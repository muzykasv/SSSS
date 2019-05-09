package com.company;

public class LocalVariables {

    public static void main (String[] args) {
        int x = 10;
        final double Pi = 3.14159;
        {
            int locVar = 20;
            System.out.println(locVar);
        }
        System.out.println(x);
        System.out.println(Pi);
        int num1 = 35;
        int num2 = 25;
        if (num1<num2){
            System.out.println("num1<num2 ->true");
        } else {
            System.out.println("num1<num2 ->false");
        }
        }
    }
