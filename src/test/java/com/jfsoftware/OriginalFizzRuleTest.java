package com.jfsoftware;

import com.jfsoftware.rule.original.OriginalFizzRule;
import com.jfsoftware.rule.NoMatchRule;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Rather than testing all the possible values in the range 1..100, the tests assume that some values would make the
 * system behave in the same way. For example testing for the integer 3 is the same as testing for integer 18 for
 * some tests in this class.
 * <p>
 * Additionally the test are executed at value boundaries, for example 3 and 99 when testing that "Fizz" is returned.
 */
class OriginalFizzRuleTest {


    @ParameterizedTest
    @ValueSource(ints = {3, 99})
    void ruleShouldReturnFizzForIntegersThatAreMultiplesOffThree(int integer) {
        OriginalFizzRule rule = new OriginalFizzRule(null);
        assertThat(rule.apply(integer)).isEqualTo("Fizz");
    }


    @ParameterizedTest
    @ValueSource(ints = {1, 100})
    void ruleShouldRReturnIntegerIfNextRuleIsSetToNoMatchAndIntegerIsNotAMultipleOfFThree(int integer) {
        OriginalFizzRule rule = new OriginalFizzRule(new NoMatchRule());
        assertThat(rule.apply(integer)).isEqualTo(String.valueOf(integer));
    }

}