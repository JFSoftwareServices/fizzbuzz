package com.jfsoftware;

import com.jfsoftware.rule.original.OriginalFizzBuzzRule;
import com.jfsoftware.rule.NoMatchRule;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Rather than testing all the possible values in the range 1..100, the tests assume that some values would make the
 * system behave in the same way. For example testing for the integer 15 is the same as testing for integer 45 for
 * certain test in this class.
 * <p>
 * Additionally the test are executed at value boundaries, for example 15 and 90 when testing that "FizzBuzz" is returned.
 */
class OriginalFizzBuzzRuleTest {


    @ParameterizedTest
    @ValueSource(ints = {15, 90})
    void ruleShouldReturnFizzBuzzForIntegersThatAreMultiplesOfFiveAndThree(int integer) {
        OriginalFizzBuzzRule rule = new OriginalFizzBuzzRule(null);
        assertThat(rule.apply(integer)).isEqualTo("FizzBuzz");
    }


    @ParameterizedTest
    @ValueSource(ints = {1, 99})
    void ruleShouldReturnIntegerIfNextRuleIsSetToNoMatchAndIntegerIsNotAMultipleOfFiveAndThree(int integer) {
        OriginalFizzBuzzRule rule = new OriginalFizzBuzzRule(new NoMatchRule());
        assertThat(rule.apply(integer)).isEqualTo(String.valueOf(integer));
    }

}