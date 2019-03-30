package com.dhy.yycompany.lock.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GetTimeUtil {

    /**
     * 获取当前时间
     * <p>
     * yyyy-MM-dd HH:mm:ss
     * @return
     */
    public static String getTime()
    {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        String format = df.format(new Date());
        //System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
        return format;
    }
    /**
     * String转Date
     * */
    public static java.sql.Date strToDate(String strDate) {
        String str = strDate;
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date d = null;
        try {
            d = format.parse(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
        java.sql.Date date = new java.sql.Date(d.getTime());
        return date;
    }

    /**
     * <p>比较时间大小，返回1比2大还是小</p>
     * <p>0-相等，1-大，-1-小</p>
     * @param date1
     * @param date2
     * @return
     */
    public static int compareDate(Date date1,Date date2) {
        try {
            int compareTo = date1.compareTo(date2);
            return compareTo;
            //System.out.println(compareTo);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 11;
    }
}
