package com.dhy.yycompany.lock.service.roomInfoService;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.dhy.yycompany.lock.bean.*;
import com.dhy.yycompany.lock.dao.*;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
@Transactional
public class RoomInfoServiceImpl implements RoomInfoService {
    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    /**
     * 1.通过room_id找到任意一位住户，可以得到租住时间。
     * 2.在room表中获得居住人数
     * 3.通过room_id找到lock_id，然后获得门锁状态（开或关）
     * 4.根据room_id找到所有住户
     */
    @Override
    public Map<String, Object> getRoomInfo(int room_id) {
        VRoomUserLockExample vRoomUserLockExample = new VRoomUserLockExample();
        VRoomUserLockExample.Criteria criteria = vRoomUserLockExample.createCriteria();
        criteria.andRIdEqualTo(room_id);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        VRoomUserLockMapper vRoomUserLockMapper = sqlSession.getMapper(VRoomUserLockMapper.class);
        List<VRoomUserLock> vRoomUserLockList = vRoomUserLockMapper.selectByExample(vRoomUserLockExample);
        Map<String, Object> map = new HashMap<>();
        map.put("time", vRoomUserLockList.get(0).getStayTime() + "~" + vRoomUserLockList.get(0).getRetreatTime());//例子： 2019-01-01～2020-11-11
        map.put("residentNum", vRoomUserLockList.get(0).getResidentNum());
        map.put("status", vRoomUserLockList.get(0).getlStatus());

//        System.out.println("time"+vRoomUserLockList.get(0).getStayTime()+"~"+vRoomUserLockList.get(0).getRetreatTime());
//        System.out.println("residentNum"+vRoomUserLockList.get(0).getResidentNum());
//        System.out.println("status"+vRoomUserLockList.get(0).getlStatus());


        UserInfoExample userInfoExample = new UserInfoExample();
        UserInfoExample.Criteria criteria1 = userInfoExample.createCriteria();
        criteria1.andURoomIdEqualTo(room_id);
        UserInfoMapper userInfoMapper = sqlSession.getMapper(UserInfoMapper.class);
        List<UserInfo> userInfoList = userInfoMapper.selectByExample(userInfoExample);
        System.out.println("-----------------------");
        for (UserInfo u : userInfoList) {
            System.out.println(u);
        }
        map.put("users", userInfoList);
        RoomExample roomExample = new RoomExample();
        RoomExample.Criteria criteria2 = roomExample.createCriteria();
        criteria2.andRIdEqualTo(room_id);
        RoomMapper roomMapper = sqlSession.getMapper(RoomMapper.class);
        List<Room> roomList = roomMapper.selectByExample(roomExample);
        map.put("price", roomList.get(0).getrPrice());
        System.out.println("map==" + map);
        sqlSession.commit();
        sqlSession.close();
        return map;
    }


    /**
     * 1。lock_id查出lock_info表的信息
     * 2。lock_id 查出v_key_username视图中的信息
     * 3。lock_id 查出v_daily_userinfo视图中的信息
     * <p>
     * <p>
     * map对象的信息
     * * lockID:门锁id
     * * software:软件版本
     * * hardware:硬件版本
     * * status:门锁状态
     * * keyList:密码bean的list
     * * openlist:开门bean的list
     *
     * @param lock_id
     * @return
     */
    @Override
    public Map<String, Object> getLockInfo(int lock_id) {
        LockInfoExample lockInfoExample = new LockInfoExample();
        LockInfoExample.Criteria criteria = lockInfoExample.createCriteria();
        criteria.andLIdEqualTo(lock_id);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        LockInfoMapper lockInfoMapper = sqlSession.getMapper(LockInfoMapper.class);
        List<LockInfo> lockInfoList = lockInfoMapper.selectByExample(lockInfoExample);
        System.out.println("lockInfoList=" + lockInfoList);

        VKeyUsernameExample vKeyUsernameExample = new VKeyUsernameExample();
        VKeyUsernameExample.Criteria criteria1 = vKeyUsernameExample.createCriteria();
        criteria1.andKLockIdEqualTo(lock_id);
        VKeyUsernameMapper vKeyUsernameMapper = sqlSession.getMapper(VKeyUsernameMapper.class);
        List<VKeyUsername> vKeyUsernameList = vKeyUsernameMapper.selectByExample(vKeyUsernameExample);
        System.out.println("vKeyUsernameList" + vKeyUsernameList);

        VDailyUserInfoExample vDailyUserInfoExample = new VDailyUserInfoExample();
        VDailyUserInfoExample.Criteria criteria2 = vDailyUserInfoExample.createCriteria();
        criteria2.andDLockIdEqualTo(lock_id);
        VDailyUserInfoMapper vDailyUserInfoMapper = sqlSession.getMapper(VDailyUserInfoMapper.class);
        List<VDailyUserInfo> vDailyUserInfoList = vDailyUserInfoMapper.selectByExample(vDailyUserInfoExample);
        System.out.println("vDailyUserInfoList" + vDailyUserInfoList);


        Map<String, Object> map = new HashMap<>();

        map.put("LockID", lockInfoList.get(0).getlId());
        map.put("software", lockInfoList.get(0).getlSoftVer());
        map.put("hardware", lockInfoList.get(0).getlHardVer());
        map.put("status", lockInfoList.get(0).getlStatus());
        map.put("keyList", vKeyUsernameList);
        map.put("openlist", vDailyUserInfoList);

        System.out.println("map=" + map);

        sqlSession.commit();
        sqlSession.close();
        return null;
    }

