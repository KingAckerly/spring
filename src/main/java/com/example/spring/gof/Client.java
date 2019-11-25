package com.example.spring.gof;

/**
 * 客户端角色
 */
public class Client {
    public static void main(String[] args) {
        //1.向原型管理器注册一个原型
        String prototypeId = "p1";
        Prototype prototype = new Money().setFaceValue(100).setType("RMB");
        System.out.println(prototype.hashCode());//1067040082
        PrototypeManager.setPrototype(prototypeId, prototype);
        //2.从原型管理器中获取一个原型
        prototype = PrototypeManager.getPrototype(prototypeId);
        System.out.println(prototype.hashCode());//1067040082
        //3.从原型管理器中获取一个原型的拷贝
        prototype = (Prototype) PrototypeManager.getPrototype(prototypeId).copy();
        System.out.println(prototype.hashCode());//443308702
        //4.从原型管理器中删除一个原型
        PrototypeManager.removePrototype(prototypeId);
        prototype = PrototypeManager.getPrototype(prototypeId);
        System.out.println(prototype);//null
    }
}
