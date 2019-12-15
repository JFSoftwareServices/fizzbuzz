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
    @ValueSource(ints = {5, 10, 15, 100})
    void multiplesOfFiveOrContainFive(int number) {
        assertThat(rule.apply(number)).isEqualTo("Buzz");
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 13})
    void multiplesOfThreeOrContainThree(int number) {
        assertThat(rule.apply(number)).isEqualTo("Fizz");
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 35, 53})
    void multiplesOfThreeOrContainThreeAndMultipleOfFiveOrContains(int number) {
        assertThat(rule.apply(number)).isEqualTo("FizzBuzz");
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 4, 7})
    void notMultiplesOfThreeOrFiveAndDoesNotContainThreeOrFive(int number) {
        assertThat(rule.apply(number)).isEqualTo(valueOf(number));
    }
}