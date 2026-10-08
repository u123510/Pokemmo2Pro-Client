package ch.qos.logback.core.encoder;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.Layout;
import ch.qos.logback.core.OutputStreamAppender;
import ch.qos.logback.core.spi.ContextAware;
import java.nio.charset.Charset;

public class LayoutWrappingEncoder<E> extends EncoderBase<E> {
    protected Layout<E> layout;
    private Charset charset;
    ContextAware parent;
    private Boolean immediateFlush;

    public LayoutWrappingEncoder() {
        immediateFlush = null;
    }

    private byte[] convertToBytes(String value) {
        return charset == null ? value.getBytes() : value.getBytes(charset);
    }

    private void appendIfNotNull(StringBuilder builder, String value) {
        if (value != null) builder.append(value);
    }

    public Layout<E> getLayout() { return layout; }
    public void setLayout(Layout<E> layout) { this.layout = layout; }
    public Charset getCharset() { return charset; }
    public void setCharset(Charset charset) { this.charset = charset; }

    public void setImmediateFlush(boolean immediateFlush) {
        addWarn("As of version 1.2.0 \"immediateFlush\" property should be set within the enclosing Appender.");
        addWarn("Please move \"immediateFlush\" property into the enclosing appender.");
        this.immediateFlush = immediateFlush;
    }

    @Override
    public byte[] headerBytes() {
        if (layout == null) return null;
        StringBuilder builder = new StringBuilder();
        appendIfNotNull(builder, layout.getFileHeader());
        appendIfNotNull(builder, layout.getPresentationHeader());
        if (builder.length() > 0) builder.append(CoreConstants.LINE_SEPARATOR);
        return convertToBytes(builder.toString());
    }

    @Override
    public byte[] footerBytes() {
        if (layout == null) return null;
        StringBuilder builder = new StringBuilder();
        appendIfNotNull(builder, layout.getPresentationFooter());
        appendIfNotNull(builder, layout.getFileFooter());
        return convertToBytes(builder.toString());
    }

    @Override
    public byte[] encode(E event) { return convertToBytes(layout.doLayout(event)); }

    @Override
    public void start() {
        if (immediateFlush != null) {
            if (parent instanceof OutputStreamAppender) {
                addWarn("Setting the \"immediateFlush\" property of the enclosing appender to " + immediateFlush);
                ((OutputStreamAppender) parent).setImmediateFlush(immediateFlush.booleanValue());
            } else {
                addError("Could not set the \"immediateFlush\" property of the enclosing appender.");
            }
        }
        started = true;
    }

    @Override
    public void stop() { started = false; }
    public void setParent(ContextAware parent) { this.parent = parent; }
}
