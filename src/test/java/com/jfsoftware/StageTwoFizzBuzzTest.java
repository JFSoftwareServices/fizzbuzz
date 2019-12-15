package com.jfsoftware;

import com.jfsoftware.rule.CompositeRuleFactory;
import com.jfsoftware.rule.Rule;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static java.lang.String.valueOf;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for stage-two way of solving the fizzBuzz problem.
 */
class StageTwoFizzBuzzTest {

    private Rule rule;

    @BeforeEach
    void createCompositeRule() {
        System.setProperty("application", "stageTwo");
        rule = CompositeRuleFactory.create();
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10, 20, 25, 40, 50, 52})
    void multiplesOfFiveOrContainFive(int number) {
        assertThat(rule.apply(number)).isEqualTo("Buzz");
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9, 12, 13, 18, 21, 23, 24, 27, 31, 32, 33, 34, 36, 37, 38, 39, 42, 43, 48})
    void multiplesOfThreeOrContainThree(int number) {
        assertThat(rule.apply(number)).isEqualTo("Fizz");
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 30, 35, 45, 51, 53, 54})
    void multiplesOfThreeOrContainsThreeAndMultipleOfFiveOrContainsFive(int number) {
        assertThat(rule.apply(number)).isEqualTo("FizzBuzz");
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 4, 7, 8, 11, 14, 16, 17, 19, 22, 26, 28, 29, 41, 44, 46, 47, 49})
    void notMultiplesOfThreeOrFiveAndDoesNotContainThreeOrFive(int number) {
        assertThat(rule.apply(number)).isEqualTo(valueOf(number));
    }
}