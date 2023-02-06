package ru.netology.square.servises;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class AmountSquareServiseTest {

    @Test
    public void firstTest (){
        AmountSquareService service = new AmountSquareService();
        int expected = 3;
        int actual = service.square(200,300);

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
