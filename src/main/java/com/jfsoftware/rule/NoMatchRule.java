package com.jfsoftware.rule;

public class NoMatchRule implements Rule {

    @Override
    public String apply(Number number) {
        return number.toString();
    }
}