package com.dhy.yycompany.lock.test;

import org.junit.Test;

public class PathTest {
    @Test
    public void path(){
        String path1 = System.getProperty("evan.webapp");
        String path = this.getClass().getClassLoader().getResource("./finger/").getPath();
        System.out.println(path);
    }
}
