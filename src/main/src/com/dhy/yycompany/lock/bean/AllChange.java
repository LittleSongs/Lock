package com.dhy.yycompany.lock.bean;

import com.dhy.yycompany.lock.bean.UserInfo;

import java.util.List;

public  class AllChange {
    /**
     * 性别转换
     * @param userInfoList
     */
      public static void changeSex(List<UserInfo> userInfoList)
    {
        for(int i=0;i<userInfoList.size();i++)
        {
            UserInfo userInfo = userInfoList.get(i);
            String s = userInfo.getuSex();
            if(s.equals("m"))
            {
                userInfo.setSexStr("男");
            }else if(s.equals("w"))
            {
                userInfo.setSexStr("女");
            }
        }
    }
}
