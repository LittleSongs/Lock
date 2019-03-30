package com.dhy.yycompany.lock.controller.loginController;

import com.alibaba.fastjson.JSON;

import com.dhy.yycompany.lock.bean.Administrator;
import com.dhy.yycompany.lock.service.AdminService.AdministratorService;
import com.dhy.yycompany.lock.service.loginService.LoginService;
import com.dhy.yycompany.lock.utils.GetSessionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("lock")
//@SessionAttributes(value={"sellId","store","storeId","nickname","username"})
public class LoginController {
    @Autowired
    private LoginService loginServiceImpl;

    @Autowired
    private AdministratorService administratorServiceImpl;


    @RequestMapping(value="loginverify")
    @ResponseBody
    public JSON loginverify(@RequestParam("username")String username, @RequestParam("password") String password,ModelMap mod)
    {
        System.out.println("ppppp1");
        //System.out.println(username+password);
        JSON login = loginServiceImpl.login(username, password);
        Map<String,String> map5= (Map<String,String>)login;
        String code = map5.get("code");
        String sellId = map5.get("id");
        int i = Integer.parseInt(sellId);
        if(code.equals("10"))
        {
            System.out.println("登录成功");
            HttpSession session = GetSessionUtil.getSession();
            session.setAttribute("adminId", i);
        }
        //code为10登录成功
            return login;
    }

    @RequestMapping(value="index")
    public String loging(ModelMap mod)
    {
        System.out.println("index");

        HttpSession session = GetSessionUtil.getSession();
        int adminId = (int) session.getAttribute("adminId");
        //获得管理员信息
        Administrator administrator = administratorServiceImpl.GetAdminMessage(adminId);
        String adminName = administrator.getAdminName();//姓名
        String adminAvator = administrator.getAdminAvator();//头像地址
        int adminPermission = administrator.getAdminPermission();//权限


        mod.addAttribute("adminName",adminName);
        mod.addAttribute("adminAvator",adminAvator);
        mod.addAttribute("adminPermission",adminPermission);

        return "index.jsp";
    }


}
