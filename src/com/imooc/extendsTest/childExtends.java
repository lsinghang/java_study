package com.imooc.extendsTest;

public class childExtends extends firstExtends {
    private double weight;

    public childExtends() {

    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void run () {
        System.out.println(this.getName());
        System.out.println(this.getSpecies());
        System.out.println(this.getMonth());
        System.out.println(this.weight);
    }
}
