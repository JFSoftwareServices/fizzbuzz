package com.jfsoftware.rule;

import static java.lang.String.valueOf;

public class Number {

    private final int number;

    public Number(int number) {
        this.number = number;
    }

    public boolean isMultipleOf(int num) {
        return number % num == 0;
    }

    private boolean contains(int num) {
        return valueOf(number).contains(valueOf(num));
    }

    public boolean isMultipleOfOrContains(int num) {
        return isMultipleOf(num) || contains(num);
    }
}