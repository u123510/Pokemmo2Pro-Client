package ch.qos.logback.core.joran.action;

import ch.qos.logback.core.joran.spi.SaxEventInterpretationContext;
import ch.qos.logback.core.model.Model;
import ch.qos.logback.core.model.StatusListenerModel;
import ch.qos.logback.core.util.OptionHelper;
import org.xml.sax.Attributes;

public class StatusListenerAction extends BaseModelAction {
    boolean inError;
    Boolean effectivelyAdded;
    ch.qos.logback.core.status.StatusListener statusListener;

    public StatusListenerAction() {
        this.inError = false;
        this.effectivelyAdded = null;
        this.statusListener = null;
    }

    public boolean validPreconditions(SaxEventInterpretationContext context, String name, Attributes attributes) {
        if (OptionHelper.isNullOrEmptyOrAllSpaces(attributes.getValue("class"))) {
            addError("Missing class name for statusListener. Near [" + name + "] line " + Action.getLineNumber(context));
            return false;
        }
        return true;
    }

    public Model buildCurrentModel(SaxEventInterpretationContext context, String name, Attributes attributes) {
        StatusListenerModel model = new StatusListenerModel();
        model.setClassName(attributes.getValue("class"));
        return model;
    }
}
