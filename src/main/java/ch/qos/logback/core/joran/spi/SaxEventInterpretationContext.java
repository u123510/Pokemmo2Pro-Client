package ch.qos.logback.core.joran.spi;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.joran.event.SaxEvent;
import ch.qos.logback.core.model.Model;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.spi.PropertyContainer;
import java.util.Map;
import java.util.Stack;

public class SaxEventInterpretationContext extends ContextAwareBase implements PropertyContainer {
    Stack modelStack;
    SaxEventInterpreter saxEventInterpreter;

    public SaxEventInterpretationContext(Context context, SaxEventInterpreter saxEventInterpreter) {
        this.context = context;
        this.saxEventInterpreter = saxEventInterpreter;
        this.modelStack = new Stack();
    }

    public SaxEventInterpreter getSaxEventInterpreter() {
        return this.saxEventInterpreter;
    }

    public Model peekModel() {
        if (this.modelStack.isEmpty()) {
            return null;
        }
        return (Model) this.modelStack.peek();
    }

    public void pushModel(Model model) {
        this.modelStack.push(model);
    }

    public boolean isModelStackEmpty() {
        return this.modelStack.isEmpty();
    }

    public Model popModel() {
        return (Model) this.modelStack.pop();
    }

    public Stack getCopyOfModelStack() {
        Stack copy = new Stack();
        copy.addAll(this.modelStack);
        return copy;
    }

    public void addSubstitutionProperty(String key, String value) {
        throw new UnsupportedOperationException();
    }

    public String getProperty(String key) {
        return this.context.getProperty(key);
    }

    public Map getCopyOfPropertyMap() {
        return null;
    }

    public String subst(String value) {
        if (value == null) {
            return null;
        }
        try {
            return ch.qos.logback.core.util.OptionHelper.substVars(value, this, this.context);
        } catch (ch.qos.logback.core.spi.ScanException | IllegalArgumentException exception) {
            addError("Problem while parsing [" + value + "]", exception);
            return value;
        }
    }
}
