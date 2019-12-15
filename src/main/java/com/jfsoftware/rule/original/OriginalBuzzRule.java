package com.jfsoftware.rule.original;

import com.jfsoftware.rule.Number;
import com.jfsoftware.rule.Rule;

/**
 * A rule that describes the conditions under which "Buzz" is returned in the original fizzBuzz problem.
 */
public class OriginalBuzzRule implements Rule {
    private Rule next;

    OriginalBuzzRule(Rule next) {
        this.next = next;
    }

    @Override
    public String apply(int number) {
        return new Number(number).isMultipleOf(5) ? "Buzz" : next.apply(number);
    }
}