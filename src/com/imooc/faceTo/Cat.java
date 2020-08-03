package com.imooc.faceTo;

public class Cat {
    String name;
    int age;
    int price;

    public Cat() {
        System.out.println("我是构造方法");
    }

    public Cat(String name, int age, int price) {
//        name = name;
        this(); //  第一行 可以调用同一个类可以调用构造函数
        this.name = name;
        this.age = age;
        this.price = price;
        this.introduce();
        introduce();
    }

    public void introduce() {
        System.out.println("我的名字：" + name + ' ' + "今年" + age);
    }

    public String getName() {
        return  "我是:" + this.name;
    }
    public double getPrice() { return  this.price; }
    public void setName(String name) {
        this.name = name;
    }
}
