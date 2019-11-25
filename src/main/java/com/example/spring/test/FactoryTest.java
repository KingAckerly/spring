package com.example.spring.test;

import com.example.spring.factory.Provider;
import com.example.spring.factory.SendMailFactory;
import com.example.spring.factory.SendSmsFactory;
import com.example.spring.service.Sender;

public class FactoryTest {
    public static void main(String[] args) {
//        SendFactory factory = new SendFactory();
//        Sender mailSender = factory.produce("mail");
//        Sender smsSender = factory.produce("sms");
//        mailSender.send();
//        smsSender.send();
//        SendFactory factory = new SendFactory();
//        Sender mailSender = factory.produceMail();
//        mailSender.send();
//        Sender smsSender = factory.produceSms();
//        smsSender.send();
//        Sender mailSender = SendFactory.produceMail();
//        mailSender.send();
//        Sender smsSender = SendFactory.produceSms();
//        smsSender.send();
        Provider sendMailProvider = new SendMailFactory();
        Sender mailSender = sendMailProvider.produce();
        mailSender.send();
        Provider sendSmsProvider = new SendSmsFactory();
        Sender smsSender = sendSmsProvider.produce();
        smsSender.send();
    }
}
