package com.jfsoftware;

import com.jfsoftware.rule.original.OriginalCompositeRule;

public class FizzBuzzApplication {
    public static void main(String[] args) {
        new FizzBuzzApplication().run();
    }

    private void run() {
        OriginalCompositeRule originalCompositeRule = new OriginalCompositeRule();
        for (int i = 1; i <= 100; i++) {
            System.out.println(originalCompositeRule.apply(i));
        }
    }
}