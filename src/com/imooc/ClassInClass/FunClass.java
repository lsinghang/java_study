package com.imooc.ClassInClass;

public class FunClass {
    public static int age;

    public Object getHeart() {
        // 方法内部类
        /*
        * 1. 定义在方法内部, 作用范围也在方法内
        * 2. 和方法内部成员使用规则一样, class前面不可以添加public private protected static
        * 3. 类中不能包含静态成员
        * 4. 类中可以包含final abstract 修饰的成员
        * */
        class Heart {
            public final int age = 13;
            public void eat(){

            }

            public String beat() {
                return FunClass.age + "岁的心脏在跳动";
            }
        }
        return new Heart().beat();
    }
}
