package com.imooc.InterfaceDemo;

public class InterfaceDemo {
    public static void main(String[] args) {
        Icream one = new Icream();
        one.photo();
        System.out.println("========================");
        one.connection();
        IPhoto.stop(); // 静态方法需要用接口名字来调用
    }
}
