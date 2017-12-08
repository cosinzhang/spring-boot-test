package com.techzhang.springboottest.init;

import com.techzhang.springboottest.init.dto.InitByInitializingBean;
import com.techzhang.springboottest.init.dto.InitByPostConstruct;
import org.junit.Test;

/**
 * Created by zhanghaijun on 2017/12/8.
 */
public class InitBeanTest {


    @Test
    public void testInit(){
        InitByPostConstruct initByPostConstruct = new InitByPostConstruct();

        InitByInitializingBean initByInitializingBean = new InitByInitializingBean();


    }











}
