package com.comnie.aop.jdkDynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by 波 on 2016/12/14.
 */
public class HelloServiceProxy implements InvocationHandler{

    private  Object target;

    public HelloServiceProxy(Object target) {
        this.target = target;
    }

    /**
     * 该方法负责集中处理动态代理类上的所有方法调用。
     * 调用处理器根据这三个参数进行预处理或分派到委托类实例上反射执行
     *
     * @param proxy  代理类实例
     * @param method 被调用的方法对象
     * @param args   调用参数
     * @return
     * @throws Throwable
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before---------:"+method.getName());
        Object result = method.invoke(target,args);
        System.out.print("after----------:"+ method.getName()+",result:"+result);
        return result;
    }
}
