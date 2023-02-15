package ru.netology.square.servises;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AmountSquareServiсeTest {

    @Test
    public void firstTest (){
        AmountSquareService service = new AmountSquareService();
        int expected = 3;
        int actual = service.square(200,300);
        System.out.println("1");

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void secondTest(){
        AmountSquareService service = new AmountSquareService();
        int expected = 8;
        int actual = service.square(100,300);

        Assertions.assertEquals(expected, actual);

    }


}
