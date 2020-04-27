package com.jfsoftware.rule.original;

import com.jfsoftware.rule.NoMatchRule;
import com.jfsoftware.rule.Number;
import com.jfsoftware.rule.Rule;

/**
 * A composite rule that composes a rule from other rules in the original fizzBuzz problem.
 */
public class OriginalCompositeRule implements Rule {

    private OriginalFizzBuzzRule fizzBuzzRule;

    public OriginalCompositeRule() {
        Rule noMatchRule = new NoMatchRule();
        Rule buzzRule = new OriginalBuzzRule(noMatchRule);
        Rule fizzRule = new OriginalFizzRule(buzzRule);
        fizzBuzzRule = new OriginalFizzBuzzRule(fizzRule);
    }

    @Override
    public String apply(Number number) {
        return fizzBuzzRule.apply(number);
    }
}