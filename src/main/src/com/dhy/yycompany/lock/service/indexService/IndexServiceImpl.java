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


    /**
     * apartmentID:1
     * EmptyRooms:10
     * roomMap=> "1":list[]
     * "2":list[]
     *
     * @return
     */


    @Override
    public List<Map<String, Object>> getRooms() {
        String jsonString = "";

        SqlSession sqlSession = sqlSessionFactory.openSession();
        ApartmentExample apartmentExample = new ApartmentExample();
        ApartmentExample.Criteria criteria = apartmentExample.createCriteria();
        criteria.andADeleteEqualTo(0);
        ApartmentMapper apartmentMapper = sqlSession.getMapper(ApartmentMapper.class);
        List<Apartment> apartmentList = apartmentMapper.selectByExample(apartmentExample);


        //传给前端的list
        List<Map<String, Object>> listMap = new ArrayList<>();//楼list,有几幢楼，就创建几个map元素
        Map<Integer, String> apartmentMap = new HashMap<>();//公寓id:公寓名字
        List<Integer> apartmentIDList = new ArrayList<>();//未删除公寓的所有id list
        if (apartmentList != null && apartmentList.size() != 0) {
            for (int i = 0; i < apartmentList.size(); i++) {
                System.out.println("apartment===");
                System.out.println(apartmentList.get(i));
                apartmentMap.put(apartmentList.get(i).getaId(), apartmentList.get(i).getaName());
                apartmentIDList.add(apartmentList.get(i).getaId());
//                Map<String,Object> map=new HashMap<>();
//                map.put(apartmentList.get(i).getaId().toString(),apartmentList.get(i).getaName());
//                listMap.add(map);
//                System.out.println("----------");
//                System.out.println(listMap);
                System.out.println("apartmentMap=" + apartmentMap);
            }


            RoomExample roomExample = new RoomExample();
            RoomExample.Criteria criteria1 = roomExample.createCriteria();
            criteria1.andRDeleteEqualTo(0).andRApartmentIdIn(apartmentIDList);
            roomExample.setOrderByClause("r_apartment_id asc,r_floor asc");
            RoomMapper roomMapper = sqlSession.getMapper(RoomMapper.class);
            List<Room> roomList = roomMapper.selectByExample(roomExample);
            System.out.println(roomList);

            if (roomList != null && roomList.size() != 0) {
                List<Room> sameFloorRooms = new ArrayList<>();
                int emptyRooms = 0;
                int apartment_id = roomList.get(0).getrApartmentId();
                int rFloor = roomList.get(0).getrFloor();
                Map<String, Object> mapFloor = new HashMap<>();
                for (int i = 0; i < roomList.size(); i++) {
                    //判断是否是一个公寓的房间
                    if (apartment_id == roomList.get(i).getrApartmentId()) {
                        if (roomList.get(i).getrResidentNum() == 0) {
                            emptyRooms++;
                        }
                        //把一层楼的房间放到一个list里，存入mapFloor中
                        if (rFloor == roomList.get(i).getrFloor()) {
                            //把房间加入楼层list
                            sameFloorRooms.add(roomList.get(i));
                        } else {
                            //房间楼层发生了改变,把当前楼层的房间按照房间号排序
                            Collections.sort(sameFloorRooms, new Comparator<Room>() {
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
                            System.out.println("8888888");
                            System.out.println(sameFloorRooms);
                            //把一层楼的房间按照房间号排序后，放到mapFloor中。
                            mapFloor.put(String.valueOf(rFloor), sameFloorRooms);
                            sameFloorRooms = new ArrayList<>();
                            //把房间加入楼层list
                            sameFloorRooms.add(roomList.get(i));
                            rFloor = roomList.get(i).getrFloor();
                        }
                    } else {
                        //不是同一幢公寓楼,需要分开

                        //公寓楼发生变化，所有房间楼层发生了改变,把当前楼层的房间按照房间号排序
                        Collections.sort(sameFloorRooms, new Comparator<Room>() {
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
                        //把一层楼的房间按照房间号排序后，放到mapFloor中。
                        mapFloor.put(String.valueOf(rFloor), sameFloorRooms);
                        rFloor = roomList.get(i).getrFloor();


                        //添加一个公寓楼的map
                        Map<String, Object> map = new HashMap<>();
                        map.put("ApartmentID", String.valueOf(apartment_id));
                        map.put("ApartmentName", apartmentMap.get(apartment_id));
                        map.put("EmptyRooms", String.valueOf(emptyRooms));
                        map.put("Rooms", mapFloor);
                        listMap.add(map);
                        sameFloorRooms = new ArrayList<>();
                        //把房间加入楼层list
                        sameFloorRooms.add(roomList.get(i));
                        emptyRooms = 0;
                        if (roomList.get(i).getrResidentNum() == 0) {
                            emptyRooms++;
                        }
                        mapFloor = new HashMap<>();
                        apartment_id = roomList.get(i).getrApartmentId();

                    }
                }
                //公寓楼发生变化，所有房间楼层发生了改变,把当前楼层的房间按照房间号排序
                Collections.sort(sameFloorRooms, new Comparator<Room>() {
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
                //把一层楼的房间按照房间号排序后，放到mapFloor中。
                mapFloor.put(String.valueOf(rFloor), sameFloorRooms);
                //roomlist遍历结束，会有多出来的最后n个房间，需要保存到list中
                Map<String, Object> map = new HashMap<>();
                map.put("ApartmentID", String.valueOf(apartment_id));
                map.put("ApartmentName", apartmentMap.get(apartment_id));
                map.put("EmptyRooms", String.valueOf(emptyRooms));
                map.put("Rooms", mapFloor);
                listMap.add(map);
//                sameFloorRooms=new ArrayList<>();
//                emptyRooms=0;
//                mapFloor=new HashMap<>();
//                apartment_id = roomList.get(i).getrApartmentId();
            }
//            if (roomList != null && roomList.size() != 0) {
//                int emptyRooms=0;
//                List<Room> miniList = new ArrayList<>();
//                List<Room> floorList=new ArrayList<>();
//                int apartment_id = roomList.get(0).getrApartmentId();
//                int rFloor = roomList.get(0).getrFloor();
//                for (int i = 0; i < roomList.size(); i++) {
//                    if (apartment_id == roomList.get(i).getrApartmentId()) {
//                        if(rFloor!=roomList.get(i).getrFloor()){
//                            //房间楼层发生了改变,把当前楼层的房间按照房间号排序
//                            Collections.sort(floorList, new Comparator<Room>() {
//                                @Override
//                                public int compare(Room o1, Room o2) {
//// TODO Auto-generated method stub
//                                    if (o1.getrNumInt() < o2.getrNumInt()) {
//                                        return -1;
//                                    }
//                                    if (o1.getrNumInt() == o2.getrNumInt())
//                                        return 0;
//                                    return 1;
//                                }
//                            });
//
//
//                        }else{
//                            floorList.add(roomList.get(i));
//                        }
//
//                        miniList.add(roomList.get(i));
//                        if(roomList.get(i).getrResidentNum()==0){
//                            emptyRooms++;
//                        }
//                    } else {
//                        Map<String, Object> map = new HashMap<>();
//                        map.put("ApartmentID", String.valueOf(apartment_id));
//                        map.put("ApartmentName", apartmentMap.get(apartment_id));
//
//
//                        Collections.sort(miniList, new Comparator<Room>() {
//                            @Override
//                            public int compare(Room o1, Room o2) {
//// TODO Auto-generated method stub
//                                if (o1.getrNumInt() < o2.getrNumInt()) {
//                                    return -1;
//                                }
//                                if (o1.getrNumInt() == o2.getrNumInt())
//                                    return 0;
//                                return 1;
//                            }
//                        });
//
//                        map.put("Rooms", miniList);
//                        map.put("EmptyRooms", String.valueOf(emptyRooms));
//                        emptyRooms=0;
//                        listMap.add(map);
//                        miniList = new ArrayList<>();
//                        miniList.add(roomList.get(i));
//                        apartment_id = roomList.get(i).getrApartmentId();//新的apartment_id
//                    }
//                    System.out.println("roomlist===");
//                    System.out.println(roomList.get(i));
//                }
//
//                Map<String, Object> map = new HashMap<>();
//                map.put("ApartmentID", String.valueOf(apartment_id));
//                map.put("ApartmentName", apartmentMap.get(apartment_id));
//                Collections.sort(miniList, new Comparator<Room>() {
//
//                    @Override
//                    public int compare(Room o1, Room o2) {
//// TODO Auto-generated method stub
//                        if (o1.getrNumInt() < o2.getrNumInt()) {
//                            return -1;
//                        }
//                        if (o1.getrNumInt() == o2.getrNumInt())
//                            return 0;
//                        return 1;
//                    }
//                });
//                map.put("Rooms", miniList);
//                map.put("EmptyRooms", String.valueOf(emptyRooms));
//                emptyRooms=0;
//                listMap.add(map);
//            }
        }

        JSON toJSON = (JSON) JSONArray.toJSON(listMap); // List转json
        System.out.println("909090909090909090");
        System.out.println(toJSON);

        sqlSession.commit();
        sqlSession.close();
        return listMap;
    }
}
