package com.dhy.yycompany.lock.service.loginService;


import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public interface LoginService {
    public JSON login(String account, String password);
}
