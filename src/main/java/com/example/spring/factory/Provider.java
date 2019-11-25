package com.example.spring.factory;

import com.example.spring.service.Sender;

/**
 * 生产提供者
 */
public interface Provider {
    /**
     * 提供发送者
     *
     * @return
     */
    Sender produce();
}
