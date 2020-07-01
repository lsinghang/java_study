package com.imooc.ClassInClass;

public class PeopleTest {
    public void getRead(AnonymityClass anonymityClass) {
        anonymityClass.read();
    }
    // 匿名内部类
    /*  1. 匿名内部类没有类型名称 实例对象名称
    *   2. 编译后的文件命名: 外部类$ 数字.class
    *   3. 无法使用修饰符 private public protected abstract static
    *   4. 无法编写构造方法
    *   5. 不能出现静态成员
    *   6. 匿名内部类可以实现接口也可以继承父类, 只能二选一
    * */
    public static void main(String[] args) {
        PeopleTest test = new PeopleTest();

        test.getRead(new AnonymityClass() {
            {
                // 构造代码块 用做初始化
            }
            @Override
            public void read() {
                System.out.println("匿名内部类");
            }
        });

        test.getRead(new AnonymityClass() {
            @Override
            public void read() {
                System.out.println("匿名内部类2");
            }
        });
    }
}

/*// 方法内部类
*     public static void main(String[] args) {
        FunClass one = new FunClass();
        System.out.println(one.getHeart());
    }
* */

/*
*    // 获取静态内部类对象实例
    public static void main(String[] args) {
        StaticClass.Heart one = new StaticClass.Heart();
        one.age = 12;
        System.out.println(one.beat());

        StaticClass.Heart.eat();
    }
* */

/*
*     public static void main(String[] args) {
        PeopleClass one = new PeopleClass();
        one.age = 12;

        // 获取内部类对象实例, 方式1: new 外部类. new 内部类 age会重新实例没有赋值
        PeopleClass.Heart myHeart = new PeopleClass().new Heart();
        System.out.println(myHeart.beat());

        // 获取内部类对象实例, 方式2: 外部类对象.new 内部类
        myHeart = one.new Heart();
        System.out.println(myHeart.beat());

        // 获取内部类对象实例, 方式3: 外部类对象.获取方法
        myHeart = one.getHeart();
        System.out.println(myHeart.beat());
    }
*
* */