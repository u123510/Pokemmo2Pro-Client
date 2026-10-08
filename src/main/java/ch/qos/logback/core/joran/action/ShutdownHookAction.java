package ch.qos.logback.core.joran.action;

import ch.qos.logback.core.joran.spi.SaxEventInterpretationContext;
import ch.qos.logback.core.model.Model;
import ch.qos.logback.core.model.ShutdownHookModel;
import org.xml.sax.Attributes;

public class ShutdownHookAction extends BaseModelAction {
    public ShutdownHookAction() {
        super();
    }

    public boolean validPreconditions(SaxEventInterpretationContext context, String name, Attributes attributes) {
        return true;
    }

    public Model buildCurrentModel(SaxEventInterpretationContext context, String name, Attributes attributes) {
        ShutdownHookModel model = new ShutdownHookModel();
        model.setClassName(attributes.getValue("class"));
        return model;
    }
}
