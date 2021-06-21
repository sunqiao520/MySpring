package com.sq.springframework.beans.factory.support;

import com.sq.springframework.beans.BeansException;
import com.sq.springframework.beans.factory.BeanFactory;
import com.sq.springframework.beans.factory.config.BeanDefinition;

/**
 * @author SunQiao
 * @create 2021-06-21 19:14
 */
public abstract class AbstractBeanFactory extends DefaultSingletonRegistry implements BeanFactory {
    @Override
    public Object getBean(String name) throws BeansException {
        Object bean = getSingleton(name);
        if(bean != null) {
            return bean;
        }
        BeanDefinition beanDefinition = getBeanDefinition(name);
        return createBean(name,beanDefinition);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;
    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException;
}
