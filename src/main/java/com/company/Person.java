package com.company;

public class Person {
    int height;
    float weight;

    public static int sum =478;
    public static void write (String str){
        System.out.println(str);
    }

    void say (String str){
        System.out.println(str);
    }
    Person (int height, float weight) {
       this.height = height;
       this.weight = weight;
    }

    Person () {}
}
