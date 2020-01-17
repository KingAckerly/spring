package com.example.spring;


import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ImageUtil {
    /**
     * 通过图片的url获取图片的base64字符串
     *
     * @param imgUrl
     * @return
     */
    public static String imageToBase64(String imgUrl) {
        URL url = null;
        InputStream is = null;
        ByteArrayOutputStream outStream = null;
        HttpURLConnection httpUrl = null;
        try {
            url = new URL(imgUrl);
            httpUrl = (HttpURLConnection) url.openConnection();
            httpUrl.connect();
            httpUrl.getInputStream();
            is = httpUrl.getInputStream();
            outStream = new ByteArrayOutputStream();
            //创建一个Buffer字符串
            byte[] buffer = new byte[1024];
            //每次读取的字符串长度，如果为-1，代表全部读取完毕
            int len = 0;
            //使用一个输入流从buffer里把数据读取出来
            while ((len = is.read(buffer)) != -1) {
                //用输出流往buffer里写入数据，中间参数代表从哪个位置开始读，len代表读取的长度
                outStream.write(buffer, 0, len);
            }
            // 对字节数组Base64编码
            return encode(outStream.toByteArray());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (outStream != null) {
                try {
                    outStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (httpUrl != null) {
                httpUrl.disconnect();
            }
        }
        return imgUrl;
    }

    /**
     * 图片转字符串
     *
     * @param image
     * @return
     */
    public static String encode(byte[] image) {
        BASE64Encoder decoder = new BASE64Encoder();
        return replaceEnter(decoder.encode(image));
    }

    public static String replaceEnter(String str) {
        String reg = "[\n-\r]";
        Pattern p = Pattern.compile(reg);
        Matcher m = p.matcher(str);
        return m.replaceAll("");
    }


    /**
     * base64字符串转图片
     *
     * @param imgBase64Str
     * @param path
     * @return
     */
    public static boolean generateImage(String imgBase64Str, String path) {
        if (imgBase64Str == null)
            return false;
        BASE64Decoder decoder = new BASE64Decoder();
        try {
            // 解密
            byte[] b = decoder.decodeBuffer(imgBase64Str);
            // 处理数据
            for (int i = 0; i < b.length; ++i) {
                if (b[i] < 0) {
                    b[i] += 256;
                }
            }
            OutputStream out = new FileOutputStream(path);
            out.write(b);
            out.flush();
            out.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }


    /**
     * 根据img获取图片的宽高
     *
     * @param imgurl
     * @return
     */
    public static Map<String, Integer> getImageMap(String imgurl) {
        URL url = null;
        InputStream is = null;
        BufferedImage img = null;
        Map<String, Integer> map = new HashMap<String, Integer>();
        try {
            url = new URL(imgurl);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            //  设置请求头信息
            //con.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:47.0) Gecko/20100101 Firefox/47.0");
            //con.setRequestProperty("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
            //con.setRequestProperty("Connection", "keep-alive");
            is = con.getInputStream();
            img = ImageIO.read(is);
            System.out.println(img.getWidth());
            System.out.println(img.getHeight());
            map.put("width", img.getWidth());
            map.put("height", img.getHeight());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            img = null;
            e.printStackTrace();
        } finally {
            try {
                if (is != null) {
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return map;
    }

    public static void main(String[] args) {
        byte[] data = null;
        // 读取图片字节数组
        try {
            InputStream in = new FileInputStream("D:\\a\\1.jpg");
            data = new byte[in.available()];
            in.read(data);
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 对字节数组Base64编码
        BASE64Encoder encoder = new BASE64Encoder();
        // 返回Base64编码过的字节数组字符串
        String base64 = encoder.encode(Objects.requireNonNull(data));
        System.out.println("本地图片转换Base64:" + base64);
        String path = "D:\\a\\2.jpg";
        ImageUtil imageUtil = new ImageUtil();
        imageUtil.generateImage("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", path);


    }
}
