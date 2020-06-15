package com.imooc.extendsTest;

public class childExtends2 extends firstExtends{

    private String sex;

    public childExtends2() {
        super("abc");
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public void sleep() {
        System.out.println(this.getName());
        System.out.println("childExtends2");
        super.eat(1);
    }

    @Override
    public String eat(int num) {
        System.out.println(this.getName() + "最近没有食欲");
        return "1";
    }
    private void privateFun() {
        System.out.println("private子类");
    }
}
