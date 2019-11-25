package com.example.spring.factory;

import com.example.spring.service.Sender;
import com.example.spring.service.impl.MailSender;
import com.example.spring.service.impl.SmsSender;

/**
 * 发送者工厂
 */
public class SendFactory {
    /**
     * 创建发送者
     *
     * @param type
     * @return
     */
    public Sender produce(String type) {
        if ("mail".equals(type)) {
            return new MailSender();
        } else if ("sms".equals(type)) {
            return new SmsSender();
        } else {
            System.out.println("请输入正确的类型!");
            return null;
        }
    }

    /**
     * 生产邮件
     *
     * @return
     */
    public static Sender produceMail() {
        return new MailSender();
    }

    /**
     * 生产短信
     *
     * @return
     */
    public static Sender produceSms() {
        return new SmsSender();
    }
}
