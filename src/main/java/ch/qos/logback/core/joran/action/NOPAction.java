package ch.qos.logback.core.joran.action;

import ch.qos.logback.core.joran.spi.SaxEventInterpretationContext;
import org.xml.sax.Attributes;

public class NOPAction extends Action {
    public NOPAction() {
        super();
    }

    @Override
    public void begin(SaxEventInterpretationContext context, String name, Attributes attributes) {
    }

    @Override
    public void end(SaxEventInterpretationContext context, String name) {
    }
}
