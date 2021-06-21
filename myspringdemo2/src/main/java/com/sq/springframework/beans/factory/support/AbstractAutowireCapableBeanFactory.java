package com.sq.springframework.beans.factory.support;

import com.sq.springframework.beans.BeansException;
import com.sq.springframework.beans.factory.config.BeanDefinition;

/**
 * @author SunQiao
 * @create 2021-06-21 19:23
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {

    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException {
        Object bean = null;
        try {
            bean = beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new BeansException("Instantiation of bean failed", e);
        }

        addSingleton(beanName, bean);
        return bean;
    }
}
