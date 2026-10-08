package ch.qos.logback.classic.joran.action;

import ch.qos.logback.classic.model.ContextNameModel;
import ch.qos.logback.core.joran.action.BaseModelAction;
import ch.qos.logback.core.joran.spi.SaxEventInterpretationContext;
import ch.qos.logback.core.model.Model;
import org.xml.sax.Attributes;

public class ContextNameAction extends BaseModelAction {
    @Override
    public Model buildCurrentModel(SaxEventInterpretationContext context, String name, Attributes attributes) {
        return new ContextNameModel();
    }
}
