package com.dhy.yycompany.lock.service.FingerService;

import java.util.Map;

public interface FingerPrintService {

    /**
     * 添加指纹方法
     *
     * process=1表示第一次录入
     * process=2表示第二次录入
     *
     * @return
     */
    Map<String,Object> addFingerPrint(int u_id,int l_id,String fName,int process);
}
