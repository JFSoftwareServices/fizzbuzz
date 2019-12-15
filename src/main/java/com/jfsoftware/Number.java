package com.jfsoftware;

import static java.lang.String.valueOf;

public class Number {

    private final int number;

    public Number(int number) {
        this.number = number;
    }

    public boolean isMultipleOf(int divisor) {
        return number % divisor == 0;
    }

    public boolean containsDigit(int digit) {
        return valueOf(number).contains(valueOf(digit));
    }
}