package com.imooc.JiHe;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class HashSetDemo {

  public static void main(String[] args) {
//    Set set = new HashSet();
//
//    set.add("blue");
//    set.add("red");
//    set.add("green");
//    set.add("black");
//    set.add("yellow");
//    set.add("white");
//
//    Iterator it = set.iterator();
//
//    // 遍历迭代器并输出元素
//    while(it.hasNext()) {
//      System.out.println(it.next() + " ");
//    }
//
//    // 在迭代器中插入 元素
//    set.add("abc");
//
//    // 不能插入重复元素 不会插入 而不是报错或者 覆盖

    Cat huahua = new Cat("花花", 12, "英短");
    Cat fanfan = new Cat("翻翻", 12, "中原");

    Set<Cat> set = new HashSet<Cat>(); // 引入泛型 指定类型
    set.add(huahua);
    set.add(fanfan);

    Iterator<Cat> it = set.iterator();

    while(it.hasNext()) {
      System.out.println(it.next() + ""); // 没有改写tostring时 是输出地址值
    }

    System.out.println("==================================");

    // 再添加一个属性一样的元素
    Cat huahua01 = new Cat("花花", 12, "英短");
    set.add(huahua01); // 地址值不一样可以添加 但是添加了 hashCode方法后会判断不给添加
    it = set.iterator();
    while(it.hasNext()) {
      System.out.println(it.next() + ""); // 没有改写tostring时 是输出地址值
    }

    if(set.contains(huahua)){
      System.out.println("找到了");
      System.out.println(huahua);
    } else {
      System.out.println("没有找到了");
    }



    // 在集合中使用名字查找花花的信息
    boolean flag = false;
    Cat c = null;
    it = set.iterator(); // 重新赋值因为上面的it已经调用next方法
    while (it.hasNext()) {
      c = it.next();
      if(c.getName().equals("花花")){
        flag = true; // 找到了
        break;
      }
    }
    if(flag) {
      System.out.println("花花找到了");
      System.out.println(c);
    } else {
      System.out.println("花花没找到");
    }


    // set删除元素
    for(Cat cat: set) {
      if("花花".equals(cat.getName())){
        set.remove(cat);
        break;
      }
    }

    System.out.println("=============删除================");

    for(Cat cat: set) {
      System.out.println(cat);
    }

    //方法二  读取时不能删除 removeAll可以删除一整个子集 所以可以使用这种技巧
//    Set<Cat> set1 = new HashSet<Cat>();
//    for(Cat cat: set1) {
//      if(cat.getMonth() < 5) {
//        set1.add(cat);
//      }
//    }
//    set.removeAll(set1);

    // 删除 所有元素
    System.out.println("----------删除所有信息-----------");
    boolean flag1 = set.removeAll(set);

    if(flag1 || set.isEmpty()) {
      System.out.println("都删除了");
    }else {
      System.out.println("没有删除");

    }


  }
  public static class Cat {
    private String name;
    private int month;
    private String specied;

    public  Cat(String name, int month, String specied) {
      super();
      this.name = name;
      this.month = month;
      this.specied = specied;
    }

    @Override
    public String toString() { // 自动调用tostring方法
      return "Cat{" +
        "name='" + name + '\'' +
        ", month=" + month +
        ", specied='" + specied + '\'' +
        '}';
    }

    public String getName() {
      return name;
    }

    public int getMonth() {
      return month;
    }

    public String getSpecied() {
      return specied;
    }

    public void setName(String name) {
      this.name = name;
    }

    public void setMonth(int month) {
      this.month = month;
    }

    public void setSpecied(String specied) {
      this.specied = specied;
    }


    @Override
    public boolean equals(Object o) {
      // 判断对象是否相等
      if (this == o) return true;
      // 判断obj是否是cat类的对象
      if (!(o instanceof Cat)) return false;
      Cat cat = (Cat) o;
      return getMonth() == cat.getMonth() &&
        Objects.equals(getName(), cat.getName()) &&
        Objects.equals(getSpecied(), cat.getSpecied());
    }

    @Override
    public int hashCode() {
      return Objects.hash(getName(), getMonth(), getSpecied());
    }

    public double getPrice() {
      return 0;
    }
  }
}


