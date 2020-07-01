package com.imooc.ClassInClass;

public class StaticClass {
    public int age;
    public StaticClass.Heart getHeart() {
        new StaticClass.Heart().example = 1234;
        return new StaticClass.Heart();
    }

    public void eat() {
        System.out.println("外部吃东西");
    }

    /* 静态内部类
    *   1. 静态内部类中, 只能直接访问外部类的静态方法, 如果需要调用非静态方法, 可以通过对象实例
    *   2. 静态内部类对象实例时, 可以不依赖与外部类对象
    *   3. 可以通过外部类.内部类.静态成员的方式, 访问内部类中的静态成员
    *   4. 当内部类属性与外部类属性同名时, 默认直接调用内部类中的成员;
    *       如果需要访问外部类中的静态属性, 则可以通过 外部类.属性 的方式;
    *       如果需要访问外部类中的非静态属性, 则可以通过new 外部类.属性 的方式;
    * */

    public static class Heart {
        int example = 123;
        int age = 13;

        //静态成员可以直接访问
        public static void eat() {
            System.out.println("内部吃东西");
        }

        public String beat() {
            new StaticClass().eat();
            return new StaticClass().age + "心脏在跳动";
        }
    }
}
