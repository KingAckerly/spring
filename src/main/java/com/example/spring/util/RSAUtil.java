package com.example.spring.util;


import javax.crypto.Cipher;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;

public class RSAUtil {

    /**
     * 生成密钥对
     *
     * @return
     * @throws Exception
     */
    public static KeyPair genKeyPair() throws Exception {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        // 一般为1024，为了更安全最好采用2048
        keyPairGenerator.initialize(1024);
        return keyPairGenerator.generateKeyPair();
    }

    /**
     * 公钥加密
     *
     * @param content
     * @param publicKey
     * @return
     * @throws Exception
     */
    public static byte[] encrypt(byte[] content, PublicKey publicKey) throws Exception {
        // java默认"RSA"="RSA/ECB/PKCS1Padding"
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);
        return cipher.doFinal(content);
    }

    /**
     * 私钥解密
     *
     * @param content
     * @param privateKey
     * @return
     * @throws Exception
     */
    public static byte[] decrypt(byte[] content, PrivateKey privateKey) throws Exception {
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.DECRYPT_MODE, privateKey);
        return cipher.doFinal(content);
    }

    public static void main(String[] args) throws Exception {
        String data = "123456";
        KeyPair keyPair = genKeyPair();
        //获取公钥，并以base64格式打印出来
        PublicKey publicKey = keyPair.getPublic();
        //System.out.println("公钥："+new String(Base64.getEncoder().encode(publicKey.getEncoded())));
        System.out.println("公钥：" + publicKey);
        //获取私钥，并以base64格式打印出来
        PrivateKey privateKey = keyPair.getPrivate();
        //System.out.println("私钥："+new String(Base64.getEncoder().encode(privateKey.getEncoded())));
        System.out.println("私钥：" + privateKey);
        //公钥加密
        byte[] encryptedBytes = encrypt(data.getBytes(), publicKey);
        //System.out.println("加密后："+new String(encryptedBytes));
        System.out.println("加密后：" + encryptedBytes);
        //私钥解密
        byte[] decryptedBytes = decrypt(encryptedBytes, privateKey);
        System.out.println("解密后：" + new String(decryptedBytes));
    }

}
