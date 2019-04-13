package com.dhy.yycompany.lock.service.UserService;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.dhy.yycompany.lock.bean.*;
import com.dhy.yycompany.lock.dao.*;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private SqlSessionFactory sqlSessionFactory;


    /**
     * 用户退宿功能：住户表删除住户，对应的room表住户数减1，住户对应的开门密码表的信息需要删除，指令表增加删除密码指令，让树莓派更新密码表。
     *
     * @return
     */
    @Override
    public Map<String, Object> deleteUser(int roomId, int userId) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
//        RoomMapper roomMapper1 = sqlSession.getMapper(RoomMapper.class);
//        Room room = roomMapper1.selectByPrimaryKey(roomId);
        Map<String, Object> map = new HashMap<>();
//        if(room.getrResidentNum()==1)
//        {
//            map.put("result", 2);
//            map.put("message", "删除用户失败,该房间只有一个人居住,不能进行删除操作");
//            sqlSession.commit();
//            sqlSession.close();
//            return map;
//        }


        UserInfoExample userInfoExample = new UserInfoExample();
        UserInfoExample.Criteria criteria = userInfoExample.createCriteria();
        criteria.andUIdEqualTo(userId);
        UserInfoMapper userInfoMapper = sqlSession.getMapper(UserInfoMapper.class);
        List<UserInfo> userInfoList = userInfoMapper.selectByExample(userInfoExample);

        UserInfo userInfo = new UserInfo();
        userInfo.setuId(userId);
        userInfo.setuDelete(1);


        //UserInfoMapper userInfoMapper=sqlSession.getMapper(UserInfoMapper.class);
        int num = userInfoMapper.updateByPrimaryKeySelective(userInfo);

        if (num == 1) {
            //删除住户成功
//            map.put("result", "0");
//            map.put("message", "删除住户成功");
            //room表中的residentNum-1
            int roomID = userInfoList.get(0).getuRoomId();
            RoomMapper roomMapper = sqlSession.getMapper(RoomMapper.class);
            int num1 = roomMapper.deleteUserByPrimaryKey(roomID);
            System.out.println("num1==" + num1);
            System.out.println("room表住户数减1成功");


            KeyInfoExample keyInfoExample = new KeyInfoExample();
            KeyInfoExample.Criteria criteria2 = keyInfoExample.createCriteria();
            criteria2.andKUserIdEqualTo(userId).andKDeleteEqualTo(0);
            KeyInfoMapper keyInfoMapper = sqlSession.getMapper(KeyInfoMapper.class);
            //得到所有即将要删除的密码信息
            List<KeyInfo> keyInfos = keyInfoMapper.selectByExample(keyInfoExample);
            //如果没有密码
            if (keyInfos.size() == 0) {
                map.put("result", 3);
                map.put("message", "删除用户成功,并且没有密码");
                sqlSession.commit();
                sqlSession.close();
                return map;
            }

            KeyInfoExample keyInfoExample1 = new KeyInfoExample();
            KeyInfoExample.Criteria criteria1 = keyInfoExample1.createCriteria();
            criteria1.andKUserIdEqualTo(userId).andKDeleteEqualTo(0);
            KeyInfo keyInfo = new KeyInfo();
            keyInfo.setkDelete(1);
            int num2 = keyInfoMapper.updateByExampleSelective(keyInfo, keyInfoExample1);
            System.out.println("删除了" + num2 + "条住户密码");

            for (int i = 0; i < keyInfos.size(); i++) {
                Map<String, String> params = new HashMap<String, String>();
                params.put("result", "ok");
                params.put("method", "delTempraryKey");
                params.put("kUuid", keyInfos.get(i).getkUuid());
//            params.put("kFailureTime",keyInfo.getkFailureTime());
//            params.put("kAvailableTimes",keyInfo.getkAvailableTimes().toString());
//            params.put("kDelete",keyInfo.getkDelete().toString());
//            params.put("kIsModify",keyInfo.getkIsModify().toString());
//            params.put("kLockId",keyInfo.getkLockId().toString());
//            params.put("kUserId",keyInfo.getkUserId().toString());

                String jsonString = JSONObject.toJSONString(params);
                Instruction instruction = new Instruction();
                //下面是指令对象赋值，要修改
                instruction.setiUuid(UUID.randomUUID().toString().replaceAll("-", ""));
                instruction.setiLockId(keyInfos.get(0).getkLockId());
                instruction.setiUserId(keyInfos.get(0).getkUserId());
                instruction.setiIsDelete(0);
                instruction.setiIsModify(1);
                instruction.setiIsFinger(0);
                instruction.setiIsKey(1);
                instruction.setiIsLock(0);
                instruction.setiIsUser(0);
                instruction.setiFingerInfo("");
                instruction.setiKeyInfo(jsonString);
                instruction.setiLockInfo("");
                instruction.setiUserInfo("");
                InstructionMapper instructionMapper = sqlSession.getMapper(InstructionMapper.class);
                int num3 = instructionMapper.insert(instruction);
                System.out.println("删除密码指令添加了 " + num3 + " 条");
                if (num3 != 0) {
                    map.put("result", 0);
                    map.put("message", "删除用户成功");
                }
            }
        } else {
            //删除用户失败
            map.put("result", 1);
            map.put("message", "删除用户失败");
        }
        sqlSession.commit();
        sqlSession.close();
        return map;
    }

    @Override
    public Map<String, Object> deleteAllUsers(int roomId) {
        UserInfoExample userInfoExample = new UserInfoExample();
        UserInfoExample.Criteria criteria = userInfoExample.createCriteria();
        criteria.andURoomIdEqualTo(roomId);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserInfoMapper userInfoMapper = sqlSession.getMapper(UserInfoMapper.class);
        List<UserInfo> userInfos = userInfoMapper.selectByExample(userInfoExample);
        Map<String, Object> map = new HashMap<>();
        if (userInfos != null && userInfos.size() != 0) {
            for (int i = 0; i < userInfos.size(); i++) {
                Map<String, Object> map1 = deleteUser(roomId, userInfos.get(i).getuId());
                int i1 = (int) map1.get("result");
                if (i1 == 1) {
                    //删除某个用户失败
                    map.put("result", 1);
                    map.put("message", "删除住户失败");
                    break;
                }
            }
        } else {
            map.put("result", 1);
            map.put("message", "房间内没有住户，无法删除住户");
        }
        map.put("result", 0);
        map.put("message", "删除所有用户成功");
        sqlSession.commit();
        sqlSession.close();
        return map;
    }


    /**
     * 增加房间户主
     * 1。前端把用户手机号和用户个人信息发送到后台
     * 2。在user表中创建数据
     * 3。根据手机号在手机用户表中修改userID字段为新生成user_id的值
     * 4。添加用户指纹
     * 5。把指纹信息发送到树莓派端
     * 6。room表的人数字段加1
     */
    @Override
    public Map<String, Object> addHomeMaster(JSON json) {
        //String account, int roomID, String name, String sex, String idCard, String phone, String stayTime, String retreatTime, String introduction
        Map<String, Object> itemMap = JSONObject.toJavaObject(json, Map.class);
        String account = itemMap.get("account").toString();
        //String openDoorpassword = itemMap.get("openDoorpassword").toString();
        int roomID = (int) itemMap.get("roomID");
        String name = itemMap.get("name").toString();
        String sex = itemMap.get("sex").toString();
        String idCard = itemMap.get("idCard").toString();
        String phone = itemMap.get("phone").toString();
        String stayTime = itemMap.get("stayTime").toString();
        String retreatTime = itemMap.get("retreatTime").toString();
        String introduction = itemMap.get("introduction").toString();


        SqlSession sqlSession = sqlSessionFactory.openSession();
        Map<String, Object> map = new HashMap<String, Object>();

        UserInfo u = new UserInfo();
        String uuid = UUID.randomUUID().toString().replaceAll("-", "");
        u.setuUuid(uuid);
        u.setuRoomId(roomID);
        u.setuName(name);
        u.setuSex(sex);
        u.setuIdCard(idCard);
        u.setuPhone(phone);
        u.setuStayTime(stayTime);
        u.setuRetreatTime(retreatTime);
        u.setuIntroduction(introduction);
        u.setuPrimaryUser(1);
        u.setuDelete(0);
        u.setuIsModify(0);
        //创建mapper
        UserInfoMapper userInfoMapper = sqlSession.getMapper(UserInfoMapper.class);

        int num = userInfoMapper.insertUserReturnUId(u);
        System.out.println("创建用户成功，userID=" + u.getuId());
        if (num == 1) {
            //根据手机号码判断是否存在手机用户
            PhoneUserInfoExample phoneUserInfoExample1 = new PhoneUserInfoExample();
            PhoneUserInfoExample.Criteria criteria1 = phoneUserInfoExample1.createCriteria();
            criteria1.andPAccountNumEqualTo(account);
            PhoneUserInfoMapper phoneUserInfoMapper1 = sqlSession.getMapper(PhoneUserInfoMapper.class);
            List<PhoneUserInfo> phoneUserInfos = phoneUserInfoMapper1.selectByExample(phoneUserInfoExample1);
            if (phoneUserInfos != null && phoneUserInfos.size() == 1) {
                //手机用户已经存在，把手机用户信息中的user_id进行修改
                //住户表中创建信息成功,下一步，把手机用户表中对应的用户的userid更新
                PhoneUserInfoExample phoneUserInfoExample = new PhoneUserInfoExample();
                PhoneUserInfoExample.Criteria criteria = phoneUserInfoExample.createCriteria();
                criteria.andPAccountNumEqualTo(account);
                PhoneUserInfo phoneUserInfo = new PhoneUserInfo();
                phoneUserInfo.setpUId(u.getuId());
                PhoneUserInfoMapper phoneUserInfoMapper = sqlSession.getMapper(PhoneUserInfoMapper.class);
                int num1 = phoneUserInfoMapper.updateByExampleSelective(phoneUserInfo, phoneUserInfoExample);
                if (num1 == 1) {
                    //手机用户表更新userID字段成功
                    System.out.println("手机用户表更新userID字段成功");
                    //对应的room房间人数加1
                    RoomMapper roomMapper = sqlSession.getMapper(RoomMapper.class);
                    int num2 = roomMapper.insertUserByPrimaryKey(roomID);
                    if (num2 == 1) {
                        System.out.println("房间人数加1成功");
                        map.put("result", 0);
                        map.put("message", "户主生成成功");
                        map.put("userID", u.getuId());
                    } else {
                        map.put("result", 1);
                        map.put("message", "房间人数加1失败");
                    }
                } else {
                    map.put("result", "1");
                    map.put("message", "在住户表中创建信息失败");
                }
            } else {
                //手机用户不存在，创建手机用户
                PhoneUserInfoMapper phoneUserInfoMapper = sqlSession.getMapper(PhoneUserInfoMapper.class);
                PhoneUserInfo phoneUserInfo = new PhoneUserInfo();
                phoneUserInfo.setpUuid(UUID.randomUUID().toString().replaceAll("-", ""));
                phoneUserInfo.setpUId(u.getuId());
                phoneUserInfo.setpUserName(name);
                phoneUserInfo.setpAccountNum(account);
                phoneUserInfo.setpDelete(0);
                phoneUserInfo.setpModify(0);
                int num3 = phoneUserInfoMapper.insert(phoneUserInfo);
                if (num3 == 1) {
                    //对应的room房间人数加1
                    RoomMapper roomMapper = sqlSession.getMapper(RoomMapper.class);
                    int num2 = roomMapper.insertUserByPrimaryKey(roomID);
                    if (num2 == 1) {
                        System.out.println("房间人数加1成功");
                        map.put("result", 0);
                        map.put("message", "户主生成成功");
                        map.put("userID", u.getuId());
                    } else {
                        map.put("result", 1);
                        map.put("message", "房间人数加1失败");
                    }
                }

            }


//            //用户创建成功，在key表中添加信息
//            RoomExample roomExample = new RoomExample();
//            RoomExample.Criteria criteria = roomExample.createCriteria();
//            criteria.andRIdEqualTo(roomID);
//            RoomMapper roomMapper = sqlSession.getMapper(RoomMapper.class);
//            List<Room> roomList = roomMapper.selectByExample(roomExample);
//            int lock_id=roomList.get(0).getrLockId();
//            Instruction instruction = new Instruction();
//            instruction.setiUuid(UUID.randomUUID().toString().replaceAll("-", ""));
//            instruction.setiLockId(lock_id);
//            instruction.setiUserId(u.getuId());
//            instruction.setiIsDelete(0);
//            instruction.setiIsModify(1);
//            instruction.setiIsUser(0);
//            instruction.setiIsLock(0);
//            instruction.setiIsKey(1);
//            instruction.setiIsFinger(0);
//            instruction.setiUserInfo("");
//            instruction.setiLockInfo("{\"result\":\"ok\",\"method\":\"openDoor\"}");
//            instruction.setiKeyInfo("");
//            instruction.setiFingerInfo("");
//            InstructionMapper instructionMapper=sqlSession.getMapper(InstructionMapper.class);
//            int result=instructionMapper.insert(instruction);
//            Map<String,Object> map=new HashMap<>();
//            if(result==1){
//                map.put("result",0);
//                map.put("detail","开门指令生成成功");
//            }else{
//                map.put("result",1);
//                map.put("detail","开门指令生成失败");
//            }

        } else {
            //住户表中创建信息失败
            map.put("result", 1);
            map.put("message", "在住户表中创建信息失败");
        }
        sqlSession.commit();
        sqlSession.close();
        return map;
    }

    @Override
    public Map<String, Object> addUserKey(JSON json, int UserID) {

        SqlSession sqlSession = sqlSessionFactory.openSession();
        Map<String, Object> map = new HashMap<String, Object>();
        Map<String, Object> itemMap = JSONObject.toJavaObject(json, Map.class);
        int roomID = (int)itemMap.get("roomID");
        RoomExample roomExample = new RoomExample();
        RoomExample.Criteria criteria = roomExample.createCriteria();
        criteria.andRIdEqualTo(roomID);
        RoomMapper roomMapper = sqlSession.getMapper(RoomMapper.class);
        List<Room> roomList = roomMapper.selectByExample(roomExample);
        int lock_id = roomList.get(0).getrLockId();

        KeyInfo keyInfo=new KeyInfo();
        keyInfo.setkUuid(UUID.randomUUID().toString().replaceAll("-", ""));
        keyInfo.setkLockId(lock_id);
        keyInfo.setkUserId(UserID);
        keyInfo.setkPassword(itemMap.get("openDoorpassword").toString());
        keyInfo.setkAvailableTimes(-1);
        keyInfo.setkIsModify(1);
        keyInfo.setkDelete(0);
        keyInfo.setkFailureTime("");

        KeyInfoMapper keyInfoMapper=sqlSession.getMapper(KeyInfoMapper.class);
        int num=keyInfoMapper.insert(keyInfo);
        if(num==1){
            //密码添加成功

            Map<String, String> params = new HashMap<String, String>();
            //查到数据，返回user用户数据，以json的形式
            //System.out.println("=====================");
            //System.out.println(keyInfo.getkPassword());
            //System.out.println("=====================");
            params.put("result", "ok");
            params.put("method","addTempraryKey");
            params.put("kPassword",keyInfo.getkPassword());
            //params.put("kId","");
            params.put("kUuid",keyInfo.getkUuid());
            params.put("kFailureTime",keyInfo.getkFailureTime());
            params.put("kAvailableTimes",keyInfo.getkAvailableTimes().toString());
            params.put("kDelete",keyInfo.getkDelete().toString());
            params.put("kIsModify",keyInfo.getkIsModify().toString());
            params.put("kLockId",keyInfo.getkLockId().toString());
            params.put("kUserId",keyInfo.getkUserId().toString());

            String jsonString = JSONObject.toJSONString(params);

            Instruction instruction=new Instruction();
            //下面是指令对象赋值，要修改
            instruction.setiUuid(UUID.randomUUID().toString().replaceAll("-", ""));
            instruction.setiLockId(lock_id);
            instruction.setiUserId(UserID);
            instruction.setiIsDelete(0);
            instruction.setiIsModify(1);
            instruction.setiIsFinger(0);
            instruction.setiIsKey(1);
            instruction.setiIsLock(0);
            instruction.setiIsUser(0);
            instruction.setiFingerInfo("");
            instruction.setiKeyInfo(jsonString);
            instruction.setiLockInfo("");
            instruction.setiUserInfo("");
            InstructionMapper instructionMapper=sqlSession.getMapper(InstructionMapper.class);
            num=instructionMapper.insert(instruction);
            if(num==1){
                map.put("result", 0);
                map.put("message", "添加密码成功");
            }else{
                map.put("result", 1);
                map.put("message", "添加密码失败");
            }

            //System.out.println("insert into instruction "+num);
        }else {
            map.put("result", 1);
            map.put("message", "添加密码失败");
        }

        sqlSession.commit();
        sqlSession.close();
        return null;
    }

}
