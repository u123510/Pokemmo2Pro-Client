package ch.qos.logback.core.joran.action;

import ch.qos.logback.core.joran.spi.SaxEventInterpretationContext;
import org.xml.sax.Attributes;

public class ContextPropertyAction extends Action {
    public ContextPropertyAction() {
        super();
    }

    @Override
    public void begin(SaxEventInterpretationContext context, String name, Attributes attributes) {
        addError("The [contextProperty] element has been removed. Please use [property] element instead");
    }

    @Override
    public void end(SaxEventInterpretationContext context, String name) {
    }
}
