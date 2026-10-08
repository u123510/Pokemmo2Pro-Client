package ch.qos.logback.classic.pattern;

import ch.qos.logback.classic.spi.IThrowableProxy;
import ch.qos.logback.classic.spi.ThrowableProxyUtil;
import ch.qos.logback.core.CoreConstants;

public class RootCauseFirstThrowableProxyConverter extends ExtendedThrowableProxyConverter {
    @Override
    public String throwableProxyToString(IThrowableProxy proxy) {
        StringBuilder builder = new StringBuilder(BUILDER_CAPACITY);
        recursiveAppendRootCauseFirst(builder, null, 1, proxy);
        return builder.toString();
    }

    public void recursiveAppendRootCauseFirst(StringBuilder builder, String prefix, int indent, IThrowableProxy proxy) {
        IThrowableProxy cause = proxy.getCause();
        if (cause != null) {
            recursiveAppendRootCauseFirst(builder, prefix, indent, cause);
            prefix = null;
        }
        ThrowableProxyUtil.indent(builder, indent - 1);
        if (prefix != null) builder.append(prefix);
        ThrowableProxyUtil.subjoinFirstLineRootCauseFirst(builder, proxy);
        builder.append(CoreConstants.LINE_SEPARATOR);
        subjoinSTEPArray(builder, indent, proxy);
        IThrowableProxy[] suppressed = proxy.getSuppressed();
        if (suppressed != null) {
            for (IThrowableProxy item : suppressed) {
                recursiveAppendRootCauseFirst(builder, "Suppressed: ", indent + 1, item);
            }
        }
    }
}
