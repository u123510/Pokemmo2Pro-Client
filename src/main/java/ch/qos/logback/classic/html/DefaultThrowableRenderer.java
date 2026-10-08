package ch.qos.logback.classic.html;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.classic.spi.IThrowableProxy;
import ch.qos.logback.classic.spi.StackTraceElementProxy;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.html.IThrowableRenderer;
import ch.qos.logback.core.helpers.Transform;

public class DefaultThrowableRenderer implements IThrowableRenderer<ILoggingEvent> {
    static final String TRACE_PREFIX = "<br />&nbsp;&nbsp;&nbsp;&nbsp;";

    @Override
    public void render(StringBuilder output, ILoggingEvent event) {
        IThrowableProxy throwable = event.getThrowableProxy();
        output.append("<tr><td class=\"Exception\" colspan=\"6\">");
        while (throwable != null) {
            render(output, throwable);
            throwable = throwable.getCause();
        }
        output.append("</td></tr>");
    }

    public void render(StringBuilder output, IThrowableProxy throwable) {
        printFirstLine(output, throwable);
        int commonFrames = throwable.getCommonFrames();
        StackTraceElementProxy[] steps = throwable.getStackTraceElementProxyArray();
        for (int i = 0; i < steps.length - commonFrames; i++) {
            output.append(TRACE_PREFIX)
                    .append(Transform.escapeTags(steps[i].toString()))
                    .append(CoreConstants.LINE_SEPARATOR);
        }
        if (commonFrames > 0) {
            output.append(TRACE_PREFIX)
                    .append("\t... ")
                    .append(commonFrames)
                    .append(" common frames omitted")
                    .append(CoreConstants.LINE_SEPARATOR);
        }
    }

    public void printFirstLine(StringBuilder output, IThrowableProxy throwable) {
        if (throwable.getCommonFrames() > 0) {
            output.append("<br />Caused by: ");
        }
        output.append(throwable.getClassName())
                .append(": ")
                .append(Transform.escapeTags(throwable.getMessage()))
                .append(CoreConstants.LINE_SEPARATOR);
    }
}
