package com.imooc.method;

public class MaxDemo {
    public void max(float a, float b){
        float max;
        if(a > b) {
            max = a;
        } else {
            max = b;
        }
        System.out.println("两个数"+ a + "和" +b+ "的最大值为 ："+ max);
    }
    public static void main(String[] args) {
        MaxDemo maxDemo = new MaxDemo();
        float a = 5, b =3 ;
        maxDemo.max(a,b);

        float m = 5.6f, n = 9.9f;
        maxDemo.max(m,n);

        maxDemo.max(12.3f,594.222f);
    }
}