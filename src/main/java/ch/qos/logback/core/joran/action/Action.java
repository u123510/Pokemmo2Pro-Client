package ch.qos.logback.core.joran.action;

import ch.qos.logback.core.joran.spi.SaxEventInterpretationContext;
import ch.qos.logback.core.joran.spi.ActionException;
import ch.qos.logback.core.spi.ContextAwareBase;
import org.xml.sax.Attributes;
import org.xml.sax.Locator;

public abstract class Action extends ContextAwareBase {
    public static final String NAME_ATTRIBUTE = "name";
    public static final String KEY_ATTRIBUTE = "key";
    public static final String VALUE_ATTRIBUTE = "value";
    public static final String FILE_ATTRIBUTE = "file";
    public static final String CLASS_ATTRIBUTE = "class";
    public static final String PATTERN_ATTRIBUTE = "pattern";
    public static final String SCOPE_ATTRIBUTE = "scope";
    public static final String ACTION_CLASS_ATTRIBUTE = "actionClass";

    public static int getLineNumber(SaxEventInterpretationContext context) {
        if (context.getSaxEventInterpreter() == null) {
            return -1;
        }
        Locator locator = context.getSaxEventInterpreter().getLocator();
        return locator == null ? -1 : locator.getLineNumber();
    }

    public abstract void begin(SaxEventInterpretationContext context, String name, Attributes attributes) throws ActionException;

    public void body(SaxEventInterpretationContext context, String body) throws ActionException {
    }

    public abstract void end(SaxEventInterpretationContext context, String name) throws ActionException;

    @Override
    public String toString() {
        return getClass().getName();
    }

    public int getColumnNumber(SaxEventInterpretationContext context) {
        if (context.getSaxEventInterpreter() == null) {
            return -1;
        }
        Locator locator = context.getSaxEventInterpreter().getLocator();
        return locator == null ? -1 : locator.getColumnNumber();
    }

    public String getLineColStr(SaxEventInterpretationContext context) {
        return "line: " + getLineNumber(context) + ", column: " + getColumnNumber(context);
    }

    public String atLine(SaxEventInterpretationContext context) {
        return "At line " + getLineNumber(context);
    }

    public String nearLine(SaxEventInterpretationContext context) {
        return "Near line " + getLineNumber(context);
    }
}
