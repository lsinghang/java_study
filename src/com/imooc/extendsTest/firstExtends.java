package com.imooc.extendsTest;

public class firstExtends {
    private String name;
    private int month;
    private String species;

    public firstExtends() {}

    public firstExtends(String name) {
        System.out.println("父类一参构造方法"+ name);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String eat(int num) {
        System.out.println(this.species + "失业" + num + "天");
        return "这几天" + num;
    }
}
