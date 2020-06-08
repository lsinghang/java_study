package com.imooc.test;
import com.imooc.model.Subject;

public class SubjectTest {
    public static void main(String[] args) {
        Subject sub = new Subject("计算机科学与应用","10001", 4);
        System.out.println(sub.info());
    }
}
