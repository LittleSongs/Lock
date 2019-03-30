package com.dhy.yycompany.lock.utils;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * 获得session
 */
public class GetSessionUtil {

    public static HttpSession getSession() {
        HttpSession session = null;
        try {
            session = getRequest().getSession();
        } catch (Exception e) {}
        return session;
    }

    private static HttpServletRequest getRequest() {
        ServletRequestAttributes attrs =(ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        return attrs.getRequest();
    }
}
