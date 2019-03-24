package com.dhy.yycompany.lock.service.indexService;

import java.util.List;
import java.util.Map;

public interface IndexService {
    //获得公寓所有房屋的信息
    List<Map<String,Object>> getRooms();
}
