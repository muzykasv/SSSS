package com.company;

public class NewString {
    public static void main(String[] args) {
    String s = "Main Academy";
    int x = s.length();
    s.charAt(7);
    s.substring(4, 6);
        System.out.println(x);
        System.out.println(s.charAt(3));
        System.out.println(s.substring(5, 8));
        String s1 = "Web Application ";
        String s2 = "For Computer!!!!";
        String s3 = "    To user's Computer!!!!     ";
        System.out.println(s1.concat(s2));
        System.out.println(s.indexOf("Academy"));
        System.out.println(s.lastIndexOf("m"));
        System.out.println(s1.equals(s2));
        System.out.println(s2.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s3.trim());
        System.out.println(s1.replace("Web","Client"));
    }
}

