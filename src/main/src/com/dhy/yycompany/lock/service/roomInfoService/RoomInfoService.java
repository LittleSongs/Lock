package com.dhy.yycompany.lock.service.roomInfoService;

import java.util.Map;

public interface RoomInfoService {

    //点击房间按钮进入
    //获得单个房间信息

    /**
     * map对象的信息
     * time：2020-03-04～2222-03-05（租住时限）
     * residentNum：住户人数
     * status：门锁状态（1开   0关）
     * users：住户信息list
     * price：房间价格
     * @param room_id
     * @return
     */
    Map<String,Object> getRoomInfo(int room_id);



    //点击门锁管理按钮进入
    //获得门锁的信息：

    /**
     * 锁的版本信息，
     * 门锁开关状态
     * 门锁密码管理
     * 开门记录
     *
     * map对象的信息
     * lockID:门锁id
     * software:软件版本
     * hardware:硬件版本
     * status:门锁状态
     * keyList:密码bean的list
     * openlist:开门bean的list
     * @param lock_id
     * @return
     */
    Map<String,Object> getLockInfo(int lock_id);



    /**
     * 删除单个房间
     * @param roomID
     */
    void deleteRoom(int roomID);


    /**
     * 增加单个房间
     * 提供房间号创建房间
     */
    Map<String,String> addRoom(int roomNum);
}
