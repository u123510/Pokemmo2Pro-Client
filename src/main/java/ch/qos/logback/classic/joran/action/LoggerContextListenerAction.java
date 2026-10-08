package ch.qos.logback.classic.joran.action;

import ch.qos.logback.classic.model.LoggerContextListenerModel;
import ch.qos.logback.core.joran.action.BaseModelAction;
import ch.qos.logback.core.joran.action.PreconditionValidator;
import ch.qos.logback.core.joran.spi.SaxEventInterpretationContext;
import ch.qos.logback.core.model.Model;
import org.xml.sax.Attributes;

public class LoggerContextListenerAction extends BaseModelAction {
    boolean inError;
    ch.qos.logback.classic.spi.LoggerContextListener lcl;

    public LoggerContextListenerAction() {
        inError = false;
    }

    @Override
    public boolean validPreconditions(SaxEventInterpretationContext context, String name, Attributes attributes) {
        return new PreconditionValidator(this, context, name, attributes)
                .validateClassAttribute().isValid();
    }

    @Override
    public Model buildCurrentModel(SaxEventInterpretationContext context, String name, Attributes attributes) {
        LoggerContextListenerModel model = new LoggerContextListenerModel();
        model.setClassName(attributes.getValue("class"));
        return model;
    }
}
