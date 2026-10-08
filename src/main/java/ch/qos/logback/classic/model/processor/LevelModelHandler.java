package ch.qos.logback.classic.model.processor;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.model.LevelModel;
import ch.qos.logback.core.Context;
import ch.qos.logback.core.model.Model;
import ch.qos.logback.core.model.processor.ModelHandlerBase;
import ch.qos.logback.core.model.processor.ModelInterpretationContext;

public class LevelModelHandler extends ModelHandlerBase {
    private boolean inError;

    public LevelModelHandler(Context context) {
        super(context);
    }

    public static ModelHandlerBase makeInstance(Context context, ModelInterpretationContext mic) {
        return new LevelModelHandler(context);
    }

    public Class<?> getSupportedModelClass() {
        return LevelModel.class;
    }

    public void handle(ModelInterpretationContext mic, Model model) {
        Object top = mic.peekObject();
        if (!(top instanceof Logger logger)) {
            inError = true;
            addError("For element <level>, could not find a logger at the top of execution stack.");
            return;
        }
        String loggerName = logger.getName();
        String value = mic.subst(((LevelModel) model).getValue());
        if (!"INHERITED".equalsIgnoreCase(value) && !"NULL".equalsIgnoreCase(value)) {
            logger.setLevel(Level.toLevel(value, Level.DEBUG));
        } else if ("ROOT".equalsIgnoreCase(loggerName)) {
            addError("The level for the ROOT logger cannot be set to NULL or INHERITED. Ignoring.");
        } else {
            logger.setLevel(null);
        }
        addInfo(loggerName + " level set to " + logger.getLevel());
    }
}
