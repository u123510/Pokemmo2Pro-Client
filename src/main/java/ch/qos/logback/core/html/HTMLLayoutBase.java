package ch.qos.logback.core.html;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.LayoutBase;
import ch.qos.logback.core.Context;
import ch.qos.logback.core.pattern.Converter;
import ch.qos.logback.core.pattern.ConverterUtil;
import ch.qos.logback.core.pattern.parser.Node;
import ch.qos.logback.core.pattern.parser.Parser;
import ch.qos.logback.core.spi.ScanException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public abstract class HTMLLayoutBase<E> extends LayoutBase<E> {
    protected String pattern;
    protected Converter head;
    protected String title;
    protected CssBuilder cssBuilder;
    protected long counter;

    public HTMLLayoutBase() {
        title = "Logback Log Messages";
        counter = 0L;
    }

    private void buildHeaderRowForTable(StringBuilder builder) {
        builder.append("<tr class=\"header\">").append(CoreConstants.LINE_SEPARATOR);
        Converter converter = head;
        while (converter != null) {
            String name = computeConverterName(converter);
            if (name != null) {
                builder.append("<td class=\"").append(name).append("\">").append(name).append("</td>").append(CoreConstants.LINE_SEPARATOR);
            }
            converter = converter.getNext();
        }
        builder.append("</tr>").append(CoreConstants.LINE_SEPARATOR);
    }

    public void setPattern(String pattern) { this.pattern = pattern; }
    public String getPattern() { return pattern; }
    public CssBuilder getCssBuilder() { return cssBuilder; }
    public void setCssBuilder(CssBuilder cssBuilder) { this.cssBuilder = cssBuilder; }

    @Override
    public void start() {
        try {
            Parser parser = new Parser(pattern);
            parser.setContext(getContext());
            Node node = parser.parse();
            head = parser.compile(node, getEffectiveConverterMap());
            ConverterUtil.startConverters(head);
            started = true;
        } catch (ScanException e) {
            addError("Incorrect pattern found", e);
        }
    }

    public abstract Map getDefaultConverterMap();

    public Map getEffectiveConverterMap() {
        HashMap map = new HashMap();
        Map defaults = getDefaultConverterMap();
        if (defaults != null) map.putAll(defaults);
        Context context = getContext();
        if (context != null) {
            Map registry = (Map) context.getObject("PATTERN_RULE_REGISTRY");
            if (registry != null) map.putAll(registry);
        }
        return map;
    }

    public void setTitle(String title) { this.title = title; }
    public String getTitle() { return title; }
    public String getContentType() { return "text/html"; }

    public String getFileHeader() {
        StringBuilder builder = new StringBuilder();
        String lineSeparator = CoreConstants.LINE_SEPARATOR;
        builder.append("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">").append(lineSeparator);
        builder.append("<html>").append(lineSeparator);
        builder.append("  <head>").append(lineSeparator);
        builder.append("    <title>").append(title).append("</title>").append(lineSeparator);
        if (cssBuilder != null) cssBuilder.addCss(builder);
        builder.append("  </head>").append(lineSeparator);
        builder.append("<body>").append(lineSeparator);
        return builder.toString();
    }

    public String getPresentationHeader() {
        StringBuilder builder = new StringBuilder();
        String lineSeparator = CoreConstants.LINE_SEPARATOR;
        builder.append("<hr/>").append(lineSeparator);
        builder.append("<p>Log session start time ").append(new Date()).append("</p><p></p>").append(lineSeparator).append(lineSeparator);
        builder.append("<table cellspacing=\"0\">").append(lineSeparator);
        buildHeaderRowForTable(builder);
        return builder.toString();
    }

    public String getPresentationFooter() { return "</table>"; }

    public String getFileFooter() {
        return CoreConstants.LINE_SEPARATOR + "</body></html>";
    }

    public void startNewTableIfLimitReached(StringBuilder builder) {
        if (counter >= 10000L) {
            counter = 0L;
            builder.append("</table>").append(CoreConstants.LINE_SEPARATOR).append("<p></p>").append("<table cellspacing=\"0\">").append(CoreConstants.LINE_SEPARATOR);
            buildHeaderRowForTable(builder);
        }
    }

    public String computeConverterName(Converter<?> converter) {
        String simpleName = converter.getClass().getSimpleName();
        int index = simpleName.indexOf("Converter");
        return index == -1 ? simpleName : simpleName.substring(0, index);
    }
}
