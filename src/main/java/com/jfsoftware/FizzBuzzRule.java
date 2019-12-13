package com.jfsoftware;

public class FizzBuzzRule implements Rule {
    private Rule next;

    FizzBuzzRule(Rule next) {
        this.next = next;
    }

    @Override
    public String apply(int integer) {
        return integer % 15 == 0 ? "FizzBuzz" : next.apply(integer);
    }
}