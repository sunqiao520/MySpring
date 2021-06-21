package com.sq.springframework.beans.factory.support;

import com.sq.springframework.beans.factory.config.BeanDefinition;

/**
 * @author SunQiao
 * @create 2021-06-21 19:24
 */
public interface BeanDefinitionRegistry {
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
