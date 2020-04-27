package com.jfsoftware.rule.stagetwo;

import com.jfsoftware.rule.NoMatchRule;
import com.jfsoftware.rule.Number;
import com.jfsoftware.rule.Rule;

/**
 * A composite rule from other rules in stage two of the fizzBuzz problem.
 */
public class StageTwoCompositeRule implements Rule {

    private Rule fizzBuzzRule;

    public StageTwoCompositeRule() {
        Rule noMatchRule = new NoMatchRule();
        Rule buzzRule = new StageTwoBuzzRule(noMatchRule);
        Rule fizzRule = new StageTwoFizzRule(buzzRule);
        fizzBuzzRule = new StageTwoFizzBuzzRule(fizzRule);
    }


    @Override
    public String apply(Number number) {
        return fizzBuzzRule.apply(number);
    }
}