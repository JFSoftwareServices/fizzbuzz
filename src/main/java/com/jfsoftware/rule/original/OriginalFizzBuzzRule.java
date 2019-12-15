package com.jfsoftware.rule.original;

import com.jfsoftware.rule.Number;
import com.jfsoftware.rule.Rule;

/**
 * A rule that describes the conditions under which "FizzBuzz" is returned in the original fizzBuzz problem.
 */
public class OriginalFizzBuzzRule implements Rule {
    private Rule next;

    OriginalFizzBuzzRule(Rule next) {
        this.next = next;
    }

    @Override
    public String apply(int number) {
        return new Number(number).isMultipleOf(15) ? "FizzBuzz" : next.apply(number);
    }
}