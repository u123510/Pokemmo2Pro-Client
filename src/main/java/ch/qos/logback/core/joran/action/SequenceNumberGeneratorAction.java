package ch.qos.logback.core.joran.action;

import ch.qos.logback.core.joran.spi.SaxEventInterpretationContext;
import ch.qos.logback.core.model.Model;
import ch.qos.logback.core.model.SequenceNumberGeneratorModel;
import org.xml.sax.Attributes;

public class SequenceNumberGeneratorAction extends BaseModelAction {
    public SequenceNumberGeneratorAction() {
        super();
    }

    public Model buildCurrentModel(SaxEventInterpretationContext context, String name, Attributes attributes) {
        SequenceNumberGeneratorModel model = new SequenceNumberGeneratorModel();
        model.setClassName(attributes.getValue("class"));
        return model;
    }

    public boolean validPreconditions(SaxEventInterpretationContext context, String name, Attributes attributes) {
        PreconditionValidator validator = new PreconditionValidator(this, context, name, attributes);
        validator.validateClassAttribute();
        return validator.isValid();
    }
}
