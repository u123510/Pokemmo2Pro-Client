package ch.qos.logback.core.joran.spi;

import org.xml.sax.Locator;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.spi.ContextAwareImpl;

class CAI_WithLocatorSupport extends ContextAwareImpl {
    public CAI_WithLocatorSupport(Context context, SaxEventInterpreter interpreter) {
        super(context, interpreter);
    }

    public Object getOrigin() {
        SaxEventInterpreter interpreter = (SaxEventInterpreter) super.getOrigin();
        Locator locator = interpreter.locator;
        if (locator != null) {
            return SaxEventInterpreter.class.getName() + "@" + locator.getLineNumber() + ":" + locator.getColumnNumber();
        }
        return SaxEventInterpreter.class.getName() + "@NA:NA";
    }
}
