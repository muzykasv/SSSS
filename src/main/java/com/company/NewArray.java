package com.company;

import java.util.Arrays;

public class NewArray {
    public static void main(String[] args) {
     int[] arr1 = {12, 56, 89, 45, 699, 456};
        System.out.println("Element at index 4: " + arr1[4]);
        System.out.println("Element at index 2: " + arr1[2]);
        int[][] marr = {{11,22}, {56,89,485,632,144},{56,95,321,741},{8574},{}};
        int[] arr2 = {1,2,3,4,5};
        int[] arr5 = {1,2,3,4,5};
        int[] arr3 = {1,2,3,4,5};
        int[] arr4 = {1,2,2,5,5};
        /* marr[1][2] = 123; */
        System.out.println(marr[2][2]);
        System.out.println(arr5 == arr3);
        System.out.println(arr2.equals(arr4));
        System.out.println(Arrays.equals(arr3, arr2));
        Arrays.sort(arr1);
        System.out.println("The sorted arr1 is: " + arr1[2]);
        System.out.println(Arrays.toString(arr1));
    }
}
