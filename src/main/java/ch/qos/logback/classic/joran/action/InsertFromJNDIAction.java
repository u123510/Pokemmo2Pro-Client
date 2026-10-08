package ch.qos.logback.classic.joran.action;

import ch.qos.logback.core.joran.action.BaseModelAction;
import ch.qos.logback.core.joran.action.PreconditionValidator;
import ch.qos.logback.core.joran.spi.SaxEventInterpretationContext;
import ch.qos.logback.core.model.InsertFromJNDIModel;
import ch.qos.logback.core.model.Model;
import org.xml.sax.Attributes;

public class InsertFromJNDIAction extends BaseModelAction {
    public static final String ENV_ENTRY_NAME_ATTR = "env-entry-name";
    public static final String AS_ATTR = "as";

    @Override
    public Model buildCurrentModel(SaxEventInterpretationContext context, String name, Attributes attributes) {
        InsertFromJNDIModel model = new InsertFromJNDIModel();
        model.setEnvEntryName(attributes.getValue("env-entry-name"));
        model.setAs(attributes.getValue("as"));
        model.setScopeStr(attributes.getValue("scope"));
        return model;
    }

    @Override
    public boolean validPreconditions(SaxEventInterpretationContext context, String name, Attributes attributes) {
        return new PreconditionValidator(this, context, name, attributes)
                .generic("env-entry-name").generic("as").isValid();
    }
}
