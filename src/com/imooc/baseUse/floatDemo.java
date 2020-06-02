package com.imooc.baseUse;

public class floatDemo {
    public static void main(String[] args) {
        float f = 1234.21323f;
        System.out.println("f=" + f);

        double b = 12313.23123; // 123d  123D
        double bf = 12313.23123f; // 123d  123D
        System.out.println("b=" + b);
        System.out.println("bf=" + bf);

        double dTof = 12313f;
        System.out.println("dTof=" + dTof);

//        float fTb = 1234.21323d; 精度少的不能赋值小精度的

    }
}
