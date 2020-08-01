package com.imooc.JiHe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sortDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(9);
        list.add(7);

        System.out.println("排序前");
        for (int n: list) {
            System.out.println(n + " ");
        }

        System.out.println("====================");

        Collections.sort(list);
        System.out.println("排序后");
        for(int n: list){
            System.out.println(n + " ");
        }
    }
}
