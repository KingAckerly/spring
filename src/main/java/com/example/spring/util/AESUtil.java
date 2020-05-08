package com.example.spring.util;


import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.UUID;

public class AESUtil {

    /**
     * @param key     密钥
     * @param content 需要加密的字符串
     * @return 密文字节数组
     */
    public static byte[] encrypt(String key, String content) {
        byte[] rawKey = genKey(key.getBytes());
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(rawKey, "AES");
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
            byte[] encypted = cipher.doFinal(content.getBytes());
            return encypted;
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * @param encrypted 密文字节数组
     * @param key       密钥
     * @return 解密后的字符串
     */
    public static String decrypt(byte[] encrypted, String key) {
        byte[] rawKey = genKey(key.getBytes());
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(rawKey, "AES");
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.DECRYPT_MODE, secretKeySpec);
            byte[] decrypted = cipher.doFinal(encrypted);
            return new String(decrypted);
        } catch (Exception e) {
            return "";
        }
    }

    /**
     * @param seed 种子数据
     * @return 密钥数据
     */
    private static byte[] genKey(byte[] seed) {
        byte[] rawKey = null;
        try {
            KeyGenerator kgen = KeyGenerator.getInstance("AES");
            SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG");
            secureRandom.setSeed(seed);
            // AES加密数据块分组长度必须为128比特，密钥长度可以是128比特、192比特、256比特中的任意一个
            kgen.init(128, secureRandom);
            SecretKey secretKey = kgen.generateKey();
            rawKey = secretKey.getEncoded();
        } catch (NoSuchAlgorithmException e) {
        }
        return rawKey;
    }


    public static void main(String[] args) {
        // 密钥的种子，可以是任何形式，本质是字节数组
        String key = UUID.randomUUID().toString();
        // 密码的明文
        String clearPwd = "123456";
        // 密码加密后的密文
        byte[] encryptedByteArr = encrypt(key, clearPwd);
        String encryptedPwd = new String(encryptedByteArr);
        System.out.println(encryptedPwd);
        // 解密后的字符串
        String decryptedPwd = decrypt(encryptedByteArr, key);
        System.out.println(decryptedPwd);
    }

}
