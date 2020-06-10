package com.imooc.extendsTest;

public class childExtends2 extends firstExtends{
    private String sex;

    public childExtends2() {}

    public void setSex(String sex) {
        this.sex = sex;
    }
    public void sleep() {
        System.out.println(this.getName());
        System.out.println("childExtends2");
    }

    public void eat() {
        System.out.println(this.getName() + "最近没有食欲");
    }
}
