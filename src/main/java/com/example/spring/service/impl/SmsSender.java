package com.example.spring.service.impl;

import com.example.spring.service.Sender;

/**
 * 短信发送者
 */
public class SmsSender implements Sender {
    /**
     * 发送
     */
    @Override
    public void send() {
        System.out.println("this is sms sender!");
    }
}
