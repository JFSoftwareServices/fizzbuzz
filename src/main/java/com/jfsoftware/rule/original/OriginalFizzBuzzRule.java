package com.jfsoftware.rule.original;

import com.jfsoftware.rule.Rule;

/**
 * A rule that describes the conditions under which "FizzBuzz" is returned in the original fizzBuzz problem.
 *
 */
public class OriginalFizzBuzzRule implements Rule {
    private Rule next;

    public OriginalFizzBuzzRule(Rule next) {
        this.next = next;
    }

    @Override
    public String apply(int integer) {
        return integer % 15 == 0 ? "FizzBuzz" : next.apply(integer);
    }
}