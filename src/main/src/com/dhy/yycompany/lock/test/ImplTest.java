package com.dhy.yycompany.lock.test;

import com.dhy.yycompany.lock.bean.Room;
import com.dhy.yycompany.lock.service.indexService.IndexService;
import com.dhy.yycompany.lock.service.roomInfoService.RoomInfoService;
import com.dhy.yycompany.lock.service.testService.TestService;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ImplTest {
    @Test
    public void getPlaceOrderByDate(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        TestService testServiceImpl = (TestService) context.getBean("testServiceImpl");
        testServiceImpl.getuser();
    }

    @Test
    public void getApartments(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        IndexService indexService = (IndexService) context.getBean("indexServiceImpl");
        indexService.getRooms();
    }
    @Test
    public void getRoomInfo(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        RoomInfoService roomInfoService = (RoomInfoService) context.getBean("roomInfoServiceImpl");
        roomInfoService.getRoomInfo(2);
    }
}
