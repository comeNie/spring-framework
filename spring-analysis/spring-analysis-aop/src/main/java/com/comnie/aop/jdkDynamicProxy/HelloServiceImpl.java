package com.comnie.aop.jdkDynamicProxy;

/**
 * Created by 波 on 2016/12/14.
 */
public class HelloServiceImpl implements HelloService {
    public String sayHello(String message) {
        return "hello "+ message;
    }
}
