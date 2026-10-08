package ch.qos.logback.classic.model.processor;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.model.ConfigurationModel;
import ch.qos.logback.core.Context;
import ch.qos.logback.core.model.Model;
import ch.qos.logback.core.model.processor.ModelHandlerBase;
import ch.qos.logback.core.model.processor.ModelInterpretationContext;
import ch.qos.logback.core.status.OnConsoleStatusListener;
import ch.qos.logback.core.util.ContextUtil;
import ch.qos.logback.core.util.Duration;
import ch.qos.logback.core.util.OptionHelper;
import ch.qos.logback.core.util.StatusListenerConfigHelper;

public class ConfigurationModelHandler extends ModelHandlerBase {
    static final Duration SCAN_PERIOD_DEFAULT = Duration.buildByMinutes(1.0d);

    public ConfigurationModelHandler(Context context) {
        super(context);
    }

    public static ModelHandlerBase makeInstance(Context context, ModelInterpretationContext mic) {
        return new ConfigurationModelHandler(context);
    }

    public Class<?> getSupportedModelClass() {
        return ConfigurationModel.class;
    }

    public void handle(ModelInterpretationContext mic, Model model) {
        ConfigurationModel configuration = (ConfigurationModel) model;
        String debug = OptionHelper.getSystemProperty("logback.debug", null);
        if (debug == null) {
            debug = mic.subst(configuration.getDebugStr());
        }
        if (!OptionHelper.isNullOrEmptyOrAllSpaces(debug)
                && !Boolean.FALSE.toString().equalsIgnoreCase(debug)
                && !"null".equalsIgnoreCase(debug)) {
            StatusListenerConfigHelper.addOnConsoleListenerInstance(context, new OnConsoleStatusListener());
        }
        processScanAttrib(mic, configuration);
        LoggerContext loggerContext = (LoggerContext) context;
        loggerContext.setPackagingDataEnabled(OptionHelper.toBoolean(mic.subst(configuration.getPackagingDataStr()), false));
        new ContextUtil(loggerContext).addGroovyPackages(loggerContext.getFrameworkPackages());
    }

    public void processScanAttrib(ModelInterpretationContext mic, ConfigurationModel configuration) {
        String scan = mic.subst(configuration.getScanStr());
        if (!OptionHelper.isNullOrEmptyOrAllSpaces(scan) && !"false".equalsIgnoreCase(scan)) {
            addInfo("Skipping ReconfigureOnChangeTask registration");
        }
    }
}
