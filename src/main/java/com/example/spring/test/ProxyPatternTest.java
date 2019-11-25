package com.example.spring.test;

import com.example.spring.gof.*;

/**
 * 代理模式测试
 */
public class ProxyPatternTest {
    public static void main(String[] args) {
        CglibProxy cglib = new CglibProxy();
        //通过CGLIB动态生成代理对象
        Work work = (Work) cglib.getInstance(new Work());
        //预处理
        //工作
        //后处理
        work.work();
    }
}
