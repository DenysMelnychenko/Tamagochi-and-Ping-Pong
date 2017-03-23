package com.tamagochi.model;

public class Creature {

    private  int fullness;
    private  int vitality;
    private  int wc;
    private  int age;

    public Creature() {
        fullness = 100;
        vitality = 100;
        wc = 0;
        age = 0;
    }

    public  int getFullness() {
        return fullness;
    }

    public synchronized void setFullness(int fullness) {
        this.fullness = fullness;
    }

    public int getVitality() {
        return vitality;
    }

    public synchronized void setVitality(int vitality) {
        this.vitality = vitality;
    }

    public int getWc() {
        return wc;
    }

    public synchronized  void setWc(int wc) {
        this.wc = wc;
    }

    public int getAge() {
        return age;
    }

    public synchronized void setAge(int age) {
        this.age = age;
    }
}
