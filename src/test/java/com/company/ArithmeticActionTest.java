package com.company;

import org.junit.Assert;
import org.junit.Test;
import java.io.IOException;
import static org.junit.Assert.*;

public class ArithmeticActionTest { //Имя класса

    @Test          //Здесь особое внимание анотации: должен быть создан объект класса ArithmeticActionTest и
                   // должен быть вызван метод testAdd
    public void testAdd () throws Exception {   //Метод тестирования
        ArithmeticAction arithmeticAction = new ArithmeticAction(); //Создаем объект класса ArithmeticAction
        int res = arithmeticAction.add(2,2);
        Assert.assertEquals(4, res);
        System.out.println(res);
    }
}