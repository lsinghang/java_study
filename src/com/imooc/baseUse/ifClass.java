package com.imooc.baseUse;

import java.util.Scanner;

public class ifClass {
    public static void main(String[] args) {
        System.out.println("请输入成绩");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        if(score >= 90) {
            System.out.println("优");
        }

    }
}
