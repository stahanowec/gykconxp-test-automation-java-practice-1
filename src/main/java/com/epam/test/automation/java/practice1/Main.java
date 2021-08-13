package com.epam.test.automation.java.practice1;

import java.util.stream.IntStream;

public class Main {

    private static final int DEFAULT_SQUARE = 2;
    private static final int ALLOWED_SIZE = 3;

    private Main() {}

    public static int task1(int n) {
        return (n >= 0) ? (int) Math.pow(n, DEFAULT_SQUARE) : Math.abs(n);
    }

    public static int task2(int n) {

        var count = new int[10];

        var str = Integer.toString(n);
        if (str.length() != ALLOWED_SIZE) {
            throw new UnsupportedOperationException("Invalid value");
        }
        IntStream.range(0, str.length()).forEach(i -> count[str.charAt(i) - '0']++);

        var result = 0;
        var multiplier = 1;

        for (var i = 0; i <= 9; i++) {
            while (count[i] > 0) {
                result = result + (i * multiplier);
                count[i]--;
                multiplier = multiplier * 10;
            }
        }

        return result;
    }

}
