package com.sq.springframework.beans.factory;

import com.sq.springframework.beans.BeansException;

/**
 * @author SunQiao
 * @create 2021-06-21 19:00
 */
public interface BeanFactory {
    Object getBean(String name) throws BeansException;
}
