package com.company;

import java.util.Arrays;
import java.util.List;

public class Ut{   /*класс Util, видим в нём два типизированных метода.
                    Благодаря возможности выведения типов мы можем предоставить
                     определение типа непосредственно компилятору, а можем сами это указать.
                     Оба варианта представлены в примере.*/

    public static class Util {
        public static <T> T getValue(Object obj, Class <T> clazz) {
            return (T) obj;
        }
        public static <T> T getValue(Object obj) {
            return (T) obj;
        }
    }
    public static void main(String []args) {
          List list = Arrays.asList("Author", "Book");
          for (Object element : list) {
            String data = Util.getValue(element, String.class);
            System.out.println(data);
            System.out.println(Util.<String>getValue(element));
          }
    }

}