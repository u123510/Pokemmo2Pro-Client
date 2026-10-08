package ch.qos.logback.classic.model.processor;

import ch.qos.logback.classic.joran.ReconfigureOnChangeTask;
import ch.qos.logback.classic.model.ConfigurationModel;
import ch.qos.logback.core.Context;
import ch.qos.logback.core.model.Model;
import ch.qos.logback.core.model.processor.ModelHandlerBase;
import ch.qos.logback.core.model.processor.ModelInterpretationContext;
import ch.qos.logback.core.joran.util.ConfigurationWatchListUtil;
import ch.qos.logback.core.spi.ConfigurationEvent;
import ch.qos.logback.core.util.Duration;
import ch.qos.logback.core.util.OptionHelper;
import java.net.URL;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ConfigurationModelHandlerFull extends ConfigurationModelHandler {
    public ConfigurationModelHandlerFull(Context context) {
        super(context);
    }

    public static ModelHandlerBase makeInstance2(Context context, ModelInterpretationContext mic) {
        return new ConfigurationModelHandlerFull(context);
    }

    private Duration getDurationOfScanPeriodAttribute(String value, Duration defaultDuration) {
        Duration duration = null;
        if (!OptionHelper.isNullOrEmptyOrAllSpaces(value)) {
            try {
                duration = Duration.valueOf(value);
            } catch (IllegalArgumentException | IllegalStateException ex) {
                addWarn("Failed to parse 'scanPeriod' attribute [" + value + "]", ex);
            }
        }
        if (duration == null) {
            addInfo("No 'scanPeriod' specified. Defaulting to " + defaultDuration);
        } else {
            defaultDuration = duration;
        }
        return defaultDuration;
    }

    @Override
    public void processScanAttrib(ModelInterpretationContext mic, ConfigurationModel configuration) {
        String scan = mic.subst(configuration.getScanStr());
        if (OptionHelper.isNullOrEmptyOrAllSpaces(scan) || "false".equalsIgnoreCase(scan)) {
            return;
        }
        ScheduledExecutorService executor = context.getScheduledExecutorService();
        URL mainUrl = ConfigurationWatchListUtil.getMainWatchURL(context);
        if (mainUrl == null) {
            addWarn("Due to missing top level configuration file, reconfiguration on change (configuration file scanning) cannot be done.");
            return;
        }
        ReconfigureOnChangeTask task = new ReconfigureOnChangeTask();
        task.setContext(context);
        addInfo("Registering a new ReconfigureOnChangeTask " + task);
        context.fireConfigurationEvent(ConfigurationEvent.newConfigurationChangeDetectorRegisteredEvent(task));
        Duration duration = getDurationOfScanPeriodAttribute(mic.subst(configuration.getScanPeriodStr()), SCAN_PERIOD_DEFAULT);
        addInfo("Will scan for changes in [" + mainUrl + "] ");
        addInfo("Setting ReconfigureOnChangeTask scanning period to " + duration);
        long delay = duration.getMilliseconds();
        ScheduledFuture<?> future = executor.scheduleAtFixedRate(task, delay, delay, TimeUnit.MILLISECONDS);
        task.setScheduredFuture(future);
        context.addScheduledFuture(future);
    }
}
