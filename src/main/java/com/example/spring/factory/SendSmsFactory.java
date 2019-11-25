package com.example.spring.factory;

import com.example.spring.service.Sender;
import com.example.spring.service.impl.SmsSender;

/**
 * 短信发送工厂
 */
public class SendSmsFactory implements Provider {
    /**
     * 生产短信发送者
     *
     * @return
     */
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
