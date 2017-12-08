package com.techzhang.springboottest.init.dto;

import org.springframework.beans.factory.InitializingBean;

/**
 * Created by zhanghaijun on 2017/12/8.
 */
public class InitByInitializingBean implements InitializingBean {

    @Override
    public void afterPropertiesSet() throws Exception {

        System.out.println("afterPropertiesSet");

    }
}
