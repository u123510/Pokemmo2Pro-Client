package ch.qos.logback.core.joran.spi;

import ch.qos.logback.core.model.processor.DefaultProcessor;

public interface NewRuleProvider {
    void addPathActionAssociations(RuleStore ruleStore);
    void addModelHandlerAssociations(DefaultProcessor processor);
    void addModelAnalyserAssociations(DefaultProcessor processor);
}
