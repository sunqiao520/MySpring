package com.sq.springframework.test;

import com.sq.springframework.BeanDefinition;
import com.sq.springframework.BeanFactory;
import com.sq.springframework.test.bean.UserService;
import org.junit.Test;

/**
 * @author SunQiao
 * @create 2021-06-21 16:37
 */
public class ApiTest {
    @Test
    public void test_BeanFactory(){
        // 1.初始化 BeanFactory
        BeanFactory beanFactory = new BeanFactory();

        // 2.注册 bean
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 3.获取 bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }
}
