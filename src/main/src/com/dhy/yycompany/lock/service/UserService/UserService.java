package com.dhy.yycompany.lock.service.UserService;

import com.alibaba.fastjson.JSON;

import java.util.Map;

public interface UserService {
    /**
     * 用户退宿功能：住户表删除住户，对应的room表住户数减1，住户对应的开门密码表的信息需要删除，指令表增加删除密码指令，让树莓派更新密码表。
     * @return
     */
    Map<String,Object> deleteUser(int roomId, int userId);


    /**
     * 整个房间的住户退宿：就是多次调用deleteUser方法
     */
    Map<String,Object> deleteAllUsers(int roomId);


    /**
     * 增加房间户主
     *
     * 1。前端把用户手机号和用户个人信息发送到后台
     * 2。在user表中创建数据
     * 3。根据手机号在手机用户表中修改userID字段为新生成user_id的值
     * 4。添加用户指纹
     * 5。把指纹信息发送到树莓派端
     * 6。room表的人数字段加1
     */
    Map<String,Object> addHomeMaster(JSON json);


    //为用户添加永久密码
    Map<String,Object> addUserKey(JSON json,int UserID);


}
