package ch.qos.logback.core.joran.action;

import ch.qos.logback.core.joran.spi.ActionException;
import ch.qos.logback.core.joran.spi.SaxEventInterpretationContext;
import ch.qos.logback.core.model.Model;
import org.xml.sax.Attributes;

public abstract class BaseModelAction extends Action {
    Model parentModel;
    Model currentModel;
    boolean inError;

    public BaseModelAction() {
        this.inError = false;
    }

    @Override
    public void begin(SaxEventInterpretationContext context, String name, Attributes attributes) {
        this.parentModel = null;
        this.inError = false;
        if (!validPreconditions(context, name, attributes)) {
            this.inError = true;
            return;
        }
        Model model = buildCurrentModel(context, name, attributes);
        this.currentModel = model;
        model.setTag(name);
        if (!context.isModelStackEmpty()) {
            this.parentModel = context.peekModel();
        }
        model.setLineNumber(Action.getLineNumber(context));
        context.pushModel(model);
    }

    public abstract Model buildCurrentModel(SaxEventInterpretationContext context, String name, Attributes attributes);

    public boolean validPreconditions(SaxEventInterpretationContext context, String name, Attributes attributes) {
        return true;
    }

    @Override
    public void body(SaxEventInterpretationContext context, String body) throws ActionException {
        if (this.currentModel != null) {
            this.currentModel.addText(body);
            return;
        }
        throw new ActionException("current model is null. Is <configuration> element missing?");
    }

    @Override
    public void end(SaxEventInterpretationContext context, String name) {
        if (this.inError) {
            return;
        }
        Model top = context.peekModel();
        if (top != this.currentModel) {
            addWarn("The object " + String.valueOf(top) + "] at the top of the stack differs from the model [" + this.currentModel.idString() + "] pushed earlier.");
            addWarn("This is wholly unexpected.");
        }
        if (this.parentModel != null) {
            this.parentModel.addSubModel(this.currentModel);
            context.popModel();
        }
    }
}
