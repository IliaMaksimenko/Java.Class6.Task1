package ru.netology.sqr;

public class SQRService {

    public int sqrCounter(int minimum, int maximum) {


        int x = (int) Math.sqrt(minimum);
        int count = 0;
        while (maximum >= Math.pow(x, 2)) {
            if (Math.pow(x, 2) < minimum | x == 0) {
                x++;
            } else {
                x++;
                count++;
            }
        }
        return count;
    }
}
