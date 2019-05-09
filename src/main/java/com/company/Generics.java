package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Generics {
        public static void main(String []args) {
                List<String> list = new ArrayList<String>();
                list.add("Hello");
                for (Object str : list) {
                    String text = list.get(0) + ", world!";
                    System.out.print("-" + str);
                    System.out.print(text);
                }
                List<String> list2 = Arrays.asList("Hy, ", " Everybody ");
                List<Integer> data = new ArrayList(list2);
                Integer intNumber = data.get(0);
                System.out.println(data);
        }

    public static class SomeType<T> {      /*Типизировать можно не только методы, но и сами классы
                                           Если мы используем класс, дженерик указывается после имени класса.*/
        public <E> void test(Collection<E> collection) {
            for (E element : collection) {
                System.out.println(element);
            }
        }
        public void test(List<Integer> collection) {
            for (Integer element : collection) {
                System.out.println(element);
            }
        }
    }
}