package com.imooc.extendsTest;

public class extendsTest {
    public static void main(String[] args) {
        childExtends one = new childExtends();
        one.setName("花花");
        one.setSpecies("中华田园猫");
        one.run();
        System.out.println("=============");
        childExtends2 two =new childExtends2();
        two.setName("two");
        two.setSpecies("断尾");
        two.sleep();
        two.eat();
    }
}