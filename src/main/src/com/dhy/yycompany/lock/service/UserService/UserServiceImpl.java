package com.dhy.yycompany.lock.service.UserService;

import com.dhy.yycompany.lock.bean.Room;
import com.dhy.yycompany.lock.bean.UserInfo;
import com.dhy.yycompany.lock.bean.UserInfoExample;
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
            int roomID=userInfoList.get(0).getuRoomId();
            RoomMapper roomMapper=sqlSession.getMapper(RoomMapper.class);
            int num1=roomMapper.deleteUserByPrimaryKey(roomID);
            System.out.println("num1=="+num1);

        }else{
            //删除用户失败
            map.put("result", "1");
            map.put("message", "删除用户失败");
        }

        return null;
    }

}
