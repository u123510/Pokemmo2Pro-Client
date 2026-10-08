package ch.qos.logback.classic.model.processor;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.model.LoggerContextListenerModel;
import ch.qos.logback.classic.spi.LoggerContextListener;
import ch.qos.logback.core.Context;
import ch.qos.logback.core.model.Model;
import ch.qos.logback.core.model.processor.ModelHandlerBase;
import ch.qos.logback.core.model.processor.ModelInterpretationContext;
import ch.qos.logback.core.spi.ContextAware;
import ch.qos.logback.core.spi.LifeCycle;
import ch.qos.logback.core.util.OptionHelper;

public class LoggerContextListenerModelHandler extends ModelHandlerBase {
    private boolean inError;
    private LoggerContextListener lcl;

    public LoggerContextListenerModelHandler(Context context) {
        super(context);
    }

    public static ModelHandlerBase makeInstance(Context context, ModelInterpretationContext mic) {
        return new LoggerContextListenerModelHandler(context);
    }

    public Class<?> getSupportedModelClass() {
        return LoggerContextListenerModel.class;
    }

    public void handle(ModelInterpretationContext mic, Model model) {
        String className = ((LoggerContextListenerModel) model).getClassName();
        if (OptionHelper.isNullOrEmptyOrAllSpaces(className)) {
            addError("Empty class name for LoggerContextListener");
            inError = true;
            return;
        }
        className = mic.getImport(className);
        try {
            Class<LoggerContextListener> type = LoggerContextListener.class;
            lcl = (LoggerContextListener) OptionHelper.instantiateByClassName(className, type, context);
            if (lcl instanceof ContextAware aware) {
                aware.setContext(context);
            }
            mic.pushObject(lcl);
            addInfo("Adding LoggerContextListener of type [" + className + "] to the object stack");
        } catch (Exception ex) {
            inError = true;
            addError("Could not create LoggerContextListener of type " + className + "].", ex);
        }
    }

    public void postHandle(ModelInterpretationContext mic, Model model) {
        if (inError) return;
        Object top = mic.peekObject();
        if (top != lcl) {
            addWarn("The object on the top the of the stack is not the LoggerContextListener pushed earlier.");
            return;
        }
        if (lcl instanceof LifeCycle lifeCycle) {
            lifeCycle.start();
            addInfo("Starting LoggerContextListener");
        }
        mic.popObject();
        ((LoggerContext) context).addListener(lcl);
    }
}
