package com.imooc.method;

public class ChooseVal {
    public void search(int n, int...a) {
        for(int i: a) {
            n +=i;
        }
        System.out.println("n的值：" + n);
    }

    public static void main(String[] args) {
        ChooseVal sc = new ChooseVal();
        sc.search(0,1,2,3,4,5,6);
        sc.search(1000, 1,2,3,10);
    }
}
