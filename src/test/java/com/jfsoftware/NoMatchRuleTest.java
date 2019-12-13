package com.jfsoftware;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class NoMatchRuleTest {

    @Test
    void ruleShouldRReturnStringValueOfItsIntegerInput() {
        NoMatchRule rule = new NoMatchRule();
        assertThat(rule.apply(5)).isEqualTo("5");
    }
}