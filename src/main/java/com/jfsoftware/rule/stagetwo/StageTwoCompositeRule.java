package com.jfsoftware.rule.stagetwo;

import com.jfsoftware.rule.NoMatchRule;
import com.jfsoftware.rule.Rule;

/**
 * A composite rule from other rules in stage two of the fizzBuzz problem.
 */
public class StageTwoCompositeRule implements Rule {

    private Rule fizzBuzzRule;

    public StageTwoCompositeRule() {
        Rule rule = new NoMatchRule();
        rule = new StageTwoBuzzRule(rule);
        rule = new StageTwoFizzRule(rule);
        fizzBuzzRule = new StageTwoFizzBuzzRule(rule);
    }

    @Override
    public String apply(final int number) {
        return fizzBuzzRule.apply(number);
    }
}