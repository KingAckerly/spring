package com.example.spring.gof;

/**
 * 建造者模式-Product类
 */
public class Person {
    /**
     * 头部
     */
    private String head;
    /**
     * 身体
     */
    private String body;
    /**
     * 四肢
     */
    private String foot;
    public String getHead() {
        return head;
    }
    public Person setHead(String head) {
        this.head = head;
        return this;
    }
    public String getBody() {
        return body;
    }
    public Person setBody(String body) {
        this.body = body;
        return this;
    }
    public String getFoot() {
        return foot;
    }
    public Person setFoot(String foot) {
        this.foot = foot;
        return this;
    }
}
