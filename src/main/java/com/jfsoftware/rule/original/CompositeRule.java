package com.jfsoftware.rule.original;

import com.jfsoftware.rule.NoMatchRule;
import com.jfsoftware.rule.Rule;

public class CompositeRule implements Rule {

    private FizzBuzzRule fizzBuzzRule;

    CompositeRule() {
        Rule noMatchRule = new NoMatchRule();
        Rule buzzRule = new BuzzRule(noMatchRule);
        Rule fizzRule = new FizzRule(buzzRule);
        fizzBuzzRule = new FizzBuzzRule(fizzRule);
    }

    @Override
    public String apply(int integer) {
        return fizzBuzzRule.apply(integer);
    }
}