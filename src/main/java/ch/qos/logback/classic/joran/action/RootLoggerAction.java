package ch.qos.logback.classic.joran.action;

import ch.qos.logback.classic.model.RootLoggerModel;
import ch.qos.logback.core.joran.action.BaseModelAction;
import ch.qos.logback.core.joran.spi.SaxEventInterpretationContext;
import ch.qos.logback.core.model.Model;
import org.xml.sax.Attributes;

public class RootLoggerAction extends BaseModelAction {
    String root;
    boolean inError;

    @Override
    public boolean validPreconditions(SaxEventInterpretationContext context, String name, Attributes attributes) {
        String level = attributes.getValue("level");
        if ("NULL".equalsIgnoreCase(level) || "INHERITED".equalsIgnoreCase(level)) {
            addError("The level for the ROOT logger cannot be set to NULL or INHERITED. Ignoring.");
            return false;
        }
        return true;
    }

    @Override
    public Model buildCurrentModel(SaxEventInterpretationContext context, String name, Attributes attributes) {
        RootLoggerModel model = new RootLoggerModel();
        model.setLevel(attributes.getValue("level"));
        return model;
    }
}
