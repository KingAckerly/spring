package com.example.spring.algorithm;

import java.util.*;

/**
 * 去不重
 */
public class CleanNoRepeat {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("1");
        list1.add("1");
        list1.add("2");
        list1.add("3");
        list1.add("3");
        list1.add("4");
        System.out.println(list1);//[1, 1, 2, 3, 3, 4]
        Map<String, Integer> map = new HashMap<>();
        for (String item : list1) {
            if (map.containsKey(item)) {
                map.put(item, map.get(item) + 1);
            } else {
                map.put(item, 1);
            }
        }
        Iterator<String> iterator = list1.iterator();
        while (iterator.hasNext()) {
            String i = iterator.next();
            if (!map.get(i).equals(1)) {
                iterator.remove();
            }
        }
        System.out.println(list1);//[2, 4]
    }
}
