package com.imooc.JiHe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {
        HashSetDemo.Cat huahua = new HashSetDemo.Cat("huahua", 5, "英国短毛猫");
        HashSetDemo.Cat fanfan = new HashSetDemo.Cat("famfam", 2, "中华田园猫");
        HashSetDemo.Cat maomao = new HashSetDemo.Cat("maomao", 10, "英国短毛猫");
        HashSetDemo.Cat aaa = new HashSetDemo.Cat("aaa", 10, "英国短毛猫");

        List<HashSetDemo.Cat> catList = new ArrayList();
        catList.add(huahua);
        catList.add(fanfan);
        catList.add(maomao);
        catList.add(aaa);

        System.out.println("排序前");

        for( HashSetDemo.Cat cat: catList){
            System.out.println(cat);
        }

        // 按名字进行升序排序
        Collections.sort(catList, new Namecomparator());
        System.out.println("按名字排序后");
        for( HashSetDemo.Cat cat: catList){
            System.out.println(cat);
        }

        // 按名字进行升序排序
        Collections.sort(catList, new princeComparator());
        System.out.println("按名字排序后");
        for( HashSetDemo.Cat cat: catList){
            System.out.println(cat);
        }

    }


    public static class Namecomparator implements Comparator<HashSetDemo.Cat> {
        @Override
        public int compare(HashSetDemo.Cat o1, HashSetDemo.Cat o2) {
            // 按名字升序排序
            String name1 = o1.getName();
            String name2 = o2.getName();
            int n = name1.compareTo(name2); // name1 比 name2 返回一个 升序排序
           // name2.compareTo(name1); 倒序
            return n;
        }
    }

    public static class princeComparator implements Comparator<HashSetDemo.Cat> {
        @Override
        public int compare(HashSetDemo.Cat o1, HashSetDemo.Cat o2) {
            double Month1 = o1.getMonth();
            double Month2 = o2.getMonth();
            int n = new Double((Month2-Month1)).intValue();
            return  n;
        }

    }

}
