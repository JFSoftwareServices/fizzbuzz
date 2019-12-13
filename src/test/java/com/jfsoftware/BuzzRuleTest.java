package com.jfsoftware;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Rather than testing all the possible values in the range 1..100, the tests assume that some values would make the
 * system behave in the same way. For example testing for the integer 5 is the same as testing for integer 100 for
 * test in this class.
 */
class BuzzRuleTest {


    @ParameterizedTest
    @ValueSource(ints = {5, 100})
    void ruleShouldReturnBuzzForIntegersThatAreMultiplesOfFive(int integer) {
        BuzzRule rule = new BuzzRule(null);
        assertThat(rule.apply(integer)).isEqualTo("Buzz");
    }


    @ParameterizedTest
    @ValueSource(ints = {1, 99})
    void ruleShouldReturnIntegerIfNextRuleIsSetToNoMatchAndIntegerIsNotAMultipleOfFive(int integer) {
        BuzzRule rule = new BuzzRule(new NoMatchRule());
        assertThat(rule.apply(integer)).isEqualTo(String.valueOf(integer));
    }

}