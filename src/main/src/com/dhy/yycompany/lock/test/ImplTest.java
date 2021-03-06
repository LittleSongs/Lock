package com.dhy.yycompany.lock.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.dhy.yycompany.lock.bean.UserInfo;
import com.dhy.yycompany.lock.service.AdminService.AdministratorService;
import com.dhy.yycompany.lock.service.ApartmentService.ApartmentService;
import com.dhy.yycompany.lock.service.FingerService.FingerPrintService;
import com.dhy.yycompany.lock.service.UserService.UserService;
import com.dhy.yycompany.lock.service.indexService.IndexService;
import com.dhy.yycompany.lock.service.roomInfoService.RoomInfoService;
import com.dhy.yycompany.lock.service.testService.TestService;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ImplTest {
    @Test
    public void getPlaceOrderByDate(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        TestService testServiceImpl = (TestService) context.getBean("testServiceImpl");
        testServiceImpl.getuser();
    }


    //在首页展示所有公寓和房间的信息
    @Test
    public void getApartments(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        IndexService indexService = (IndexService) context.getBean("indexServiceImpl");
        List<Map<String,Object>> mapList=indexService.getRooms();
        System.out.println("listSize="+mapList.size());
    }


    //获得单个房间信息
    @Test
    public void getRoomInfo(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        RoomInfoService roomInfoService = (RoomInfoService) context.getBean("roomInfoServiceImpl");
        Map<String,Object> map=roomInfoService.getRoomInfo(50);
    }





    //获得单个门锁的信息，弃用，使用getLockInfoFenye()方法
    @Test
    public void getLockInfo(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        RoomInfoService roomInfoService = (RoomInfoService) context.getBean("roomInfoServiceImpl");
        roomInfoService.getLockInfo(1);
    }

    //获得单个门锁信息带分页功能
    @Test
    public void getLockInfoFenye(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        RoomInfoService roomInfoService = (RoomInfoService) context.getBean("roomInfoServiceImpl");
        roomInfoService.getLockInfoFenye(2,3);
    }

    //添加房间
    @Test
    public void addRoom(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        RoomInfoService roomInfoService = (RoomInfoService) context.getBean("roomInfoServiceImpl");
        roomInfoService.addRoom(1,"409");
    }

    //管理员添加开门密码
    @Test
    public void addKey(){
        Map<String ,String> map=new HashMap<>();
        map.put("LockID","3");
        map.put("UserID","-1");
        map.put("Password","111111");
        map.put("AvailableTimes","3");
        map.put("FailureTime","2019-03-29");
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        AdministratorService administratorService = (AdministratorService) context.getBean("administratorServiceImpl");
        int result=administratorService.addkey(map);
        if(result==0){
            System.out.println("成功");
        }else{
            System.out.println("失败");
        }
    }


    //删除公寓楼
    @Test
    public void deleteApartments(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        ApartmentService apartmentService = (ApartmentService) context.getBean("apartmentServiceImpl");
        apartmentService.deleteApartment(3);
    }

    //删除单个房间
    @Test
    public void deleteRoom(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        RoomInfoService roomInfoService = (RoomInfoService) context.getBean("roomInfoServiceImpl");
        roomInfoService.deleteRoom(71);
    }

    //修改房间租金
    @Test
    public void modifyPrice(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        RoomInfoService roomInfoService = (RoomInfoService) context.getBean("roomInfoServiceImpl");
        roomInfoService.modifyPrice(51,111);
    }

    //修改公寓楼名
    @Test
    public void updateApartmentName(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        ApartmentService apartmentService = (ApartmentService) context.getBean("apartmentServiceImpl");
        apartmentService.updateApartment(3,"修改后的名字");
    }


    //修改公寓楼层数
    @Test
    public void updateApartmentFloorNum(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        ApartmentService apartmentService = (ApartmentService) context.getBean("apartmentServiceImpl");
        apartmentService.updateApartmentFloorNum(3,20);
    }


    /**
     * 用户退宿功能：住户表删除住户，对应的room表住户数减1，住户对应的开门密码表的信息需要删除，指令表增加删除密码指令，让树莓派更新密码表。
     */
//    @Test
//    public void deleteUser(){
//        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
//        UserService userService=(UserService) context.getBean("userServiceImpl");
//        userService.deleteUser(22);
//    }

    /**
     * 修改管理员信息11
     */
    @Test
    public void modifyAdmin(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        AdministratorService administratorService = (AdministratorService) context.getBean("administratorServiceImpl");
        administratorService.modifyAdminInfo(1,"qqq","aaa");
    }

    //获取单个管理员信息
    @Test
    public void getAdmin(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        AdministratorService administratorService = (AdministratorService) context.getBean("administratorServiceImpl");
        administratorService.getInfo(1);
    }

    //获取所有管理员信息
    @Test
    public void getAdmins(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        AdministratorService administratorService = (AdministratorService) context.getBean("administratorServiceImpl");
        administratorService.getInfos(1,5);
    }

    //删除管理员
    @Test
    public void deleteAdmin(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        AdministratorService administratorService = (AdministratorService) context.getBean("administratorServiceImpl");
        administratorService.deleteAdmin(2);
    }

    //增删房间界面，获取某楼层的所有房间号
    @Test
    public void getRoomsNum(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        RoomInfoService roomInfoService = (RoomInfoService) context.getBean("roomInfoServiceImpl");
        roomInfoService.getRoomsNum(2,1);
    }


    //添加户主功能
    @Test
    public void addHomeMaster(){
        JSON json=new JSONObject();
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService=(UserService) context.getBean("userServiceImpl");
        userService.addHomeMaster(json);
    }

    //添加指纹功能
    @Test
    public void addFingerPrint(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        FingerPrintService fingerPrintService=(FingerPrintService) context.getBean("fingerPrintServiceImpl");
        fingerPrintService.addFingerPrint(23,50,"finger",1);
    }

    //删除所有房间内的住户
    @Test
    public void deleteAllUsers(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService=(UserService) context.getBean("userServiceImpl");
        userService.deleteAllUsers(3);
    }


    //直接开门指令
    @Test
    public void openDoor(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        RoomInfoService roomInfoService = (RoomInfoService) context.getBean("roomInfoServiceImpl");
        roomInfoService.openDoor(2,10);
    }




    //为用户生成永久密码
    @Test
    public void addUserKey(){
        JSONObject jsonObject = new JSONObject();
        Object object = null;
        jsonObject.put("roomID", 2);
        jsonObject.put("openDoorpassword","909090");
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService=(UserService) context.getBean("userServiceImpl");
        userService.addUserKey(jsonObject,4);
    }


    //绑定房间和门锁
    @Test
    public void bindRoomAndLock(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        RoomInfoService roomInfoService = (RoomInfoService) context.getBean("roomInfoServiceImpl");
        roomInfoService.bindRoomLock(95,"1-1");
    }

    //renting表信息修改
    @Test
    public void modifyRenting(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        RoomInfoService roomInfoService = (RoomInfoService) context.getBean("roomInfoServiceImpl");
        roomInfoService.rentingRoom(50,"2020-01-01","2030-01-01");
    }

}
