package ch.qos.logback.classic.selector;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.joran.JoranConfigurator;
import ch.qos.logback.classic.util.ContextInitializer;
import ch.qos.logback.core.ContextBase;
import ch.qos.logback.core.joran.spi.JoranException;
import ch.qos.logback.core.status.InfoStatus;
import ch.qos.logback.core.status.StatusManager;
import ch.qos.logback.core.util.StatusPrinter;
import ch.qos.logback.core.status.StatusUtil;
import ch.qos.logback.core.status.WarnStatus;
import ch.qos.logback.core.util.JNDIUtil;
import ch.qos.logback.core.util.Loader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.naming.Context;
import javax.naming.NamingException;

public class ContextJNDISelector implements ContextSelector {
    private static final ThreadLocal<LoggerContext> threadLocal = new ThreadLocal<>();
    private final Map<String, LoggerContext> synchronizedContextMap;
    private final LoggerContext defaultContext;

    public ContextJNDISelector(LoggerContext defaultContext) {
        this.synchronizedContextMap = Collections.synchronizedMap(new HashMap<>());
        this.defaultContext = defaultContext;
    }

    private String conventionalConfigFileName(String contextName) {
        return "logback-" + contextName + ".xml";
    }

    private URL findConfigFileURL(Context jndiContext, LoggerContext context) {
        StatusManager statusManager = ((ContextBase) context).getStatusManager();
        String resource = null;
        try {
            resource = JNDIUtil.lookupString(jndiContext, "java:comp/env/logback/configuration-resource");
        } catch (NamingException ex) {
            statusManager.add(new WarnStatus("JNDI lookup failed", this, ex));
        }
        if (resource != null) {
            statusManager.add(new InfoStatus("Searching for [" + resource + "]", this));
            URL url = urlByResourceName(statusManager, resource);
            if (url == null) {
                statusManager.add(new WarnStatus("The jndi resource [" + resource + "] for context [" + context.getName() + "] does not lead to a valid file", this));
            }
            return url;
        }
        return urlByResourceName(statusManager, conventionalConfigFileName(context.getName()));
    }

    private URL urlByResourceName(StatusManager statusManager, String resource) {
        statusManager.add(new InfoStatus("Searching for [" + resource + "]", this));
        URL url = Loader.getResource(resource, Loader.getTCL());
        return url != null ? url : Loader.getResourceBySelfClassLoader(resource);
    }

    private void configureLoggerContextByURL(LoggerContext context, URL url) {
        try {
            JoranConfigurator configurator = new JoranConfigurator();
            context.reset();
            configurator.setContext(context);
            configurator.doConfigure(url);
        } catch (JoranException ignored) {
        }
        StatusPrinter.printInCaseOfErrorsOrWarnings(context);
    }

    @Override
    public LoggerContext getDefaultLoggerContext() {
        return defaultContext;
    }

    @Override
    public LoggerContext detachLoggerContext(String name) {
        return synchronizedContextMap.remove(name);
    }

    @Override
    public LoggerContext getLoggerContext() {
        LoggerContext local = threadLocal.get();
        if (local != null) return local;
        Context jndiContext = null;
        String contextName = null;
        try {
            jndiContext = JNDIUtil.getInitialContext();
            contextName = JNDIUtil.lookupString(jndiContext, "java:comp/env/logback/context-name");
        } catch (NamingException ignored) {
        }
        if (contextName == null) return defaultContext;
        LoggerContext context = synchronizedContextMap.get(contextName);
        if (context == null) {
            context = new LoggerContext();
            context.setName(contextName);
            synchronizedContextMap.put(contextName, context);
            URL configUrl = findConfigFileURL(jndiContext, context);
            if (configUrl != null) {
                configureLoggerContextByURL(context, configUrl);
            } else {
                try {
                    new ContextInitializer(context).autoConfig();
                } catch (JoranException ignored) {
                }
            }
            if (!StatusUtil.contextHasStatusListener(context)) {
                StatusPrinter.printInCaseOfErrorsOrWarnings(context);
            }
        }
        return context;
    }

    @Override
    public List<String> getContextNames() {
        return new ArrayList<>(synchronizedContextMap.keySet());
    }

    @Override
    public LoggerContext getLoggerContext(String name) {
        return synchronizedContextMap.get(name);
    }

    public int getCount() {
        return synchronizedContextMap.size();
    }

    public void setLocalContext(LoggerContext context) {
        threadLocal.set(context);
    }

    public void removeLocalContext() {
        threadLocal.remove();
    }
}
