package ch.qos.logback.core.encoder;

import ch.qos.logback.core.CoreConstants;

public class EchoEncoder extends EncoderBase {
    String fileHeader;
    String fileFooter;

    public EchoEncoder() {
    }

    @Override
    public byte[] encode(Object event) {
        return (String.valueOf(event) + CoreConstants.LINE_SEPARATOR).getBytes();
    }

    @Override
    public byte[] footerBytes() {
        return fileFooter == null ? null : fileFooter.getBytes();
    }

    @Override
    public byte[] headerBytes() {
        return fileHeader == null ? null : fileHeader.getBytes();
    }
}
