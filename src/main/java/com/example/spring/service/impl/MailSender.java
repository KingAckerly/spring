package com.example.spring.service.impl;

import com.example.spring.service.Sender;

/**
 * 邮件发送者
 */
public class MailSender implements Sender {
    /**
     * 发送
     */
    @Override
    public void send() {
        System.out.println("this is mailsender!");
    }
}
