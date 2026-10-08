package ch.qos.logback.core.joran.action;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.joran.spi.SaxEventInterpretationContext;
import ch.qos.logback.core.util.OptionHelper;
import java.util.HashMap;
import java.util.Map;
import org.xml.sax.Attributes;

public class ConversionRuleAction extends Action {
    boolean inError;

    public ConversionRuleAction() {
        this.inError = false;
    }

    public void begin(SaxEventInterpretationContext context, String name, Attributes attributes) {
        this.inError = false;
        String conversionWord = attributes.getValue("conversionWord");
        String converterClass = attributes.getValue("converterClass");
        if (OptionHelper.isNullOrEmptyOrAllSpaces(conversionWord)) {
            this.inError = true;
            addError("No 'conversionWord' attribute in <conversionRule>");
            return;
        }
        if (OptionHelper.isNullOrEmptyOrAllSpaces(converterClass)) {
            this.inError = true;
            addError("No 'converterClass' attribute in <conversionRule>");
            return;
        }
        try {
            Map registry = (Map) getContext().getObject("PATTERN_RULE_REGISTRY");
            if (registry == null) {
                registry = new HashMap();
                getContext().putObject("PATTERN_RULE_REGISTRY", registry);
            }
            addInfo("registering conversion word " + conversionWord + " with class [" + converterClass + "]");
            registry.put(conversionWord, converterClass);
        } catch (Exception exception) {
            this.inError = true;
            addError("Could not add conversion rule to PatternLayout.");
        }
    }

    public void end(SaxEventInterpretationContext context, String name) {
    }

    public void finish(SaxEventInterpretationContext context) {
    }
}
