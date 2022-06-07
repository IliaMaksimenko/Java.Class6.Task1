package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class SQRServiceTest {

    public static void main(String[] args) {

        SQRService service = new SQRService();

        int minimum = -10;
        int maximum = 20;

        int count = service.sqrCounter(minimum, maximum);
        System.out.println(count);


    }


    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/count.csv")

    public void testSqrCounter(int expected, int minimum, int maximum) {

        SQRService service = new SQRService();

        int count = service.sqrCounter(minimum, maximum);

        Assertions.assertEquals(expected, count);
    }

}
