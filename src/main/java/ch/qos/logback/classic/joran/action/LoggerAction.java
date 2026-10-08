package ch.qos.logback.classic.joran.action;

import ch.qos.logback.classic.model.LoggerModel;
import ch.qos.logback.core.joran.action.BaseModelAction;
import ch.qos.logback.core.joran.action.PreconditionValidator;
import ch.qos.logback.core.joran.spi.SaxEventInterpretationContext;
import ch.qos.logback.core.model.Model;
import org.xml.sax.Attributes;

public class LoggerAction extends BaseModelAction {
    @Override
    public boolean validPreconditions(SaxEventInterpretationContext context, String name, Attributes attributes) {
        return new PreconditionValidator(this, context, name, attributes)
                .validateNameAttribute().isValid();
    }

    @Override
    public Model buildCurrentModel(SaxEventInterpretationContext context, String name, Attributes attributes) {
        LoggerModel model = new LoggerModel();
        model.setName(attributes.getValue("name"));
        model.setLevel(attributes.getValue("level"));
        model.setAdditivity(attributes.getValue("additivity"));
        return model;
    }
}
