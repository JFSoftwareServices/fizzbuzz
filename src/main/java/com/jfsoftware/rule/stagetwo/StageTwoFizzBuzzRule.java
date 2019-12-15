package com.jfsoftware.rule.stagetwo;

import com.jfsoftware.rule.Rule;


/**
 * A rule that describes the conditions under which the "FizzBuzz" is returned in stage-two fizzBuzz
 */
public class StageTwoFizzBuzzRule implements Rule {
    private Rule next;

    StageTwoFizzBuzzRule(final Rule next) {
        this.next = next;
    }

    @Override
    public String apply(final int number) {


        return next.apply(number);
    }
}