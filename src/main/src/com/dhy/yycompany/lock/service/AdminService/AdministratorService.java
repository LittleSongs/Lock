package com.dhy.yycompany.lock.service.AdminService;

import com.dhy.yycompany.lock.bean.Administrator;

import java.util.Map;

public interface AdministratorService {

    //管理员生成密码
    int setkey(Map<String ,String> map);

    /**
     * 获得管理员信息
     * @param id
     */
    public Administrator GetAdminMessage(int id);

}
