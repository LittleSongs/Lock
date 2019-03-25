package com.dhy.yycompany.lock.service.roomInfoService;

import com.dhy.yycompany.lock.bean.UserInfo;
import com.dhy.yycompany.lock.bean.UserInfoExample;
import com.dhy.yycompany.lock.bean.VRoomUserLock;
import com.dhy.yycompany.lock.bean.VRoomUserLockExample;
import com.dhy.yycompany.lock.dao.UserInfoMapper;
import com.dhy.yycompany.lock.dao.VRoomUserLockMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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
    public void getRoomInfo(int room_id) {
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

    }
}
