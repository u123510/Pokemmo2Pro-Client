package ch.qos.logback.core.joran.action;

import ch.qos.logback.core.joran.spi.ElementSelector;
import ch.qos.logback.core.joran.spi.SaxEventInterpretationContext;
import ch.qos.logback.core.joran.spi.SaxEventInterpreter;
import org.xml.sax.Attributes;

public class NewRuleAction extends Action {
    boolean inError;

    public NewRuleAction() {
        this.inError = false;
    }

    @Override
    public void begin(SaxEventInterpretationContext context, String name, Attributes attributes) {
        this.inError = false;
        String pattern = attributes.getValue("pattern");
        String actionClass = attributes.getValue("actionClass");
        if (ch.qos.logback.core.util.OptionHelper.isNullOrEmptyOrAllSpaces(pattern)) {
            this.inError = true;
            addError("No 'pattern' attribute in <newRule>");
            return;
        }
        if (ch.qos.logback.core.util.OptionHelper.isNullOrEmptyOrAllSpaces(actionClass)) {
            this.inError = true;
            addError("No 'actionClass' attribute in <newRule>");
            return;
        }
        try {
            addInfo("About to add new Joran parsing rule [" + pattern + "," + actionClass + "].");
            SaxEventInterpreter interpreter = context.getSaxEventInterpreter();
            interpreter.getRuleStore().addRule(new ElementSelector(pattern), actionClass);
        } catch (Exception exception) {
            this.inError = true;
            addError("Could not add new Joran parsing rule [" + pattern + "," + actionClass + "]");
        }
    }

    @Override
    public void end(SaxEventInterpretationContext context, String name) {
    }

    public void finish(SaxEventInterpretationContext context) {
    }
}
