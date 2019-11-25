package com.example.spring.algorithm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 去重算法
 */
public class CleanRepeat {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(3);
        list1.add(4);
        List<Integer> list2 = new ArrayList<>();
        System.out.println(list1);//[1, 1, 1, 1, 2, 2]
        System.out.println(list2);//[]
        Iterator<Integer> iterator = list1.iterator();
        while (iterator.hasNext()) {
            int i = iterator.next();
            if (list2.contains(i)) {
                iterator.remove();
            } else {
                list2.add(i);
            }
        }
        System.out.println(list1);//[1, 2]
        System.out.println(list2);//[1, 2]
    }
}
