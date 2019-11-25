package com.example.spring.gof;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * JDK动态代理
 */
public class DynamicProxyHandler implements InvocationHandler {
    /**
     * 真实对象
     */
    private Object object;
    public DynamicProxyHandler(Object object) {
        this.object = object;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("预处理,先洗菜");
        Object result = method.invoke(object, args);
        System.out.println("后处理,后洗碗");
        return result;
    }
}
