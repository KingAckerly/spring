package com.example.spring.factory;

import com.example.spring.service.Sender;
import com.example.spring.service.impl.MailSender;

/**
 * 邮件发送工厂
 */
public class SendMailFactory implements Provider {
    /**
     * 生产邮件发送者
     *
     * @return
     */
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