    @Override
    public Map<String, Object> getLockInfoFenye(int lock_id, int pageNum) {
        LockInfoExample lockInfoExample = new LockInfoExample();
        LockInfoExample.Criteria criteria = lockInfoExample.createCriteria();
        criteria.andLIdEqualTo(lock_id);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        LockInfoMapper lockInfoMapper = sqlSession.getMapper(LockInfoMapper.class);
        List<LockInfo> lockInfoList = lockInfoMapper.selectByExample(lockInfoExample);
        System.out.println("lockInfoList=" + lockInfoList);
//        for(int i=0;i<commodities.size();i++)
//        {
//            Commodity commodity = commodities.get(i);
//            String attribute = commodity.getAttribute();
//            String attributeGroup = GetAttributeUtil.getAttributeGroup(attribute);
//            String series = commodity.getSeries();
//            series=series+"+"+attributeGroup;
//            commodity.setcDName(series);
//
//        }


        VKeyUsernameExample vKeyUsernameExample = new VKeyUsernameExample();
        VKeyUsernameExample.Criteria criteria1 = vKeyUsernameExample.createCriteria();
        criteria1.andKLockIdEqualTo(lock_id);
        VKeyUsernameMapper vKeyUsernameMapper = sqlSession.getMapper(VKeyUsernameMapper.class);
        PageHelper.startPage(pageNum, 5);
        List<VKeyUsername> vKeyUsernameList = vKeyUsernameMapper.selectByExample(vKeyUsernameExample);
        System.out.println("vKeyUsernameList" + vKeyUsernameList);

        VDailyUserInfoExample vDailyUserInfoExample = new VDailyUserInfoExample();
        VDailyUserInfoExample.Criteria criteria2 = vDailyUserInfoExample.createCriteria();
        criteria2.andDLockIdEqualTo(lock_id);
        VDailyUserInfoMapper vDailyUserInfoMapper = sqlSession.getMapper(VDailyUserInfoMapper.class);
        PageHelper.startPage(pageNum, 5);
        List<VDailyUserInfo> vDailyUserInfoList = vDailyUserInfoMapper.selectByExample(vDailyUserInfoExample);
        System.out.println("vDailyUserInfoList" + vDailyUserInfoList);


        Map<String, Object> map = new HashMap<>();

        map.put("LockID", lockInfoList.get(0).getlId());
        map.put("software", lockInfoList.get(0).getlSoftVer());
        map.put("hardware", lockInfoList.get(0).getlHardVer());
        map.put("status", lockInfoList.get(0).getlStatus());

        Page<VKeyUsername> listCountry = (Page<VKeyUsername>) vKeyUsernameList;
        int pages = listCountry.getPages();//总页数
        int pageNum1 = listCountry.getPageNum();//当前页
        long total = listCountry.getTotal();//总数据数
        System.out.println(listCountry.getTotal());
        System.out.println(listCountry.toString());
        HashMap<String, Object> messages = new HashMap<>();
        HashMap<String, Object> pageHelperMessage = new HashMap<>();
        pageHelperMessage.put("pageNum", pageNum1);
        pageHelperMessage.put("pages", pages);
        pageHelperMessage.put("total", total);
        messages.put("pageHelperMessage", pageHelperMessage);
        JSON toJSON = (JSON) JSONArray.toJSON(vKeyUsernameList);
        messages.put("commodities", toJSON);
        System.out.println("keyList="+messages);
        map.put("keyList", messages);

        Page<VDailyUserInfo> listCountry1 = (Page<VDailyUserInfo>) vDailyUserInfoList;
        pages = listCountry1.getPages();//总页数
        pageNum1 = listCountry1.getPageNum();//当前页
        total = listCountry1.getTotal();//总数据数
        System.out.println(listCountry1.getTotal());
        System.out.println(listCountry1.toString());
        HashMap<String, Object> messages1 = new HashMap<>();
        HashMap<String, Object> pageHelperMessage1 = new HashMap<>();
        pageHelperMessage1.put("pageNum", pageNum1);
        pageHelperMessage1.put("pages", pages);
        pageHelperMessage1.put("total", total);
        messages1.put("pageHelperMessage", pageHelperMessage1);
        JSON toJSON1 = (JSON) JSONArray.toJSON(vDailyUserInfoList);
        messages1.put("commodities", toJSON1);
        System.out.println("toJSON1="+toJSON1);
        System.out.println("openlist="+messages1);
        map.put("openlist", messages1);

        sqlSession.commit();
        sqlSession.close();
        return messages;
    }


