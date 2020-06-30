package com.imooc.InterfaceDemo;

public interface INet {
    default void connection() {
        System.out.println("INet 的默认方法");
    }
}
