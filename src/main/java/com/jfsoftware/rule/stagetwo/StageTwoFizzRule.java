package com.jfsoftware.rule.stagetwo;

import com.jfsoftware.rule.Rule;

/**
 * A rule that describes the conditions under which "Fizz" is returned in stage two of the fizzBuzz problem.
 */
public class StageTwoFizzRule implements Rule {
    private Rule next;

    StageTwoFizzRule(final Rule next) {
        this.next = next;
    }

    @Override
    public String apply(final int number) {

        return next.apply(number);
    }
}