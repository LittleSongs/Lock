package com.dhy.yycompany.lock.service.UserService;

import java.util.Map;

public interface UserService {
    /**
     * 用户退宿功能：住户表删除住户，对应的room表住户数减1，住户对应的开门密码表的信息需要删除，指令表增加删除密码指令，让树莓派更新密码表。
     * @param userID
     * @return
     */
    Map<String,String> deleteUser(int userID);
}
