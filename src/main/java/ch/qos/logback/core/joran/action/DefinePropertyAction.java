package ch.qos.logback.core.joran.action;

import ch.qos.logback.core.joran.spi.SaxEventInterpretationContext;
import ch.qos.logback.core.model.DefineModel;
import ch.qos.logback.core.model.Model;
import org.xml.sax.Attributes;

public class DefinePropertyAction extends BaseModelAction {
    public DefinePropertyAction() {
        super();
    }

    public boolean validPreconditions(SaxEventInterpretationContext context, String name, Attributes attributes) {
        PreconditionValidator validator = new PreconditionValidator(this, context, name, attributes);
        validator.validateClassAttribute();
        validator.validateNameAttribute();
        return validator.isValid();
    }

    public Model buildCurrentModel(SaxEventInterpretationContext context, String name, Attributes attributes) {
        DefineModel model = new DefineModel();
        model.setClassName(attributes.getValue("class"));
        model.setName(attributes.getValue("name"));
        model.setScopeStr(attributes.getValue("scope"));
        return model;
    }
}
