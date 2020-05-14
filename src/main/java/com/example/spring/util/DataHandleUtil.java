package com.example.spring.util;


import org.apache.commons.lang.StringUtils;


public class DataHandleUtil {

    /**
     * 将字符串开始位置到结束位置之间的字符用指定字符替换
     *
     * @param sourceStr   待处理字符串
     * @param begin       开始位置
     * @param end         结束位置
     * @param replacement 替换字符
     * @return
     */
    private static String replaceBetween(String sourceStr, int begin, int end, String replacement) {
        if (sourceStr == null) {
            return "";
        }
        if (replacement == null) {
            replacement = "*";
        }
        int replaceLength = end - begin;
        if (StringUtils.isNotBlank(sourceStr) && replaceLength > 0) {
            StringBuilder sb = new StringBuilder(sourceStr);
            sb.replace(begin, end, StringUtils.repeat(replacement, replaceLength));
            return sb.toString();
        } else {
            return sourceStr;
        }
    }


    public static void main(String[] args) {
        String idCard = "420104194410120410";
        System.out.println(idCard);
        //显示前六后四
        idCard = replaceBetween(idCard, 6, idCard.length() - 4, null);
        System.out.println(idCard);
    }
}
