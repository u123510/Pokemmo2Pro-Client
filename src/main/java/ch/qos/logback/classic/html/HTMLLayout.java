package ch.qos.logback.classic.html;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.PatternLayout;
import ch.qos.logback.classic.pattern.MDCConverter;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.html.HTMLLayoutBase;
import ch.qos.logback.core.html.IThrowableRenderer;
import ch.qos.logback.core.pattern.Converter;
import ch.qos.logback.core.helpers.Transform;
import java.util.Map;

public class HTMLLayout extends HTMLLayoutBase<ILoggingEvent> {
    static final String DEFAULT_CONVERSION_PATTERN = "%date%thread%level%logger%mdc%msg";
    private IThrowableRenderer<ILoggingEvent> throwableRenderer;

    public HTMLLayout() {
        pattern = DEFAULT_CONVERSION_PATTERN;
        throwableRenderer = new DefaultThrowableRenderer();
        cssBuilder = new DefaultCssBuilder();
    }

    private void appendEventToBuffer(StringBuilder output, Converter<ILoggingEvent> converter, ILoggingEvent event) {
        output.append("<td class=\"")
                .append(computeConverterName(converter))
                .append("\">")
                .append(Transform.escapeTags(converter.convert(event)))
                .append("</td>")
                .append(CoreConstants.LINE_SEPARATOR);
    }

    @Override
    public void start() {
        if (throwableRenderer == null) {
            addError("ThrowableRender cannot be null.");
        } else {
            super.start();
        }
    }

    @Override
    public Map<String, String> getDefaultConverterMap() {
        return PatternLayout.DEFAULT_CONVERTER_MAP;
    }

    @Override
    public String doLayout(ILoggingEvent event) {
        StringBuilder output = new StringBuilder();
        startNewTableIfLimitReached(output);
        boolean odd = (counter++ & 1L) != 0L;
        String level = event.getLevel().toString().toLowerCase();
        output.append(CoreConstants.LINE_SEPARATOR)
                .append("<tr class=\"")
                .append(level)
                .append(odd ? " odd\">" : " even\">")
                .append(CoreConstants.LINE_SEPARATOR);
        Converter<ILoggingEvent> converter = head;
        while (converter != null) {
            appendEventToBuffer(output, converter, event);
            converter = converter.getNext();
        }
        output.append("</tr>").append(CoreConstants.LINE_SEPARATOR);
        if (event.getThrowableProxy() != null) {
            throwableRenderer.render(output, event);
        }
        return output.toString();
    }

    public IThrowableRenderer<ILoggingEvent> getThrowableRenderer() {
        return throwableRenderer;
    }

    public void setThrowableRenderer(IThrowableRenderer<ILoggingEvent> throwableRenderer) {
        this.throwableRenderer = throwableRenderer;
    }

    @Override
    public String computeConverterName(Converter<?> converter) {
        if (converter instanceof MDCConverter mdcConverter) {
            String option = mdcConverter.getFirstOption();
            return option != null ? option : "MDC";
        }
        return super.computeConverterName(converter);
    }
}
