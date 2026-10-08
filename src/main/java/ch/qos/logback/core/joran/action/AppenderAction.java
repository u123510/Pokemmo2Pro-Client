package ch.qos.logback.core.joran.action;

import ch.qos.logback.core.joran.spi.SaxEventInterpretationContext;
import ch.qos.logback.core.model.AppenderModel;
import ch.qos.logback.core.model.Model;
import org.xml.sax.Attributes;

public class AppenderAction extends BaseModelAction {
    public AppenderAction() {
        super();
    }

    public boolean validPreconditions(SaxEventInterpretationContext context, String name, Attributes attributes) {
        PreconditionValidator validator = new PreconditionValidator(this, context, name, attributes);
        validator.validateClassAttribute();
        validator.validateNameAttribute();
        return validator.isValid();
    }

    public Model buildCurrentModel(SaxEventInterpretationContext context, String name, Attributes attributes) {
        AppenderModel model = new AppenderModel();
        model.setClassName(attributes.getValue("class"));
        model.setName(attributes.getValue("name"));
        return model;
    }
}
