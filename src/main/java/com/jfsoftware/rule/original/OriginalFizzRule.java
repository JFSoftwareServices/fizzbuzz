package com.jfsoftware.rule.original;

import com.jfsoftware.rule.Rule;

public class OriginalFizzRule implements Rule {
    private Rule next;

    public OriginalFizzRule(Rule next) {
        this.next = next;
    }

    @Override
    public String apply(int integer) {
        return integer % 3 == 0 ? "Fizz" : next.apply(integer);
    }
}