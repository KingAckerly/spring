package com.example.spring;


import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.util.HashSet;
import java.util.List;

public class Register {
    public static void main(String[] args) {
        JSONArray jsonArray = new JSONArray();
        JSONObject json1 = new JSONObject();
        json1.accumulate("sfzjhm", "420");
        json1.accumulate("sfzjlx", "1");
        json1.accumulate("smrzRL", "4");
        jsonArray.add(json1);
        JSONObject json2 = new JSONObject();
        json2.accumulate("sfzjhm", "420");
        json2.accumulate("sfzjlx", "11");
        json2.accumulate("smrzRL", "5");
        jsonArray.add(json2);
        JSONObject json3 = new JSONObject();
        json3.accumulate("sfzjhm", "423");
        json3.accumulate("sfzjlx", "3");
        json3.accumulate("smrzRL", "1");
        jsonArray.add(json3);
        System.out.println("jsonArray:" + jsonArray);
        System.out.println("jsonArray.toString():" + jsonArray.toString());
        String jsonStr = jsonArray.toString();
        JSONArray json = JSONArray.fromObject(jsonStr);
        System.out.println("json:" + json);
        List<SmrzData> list = JSONArray.toList(json);
        System.out.println("list:" + list);
        HashSet set = new HashSet(list);
        System.out.println("set:" + set);
    }
}
