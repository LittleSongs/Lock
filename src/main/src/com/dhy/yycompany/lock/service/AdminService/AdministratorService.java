package com.dhy.yycompany.lock.service.AdminService;

import java.util.Map;

public interface AdministratorService {

    //管理员生成密码
    int setkey(Map<String ,String> map);

}
