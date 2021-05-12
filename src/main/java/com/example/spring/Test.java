package com.example.spring;


import com.google.common.collect.Maps;
import com.google.common.collect.Multiset;

import java.util.Map;

public class Test {


    public static void main(String[] args) {
        Map<String, String> map = Maps.newHashMap();
        map.put("k", "v");
        System.out.println(map);
        String[] strs = ",a,,b,".split(",");
        for (String item : strs) {
            System.out.print(item + "_");
        }

    }


}
