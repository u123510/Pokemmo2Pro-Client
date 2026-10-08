package ch.qos.logback.classic.sift;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.selector.ContextSelector;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.classic.util.ContextSelectorStaticBinder;
import ch.qos.logback.core.sift.AbstractDiscriminator;

public class JNDIBasedContextDiscriminator extends AbstractDiscriminator<ILoggingEvent> {
    private static final String KEY = "contextName";
    private String defaultValue;

    @Override
    public String getDiscriminatingValue(ILoggingEvent event) {
        ContextSelector selector = ContextSelectorStaticBinder.getSingleton().getContextSelector();
        if (selector == null) return defaultValue;
        LoggerContext context = selector.getLoggerContext();
        return context == null ? defaultValue : context.getName();
    }

    public String getKey() { return KEY; }

    public void setKey(String key) {
        throw new UnsupportedOperationException("Key cannot be set. Using fixed key contextName");
    }

    public String getDefaultValue() { return defaultValue; }
    public void setDefaultValue(String value) { defaultValue = value; }
}
