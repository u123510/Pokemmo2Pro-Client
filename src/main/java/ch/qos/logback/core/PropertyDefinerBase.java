package ch.qos.logback.core;

import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.spi.PropertyDefiner;

public abstract class PropertyDefinerBase extends ContextAwareBase implements PropertyDefiner {
    public PropertyDefinerBase() {
        super();
    }

    public static String booleanAsStr(boolean value) {
        return value ? Boolean.TRUE.toString() : Boolean.FALSE.toString();
    }
}
