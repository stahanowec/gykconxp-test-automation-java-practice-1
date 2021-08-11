package com.epam.test.automation.java.practice1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.testng.Assert.assertThrows;


public class MainTest {

    @Test(dataProvider = "task1DataProvider")
    public void ifTask1ThenSuccess(int currentValue, int expectedValue) {
        //given
        var current = currentValue;
        var expected = expectedValue;
        //when
        var result = Main.task1(current);
        //then
        assertThat(result, is(expected));
    }

    @Test
    public void ifTask2ThenSuccess() {
        //given
        var current = 165;
        var expected = 651;
        //when
        var result = Main.task2(current);
        //then
        assertThat(result, is(expected));
    }

    @Test
    public void ifTask2ThenThrowsUnsupportedOperation() {
        //given
        var current = 99;
        //when
        //then
        assertThrows(UnsupportedOperationException.class, () -> Main.task2(current));

    }

    @DataProvider(name = "task1DataProvider")
    public static Object[][] task1DataProvider() {
        return new Object[][]{{4, 16}, {-5, 5}, {0, 0}};
    }
}