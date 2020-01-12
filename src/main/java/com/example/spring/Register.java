package com.example.spring;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
        json2.put("smrzRL", "5");
        jsonArray.add(json2);
        JSONObject json3 = new JSONObject();
        json3.put("sfzjhm", "423");
        json3.put("sfzjlx", "3");
        json3.put("smrzRL", "1");
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
        Set<SmrzData> set = new HashSet<>();
        for (SmrzData smrzData : list) {
            set.add(smrzData);
        }
        System.out.println("set:" + set);
    }
}
