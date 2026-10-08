package ch.qos.logback.core.joran.util;

import java.net.URL;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.joran.spi.ConfigurationWatchList;
import ch.qos.logback.core.status.InfoStatus;
import ch.qos.logback.core.status.Status;
import ch.qos.logback.core.status.StatusManager;
import ch.qos.logback.core.status.WarnStatus;

public class ConfigurationWatchListUtil {
    static final ConfigurationWatchListUtil origin = new ConfigurationWatchListUtil();

    private ConfigurationWatchListUtil() {
        super();
    }

    public static void registerConfigurationWatchList(Context context, ConfigurationWatchList watchList) {
        context.putObject("CONFIGURATION_WATCH_LIST", watchList);
    }

    public static void setMainWatchURL(Context context, URL url) {
        ConfigurationWatchList watchList = getConfigurationWatchList(context);
        if (watchList == null) {
            watchList = new ConfigurationWatchList();
            watchList.setContext(context);
            context.putObject("CONFIGURATION_WATCH_LIST", watchList);
        } else {
            watchList.clear();
        }
        watchList.setMainURL(url);
    }

    public static URL getMainWatchURL(Context context) {
        ConfigurationWatchList watchList = getConfigurationWatchList(context);
        return watchList == null ? null : watchList.getMainURL();
    }

    public static void addToWatchList(Context context, URL url) {
        ConfigurationWatchList watchList = getConfigurationWatchList(context);
        if (watchList == null) {
            addWarn(context, "Null ConfigurationWatchList. Cannot add " + String.valueOf(url));
        } else {
            addInfo(context, "Adding [" + String.valueOf(url) + "] to configuration watch list.");
            watchList.addToWatchList(url);
        }
    }

    public static ConfigurationWatchList getConfigurationWatchList(Context context) {
        return (ConfigurationWatchList) context.getObject("CONFIGURATION_WATCH_LIST");
    }

    public static void addStatus(Context context, Status status) {
        if (context == null) {
            System.out.println("Null context in " + ConfigurationWatchList.class.getName());
            return;
        }
        StatusManager statusManager = context.getStatusManager();
        if (statusManager == null) {
            return;
        }
        statusManager.add(status);
    }

    public static void addInfo(Context context, String message) {
        addStatus(context, new InfoStatus(message, origin));
    }

    public static void addWarn(Context context, String message) {
        addStatus(context, new WarnStatus(message, origin));
    }
}
