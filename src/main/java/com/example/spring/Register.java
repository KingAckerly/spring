package com.example.spring;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang.StringUtils;

import java.util.*;

public class Register {
    public static void main(String[] args) {
        //阿里巴巴的fastjson
        //JSONArray
        JSONArray jsonArray = new JSONArray();
        //JSONObject
        JSONObject json1 = new JSONObject();
        json1.put("sfzjhm", "420");
        json1.put("sfzjlx", "11");
        json1.put("smrzRL", "5");
        jsonArray.add(json1);
        JSONObject json2 = new JSONObject();
        json2.put("sfzjhm", "420");
        json2.put("sfzjlx", "11");
        json2.put("smrzRL", "6");
        jsonArray.add(json2);
        JSONObject json3 = new JSONObject();
        json3.put("sfzjhm", "423");
        json3.put("sfzjlx", "3");
        json3.put("smrzRL", "");
        jsonArray.add(json3);
        System.out.println("jsonArray:" + jsonArray);
        System.out.println("jsonArray.toString():" + jsonArray.toString());
        //JSONArray转json字符串
        String jsonStr = jsonArray.toString();
        System.out.println("jsonStr:" + jsonStr);
        //json字符串转JSONArray
        JSONArray json = JSONArray.parseArray(jsonStr);
        System.out.println("json:" + json);
        //json字符串转List<T>
        List<SmrzData> list = JSONObject.parseArray(jsonStr, SmrzData.class);
        System.out.println("list:" + list);
        //转Set去重
        Set<SmrzData> set = new HashSet<>(list);
        System.out.println("set:" + set);
        list = new ArrayList<>(set);
        System.out.println("list去重后:" + list);
        Iterator<SmrzData> it = list.iterator();
        while (it.hasNext()) {
            SmrzData smrzData = it.next();
            if (StringUtils.isBlank(smrzData.getSmrzRL())) {
                it.remove();
            }
        }
        System.out.println("过滤掉没有smrzRL的元素后,list:" + list);
    }
}
