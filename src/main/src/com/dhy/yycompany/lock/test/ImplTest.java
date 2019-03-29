package com.dhy.yycompany.lock.test;

import com.dhy.yycompany.lock.service.AdminService.AdministratorService;
import com.dhy.yycompany.lock.service.ApartmentService.ApartmentService;
import com.dhy.yycompany.lock.service.indexService.IndexService;
import com.dhy.yycompany.lock.service.roomInfoService.RoomInfoService;
import com.dhy.yycompany.lock.service.testService.TestService;

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
    }


    //获得单个房间信息
    @Test
    public void getRoomInfo(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        RoomInfoService roomInfoService = (RoomInfoService) context.getBean("roomInfoServiceImpl");
        Map<String,Object> map=roomInfoService.getRoomInfo(50);
    }





    //获得单个门锁的信息
    @Test
    public void getLockInfo(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        RoomInfoService roomInfoService = (RoomInfoService) context.getBean("roomInfoServiceImpl");
        roomInfoService.getLockInfo(1);
    }

    //管理员添加开门密码
    @Test
    public void setKey(){
        Map<String ,String> map=new HashMap<>();
        map.put("LockID","3");
        map.put("UserID","-1");
        map.put("Password","111111");
        map.put("AvailableTimes","3");
        map.put("FailureTime","2019-03-29");
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        AdministratorService administratorService = (AdministratorService) context.getBean("administratorServiceImpl");
        int result=administratorService.setkey(map);
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


}
