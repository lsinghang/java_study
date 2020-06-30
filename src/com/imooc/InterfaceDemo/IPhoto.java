package com.imooc.InterfaceDemo;

/*
* 具有照相能力的接口
* */

public interface IPhoto {
    public void photo();

    // 可以在实现类中重写, 并可以通过接口的引用调用
    default void connection() {
        System.out.println("我是接口中的默认方法");
    }

    // 不可以在实现类中重写, 可以同接口名调用
    static void stop() {
        System.out.println("我是接口中的静态方法");
    }
}
