package com.dhy.yycompany.lock.service.indexService;

import java.util.List;
import java.util.Map;

public interface IndexService {
    //获得公寓所有房屋的信息

    /**
     * list中每个元素的结构
     *
     * ApartmentID:公寓id
     * ApartmentName:公寓名称
     * Rooms:公寓所有房间信息list
     * EmptyRooms:一个公寓楼的空房数量
     * @return
     */
    List<Map<String,Object>> getRooms();
}
