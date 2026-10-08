package ch.qos.logback.classic.spi;

import java.io.Serializable;
import java.util.Arrays;

public class ThrowableProxyVO implements IThrowableProxy, Serializable {
    private static final long serialVersionUID = -4516878917483369042L;
    private String className;
    private String message;
    private int commonFramesCount;
    private StackTraceElementProxy[] stackTraceElementProxyArray;
    private IThrowableProxy cause;
    private IThrowableProxy[] suppressed;
    private boolean cyclic;

    public ThrowableProxyVO() {
    }

    public static ThrowableProxyVO build(IThrowableProxy proxy) {
        if (proxy == null) {
            return null;
        }
        ThrowableProxyVO result = new ThrowableProxyVO();
        result.className = proxy.getClassName();
        result.message = proxy.getMessage();
        result.commonFramesCount = proxy.getCommonFrames();
        result.stackTraceElementProxyArray = proxy.getStackTraceElementProxyArray();
        result.cyclic = proxy.isCyclic();
        IThrowableProxy proxyCause = proxy.getCause();
        if (proxyCause != null) {
            result.cause = build(proxyCause);
        }
        IThrowableProxy[] proxySuppressed = proxy.getSuppressed();
        if (proxySuppressed != null) {
            result.suppressed = new IThrowableProxy[proxySuppressed.length];
            for (int i = 0; i < proxySuppressed.length; i++) {
                result.suppressed[i] = build(proxySuppressed[i]);
            }
        }
        return result;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public String getClassName() {
        return className;
    }

    @Override
    public int getCommonFrames() {
        return commonFramesCount;
    }

    @Override
    public IThrowableProxy getCause() {
        return cause;
    }

    @Override
    public StackTraceElementProxy[] getStackTraceElementProxyArray() {
        return stackTraceElementProxyArray;
    }

    @Override
    public IThrowableProxy[] getSuppressed() {
        return suppressed;
    }

    @Override
    public boolean isCyclic() {
        return cyclic;
    }

    @Override
    public int hashCode() {
        return 31 + (className == null ? 0 : className.hashCode());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ThrowableProxyVO other = (ThrowableProxyVO) obj;
        if (className == null ? other.className != null : !className.equals(other.className)) {
            return false;
        }
        if (!Arrays.equals(stackTraceElementProxyArray, other.stackTraceElementProxyArray)) {
            return false;
        }
        if (!Arrays.equals(suppressed, other.suppressed)) {
            return false;
        }
        return cause == null ? other.cause == null : cause.equals(other.cause);
    }
}
