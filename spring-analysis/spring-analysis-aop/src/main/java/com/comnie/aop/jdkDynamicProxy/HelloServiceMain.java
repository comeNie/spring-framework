package com.comnie.aop.jdkDynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by 波 on 2016/12/14.
 */
public class HelloServiceMain {
    public static void main(String[] args) {
        HelloService helloService = new HelloServiceImpl();
        InvocationHandler handler = new HelloServiceProxy(helloService);
        HelloService helloServiceProxy = (HelloService) Proxy.newProxyInstance(helloService.getClass().getClassLoader(),helloService.getClass().getInterfaces(),handler);
        helloServiceProxy.sayHello("world");
    }
}
