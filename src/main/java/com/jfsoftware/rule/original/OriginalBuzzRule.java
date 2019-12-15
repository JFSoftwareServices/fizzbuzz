package com.jfsoftware.rule.original;

import com.jfsoftware.rule.Rule;

/**
 * A rule that describes the conditions under which "Buzz" is returned in the original fizzBuzz problem.
 *
 */
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