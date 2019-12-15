package com.jfsoftware.rule.original;

import com.jfsoftware.rule.NoMatchRule;
import com.jfsoftware.rule.Rule;

public class OriginalCompositeRule implements Rule {

    private OriginalFizzBuzzRule fizzBuzzRule;

    public OriginalCompositeRule() {
        Rule noMatchRule = new NoMatchRule();
        Rule buzzRule = new OriginalBuzzRule(noMatchRule);
        Rule fizzRule = new OriginalFizzRule(buzzRule);
        fizzBuzzRule = new OriginalFizzBuzzRule(fizzRule);
    }

    @Override
    public String apply(int integer) {
        return fizzBuzzRule.apply(integer);
    }
}