package com.company;

import java.util.Scanner;

public class MainScanner {

    public static void main (String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.println("Your string is:" + str.nextLine ());

    Scanner num = new Scanner(System.in);
    int i;
    i = num.nextInt();
        System.out.println("My variable is: " + i);

    }
}