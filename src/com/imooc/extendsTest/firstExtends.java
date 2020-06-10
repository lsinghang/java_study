package com.imooc.extendsTest;

public class firstExtends {
    private String name;
    private int month;
    private String species;

    public firstExtends() {}

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

    public void eat() {
        System.out.println(this.species + "失业");
    }
}
