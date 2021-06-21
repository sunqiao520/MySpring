package com.sq.springframework.beans;

/**
 * @author SunQiao
 * @create 2021-06-21 18:59
 */
public class BeansException extends RuntimeException{
    public BeansException(String msg) {
        super(msg);
    }
    public BeansException(String msg,Throwable cause) {
        super(msg,cause);
    }
}
