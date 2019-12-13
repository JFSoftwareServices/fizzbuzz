package com.jfsoftware;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Rather than testing all the possible values in the range 1..100, the tests assume that some values would make the
 * system behave in the same way. For example testing for the integer 3 is the same as testing for integer 99 for
 * tests in this class.
 */
class FizzRuleTest {


    @ParameterizedTest
    @ValueSource(ints = {3, 99})
    void ruleShouldReturnFizzForIntegersThatAreMultiplesOffThree(int integer) {
        FizzRule rule = new FizzRule(null);
        assertThat(rule.apply(integer)).isEqualTo("Fizz");
    }


    @ParameterizedTest
    @ValueSource(ints = {1, 100})
    void ruleShouldRReturnIntegerIfNextRuleIsSetToNoMatchAndIntegerIsNotAMultipleOfFThree(int integer) {
        FizzRule rule = new FizzRule(new NoMatchRule());
        assertThat(rule.apply(integer)).isEqualTo(String.valueOf(integer));
    }

}