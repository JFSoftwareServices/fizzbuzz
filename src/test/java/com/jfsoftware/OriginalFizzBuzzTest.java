package com.jfsoftware;

import com.jfsoftware.rule.CompositeRuleFactory;
import com.jfsoftware.rule.Rule;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static java.lang.String.valueOf;
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
    @ValueSource(ints = {5, 10, 20, 25})
    void multiplesOfFive(int number) {
        assertThat(rule.apply(number)).isEqualTo("Buzz");
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9, 12, 18, 21, 24, 27})
    void multiplesOfThree(int number) {
        assertThat(rule.apply(number)).isEqualTo("Fizz");
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 30})
    void multiplesOfThreeAndFive(int number) {
        assertThat(rule.apply(number)).isEqualTo("FizzBuzz");
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 4, 7, 8, 11, 13, 14, 16, 17, 19, 22, 23, 26, 28, 29})
    void notMultiplesOfThreeOrFive(int number) {
        assertThat(rule.apply(number)).isEqualTo(valueOf(number));
    }
}
