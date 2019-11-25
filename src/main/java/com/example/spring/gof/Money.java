package com.example.spring.gof;

import java.io.*;

/**
 * 具体原型角色
 */
public class Money implements Prototype, Serializable {
    /**
     * 面值
     */
    private int faceValue;
    /**
     * 币种
     */
    private String type;
    public int getFaceValue() {
        return faceValue;
    }
    public Money setFaceValue(int faceValue) {
        this.faceValue = faceValue;
        return this;
    }
    public String getType() {
        return type;
    }
    public Money setType(String type) {
        this.type = type;
        return this;
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Money{");
        sb.append("faceValue=").append(faceValue);
        sb.append(", type='").append(type).append('\'');
        sb.append('}');
        return sb.toString();
    }
    /**
     * 拷贝
     *
     * @return
     */
    @Override
    public Object copy() {
        Money money = null;
        try {
            //通过序列化深拷贝
            money = (Money) deepClone();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return money;
    }
    /**
     * 通过序列化深拷贝
     *
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public Object deepClone() throws IOException, ClassNotFoundException {
        //将对象写到流里
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);
        //从流里读回来
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }
}
