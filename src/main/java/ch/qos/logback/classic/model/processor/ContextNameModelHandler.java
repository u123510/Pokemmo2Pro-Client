package ch.qos.logback.classic.model.processor;

import ch.qos.logback.classic.model.ContextNameModel;
import ch.qos.logback.core.Context;
import ch.qos.logback.core.model.Model;
import ch.qos.logback.core.model.processor.ModelHandlerBase;
import ch.qos.logback.core.model.processor.ModelInterpretationContext;

public class ContextNameModelHandler extends ModelHandlerBase {
    public ContextNameModelHandler(Context context) {
        super(context);
    }

    public static ModelHandlerBase makeInstance(Context context, ModelInterpretationContext mic) {
        return new ContextNameModelHandler(context);
    }

    public Class<?> getSupportedModelClass() {
        return ContextNameModel.class;
    }

    public void handle(ModelInterpretationContext mic, Model model) {
        String name = mic.subst(((ContextNameModel) model).getBodyText());
        addInfo("Setting logger context name as [" + name + "]");
        try {
            context.setName(name);
        } catch (IllegalStateException ex) {
            addError("Failed to rename context [" + context.getName() + "] as [" + name + "]", ex);
        }
    }
}
