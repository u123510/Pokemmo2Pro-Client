package ch.qos.logback.core.joran.action;

import ch.qos.logback.core.joran.spi.SaxEventInterpretationContext;
import ch.qos.logback.core.spi.ContextAware;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.util.OptionHelper;
import org.xml.sax.Attributes;

public class PreconditionValidator extends ContextAwareBase {
    boolean valid;
    SaxEventInterpretationContext intercon;
    Attributes attributes;
    String tag;

    public PreconditionValidator(ContextAware contextAware, SaxEventInterpretationContext intercon, String tag, Attributes attributes) {
        super(contextAware);
        this.valid = true;
        setContext(contextAware.getContext());
        this.intercon = intercon;
        this.tag = tag;
        this.attributes = attributes;
    }

    public PreconditionValidator validateZeroAttributes() {
        if (this.attributes == null) {
            return this;
        }
        if (this.attributes.getLength() != 0) {
            addError("Element [" + this.tag + "] should have no attributes, near line " + Action.getLineNumber(this.intercon));
            this.valid = false;
        }
        return this;
    }

    public PreconditionValidator validateClassAttribute() {
        return generic("class");
    }

    public PreconditionValidator validateNameAttribute() {
        return generic("name");
    }

    public PreconditionValidator validateValueAttribute() {
        return generic("value");
    }

    public PreconditionValidator validateRefAttribute() {
        return generic("ref");
    }

    public PreconditionValidator generic(String attributeName) {
        if (OptionHelper.isNullOrEmptyOrAllSpaces(this.attributes.getValue(attributeName))) {
            addError("Missing attribute [" + attributeName + "] in element [" + this.tag + "] near line " + Action.getLineNumber(this.intercon));
            this.valid = false;
        }
        return this;
    }

    public boolean isValid() {
        return this.valid;
    }
}
