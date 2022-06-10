package ru.netology.sqr;

public class SQRService {

    public int sqrCounter(int minimum, int maximum) {


        int x;
        int count = 0;

        if (minimum < 0) {
            minimum = 1;
        }

        for (x = 10; x <= 99; x++) {
            if (Math.pow(x, 2) > minimum & Math.pow(x, 2) < maximum) {
                count++;
            }
        }
        return count;
    }
}
