package com.dhy.yycompany.lock.service.ApartmentService;

import com.dhy.yycompany.lock.bean.Apartment;
import com.dhy.yycompany.lock.bean.Room;
import com.dhy.yycompany.lock.bean.RoomExample;
import com.dhy.yycompany.lock.dao.ApartmentMapper;
import com.dhy.yycompany.lock.dao.RoomMapper;
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
public class ApartmentServiceImpl implements ApartmentService {

    @Autowired
    private SqlSessionFactory sqlSessionFactory;
    /**
     * 删除公寓楼，同时需要删除公寓中的所有房间，如果房间有人，则无法删除公寓楼
     * @param apartmentID
     * @return
     */
    @Override
    public Map<String,String> deleteApartment(int apartmentID) {

        Map<String,String> map=new HashMap<>();

        RoomExample roomExample=new RoomExample();
        RoomExample.Criteria criteria=roomExample.createCriteria();
        criteria.andRApartmentIdEqualTo(apartmentID).andRResidentNumNotEqualTo(0);
        SqlSession sqlSession=sqlSessionFactory.openSession();
        RoomMapper roomMapper=sqlSession.getMapper(RoomMapper.class);
        List<Room> roomList = roomMapper.selectByExample(roomExample);
        if(roomList!=null && roomList.size()!=0){
            System.out.println("存在有人的房屋，不能删除");
            map.put("result","1");
            map.put("message","存在有人的房屋，不能删除公寓楼");
        }else{
            Apartment apartment=new Apartment();
            apartment.setaId(apartmentID);
            apartment.setaDelete(1);
            ApartmentMapper apartmentMapper=sqlSession.getMapper(ApartmentMapper.class);
            int num=apartmentMapper.updateByPrimaryKeySelective(apartment);
            if(num==1){
                System.out.println("delete ok");
                RoomExample roomExample1=new RoomExample();
                RoomExample.Criteria criteria1 = roomExample1.createCriteria();
                criteria1.andRApartmentIdEqualTo(apartmentID);
                Room room=new Room();
                room.setrDelete(1);
                int num1=roomMapper.updateByExampleSelective(room,roomExample1);
                System.out.println("delete rooms number="+num1);
                map.put("result","0");
                map.put("message","成功删除公寓，同时删除公寓内的"+num1+"间房间");
            }else{
                System.out.println("update error");
                map.put("result","1");
                map.put("message","删除公寓楼失败，但是当前公寓内没有存在住户的房屋");
            }
        }
        return map;
    }



}
