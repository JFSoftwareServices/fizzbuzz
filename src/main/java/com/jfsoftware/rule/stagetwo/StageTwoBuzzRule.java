package com.jfsoftware.rule.stagetwo;

import com.jfsoftware.rule.Rule;


/**
 * A rule that describes the conditions under which "Buzz" is returned in stage two of the fizzBuzz problem.
 */
public class StageTwoBuzzRule implements Rule {
    private Rule next;

    StageTwoBuzzRule(final Rule next) {
        this.next = next;
    }

    @Override
    public String apply(final int number) {


        return next.apply(number);
    }

}