package ch.qos.logback.classic.model.processor;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.model.RootLoggerModel;
import ch.qos.logback.core.Context;
import ch.qos.logback.core.model.Model;
import ch.qos.logback.core.model.processor.ModelHandlerBase;
import ch.qos.logback.core.model.processor.ModelInterpretationContext;
import ch.qos.logback.core.util.OptionHelper;

public class RootLoggerModelHandler extends ModelHandlerBase {
    private Logger root;
    private boolean inError;

    public RootLoggerModelHandler(Context context) {
        super(context);
    }

    public static RootLoggerModelHandler makeInstance(Context context, ModelInterpretationContext mic) {
        return new RootLoggerModelHandler(context);
    }

    public Class<?> getSupportedModelClass() {
        return RootLoggerModel.class;
    }

    public void handle(ModelInterpretationContext mic, Model model) {
        inError = false;
        RootLoggerModel rootModel = (RootLoggerModel) model;
        root = ((LoggerContext) context).getLogger("ROOT");
        String level = mic.subst(rootModel.getLevel());
        if (!OptionHelper.isNullOrEmptyOrAllSpaces(level)) {
            Level parsed = Level.toLevel(level);
            addInfo("Setting level of ROOT logger to " + parsed);
            root.setLevel(parsed);
        }
        mic.pushObject(root);
    }

    public void postHandle(ModelInterpretationContext mic, Model model) {
        if (inError) return;
        Object top = mic.peekObject();
        if (top != root) {
            addWarn("The object [" + top + "] on the top the of the stack is not the root logger");
        } else {
            mic.popObject();
        }
    }
}
