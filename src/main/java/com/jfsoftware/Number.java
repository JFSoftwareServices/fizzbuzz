package com.jfsoftware;

import static java.lang.String.valueOf;

public class Number {

    private final int number;

    public Number(int number) {
        this.number = number;
    }

    public boolean isMultipleOf(int num) {
        return number % num == 0;
    }

    private boolean containsNumber(int num) { //TODO
        return valueOf(number).contains(valueOf(num));
    }

    public boolean isMultipleOfOrContains(final int num) {
        return isMultipleOf(num) || containsNumber(num);
    }
}