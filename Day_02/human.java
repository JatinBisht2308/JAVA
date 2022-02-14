package com.jatin;

public  class human{
    int age;
    String name;
    String sex;
    boolean married;
    static boolean two_legs;
    human(int age, String name,String sex,boolean married){
        this.age = age;
        this.name = name;
        this.sex = sex;
        this.married = married;
        human.two_legs = true;
    }
}