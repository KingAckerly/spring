package com.example.spring.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;

public class RedisTest {

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    public static void main(String[] args) {
        RedisTest redisTest = new RedisTest();
        redisTest.redis();
    }


    public void redis() {
        stringRedisTemplate.opsForValue().set("key1", "value1");
        String key1 = stringRedisTemplate.opsForValue().get("key1");
        System.out.println(key1);
    }

}
