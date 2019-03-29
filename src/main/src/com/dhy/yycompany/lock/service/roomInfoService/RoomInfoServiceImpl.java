package com.dhy.yycompany.lock.service.roomInfoService;

import com.dhy.yycompany.lock.bean.*;
import com.dhy.yycompany.lock.dao.*;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        VRoomUserLockExample vRoomUserLockExample=new VRoomUserLockExample();
        VRoomUserLockExample.Criteria criteria=vRoomUserLockExample.createCriteria();
        criteria.andRIdEqualTo(room_id);
        SqlSession sqlSession=sqlSessionFactory.openSession();
        VRoomUserLockMapper vRoomUserLockMapper=sqlSession.getMapper(VRoomUserLockMapper.class);
        List<VRoomUserLock> vRoomUserLockList = vRoomUserLockMapper.selectByExample(vRoomUserLockExample);
        Map<String, Object> map = new HashMap<>();
        map.put("time",vRoomUserLockList.get(0).getStayTime()+"~"+vRoomUserLockList.get(0).getRetreatTime());//例子： 2019-01-01～2020-11-11
        map.put("residentNum",vRoomUserLockList.get(0).getResidentNum());
        map.put("status",vRoomUserLockList.get(0).getlStatus());
        System.out.println("time"+vRoomUserLockList.get(0).getStayTime()+"~"+vRoomUserLockList.get(0).getRetreatTime());
        System.out.println("residentNum"+vRoomUserLockList.get(0).getResidentNum());
        System.out.println("status"+vRoomUserLockList.get(0).getlStatus());


        UserInfoExample userInfoExample=new UserInfoExample();
        UserInfoExample.Criteria criteria1=userInfoExample.createCriteria();
        criteria1.andURoomIdEqualTo(room_id);
        UserInfoMapper userInfoMapper=sqlSession.getMapper(UserInfoMapper.class);
        List<UserInfo> userInfoList = userInfoMapper.selectByExample(userInfoExample);
        System.out.println("-----------------------");
        for (UserInfo u: userInfoList){
            System.out.println(u);
        }
        map.put("users",userInfoList);

        RoomExample roomExample=new RoomExample();
        RoomExample.Criteria criteria2=roomExample.createCriteria();
        criteria2.andRIdEqualTo(room_id);
        RoomMapper roomMapper=sqlSession.getMapper(RoomMapper.class);
        List<Room> roomList=roomMapper.selectByExample(roomExample);
        map.put("price",roomList.get(0).getrPrice());
        System.out.println("map=="+map);
        sqlSession.commit();
        sqlSession.close();
        return map;
    }


    /**
     * 1。lock_id查出lock_info表的信息
     * 2。lock_id 查出v_key_username视图中的信息
     * 3。lock_id 查出v_daily_userinfo视图中的信息
     *
     *
     * map对象的信息
     *      * lockID:门锁id
     *      * software:软件版本
     *      * hardware:硬件版本
     *      * status:门锁状态
     *      * keyList:密码bean的list
     *      * openlist:开门bean的list
     * @param lock_id
     * @return
     */
    @Override
    public Map<String, Object> getLockInfo(int lock_id) {
        LockInfoExample lockInfoExample=new LockInfoExample();
        LockInfoExample.Criteria criteria=lockInfoExample.createCriteria();
        criteria.andLIdEqualTo(lock_id);
        SqlSession sqlSession=sqlSessionFactory.openSession();
        LockInfoMapper lockInfoMapper=sqlSession.getMapper(LockInfoMapper.class);
        List<LockInfo> lockInfoList=lockInfoMapper.selectByExample(lockInfoExample);
        System.out.println("lockInfoList="+lockInfoList);

        VKeyUsernameExample vKeyUsernameExample=new VKeyUsernameExample();
        VKeyUsernameExample.Criteria criteria1=vKeyUsernameExample.createCriteria();
        criteria1.andKLockIdEqualTo(lock_id);
        VKeyUsernameMapper vKeyUsernameMapper=sqlSession.getMapper(VKeyUsernameMapper.class);
        List<VKeyUsername> vKeyUsernameList=vKeyUsernameMapper.selectByExample(vKeyUsernameExample);
        System.out.println("vKeyUsernameList"+vKeyUsernameList);

        VDailyUserInfoExample vDailyUserInfoExample=new VDailyUserInfoExample();
        VDailyUserInfoExample.Criteria criteria2=vDailyUserInfoExample.createCriteria();
        criteria2.andDLockIdEqualTo(lock_id);
        VDailyUserInfoMapper vDailyUserInfoMapper=sqlSession.getMapper(VDailyUserInfoMapper.class);
        List<VDailyUserInfo> vDailyUserInfoList=vDailyUserInfoMapper.selectByExample(vDailyUserInfoExample);
        System.out.println("vDailyUserInfoList"+vDailyUserInfoList);


        Map<String,Object> map=new HashMap<>();

        map.put("LockID",lockInfoList.get(0).getlId());
        map.put("software",lockInfoList.get(0).getlSoftVer());
        map.put("hardware",lockInfoList.get(0).getlHardVer());
        map.put("status",lockInfoList.get(0).getlStatus());
        map.put("keyList",vKeyUsernameList);
        map.put("openlist",vDailyUserInfoList);

        System.out.println("map="+map);

        sqlSession.commit();
        sqlSession.close();
        return null;
    }

    @Override
    public void deleteRoom(int roomID) {

    }
}
