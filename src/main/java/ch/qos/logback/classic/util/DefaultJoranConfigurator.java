package ch.qos.logback.classic.util;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.joran.JoranConfigurator;
import ch.qos.logback.classic.spi.Configurator;
import ch.qos.logback.classic.spi.ConfiguratorRank;
import ch.qos.logback.core.LogbackException;
import ch.qos.logback.core.joran.spi.JoranException;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.status.InfoStatus;
import ch.qos.logback.core.status.StatusManager;
import ch.qos.logback.core.util.Loader;
import ch.qos.logback.core.util.OptionHelper;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

@ConfiguratorRank(0)
public class DefaultJoranConfigurator extends ContextAwareBase implements Configurator {
    private URL performMultiStepConfigurationFileSearch(boolean updateStatus) {
        ClassLoader classLoader = Loader.getClassLoaderOfObject(this);
        URL url = findConfigFileURLFromSystemProperties(classLoader, updateStatus);
        if (url != null) return url;
        url = getResource("logback-test.xml", classLoader, updateStatus);
        if (url != null) return url;
        return getResource("logback.xml", classLoader, updateStatus);
    }

    private URL findConfigFileURLFromSystemProperties(ClassLoader classLoader, boolean updateStatus) {
        String path = OptionHelper.getSystemProperty("logback.configurationFile");
        if (path == null) return null;
        try {
            URL url = new URL(path);
            if (updateStatus) statusOnResourceSearch(path, classLoader, url);
            return url;
        } catch (MalformedURLException ignored) {
        }
        try {
            URL resource = Loader.getResource(path, classLoader);
            if (resource != null) {
                if (updateStatus) statusOnResourceSearch(path, classLoader, resource);
                return resource;
            }
            File file = new File(path);
            if (file.exists() && file.isFile()) {
                URL fileUrl = file.toURI().toURL();
                if (updateStatus) statusOnResourceSearch(path, classLoader, fileUrl);
                return fileUrl;
            }
        } catch (Exception ex) {
            if (updateStatus) statusOnResourceSearch(path, classLoader, null);
        }
        return null;
    }

    private URL getResource(String resourceName, ClassLoader classLoader, boolean updateStatus) {
        URL url = Loader.getResource(resourceName, classLoader);
        if (updateStatus) statusOnResourceSearch(resourceName, classLoader, url);
        return url;
    }

    private void statusOnResourceSearch(String resourceName, ClassLoader classLoader, URL url) {
        StatusManager statusManager = context.getStatusManager();
        if (url == null) {
            statusManager.add(new InfoStatus("Could NOT find resource [" + resourceName + "]", context));
            return;
        }
        statusManager.add(new InfoStatus("Found resource [" + resourceName + "] at [" + url + "]", context));
        multiplicityWarning(resourceName, classLoader);
    }

    private void multiplicityWarning(String resourceName, ClassLoader classLoader) {
        try {
            Set<URL> urls = Loader.getResources(resourceName, classLoader);
            if (urls != null && urls.size() > 1) {
                addWarn("Resource [" + resourceName + "] occurs multiple times on the classpath.");
                for (URL url : urls) {
                    addWarn("Resource [" + resourceName + "] occurs at [" + url + "]");
                }
            }
        } catch (IOException ex) {
            addError("Failed to get url list for resource [" + resourceName + "]", ex);
        }
    }

    @Override
    public Configurator.ExecutionStatus configure(LoggerContext loggerContext) {
        URL url = performMultiStepConfigurationFileSearch(true);
        if (url == null) {
            return Configurator.ExecutionStatus.INVOKE_NEXT_IF_ANY;
        }
        try {
            configureByResource(url);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return Configurator.ExecutionStatus.DO_NOT_INVOKE_NEXT_IF_ANY;
    }

    public void configureByResource(URL url) throws JoranException {
        if (url == null) {
            throw new IllegalArgumentException("URL argument cannot be null");
        }
        if (!url.toString().endsWith("xml")) {
            throw new LogbackException("Unexpected filename extension of file [" + url + "]. Should be .xml");
        }
        JoranConfigurator configurator = new JoranConfigurator();
        configurator.setContext(context);
        configurator.doConfigure(url);
    }

    @Deprecated
    public URL findURLOfDefaultConfigurationFile(boolean updateStatus) {
        return performMultiStepConfigurationFileSearch(updateStatus);
    }
}
