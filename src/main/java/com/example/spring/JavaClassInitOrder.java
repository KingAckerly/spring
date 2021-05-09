package com.example.spring;

/**
 * Java类初始化顺序
 * 先初始化类下面的static变量
 * 再初始化static静态块
 * 然后看main里面的代码顺序
 * 如果有new类的实例,那么
 * 先初始化类下面的成员变量
 * 再初始化类{}块
 * 再初始化类构造
 */
public class JavaClassInitOrder {
    private static String var1 = fun1();
    private String var2 = fun2();
    private String var3 = fun3();

    private static String fun1() {
        System.out.println("1");
        return "";
    }

    private String fun2() {
        System.out.println("2");
        return "";
    }

    private static String fun3() {
        System.out.println("3");
        return "";
    }

    {
        System.out.println("4");
    }

    static {
        System.out.println("5");
    }

    JavaClassInitOrder() {
        System.out.println("6");
    }

    public static void main(String[] args) {
        System.out.println("7");
        new JavaClassInitOrder();
    }
}
