package ch.qos.logback.core.pattern;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.LayoutBase;
import ch.qos.logback.core.pattern.parser.Node;
import ch.qos.logback.core.pattern.parser.Parser;
import ch.qos.logback.core.spi.ScanException;
import ch.qos.logback.core.status.ErrorStatus;
import java.util.HashMap;
import java.util.Map;

public abstract class PatternLayoutBase<E>
extends LayoutBase<E> {
    static final int INTIAL_STRING_BUILDER_SIZE = 256;
    Converter<E> head;
    String pattern;
    protected PostCompileProcessor postCompileProcessor;
    Map<String, String> instanceConverterMap;
    protected boolean outputPatternAsHeader;

    public PatternLayoutBase() {
        this.instanceConverterMap = new HashMap<String, String>();
        this.outputPatternAsHeader = false;
    }

    public abstract Map<String, String> getDefaultConverterMap();

    public Map<String, String> getEffectiveConverterMap() {
        HashMap<String, String> map = new HashMap<String, String>();
        Map<String, String> defaultMap = this.getDefaultConverterMap();
        if (defaultMap != null) {
            map.putAll(defaultMap);
        }
        Context context = this.getContext();
        Map<String, String> registryMap = context != null ? (Map<String, String>) context.getObject("PATTERN_RULE_REGISTRY") : null;
        if (registryMap != null) {
            map.putAll(registryMap);
        }
        map.putAll(this.instanceConverterMap);
        return map;
    }

    @Override
    public void start() {
        if (this.pattern == null || this.pattern.length() == 0) {
            this.addError("Empty or null pattern.");
            return;
        }
        try {
            Parser parser = new Parser(this.pattern);
            if (this.getContext() != null) {
                parser.setContext(this.getContext());
            }
            Node node = parser.parse();
            this.head = parser.compile(node, this.getEffectiveConverterMap());
            if (this.postCompileProcessor != null) {
                this.postCompileProcessor.process(this.context, this.head);
            }
            ConverterUtil.setContextForConverters(this.getContext(), this.head);
            ConverterUtil.startConverters(this.head);
            super.start();
        } catch (ScanException scanException) {
            this.getContext().getStatusManager().add(new ErrorStatus("Failed to parse pattern \"" + this.getPattern() + "\".", this, scanException));
        }
    }

    public void setPostCompileProcessor(PostCompileProcessor postCompileProcessor) {
        this.postCompileProcessor = postCompileProcessor;
    }

    @Deprecated
    public void setContextForConverters(Converter<E> converter) {
        ConverterUtil.setContextForConverters(this.getContext(), converter);
    }

    public String writeLoopOnConverters(E object) {
        StringBuilder stringBuilder = new StringBuilder(INTIAL_STRING_BUILDER_SIZE);
        Converter<E> converter = this.head;
        while (converter != null) {
            converter.write(stringBuilder, object);
            converter = converter.getNext();
        }
        return stringBuilder.toString();
    }

    public String getPattern() {
        return this.pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "(\"" + this.getPattern() + "\")";
    }

    public Map<String, String> getInstanceConverterMap() {
        return this.instanceConverterMap;
    }

    public String getPresentationHeaderPrefix() {
        return "";
    }

    public boolean isOutputPatternAsHeader() {
        return this.outputPatternAsHeader;
    }

    public void setOutputPatternAsHeader(boolean outputPatternAsHeader) {
        this.outputPatternAsHeader = outputPatternAsHeader;
    }

    @Override
    public String getPresentationHeader() {
        if (this.outputPatternAsHeader) {
            return this.getPresentationHeaderPrefix() + this.pattern;
        }
        return super.getPresentationHeader();
    }
}
