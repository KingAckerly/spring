package com.example.spring.gof;


import java.io.*;

public class Area implements Serializable {
    /**
     * 钞票单位
     */
    private String unit;

    public String getUnit() {
        return unit;
    }

    public Area setUnit(String unit) {
        this.unit = unit;
        return this;
    }

    @Override
    protected Area clone() throws CloneNotSupportedException {
        Area area = null;
        try {
            //调用deepClone，而不是Object的clone方法
            area = (Area) deepClone();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return area;
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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Area{");
        sb.append("unit='").append(unit).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
