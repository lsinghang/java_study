package com.imooc.TestSingtonone;

import com.imooc.singleMode.SingletonOne;
import com.imooc.singleMode.SingletonTwo;


public class TestSingle {
    public static void main(String[] args) {
        SingletonOne one = SingletonOne.getInstance();
        SingletonOne two = SingletonOne.getInstance();
        System.out.println(one);
        System.out.println(two);
        SingletonTwo tree = SingletonTwo.getInstance();
        SingletonTwo four = SingletonTwo.getInstance();
        System.out.println(tree);
        System.out.println(four);
    }
}
