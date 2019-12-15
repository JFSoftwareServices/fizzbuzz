package com.jfsoftware;

import com.jfsoftware.rule.CompositeRuleFactory;
import com.jfsoftware.rule.Rule;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the stagetwo way of solving the fizzBuzz problem
 */
class OriginalFizzBuzzTest {

    private Rule rule;

    @BeforeEach
    void createCompositeRule() {
        System.setProperty("application", "original");
        rule = CompositeRuleFactory.create();
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10, 95, 100})
    void multiplesOfFive(int number) {
        assertThat(rule.apply(number)).isEqualTo("Buzz");
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 96, 99})
    void multiplesOfThree(int number) {
        assertThat(rule.apply(number)).isEqualTo("Fizz");
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 30, 75, 90})
    void multiplesOfThreeAndFive(int number) {
        assertThat(rule.apply(number)).isEqualTo("FizzBuzz");
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 4, 7, 94, 97, 98})
    void notMultiplesOfThreeOrFive(int number) {
        assertThat(rule.apply(number)).isEqualTo(number);
    }
}
