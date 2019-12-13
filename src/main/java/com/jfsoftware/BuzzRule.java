package com.jfsoftware;

public class BuzzRule implements Rule {
    private Rule next;

    BuzzRule(Rule next) {
        this.next = next;
    }

    @Override
    public String apply(int number) {
        return number % 5 == 0 ? "Buzz" : next.apply(number);
    }
}