package ch.qos.logback.core.pattern.util;

public abstract interface IEscapeUtil {
    public abstract void escape(java.lang.String arg0, java.lang.StringBuffer arg1, char arg2, int arg3);

    public default void escape(java.lang.String value, java.lang.StringBuffer buf, char escapeChar) {
        escape(value, buf, escapeChar, 0);
    }
}
