package com.company;

public class Main {

    public static void main(String[] args) {
        Person.sum = 23;
        System.out.println(Person.sum);
        Person.write("Your number is " + Person.sum);

        Person maks = new Person();
        maks.height = 180;
        maks.weight = 75.4f;
        maks.say("Hay, I'm Maks!");
        System.out.println(maks.height);

        Person oleg = new Person();
        maks.height = 195;
        maks.weight = 96.7f;
        System.out.println(oleg.height);

        Student vova = new Student(178, 98f, 3);
        System.out.println(vova.course);


        byte num = 25;// write your code here
        int num_1 = 3645;
        long num_2 = 64616496;
        float num_3 = 21.46f;
        double num_4 = 254341.4456d;
        boolean isTrue = true;
        char sym = 'R';
        String Car = "Partner";
        String str1 = "Hello world!!!!!";
        System.out.println(Car);
        System.out.println(num);
        System.out.println(num_1);
        System.out.println(num_2);
        System.out.println(num_3);
        System.out.println(num_4);
        System.out.println(isTrue);
        System.out.println(sym);
        System.out.println(str1);

        Integer[] arr1 = {1, 2, 3, 4, 5};
        Integer res = testGenerics(arr1, 2);
    }

    public static <T> T testGenerics(T[] a, int x) { //Формат класса Generic: class name <T1, T2,......,Tn>{/*    */

      T someResult = a[x];                      //T = Object: public static Object testGenerics(Object[]a,int x)
        return someResult;                        // Object someResult = a[x];
    }
}
