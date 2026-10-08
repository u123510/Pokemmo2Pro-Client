package ch.qos.logback.core.model.processor;

import ch.qos.logback.core.Appender;
import ch.qos.logback.core.Context;
import ch.qos.logback.core.model.AppenderRefModel;
import ch.qos.logback.core.model.Model;
import ch.qos.logback.core.spi.AppenderAttachable;

public class AppenderRefModelHandler extends ModelHandlerBase {
    public boolean inError;

    public AppenderRefModelHandler(Context context) {
        super(context);
        this.inError = false;
    }

    public static ModelHandlerBase makeInstance(Context context, ModelInterpretationContext mic) {
        return new AppenderRefModelHandler(context);
    }

    @Override
    public Class<?> getSupportedModelClass() {
        return AppenderRefModel.class;
    }

    @Override
    public void handle(ModelInterpretationContext mic, Model model) {
        Object top = mic.peekObject();
        if (!(top instanceof AppenderAttachable)) {
            this.inError = true;
            addError("Could not find an AppenderAttachable at the top of execution stack. Near " + model.idString());
            return;
        }
        AppenderRefModel refModel = (AppenderRefModel) model;
        AppenderAttachable<?> attachable = (AppenderAttachable<?>) top;
        attachRefencedAppenders(mic, refModel, attachable);
    }

    public void attachRefencedAppenders(ModelInterpretationContext mic, AppenderRefModel refModel,
                                        AppenderAttachable<?> attachable) {
        String ref = mic.subst(refModel.getRef());
        @SuppressWarnings("unchecked")
        java.util.Map<String, Appender<?>> bag = (java.util.Map<String, Appender<?>>) mic.getObjectMap().get("APPENDER_BAG");
        Appender<?> appender = bag == null ? null : bag.get(ref);
        if (appender == null) {
            addError("Failed to find appender named " + ref);
        } else {
            addInfo("Attaching appender named " + ref + " to " + String.valueOf(attachable));
            ((AppenderAttachable) attachable).addAppender((Appender) appender);
        }
    }
}
