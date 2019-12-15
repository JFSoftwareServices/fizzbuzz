package com.jfsoftware.rule.stagetwo;

import com.jfsoftware.rule.Number;
import com.jfsoftware.rule.Rule;


/**
 * A rule that describes the conditions under which the "FizzBuzz" is returned in stage-two fizzBuzz
 */
public class StageTwoFizzBuzzRule implements Rule {
    private Rule next;

    StageTwoFizzBuzzRule(Rule next) {
        this.next = next;
    }

    @Override
    public String apply(int n) {
        Number number = new Number(n);
        if (number.isMultipleOfOrContains(3)
                && number.isMultipleOfOrContains(5)) {
            return "FizzBuzz";
        }
        return next.apply(n);
    }
}