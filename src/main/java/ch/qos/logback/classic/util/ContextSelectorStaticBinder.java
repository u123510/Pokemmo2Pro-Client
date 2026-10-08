package ch.qos.logback.classic.util;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.selector.ContextJNDISelector;
import ch.qos.logback.classic.selector.ContextSelector;
import ch.qos.logback.classic.selector.DefaultContextSelector;
import ch.qos.logback.core.util.Loader;
import ch.qos.logback.core.util.OptionHelper;

public class ContextSelectorStaticBinder {
    static ContextSelectorStaticBinder singleton = new ContextSelectorStaticBinder();
    private ContextSelector contextSelector;
    private Object key;

    public static ContextSelectorStaticBinder getSingleton() {
        return singleton;
    }

    public static ContextSelector dynamicalContextSelector(LoggerContext context, String className) throws Exception {
        return (ContextSelector) Loader.loadClass(className)
                .getConstructor(LoggerContext.class)
                .newInstance(context);
    }

    public void init(LoggerContext defaultContext, Object accessKey) throws Exception {
        if (key == null) {
            key = accessKey;
        } else if (key != accessKey) {
            throw new IllegalAccessException("Only certain classes can access this method.");
        }
        String selector = OptionHelper.getSystemProperty("logback.ContextSelector");
        if (selector == null) {
            contextSelector = new DefaultContextSelector(defaultContext);
        } else if ("JNDI".equals(selector)) {
            contextSelector = new ContextJNDISelector(defaultContext);
        } else {
            contextSelector = dynamicalContextSelector(defaultContext, selector);
        }
    }

    public ContextSelector getContextSelector() {
        return contextSelector;
    }
}
