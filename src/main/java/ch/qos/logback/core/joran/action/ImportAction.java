package ch.qos.logback.core.joran.action;

import ch.qos.logback.core.joran.spi.SaxEventInterpretationContext;
import ch.qos.logback.core.model.ImportModel;
import ch.qos.logback.core.model.Model;
import org.xml.sax.Attributes;

public class ImportAction extends BaseModelAction {
    public ImportAction() {
        super();
    }

    public boolean validPreconditions(SaxEventInterpretationContext context, String name, Attributes attributes) {
        PreconditionValidator validator = new PreconditionValidator(this, context, name, attributes);
        validator.validateClassAttribute();
        return validator.isValid();
    }

    public Model buildCurrentModel(SaxEventInterpretationContext context, String name, Attributes attributes) {
        ImportModel model = new ImportModel();
        model.setClassName(attributes.getValue("class"));
        return model;
    }
}
