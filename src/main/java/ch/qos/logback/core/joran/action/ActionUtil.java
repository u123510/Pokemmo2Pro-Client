package ch.qos.logback.core.joran.action;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.spi.ContextAwarePropertyContainer;
import ch.qos.logback.core.util.OptionHelper;

public class ActionUtil {
    public enum Scope {
        LOCAL,
        CONTEXT,
        SYSTEM
    }

    public static Scope stringToScope(String value) {
        Scope scope = Scope.SYSTEM;
        if (scope.toString().equalsIgnoreCase(value)) {
            return scope;
        }
        scope = Scope.CONTEXT;
        if (scope.toString().equalsIgnoreCase(value)) {
            return scope;
        }
        return Scope.LOCAL;
    }

    public static void setProperty(ContextAwarePropertyContainer container, String key, String value, Scope scope) {
        switch (scope.ordinal()) {
            case 0:
                container.addSubstitutionProperty(key, value);
                break;
            case 1:
                container.getContext().putProperty(key, value);
                break;
            case 2:
                OptionHelper.setSystemProperty(container, key, value);
                break;
            default:
                break;
        }
    }
}
