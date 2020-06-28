package com.imooc.UpToDown;

public class UpDemo {
    /*
    *  喂宠物
    *   后 猫去玩
    *   后 狗去睡觉
    * */

//    方案一:
    public void feed(Cat cat) {
        System.out.println("猫吃鱼");
    }

    public void feed(Dog dog) {
        System.out.println("狗吃骨头");
    }

//    方案二:
    public void feed(Animal obj) {
        if(obj instanceof Cat) {
//            Cat temp = (Cat)obj;
//            temp.eat();
            System.out.println("猫吃鱼");
        } else {
//            Dog temp = (Dog)obj;
//            temp.eat();
        }
    }
}
