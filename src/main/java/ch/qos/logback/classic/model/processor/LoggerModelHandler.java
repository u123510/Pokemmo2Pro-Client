package ch.qos.logback.classic.model.processor;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.model.LoggerModel;
import ch.qos.logback.core.Context;
import ch.qos.logback.core.model.Model;
import ch.qos.logback.core.model.processor.ModelHandlerBase;
import ch.qos.logback.core.model.processor.ModelInterpretationContext;
import ch.qos.logback.core.util.OptionHelper;

public class LoggerModelHandler extends ModelHandlerBase {
    private Logger logger;
    private boolean inError;

    public LoggerModelHandler(Context context) {
        super(context);
    }

    public static ModelHandlerBase makeInstance(Context context, ModelInterpretationContext mic) {
        return new LoggerModelHandler(context);
    }

    public Class<?> getSupportedModelClass() {
        return LoggerModel.class;
    }

    public void handle(ModelInterpretationContext mic, Model model) {
        inError = false;
        LoggerModel loggerModel = (LoggerModel) model;
        String name = mic.subst(loggerModel.getName());
        logger = ((LoggerContext) context).getLogger(name);
        String level = mic.subst(loggerModel.getLevel());
        if (!OptionHelper.isNullOrEmptyOrAllSpaces(level)) {
            if (!"INHERITED".equalsIgnoreCase(level) && !"NULL".equalsIgnoreCase(level)) {
                Level parsed = Level.toLevel(level);
                addInfo("Setting level of logger [" + name + "] to " + parsed);
                logger.setLevel(parsed);
            } else if ("ROOT".equalsIgnoreCase(name)) {
                addError("The level for the ROOT logger cannot be set to NULL or INHERITED. Ignoring.");
            } else {
                addInfo("Setting level of logger [" + name + "] to null, i.e. INHERITED");
                logger.setLevel(null);
            }
        }
        String additivity = mic.subst(loggerModel.getAdditivity());
        if (!OptionHelper.isNullOrEmptyOrAllSpaces(additivity)) {
            boolean additive = OptionHelper.toBoolean(additivity, true);
            addInfo("Setting additivity of logger [" + name + "] to " + additive);
            logger.setAdditive(additive);
        }
        mic.pushObject(logger);
    }

    public void postHandle(ModelInterpretationContext mic, Model model) {
        if (inError) return;
        Object top = mic.peekObject();
        if (top != logger) {
            LoggerModel loggerModel = (LoggerModel) model;
            addWarn("The object [" + top + "] on the top the of the stack is not the expected logger named " + loggerModel.getName());
        } else {
            mic.popObject();
        }
    }
}
