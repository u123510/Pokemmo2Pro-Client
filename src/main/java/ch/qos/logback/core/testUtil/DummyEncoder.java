package ch.qos.logback.core.testUtil;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.encoder.EncoderBase;
import java.nio.charset.Charset;

public class DummyEncoder extends EncoderBase {
    public static final String DUMMY = "dummy" + CoreConstants.LINE_SEPARATOR;
    String val;
    String fileHeader;
    String fileFooter;
    Charset charset;

    public DummyEncoder() {
        val = DUMMY;
    }

    public DummyEncoder(String value) {
        val = value;
    }

    private void appendIfNotNull(StringBuilder builder, String value) {
        if (value != null) builder.append(value);
    }

    public Charset getCharset() { return charset; }
    public void setCharset(Charset charset) { this.charset = charset; }

    @Override
    public byte[] encode(Object event) { return encodeString(val); }

    public byte[] encodeString(String value) {
        return charset == null ? value.getBytes() : value.getBytes(charset);
    }

    public byte[] header() {
        StringBuilder builder = new StringBuilder();
        appendIfNotNull(builder, fileHeader);
        if (builder.length() > 0) builder.append(CoreConstants.LINE_SEPARATOR);
        return encodeString(builder.toString());
    }

    @Override
    public byte[] headerBytes() { return header(); }

    @Override
    public byte[] footerBytes() { return fileFooter == null ? null : encodeString(fileFooter); }
    public String getFileHeader() { return fileHeader; }
    public void setFileHeader(String fileHeader) { this.fileHeader = fileHeader; }
    public String getFileFooter() { return fileFooter; }
    public void setFileFooter(String fileFooter) { this.fileFooter = fileFooter; }
}
