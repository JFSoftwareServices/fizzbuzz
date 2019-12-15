package com.jfsoftware.rule.original;

import com.jfsoftware.rule.Rule;

/**
 * A rule that describes the conditions under which the "Fizz" is returned in the original fizzBuzz problem.
 *
 */
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