package com.sq.springframework.beans.factory.config;

/**
 * @author SunQiao
 * @create 2021-06-21 19:06
 */
public interface SingletonBeanRegistry {
    Object getSingleton(String beanName);
}
