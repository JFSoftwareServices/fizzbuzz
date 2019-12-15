package com.jfsoftware;

import com.jfsoftware.rule.CompositeRuleFactory;
import com.jfsoftware.rule.Rule;

public class FizzBuzzApplication {
    public static void main(String[] args) {
        new FizzBuzzApplication().run();
    }

    private void run() {
        Rule rule = CompositeRuleFactory.create();
        for (int i = 1; i <= 100; i++) {
            System.out.println(rule.apply(i));
        }
    }
}