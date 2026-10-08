package ch.qos.logback.core.joran.action;

import ch.qos.logback.core.joran.spi.SaxEventInterpretationContext;
import ch.qos.logback.core.model.ImplicitModel;
import java.util.Stack;
import org.xml.sax.Attributes;

public class ImplicitModelAction extends Action {
    Stack currentImplicitModelStack;

    public ImplicitModelAction() {
        this.currentImplicitModelStack = new Stack();
    }

    @Override
    public void begin(SaxEventInterpretationContext context, String name, Attributes attributes) {
        ImplicitModel model = new ImplicitModel();
        model.setTag(name);
        model.setClassName(attributes.getValue("class"));
        this.currentImplicitModelStack.push(model);
        context.pushModel(model);
    }

    @Override
    public void body(SaxEventInterpretationContext context, String body) {
        ImplicitModel model = (ImplicitModel) this.currentImplicitModelStack.peek();
        model.addText(body);
    }

    @Override
    public void end(SaxEventInterpretationContext context, String name) {
        ImplicitModel model = (ImplicitModel) this.currentImplicitModelStack.peek();
        Object popped = context.popModel();
        if (popped != model) {
            addError(String.valueOf(model) + " does not match " + String.valueOf(popped));
            return;
        }
        Object parent = context.peekModel();
        if (parent != null) {
            ((ch.qos.logback.core.model.Model) parent).addSubModel(model);
        } else {
            addWarn("Could not find parent model.");
            addWarn(" Will not add current implicit model as subModel.");
        }
        this.currentImplicitModelStack.pop();
    }
}
