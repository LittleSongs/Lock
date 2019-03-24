package com.dhy.yycompany.lock.service.indexService;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.dhy.yycompany.lock.bean.*;
import com.dhy.yycompany.lock.dao.ApartmentMapper;
import com.dhy.yycompany.lock.dao.RoomMapper;
import com.dhy.yycompany.lock.dao.UserInfoMapper;
import com.dhy.yycompany.lock.service.SortList;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
@Transactional
public class IndexServiceImpl implements IndexService {
    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    @Override
    public List<Map<String,Object>> getRooms() {
        String jsonString = "";

//        SqlSession sqlSession = sqlSessionFactory.openSession();
//        UserInfoMapper mapper = sqlSession.getMapper(UserInfoMapper.class);
//        UserInfo userInfo = mapper.selectByPrimaryKey(21);
//        sqlSession.close();
//        System.out.println(userInfo.toString());
        SqlSession sqlSession = sqlSessionFactory.openSession();
        ApartmentExample apartmentExample = new ApartmentExample();
        ApartmentMapper apartmentMapper = sqlSession.getMapper(ApartmentMapper.class);
        List<Apartment> apartmentList = apartmentMapper.selectByExample(apartmentExample);


        //传给前端的list
        List<Map<String, Object>> listMap = new ArrayList<>();//楼list,有几幢楼，就创建几个map元素
        Map<Integer, String> apartmentMap = new HashMap<>();//公寓id:公寓名字

        if (apartmentList != null && apartmentList.size() != 0) {
            for (int i = 0; i < apartmentList.size(); i++) {
                System.out.println("apartment===");
                System.out.println(apartmentList.get(i));
                apartmentMap.put(apartmentList.get(i).getaId(), apartmentList.get(i).getaName());
//                Map<String,Object> map=new HashMap<>();
//                map.put(apartmentList.get(i).getaId().toString(),apartmentList.get(i).getaName());
//                listMap.add(map);
//                System.out.println("----------");
//                System.out.println(listMap);
            }


            RoomExample roomExample = new RoomExample();
            roomExample.setOrderByClause("r_apartment_id asc");
            RoomMapper roomMapper = sqlSession.getMapper(RoomMapper.class);
            List<Room> roomList = roomMapper.selectByExample(roomExample);


            if (roomList != null && roomList.size() != 0) {
                int emptyRooms=0;
                List<Room> miniList = new ArrayList<>();
                int apartment_id = roomList.get(0).getrApartmentId();
                for (int i = 0; i < roomList.size(); i++) {
                    if (apartment_id == roomList.get(i).getrApartmentId()) {
                        miniList.add(roomList.get(i));
                        if(roomList.get(i).getrResidentNum()==0){
                            emptyRooms++;
                        }
                    } else {
                        Map<String, Object> map = new HashMap<>();
                        map.put("ApartmentID", String.valueOf(apartment_id));
                        map.put("ApartmentName", apartmentMap.get(apartment_id));

                        Collections.sort(miniList, new Comparator<Room>() {

                            @Override
                            public int compare(Room o1, Room o2) {
// TODO Auto-generated method stub
                                if (o1.getrNumInt() < o2.getrNumInt()) {
                                    return -1;
                                }
                                if (o1.getrNumInt() == o2.getrNumInt())
                                    return 0;
                                return 1;
                            }
                        });

                        map.put("Rooms", miniList);
                        map.put("EmptyRooms", String.valueOf(emptyRooms));
                        emptyRooms=0;
                        listMap.add(map);
                        miniList = new ArrayList<>();
                        miniList.add(roomList.get(i));
                        apartment_id = roomList.get(i).getrApartmentId();//新的apartment_id
                    }
                    System.out.println("roomlist===");
                    System.out.println(roomList.get(i));
                }
                Map<String, Object> map = new HashMap<>();
                map.put("ApartmentID", String.valueOf(apartment_id));
                map.put("ApartmentName", apartmentMap.get(apartment_id));
                Collections.sort(miniList, new Comparator<Room>() {

                    @Override
                    public int compare(Room o1, Room o2) {
// TODO Auto-generated method stub
                        if (o1.getrNumInt() < o2.getrNumInt()) {
                            return -1;
                        }
                        if (o1.getrNumInt() == o2.getrNumInt())
                            return 0;
                        return 1;
                    }
                });
                map.put("Rooms", miniList);
                map.put("EmptyRooms", String.valueOf(emptyRooms));
                emptyRooms=0;
                listMap.add(map);
            }
        }

        JSON  toJSON= (JSON) JSONArray.toJSON(listMap); // List转json
        System.out.println("6666==="+toJSON);

        sqlSession.commit();
        sqlSession.close();
        return listMap;
    }
}
