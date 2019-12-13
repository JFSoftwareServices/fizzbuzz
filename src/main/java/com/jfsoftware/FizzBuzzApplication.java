package com.jfsoftware;

public class FizzBuzzApplication {
    public static void main(String[] args) {
        new FizzBuzzApplication().run();
    }

    private void run() {
        CompositeRule compositeRule = new CompositeRule();
        for (int i = 1; i < 100; i++) {
            System.out.println(compositeRule.apply(i)) ;
        }
    }
}