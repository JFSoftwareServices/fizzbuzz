package com.jfsoftware;

public class FizzRule implements Rule {
    private Rule next;

    FizzRule(Rule next) {
        this.next = next;
    }

    @Override
    public String apply(int integer) {
        return integer % 3 == 0 ? "Fizz" : next.apply(integer);
    }
}