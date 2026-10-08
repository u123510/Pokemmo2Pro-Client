package cn.pokemmo.util.logging;

import ch.qos.logback.core.joran.spi.ElementSelector;
import ch.qos.logback.core.joran.spi.RuleStore;
import java.util.function.Supplier;

/**
 * Logback Joran 规则配置辅助类
 */
public abstract class LogbackRuleHelper {
    public static ElementSelector addRuleAndReturnNext(RuleStore ruleStore, ElementSelector elementSelector, Supplier<?> supplier, String string) {
        ruleStore.addRule(elementSelector, supplier);
        return new ElementSelector(string);
    }

    public static ElementSelector Jl(RuleStore ruleStore, ElementSelector elementSelector, Supplier<?> supplier, String string) {
        return addRuleAndReturnNext(ruleStore, elementSelector, supplier, string);
    }
}
