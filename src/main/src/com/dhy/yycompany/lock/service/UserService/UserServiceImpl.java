package com.dhy.yycompany.lock.service.UserService;

import com.alibaba.fastjson.JSONObject;
import com.dhy.yycompany.lock.bean.*;
import com.dhy.yycompany.lock.dao.InstructionMapper;
import com.dhy.yycompany.lock.dao.KeyInfoMapper;
import com.dhy.yycompany.lock.dao.RoomMapper;
import com.dhy.yycompany.lock.dao.UserInfoMapper;
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
     * @param userID
     * @return
     */
    @Override
    public Map<String, String> deleteUser(int userID) {
        SqlSession sqlSession=sqlSessionFactory.openSession();

        UserInfoExample userInfoExample=new UserInfoExample();
        UserInfoExample.Criteria criteria=userInfoExample.createCriteria();
        criteria.andUIdEqualTo(userID);
        UserInfoMapper userInfoMapper=sqlSession.getMapper(UserInfoMapper.class);
        List<UserInfo> userInfoList=userInfoMapper.selectByExample(userInfoExample);

        UserInfo userInfo = new UserInfo();
        userInfo.setuId(userID);
        userInfo.setuDelete(1);


        //UserInfoMapper userInfoMapper=sqlSession.getMapper(UserInfoMapper.class);
        int num=userInfoMapper.updateByPrimaryKeySelective(userInfo);
        Map<String, String> map = new HashMap<>();
        if(num==1){
            //删除住户成功
//            map.put("result", "0");
//            map.put("message", "删除住户成功");
            //room表中的residentNum-1
            int roomID=userInfoList.get(0).getuRoomId();
            RoomMapper roomMapper=sqlSession.getMapper(RoomMapper.class);
            int num1=roomMapper.deleteUserByPrimaryKey(roomID);
            System.out.println("num1=="+num1);
            System.out.println("room表住户数减1成功");


            KeyInfoExample keyInfoExample=new KeyInfoExample();
            KeyInfoExample.Criteria criteria2=keyInfoExample.createCriteria();
            criteria2.andKUserIdEqualTo(userID).andKDeleteEqualTo(0);
            KeyInfoMapper keyInfoMapper=sqlSession.getMapper(KeyInfoMapper.class);
            //得到所有即将要删除的密码信息
            List<KeyInfo> keyInfos=keyInfoMapper.selectByExample(keyInfoExample);


            KeyInfoExample keyInfoExample1=new KeyInfoExample();
            KeyInfoExample.Criteria criteria1=keyInfoExample1.createCriteria();
            criteria1.andKUserIdEqualTo(userID).andKDeleteEqualTo(0);
            KeyInfo keyInfo=new KeyInfo();
            keyInfo.setkDelete(1);
            int num2=keyInfoMapper.updateByExampleSelective(keyInfo,keyInfoExample1);
            System.out.println("删除了"+num2+"条住户密码");

            for (int i = 0; i < keyInfos.size(); i++) {
                Map<String, String> params = new HashMap<String, String>();
                params.put("result", "ok");
                params.put("method","delTempraryKey");
                params.put("kUuid",keyInfos.get(i).getkUuid());
//            params.put("kFailureTime",keyInfo.getkFailureTime());
//            params.put("kAvailableTimes",keyInfo.getkAvailableTimes().toString());
//            params.put("kDelete",keyInfo.getkDelete().toString());
//            params.put("kIsModify",keyInfo.getkIsModify().toString());
//            params.put("kLockId",keyInfo.getkLockId().toString());
//            params.put("kUserId",keyInfo.getkUserId().toString());

                String jsonString = JSONObject.toJSONString(params);
                Instruction instruction=new Instruction();
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
                InstructionMapper instructionMapper=sqlSession.getMapper(InstructionMapper.class);
                int num3=instructionMapper.insert(instruction);
                System.out.println("删除密码指令添加了 " + num3 + " 条");
                if(num3!=0){
                    map.put("result", "0");
                    map.put("message", "删除用户成功");
                }
            }




        }else{
            //删除用户失败
            map.put("result", "1");
            map.put("message", "删除用户失败");
        }

        return map;
    }

}
