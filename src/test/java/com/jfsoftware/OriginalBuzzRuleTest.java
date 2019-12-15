package com.jfsoftware;

import com.jfsoftware.rule.original.OriginalBuzzRule;
import com.jfsoftware.rule.NoMatchRule;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Rather than testing all the possible values in the range 1..100, the tests assume that some values would make the
 * system behave in the same way. For example testing for the integer 5 is the same as testing for integer 35 for
 * certain test in this class.
 * <p>
 * Additionally the test are executed at value boundaries, for example 5 and 100 when testing that "Buzz" is returned.
 */
class OriginalBuzzRuleTest {


    @ParameterizedTest
    @ValueSource(ints = {5, 100})
    void ruleShouldReturnBuzzForIntegersThatAreMultiplesOfFive(int integer) {
        OriginalBuzzRule rule = new OriginalBuzzRule(null);
        assertThat(rule.apply(integer)).isEqualTo("Buzz");
    }


    @ParameterizedTest
    @ValueSource(ints = {1, 99})
    void ruleShouldReturnIntegerIfNextRuleIsSetToNoMatchAndIntegerIsNotAMultipleOfFive(int integer) {
        OriginalBuzzRule rule = new OriginalBuzzRule(new NoMatchRule());
        assertThat(rule.apply(integer)).isEqualTo(String.valueOf(integer));
    }

}