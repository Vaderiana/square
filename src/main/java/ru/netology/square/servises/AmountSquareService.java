package ru.netology.square.servises;

public class AmountSquareService {

    public int square (int startRange, int endRange){

        int counter = 0;

        for (int i = 10; i <= 99; i++) {
            if (i * i >= startRange && i * i <= endRange) {
                counter++;
            }
        }
        return counter;
    }
}

