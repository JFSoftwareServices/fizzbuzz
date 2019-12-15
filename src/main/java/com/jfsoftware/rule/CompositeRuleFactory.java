package com.jfsoftware.rule;

import com.jfsoftware.rule.original.OriginalCompositeRule;
import com.jfsoftware.rule.stagetwo.StageTwoCompositeRule;

import static java.lang.System.getProperty;

/**
 * This factory returns the CompositeRule to be used during application execution.
 * <p>
 * The rule is created dynamically depending on the the value of the application system property set.
 * <p>
 * The system property application is set from the commandline as either -Dapplication=original or
 * -Dapplication=stageTwo
 */
public final class CompositeRuleFactory {
    private static final String APPLICATION = "application";

    public static Rule create() {
        final String application = getProperty(APPLICATION);

        if (application == null || application.isEmpty()) {
            throw new IllegalStateException("The 'application' system property must be set");
        }

        Rule rule;
        if (getProperty(APPLICATION).equals("original")) {
            rule = new OriginalCompositeRule();
        } else if (getProperty(APPLICATION).equals("stageTwo")) {
            rule = new StageTwoCompositeRule();
        } else {
            throw new IllegalArgumentException("Set system property using either '-Dapplication=original' or '-Dapplication=stageTwo'");
        }

        return rule;
    }
}