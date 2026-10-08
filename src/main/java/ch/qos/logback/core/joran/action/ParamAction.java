package ch.qos.logback.core.joran.action;

import ch.qos.logback.core.joran.spi.SaxEventInterpretationContext;
import ch.qos.logback.core.model.Model;
import ch.qos.logback.core.model.ParamModel;
import org.xml.sax.Attributes;

public class ParamAction extends BaseModelAction {
    public ParamAction() {
        super();
    }

    public boolean validPreconditions(SaxEventInterpretationContext context, String name, Attributes attributes) {
        PreconditionValidator validator = new PreconditionValidator(this, context, name, attributes);
        validator.validateNameAttribute();
        validator.validateValueAttribute();
        addWarn("<param> element is deprecated in favor of a more direct syntax." + atLine(context));
        addWarn("For details see http://logback.qos.ch/codes.html#param");
        return validator.isValid();
    }

    public Model buildCurrentModel(SaxEventInterpretationContext context, String name, Attributes attributes) {
        ParamModel model = new ParamModel();
        model.setName(attributes.getValue("name"));
        model.setValue(attributes.getValue("value"));
        return model;
    }
}
