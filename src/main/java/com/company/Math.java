package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Math.cos;

public class Math {

    private static final double PI = 3.14156;

    public static void main(String[] args){
        double theta = 0.8;
        double res = cos(PI*theta);
        System.out.println(res);   // Считает неправильно, только Пи.

        int num1 = 10;
        int num2 = 0;
        try {
            int result = num1/num2;
        } catch (Exception result){
        System.out.println(result);
        }
        int num3 = 100;
        int num4 = 0;
        try {
            int res5 = num1/num2;
        } catch (Exception ex) {
            System.out.println("catch");
            return;
        } finally {
            System.out.println("finally: / by zero");
        }
        List<String> lst = new ArrayList<String>();
        lst.add("ggg");
        lst.add("jjj");
        lst.add("www");
        lst.add("qqq");
        System.out.println(lst);
        Object[] myArrObj = lst.toArray();
        String[] myArrStr = lst.toArray(new String[5]);
        List listNum = Arrays.asList(lst.toArray());
        System.out.println(myArrObj);
        System.out.println(myArrStr);
        System.out.println(listNum);
    }
}