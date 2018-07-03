package com.baizhi.test;

import com.baizhi.service.UserService;
import org.junit.Test;

/**
 * Created by Administrator on 2018/7/3.
 */
public class MyTest {
    @Test
    public void test1(){
        UserService userService=new UserService();
        userService.queryAll();
    }
}