    @Override
    public void deleteRoom(int roomID) {
        RoomExample roomExample = new RoomExample();
        RoomExample.Criteria criteria = roomExample.createCriteria();
        criteria.andRIdEqualTo(roomID);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        RoomMapper roomMapper = sqlSession.getMapper(RoomMapper.class);
        List<Room> roomList = roomMapper.selectByExample(roomExample);
        Map<String, String> map = new HashMap<>();
        if (roomList.get(0).getrResidentNum() == 0) {
            //没有住户，可以删除房间
            Room room = new Room();
            room.setrId(roomID);
            room.setrDelete(1);
            int num = roomMapper.updateByPrimaryKeySelective(room);
            if (num == 1) {
                map.put("result", "0");
                map.put("message", "删除房间成功");
            }
        } else {
            //存在用户，不能删除房间
            map.put("result", "1");
            map.put("message", "房间存在用户，不能删除");
        }
        System.out.println(map);
    }

    @Override
    public Map<String, String> addRoom(int apartmentID, String roomNum) {
        RoomExample roomExample = new RoomExample();
        RoomExample.Criteria criteria = roomExample.createCriteria();
        criteria.andRNumEqualTo(roomNum)
                .andRApartmentIdEqualTo(apartmentID);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        RoomMapper roomMapper = sqlSession.getMapper(RoomMapper.class);
        List<Room> roomList = roomMapper.selectByExample(roomExample);
        Map<String, String> map = new HashMap<>();
        if (roomList != null && roomList.size() != 0) {
            //该房间号存在
            map.put("result", "1");
            map.put("message", "房间已经存在");
        } else {
            //房间号不存在
            Room room = new Room();
            String uuid = UUID.randomUUID()
                    .toString().replaceAll("-", "");
            room.setrUuid(uuid);
            room.setrApartmentId(apartmentID);
            room.setrFloor(roomNum.charAt(0) - '0');
            room.setrNum(roomNum);
            room.setrPrice(0);
            room.setrResidentNum(0);
            room.setrLockId(0);
            room.setrDelete(0);
            room.setrModify(0);
            map.put("result", "0");
            map.put("message", "添加房间成功");
        }
        return map;
    }

    @Override
    public Map<String, String> modifyPrice(int roomID,int price) {
        SqlSession sqlSession=sqlSessionFactory.openSession();
        RoomMapper roomMapper=sqlSession.getMapper(RoomMapper.class);
        Room room=new Room();
        room.setrId(roomID);
        room.setrPrice(price);
        int num=roomMapper.updateByPrimaryKeySelective(room);
        Map<String, String> map = new HashMap<>();
        if(num==1){
            map.put("result", "0");
            map.put("message", "修改租金成功");
        }else{
            map.put("result", "1");
            map.put("message", "修改租金失败");
        }
        return map;
    }

}
