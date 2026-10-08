package ch.qos.logback.classic.joran;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.Context;
import ch.qos.logback.core.joran.spi.ConfigurationWatchList;
import ch.qos.logback.core.joran.spi.JoranException;
import ch.qos.logback.core.joran.util.ConfigurationWatchListUtil;
import ch.qos.logback.core.model.Model;
import ch.qos.logback.core.model.ModelUtil;
import ch.qos.logback.core.spi.ConfigurationEvent;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.status.StatusUtil;
import java.net.URL;
import java.util.List;
import java.util.concurrent.ScheduledFuture;

public class ReconfigureOnChangeTask extends ContextAwareBase implements Runnable {
    public static final String DETECTED_CHANGE_IN_CONFIGURATION_FILES = "Detected change in configuration files.";
    static final String RE_REGISTERING_PREVIOUS_SAFE_CONFIGURATION =
            "Re-registering previous fallback configuration once more as a fallback configuration point";
    static final String FALLING_BACK_TO_SAFE_CONFIGURATION =
            "Given previous errors, falling back to previously registered safe configuration.";

    long birthdate;
    List<ReconfigureOnChangeTaskListener> listeners;
    ScheduledFuture<?> scheduledFuture;

    public ReconfigureOnChangeTask() {
        birthdate = System.currentTimeMillis();
        listeners = null;
    }

    private void cancelFutureInvocationsOfThisTaskInstance() {
        if (!scheduledFuture.cancel(false)) {
            addWarn(toString() + "could not cancel " + toString());
        }
    }

    private void performXMLConfiguration(LoggerContext context, URL url) {
        JoranConfigurator configurator = new JoranConfigurator();
        configurator.setContext(context);
        StatusUtil statusUtil = new StatusUtil(context);
        Model safeModel = configurator.recallSafeConfiguration();
        URL mainURL = ConfigurationWatchListUtil.getMainWatchURL(context);
        context.reset();
        long threshold = System.currentTimeMillis();
        try {
            configurator.doConfigure(url);
            if (statusUtil.hasXMLParsingErrors(threshold)) {
                fallbackConfiguration(context, safeModel, mainURL);
            }
        } catch (JoranException ex) {
            addWarn("Exception occurred during reconfiguration", ex);
            fallbackConfiguration(context, safeModel, mainURL);
        }
    }

    private void fallbackConfiguration(LoggerContext context, Model safeModel, URL mainURL) {
        if (safeModel == null) {
            addWarn("No previous configuration to fall back on.");
            return;
        }
        ConfigurationWatchList watchList = ConfigurationWatchListUtil.getConfigurationWatchList(context);
        ConfigurationWatchList clonedWatchList = watchList == null ? null : watchList.buildClone();
        if (clonedWatchList == null) {
            addWarn("No previous configuration to fall back on.");
            return;
        }
        addWarn(FALLING_BACK_TO_SAFE_CONFIGURATION);
        addInfo("Safe model " + safeModel);
        try {
            context.reset();
            ConfigurationWatchListUtil.registerConfigurationWatchList(context, clonedWatchList);
            ModelUtil.resetForReuse(safeModel);
            JoranConfigurator configurator = new JoranConfigurator();
            configurator.setContext(context);
            configurator.processModel(safeModel);
            addInfo(RE_REGISTERING_PREVIOUS_SAFE_CONFIGURATION);
            configurator.registerSafeConfiguration(safeModel);
            context.fireConfigurationEvent(ConfigurationEvent.newConfigurationEndedEvent(this));
            addInfo("after registerSafeConfiguration");
        } catch (Exception ex) {
            addError("Unexpected exception thrown by a configuration considered safe.", ex);
        }
    }

    @Override
    public void run() {
        Context context = getContext();
        context.fireConfigurationEvent(ConfigurationEvent.newConfigurationChangeDetectorRunningEvent(this));
        ConfigurationWatchList watchList = ConfigurationWatchListUtil.getConfigurationWatchList(context);
        if (watchList == null) {
            addWarn("Empty ConfigurationWatchList in context");
            return;
        }
        List<?> files = watchList.getCopyOfFileWatchList();
        if (files == null || files.isEmpty()) {
            addInfo("Empty watch file list. Disabling ");
            return;
        }
        if (!watchList.changeDetected()) return;
        context.fireConfigurationEvent(ConfigurationEvent.newConfigurationChangeDetectedEvent(this));
        cancelFutureInvocationsOfThisTaskInstance();
        URL mainURL = watchList.getMainURL();
        addInfo(DETECTED_CHANGE_IN_CONFIGURATION_FILES);
        addInfo("Will reset and reconfigure context named [" + context.getName() + "]");
        LoggerContext loggerContext = (LoggerContext) context;
        if (mainURL.toString().endsWith("xml")) {
            performXMLConfiguration(loggerContext, mainURL);
        } else if (mainURL.toString().endsWith("groovy")) {
            addError("Groovy configuration disabled due to Java 9 compilation issues.");
        }
    }

    @Override
    public String toString() {
        return "ReconfigureOnChangeTask(born:" + birthdate + ")";
    }

    public void setScheduredFuture(ScheduledFuture<?> future) {
        scheduledFuture = future;
    }
}
