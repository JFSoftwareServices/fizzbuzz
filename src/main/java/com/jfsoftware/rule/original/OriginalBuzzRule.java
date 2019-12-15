package com.jfsoftware.rule.original;

import com.jfsoftware.rule.Rule;

public class OriginalBuzzRule implements Rule {
    private Rule next;

    public OriginalBuzzRule(Rule next) {
        this.next = next;
    }

    @Override
    public String apply(int number) {
        return number % 5 == 0 ? "Buzz" : next.apply(number);
    }
}