package com.example.spring.gof;

/**
 * 代理角色
 */
public class ProxyHousework implements Housework {
    /**
     * 持有真实对象实例
     */
    private RealHousework realHousework;
    /**
     * 用户
     */
    private String userName;
    public ProxyHousework(String userName) {
        this.userName = userName;
    }
    /**
     * 做饭
     */
    @Override
    public void cook() {
        System.out.println("预处理,先洗菜");
        if (realHousework == null) {
            realHousework = new RealHousework(userName);
        }
        //调用真实对象实例来做饭
        realHousework.cook();
        System.out.println("后处理,后洗碗");
    }
}
