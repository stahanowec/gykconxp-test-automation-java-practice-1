package com.epam.test.automation.java.practice1;

public class Main {

    private static final int DEFAULT_SQUARE = 2;
    private static final int ALLOWED_SIZE = 3;

    public static int task1(int n) {
        return (n >= 0) ? (int) Math.pow(n, DEFAULT_SQUARE) : -n;
    }


    public static int task2(int n) {

        int count[] = new int[10];

        var str = Integer.toString(n);
        if (str.length() != ALLOWED_SIZE) {
            throw new UnsupportedOperationException("Invalid value");
        }
        for (int i = 0; i < str.length(); i++) {

            count[str.charAt(i) - '0']++;
        }

        int result = 0, multiplier = 1;

        for (int i = 0; i <= 9; i++) {
            while (count[i] > 0) {
                result = result + (i * multiplier);
                count[i]--;
                multiplier = multiplier * 10;
            }
        }

        return result;
    }

}
