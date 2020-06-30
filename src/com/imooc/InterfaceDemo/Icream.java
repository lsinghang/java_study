package com.imooc.InterfaceDemo;

public class Icream implements IPhoto, INet {
    @Override
    public void photo() {
        System.out.println("重写拍照");
    }

    public void connection() {
        System.out.println("Icream的connection");
    }
}