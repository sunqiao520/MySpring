package com.sq.springframework;

/**
 * @author SunQiao
 * @create 2021-06-21 16:29
 */
public class BeanDefinition {
    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }
    public Object getBean() {
        return bean;
    }
}
