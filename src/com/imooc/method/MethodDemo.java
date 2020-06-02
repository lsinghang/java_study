package com.imooc.method;

import java.util.Scanner;

public class MethodDemo {

    // 打印输出星号的方法
    public void printStar() {
        System.out.println("欢迎来到java的世界");
    }

    // 主方法
    public static void main(String[] args){
        /*系统类*/
//        Scanner sc = new Scanner(System.in);
//        sc.next();

        // 创建一个MethodDemo类的对象
        MethodDemo myMethodDemo = new MethodDemo();
        System.out.println("***********");
        // 使用对象名 方法名 去调用方法
        myMethodDemo.printStar();
        System.out.println("***********");
    }

}
