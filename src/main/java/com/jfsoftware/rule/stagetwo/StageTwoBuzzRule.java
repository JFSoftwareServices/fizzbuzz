package com.jfsoftware.rule.stagetwo;

import com.jfsoftware.rule.Number;
import com.jfsoftware.rule.Rule;


/**
 * A rule that describes the conditions under which "Buzz" is returned in stage two of the fizzBuzz problem.
 */
public class StageTwoBuzzRule implements Rule {
    private Rule next;

    StageTwoBuzzRule(Rule next) {
        this.next = next;
    }

    @Override
    public String apply(int n) {
        Number number = new Number(n);
        return number.isMultipleOfOrContains(5) ?
                "Buzz" : next.apply(n);
    }
}