package com.example.spring.gof;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * CGLIB动态代理
 */
public class CglibProxy implements MethodInterceptor {
    /**
     * 真实对象
     */
    private Object object;
    /**
     * 创建代理对象
     *
     * @param object
     * @return
     */
    public Object getInstance(Object object) {
        this.object = object;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.object.getClass());
        //回调方法
        enhancer.setCallback(this);
        //创建代理对象
        return enhancer.create();
    }
    /**
     * 拦截方法 在调用具体的业务逻辑前和后 进行其他的相关处理
     *
     * @param o
     * @param method
     * @param objects
     * @param methodProxy
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("预处理");
        methodProxy.invokeSuper(o, objects);
        System.out.println("后处理");
        return null;
    }
}
