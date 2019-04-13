package com.dhy.yycompany.lock.service.roomInfoService;

import com.alibaba.fastjson.JSON;

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

    Map<String ,Object> getLockInfoFenye(int lock_id,int pageNum);



    /**
     * 删除单个房间
     * @param roomID
     */
    void deleteRoom(int roomID);


    /**
     * 增加单个房间
     * 提供房间号创建房间
     */
    Map<String,String> addRoom(int apartmentID,String roomNum);

    /**
     *修改房间租金
     */
    Map<String,String> modifyPrice(int roomID,int price);

    /**
     * 增删房间界面，获得楼层中所有房间的信息，参数 （公寓楼id， 楼层）
     * @param apartmentID
     * @param floor
     * @return
     */
    JSON getRoomsNum(int apartmentID,int floor);


    //管理员直接开门
    /**
     * 1.在指令表中添加开门指令
     * @param lockID
     * @param userID
     * @return
     */
    Map<String,Object> openDoor(int lockID,int userID);


    //绑定房间和门锁
    Map<String,Object> bindRoomLock(int roomID,String introduction);

    //租房时间表操作
    //操作renting表如果房间id存在，则更新时间。否则，创建信息
    Map<String,Object> rentingRoom(int roomID,String rentTime,String retreatTime);
}
