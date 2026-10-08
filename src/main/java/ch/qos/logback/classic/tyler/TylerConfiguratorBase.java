package ch.qos.logback.classic.tyler;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.Context;
import ch.qos.logback.core.model.util.PropertyModelHandlerHelper;
import ch.qos.logback.core.model.util.VariableSubstitutionsHelper;
import ch.qos.logback.core.spi.ContextAwarePropertyContainer;
import ch.qos.logback.core.status.OnConsoleStatusListener;
import ch.qos.logback.core.util.OptionHelper;
import ch.qos.logback.core.util.StatusListenerConfigHelper;
import ch.qos.logback.core.util.StringUtil;
import java.util.Map;

public class TylerConfiguratorBase extends ch.qos.logback.core.spi.ContextAwareBase implements ContextAwarePropertyContainer {
    public static final String SET_CONTEXT_METHOD_NAME = "setContext";
    public static final String SET_CONTEXT_NAME_METHOD_NAME = "setContextName";
    public static final String SETUP_LOGGER_METHOD_NAME = "setupLogger";
    public static final String VARIABLE_SUBSTITUTIONS_HELPER_FIELD_NAME = "variableSubstitutionsHelper";
    public static final String PROPERTY_MODEL_HANDLER_HELPER_FIELD_NAME = "propertyModelHandlerHelper";
    protected VariableSubstitutionsHelper variableSubstitutionsHelper;
    protected PropertyModelHandlerHelper propertyModelHandlerHelper;

    public TylerConfiguratorBase() {
        propertyModelHandlerHelper = new PropertyModelHandlerHelper(this);
    }

    public Logger setupLogger(String name, String level, Boolean additive) {
        Logger logger = ((LoggerContext) context).getLogger(name);
        if (!OptionHelper.isNullOrEmptyOrAllSpaces(level)) {
            logger.setLevel(ch.qos.logback.classic.util.LevelUtil.levelStringToLevel(level));
        }
        if (additive != null) {
            logger.setAdditive(additive.booleanValue());
        }
        return logger;
    }

    @Override
    public void setContext(Context context) {
        super.setContext(context);
        variableSubstitutionsHelper = new VariableSubstitutionsHelper(context);
        propertyModelHandlerHelper.setContext(context);
    }

    public void setContextName(String name) {
        if (StringUtil.isNullOrEmpty(name)) {
            addError("Cannot set context name to null or empty string");
            return;
        }
        try {
            String substituted = subst(name);
            addInfo("Setting context name to [" + substituted + "]");
            context.setName(substituted);
        } catch (IllegalStateException ex) {
            addError("Failed to rename context as [" + name + "]", ex);
        }
    }

    public void addOnConsoleStatusListener() {
        StatusListenerConfigHelper.addOnConsoleListenerInstance(context, new OnConsoleStatusListener());
    }

    public String subst(String value) {
        return variableSubstitutionsHelper.subst(value);
    }

    public void addSubstitutionProperty(String key, String value) {
        variableSubstitutionsHelper.addSubstitutionProperty(key, value);
    }

    public String getProperty(String key) {
        return variableSubstitutionsHelper.getProperty(key);
    }

    public Map<String, String> getCopyOfPropertyMap() {
        return variableSubstitutionsHelper.getCopyOfPropertyMap();
    }

    public boolean isNull(String key) {
        return OptionHelper.propertyLookup(key, this, context) == null;
    }

    public boolean isDefined(String key) {
        return OptionHelper.propertyLookup(key, this, context) != null;
    }

    public String p(String key) {
        return property(key);
    }

    public String property(String key) {
        String value = OptionHelper.propertyLookup(key, context, this);
        return value == null ? "" : value;
    }
}
