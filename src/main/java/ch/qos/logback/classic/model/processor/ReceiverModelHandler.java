package ch.qos.logback.classic.model.processor;

import ch.qos.logback.classic.model.ReceiverModel;
import ch.qos.logback.classic.net.ReceiverBase;
import ch.qos.logback.core.Context;
import ch.qos.logback.core.model.Model;
import ch.qos.logback.core.model.processor.ModelHandlerBase;
import ch.qos.logback.core.model.processor.ModelHandlerException;
import ch.qos.logback.core.model.processor.ModelInterpretationContext;
import ch.qos.logback.core.util.OptionHelper;

public class ReceiverModelHandler extends ModelHandlerBase {
    private ReceiverBase receiver;
    private boolean inError;

    public ReceiverModelHandler(Context context) {
        super(context);
    }

    public static ModelHandlerBase makeInstance(Context context, ModelInterpretationContext mic) {
        return new ReceiverModelHandler(context);
    }

    public Class<?> getSupportedModelClass() {
        return ReceiverModel.class;
    }

    public void handle(ModelInterpretationContext mic, Model model) throws ModelHandlerException {
        String className = ((ReceiverModel) model).getClassName();
        if (OptionHelper.isNullOrEmptyOrAllSpaces(className)) {
            addError("Missing class name for receiver. ");
            inError = true;
            return;
        }
        String imported = mic.getImport(className);
        try {
            addInfo("About to instantiate receiver of type [" + imported + "]");
            receiver = (ReceiverBase) OptionHelper.instantiateByClassName(imported, ReceiverBase.class, context);
            receiver.setContext(context);
            mic.pushObject(receiver);
        } catch (Exception ex) {
            inError = true;
            addError("Could not create a receiver of type [" + imported + "].", ex);
            throw new ModelHandlerException(ex);
        }
    }

    public void postHandle(ModelInterpretationContext mic, Model model) {
        if (inError) return;
        if (mic.peekObject() != receiver) {
            addWarn("The object at the of the stack is not the receiver pushed earlier.");
            return;
        }
        mic.popObject();
        addInfo("Registering receiver with context.");
        context.register(receiver);
        receiver.start();
    }
}
