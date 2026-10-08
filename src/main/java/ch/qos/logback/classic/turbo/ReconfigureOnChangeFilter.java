package ch.qos.logback.classic.turbo;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.joran.JoranConfigurator;
import ch.qos.logback.core.Context;
import ch.qos.logback.core.joran.GenericXMLConfigurator;
import ch.qos.logback.core.joran.spi.JoranException;
import ch.qos.logback.core.joran.spi.ConfigurationWatchList;
import ch.qos.logback.core.joran.util.ConfigurationWatchListUtil;
import ch.qos.logback.core.model.Model;
import ch.qos.logback.core.model.ModelUtil;
import ch.qos.logback.core.status.StatusUtil;
import ch.qos.logback.core.spi.FilterReply;
import f.HA0;
import java.net.URL;
import java.util.concurrent.ExecutorService;

public class ReconfigureOnChangeFilter extends TurboFilter {
    public static final long DEFAULT_REFRESH_PERIOD = 60000L;
    private static final int MAX_MASK = 65535;
    private static final long MASK_INCREASE_THRESHOLD = 100L;
    private static final long MASK_DECREASE_THRESHOLD = 800L;
    long refreshPeriod = DEFAULT_REFRESH_PERIOD;
    URL mainConfigurationURL;
    protected volatile long nextCheck;
    ConfigurationWatchList configurationWatchList;
    private long invocationCounter;
    private volatile long mask = 15L;
    private volatile long lastMaskCheck;

    public ReconfigureOnChangeFilter() {
        invocationCounter = 0L;
        lastMaskCheck = System.currentTimeMillis();
    }

    private void updateMaskIfNecessary(long now) {
        long elapsed = now - lastMaskCheck;
        lastMaskCheck = now;
        if (elapsed < MASK_INCREASE_THRESHOLD && mask < MAX_MASK) {
            mask = (mask << 1) | 1L;
        } else if (elapsed > MASK_DECREASE_THRESHOLD) {
            mask >>>= 2;
        }
    }

    @Override
    public void start() {
        configurationWatchList = ConfigurationWatchListUtil.getConfigurationWatchList(context);
        if (configurationWatchList == null) {
            addWarn("Empty ConfigurationWatchList in context");
            return;
        }
        mainConfigurationURL = configurationWatchList.getMainURL();
        if (mainConfigurationURL == null) {
            addWarn("Due to missing top level configuration file, automatic reconfiguration is impossible.");
            return;
        }
        addInfo("Will scan for changes in [" + configurationWatchList.getCopyOfFileWatchList() + "] every " + refreshPeriod / 1000L + " seconds. ");
        synchronized (configurationWatchList) {
            updateNextCheck(System.currentTimeMillis());
        }
        super.start();
    }

    @Override
    public String toString() {
        return "ReconfigureOnChangeFilter{invocationCounter=" + invocationCounter + "}";
    }

    @Override
    public FilterReply decide(HA0 marker, Logger logger, Level level, String format, Object[] params, Throwable t) {
        if (!isStarted()) {
            return FilterReply.NEUTRAL;
        }
        long counter = invocationCounter++;
        if ((counter & mask) != mask) {
            return FilterReply.NEUTRAL;
        }
        long now = System.currentTimeMillis();
        synchronized (configurationWatchList) {
            updateMaskIfNecessary(now);
            if (changeDetected(now)) {
                disableSubsequentReconfiguration();
                detachReconfigurationToNewThread();
            }
        }
        return FilterReply.NEUTRAL;
    }

    public void detachReconfigurationToNewThread() {
        addInfo("Detected change in [" + configurationWatchList.getCopyOfFileWatchList() + "]");
        context.getExecutorService().submit(new ReconfiguringThread(this));
    }

    public void updateNextCheck(long now) {
        nextCheck = now + refreshPeriod;
    }

    public boolean changeDetected(long now) {
        if (now < nextCheck) {
            return false;
        }
        updateNextCheck(now);
        return configurationWatchList.changeDetected();
    }

    public void disableSubsequentReconfiguration() {
        nextCheck = Long.MAX_VALUE;
    }

    public long getRefreshPeriod() {
        return refreshPeriod;
    }

    public void setRefreshPeriod(long refreshPeriod) {
        this.refreshPeriod = refreshPeriod;
    }

    public static class ReconfiguringThread implements Runnable {
        private final ReconfigureOnChangeFilter owner;

        public ReconfiguringThread(ReconfigureOnChangeFilter owner) {
            this.owner = owner;
        }

        private void performXMLConfiguration(LoggerContext loggerContext) {
            JoranConfigurator configurator = new JoranConfigurator();
            configurator.setContext(owner.context);
            StatusUtil statusUtil = new StatusUtil(owner.context);
            Model safeConfiguration = configurator.recallSafeConfiguration();
            URL mainUrl = ConfigurationWatchListUtil.getMainWatchURL(owner.context);
            loggerContext.reset();
            long threshold = System.currentTimeMillis();
            try {
                configurator.doConfigure(owner.mainConfigurationURL);
                if (statusUtil.hasXMLParsingErrors(threshold)) {
                    fallbackConfiguration(loggerContext, safeConfiguration, mainUrl);
                }
            } catch (JoranException ex) {
                fallbackConfiguration(loggerContext, safeConfiguration, mainUrl);
            }
        }

        private void fallbackConfiguration(LoggerContext loggerContext, Model safeConfiguration, URL url) {
            JoranConfigurator configurator = new JoranConfigurator();
            configurator.setContext(owner.context);
            if (safeConfiguration != null) {
                owner.addWarn("Falling back to previously registered safe configuration.");
                try {
                    loggerContext.reset();
                    GenericXMLConfigurator.informContextOfURLUsedForConfiguration(owner.context, url);
                    ModelUtil.resetForReuse(safeConfiguration);
                    configurator.processModel(safeConfiguration);
                    owner.addInfo("Re-registering previous fallback configuration once more as a fallback configuration point");
                    configurator.registerSafeConfiguration(safeConfiguration);
                } catch (Exception ex) {
                    owner.addError("Unexpected exception thrown by a configuration considered safe.", ex);
                }
            } else {
                owner.addWarn("No previous configuration to fall back on.");
            }
        }

        @Override
        public void run() {
            if (owner.mainConfigurationURL == null) {
                owner.addInfo("Due to missing top level configuration file, skipping reconfiguration");
                return;
            }
            LoggerContext loggerContext = (LoggerContext) owner.context;
            owner.addInfo("Will reset and reconfigure context named [" + owner.context.getName() + "]");
            String url = owner.mainConfigurationURL.toString();
            if (url.endsWith("xml")) {
                performXMLConfiguration(loggerContext);
            } else if (url.endsWith("groovy")) {
                owner.addError("Groovy configuration disabled due to Java 9 compilation issues.");
            }
        }
    }
}
