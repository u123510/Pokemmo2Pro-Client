package ch.qos.logback.core.joran.action;

import ch.qos.logback.core.joran.spi.SaxEventInterpretationContext;
import ch.qos.logback.core.model.EventEvaluatorModel;
import ch.qos.logback.core.model.Model;
import org.xml.sax.Attributes;

public class EventEvaluatorAction extends BaseModelAction {
    public EventEvaluatorAction() {
        super();
    }

    public boolean validPreconditions(SaxEventInterpretationContext context, String name, Attributes attributes) {
        PreconditionValidator validator = new PreconditionValidator(this, context, name, attributes);
        validator.validateNameAttribute();
        return validator.isValid();
    }

    public Model buildCurrentModel(SaxEventInterpretationContext context, String name, Attributes attributes) {
        EventEvaluatorModel model = new EventEvaluatorModel();
        model.setClassName(attributes.getValue("class"));
        model.setName(attributes.getValue("name"));
        return model;
    }
}
