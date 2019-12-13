package com.jfsoftware;

import static java.lang.String.valueOf;

public class NoMatchRule implements Rule {

    @Override
    public String apply(int integer) {
        return valueOf(integer);
    }
}