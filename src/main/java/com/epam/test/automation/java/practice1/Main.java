package com.epam.test.automation.java.practice1;

public class Main {

    private static final int DEFAULT_SQUARE = 2;

    private Main() {
    }

    public static int task1(int n) {
        return (n >= 0) ? (int) Math.pow(n, DEFAULT_SQUARE) : Math.abs(n);
    }

    public static int task2(int n) {

        if (n < 100 || n > 999) {
            throw new UnsupportedOperationException("Invalid value");
        }
        int digit100 = n / 100;
        int digit10 = n % 100 / 10;
        int digit1 = n % 10;
        int sum = digit1 + digit10 + digit100;
        int max = Math.max(digit1, Math.max(digit10, digit100));
        int min = Math.min(digit1, Math.min(digit10, digit100));
        return max * 100 + min + (sum - min - max) * 10;
    }


}
