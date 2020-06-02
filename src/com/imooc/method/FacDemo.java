package com.imooc.method;

public class FacDemo {

    /*求阶乘的方法*/
    public int fac(int n) {
        int s = 1;
        for (int i = 1; i <= n ; i++) {
            s *= i; // s = s * i
        }
        return s;
    }

    public static void main(String[] args) {
        FacDemo facDemo = new FacDemo();
        int fac = facDemo.fac(3);
        System.out.println("3!=" + fac);

        /*求 1！ + 2！ + 3！ + 4！ */
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            fac = facDemo.fac(i);
            sum = sum + fac;
        }
        System.out.println(sum);
    }
}
