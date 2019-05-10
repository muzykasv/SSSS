package com.company;

import java.util.Scanner;

public class ArithmeticAction {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        float first, second, result;

        System.out.print("Enter first num:" );
        first = num.nextFloat();
        System.out.print("Enter second num:" );
        second = num.nextFloat();
        result = first * second;
        result /=2;
        System.out.println("Result is = " + result);
        double result1 = result *2;
        System.out.println("Result is = " + result1);
    }
}