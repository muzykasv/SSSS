package com.company;

public class Student extends Person {
    int course;

    public Student (int height, float weight, int course){
        super(height, weight);
        this.course = course;
    }
}
