package com.example.spring.map;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {
    public static void main(String[] args) {
        //调试hashmap转红黑树的时机
        //链表节点个数>=8并且数组长度>=64,才会转红黑树
        //Map<A03Bean, Integer> hashmap = new HashMap<>(100);
        Map<A03Bean, Integer> hashmap = new HashMap<>();
        hashmap.put(new A03Bean(4), 0);
        hashmap.put(new A03Bean(8), 1);
        hashmap.put(new A03Bean(12), 2);
        hashmap.put(new A03Bean(16), 3);
        hashmap.put(new A03Bean(20), 4);
        hashmap.put(new A03Bean(24), 5);
        hashmap.put(new A03Bean(28), 6);
        hashmap.put(new A03Bean(32), 7);
        hashmap.put(new A03Bean(36), 8);
        hashmap.put(new A03Bean(40), 9);
        hashmap.put(new A03Bean(44), 10);
    }
}
