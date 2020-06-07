package com.imooc.faceTo;

public class Cat {
    String name;
    int age;


    public Cat() {
        System.out.println("我是构造方法");
    }

    public Cat(String name, int age) {
//        name = name;
        this(); //  第一行 可以调用同一个类可以调用构造函数
        this.name = name;
        this.age = age;
        this.introduce();
        introduce();
    }

    public void introduce() {
        System.out.println("我的名字：" + name + ' ' + "今年" + age);
    }

    public String getName() {
        return  "我是:" + this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
