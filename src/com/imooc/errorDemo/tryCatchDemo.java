package com.imooc.errorDemo;

import java.util.Scanner;

public class tryCatchDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("=======运算开始 =======");
            int one = input.nextInt();
            int two = input.nextInt();
            System.out.println("one 和 two的商" + (one/two));
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        } finally {
            System.out.println("无论怎么样我都执行");
        }
        System.out.println("运算结束");
    }
}
