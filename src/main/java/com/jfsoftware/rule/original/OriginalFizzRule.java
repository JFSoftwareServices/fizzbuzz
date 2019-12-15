package com.jfsoftware.rule.original;

import com.jfsoftware.rule.Number;
import com.jfsoftware.rule.Rule;

/**
 * A rule that describes the conditions under which the "Fizz" is returned in the original fizzBuzz problem.
 */
public class OriginalFizzRule implements Rule {
    private Rule next;

    OriginalFizzRule(Rule next) {
        this.next = next;
    }

    @Override
    public String apply(int number) {
        return new Number(number).isMultipleOf(3) ? "Fizz" : next.apply(number);
    }
}