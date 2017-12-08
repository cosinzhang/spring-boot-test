package com.techzhang.springboottest.init.dto;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by zhanghaijun on 2017/12/8.
 */
public class InitByPostConstruct {

    @PostConstruct
    private void initPostConstruct(){
        System.out.println("PostConstruct");

    }

    @PreDestroy
    private void destroy(){
        System.out.println("destroy");
    }




}
