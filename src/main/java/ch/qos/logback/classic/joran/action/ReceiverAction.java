package ch.qos.logback.classic.joran.action;

import ch.qos.logback.classic.model.ReceiverModel;
import ch.qos.logback.core.joran.action.BaseModelAction;
import ch.qos.logback.core.joran.action.PreconditionValidator;
import ch.qos.logback.core.joran.spi.SaxEventInterpretationContext;
import ch.qos.logback.core.model.Model;
import org.xml.sax.Attributes;

public class ReceiverAction extends BaseModelAction {
    @Override
    public Model buildCurrentModel(SaxEventInterpretationContext context, String name, Attributes attributes) {
        ReceiverModel model = new ReceiverModel();
        model.setClassName(attributes.getValue("class"));
        return model;
    }

    @Override
    public boolean validPreconditions(SaxEventInterpretationContext context, String name, Attributes attributes) {
        return new PreconditionValidator(this, context, name, attributes)
                .validateClassAttribute().isValid();
    }
}
