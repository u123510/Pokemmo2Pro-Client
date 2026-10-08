package ch.qos.logback.core.joran.conditional;

import org.xml.sax.Attributes;

import ch.qos.logback.core.joran.action.BaseModelAction;
import ch.qos.logback.core.joran.action.PreconditionValidator;
import ch.qos.logback.core.joran.spi.SaxEventInterpretationContext;
import ch.qos.logback.core.model.Model;
import ch.qos.logback.core.model.conditional.IfModel;

public class IfAction extends BaseModelAction {
    public static final String CONDITION_ATTRIBUTE = "condition";

    public IfAction() {
        super();
    }

    public boolean validPreconditions(SaxEventInterpretationContext context, String name, Attributes attributes) {
        return new PreconditionValidator(this, context, name, attributes).generic("condition").isValid();
    }

    public Model buildCurrentModel(SaxEventInterpretationContext context, String name, Attributes attributes) {
        IfModel model = new IfModel();
        model.setCondition(attributes.getValue("condition"));
        return model;
    }
}
