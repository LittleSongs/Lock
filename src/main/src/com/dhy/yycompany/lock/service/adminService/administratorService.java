package com.dhy.yycompany.lock.service.adminService;

import java.util.Map;

public interface administratorService {

    //管理员生成密码
    int setkey(Map<String ,String> map);
}
