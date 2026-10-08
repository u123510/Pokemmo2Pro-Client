package ch.qos.logback.core.testUtil;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class TeeOutputStream extends OutputStream {
    final PrintStream targetPS;
    public final ByteArrayOutputStream baos;

    public TeeOutputStream(PrintStream targetPS) {
        baos = new ByteArrayOutputStream();
        this.targetPS = targetPS;
    }

    @Override
    public void write(int value) {
        baos.write(value);
        if (targetPS != null) targetPS.write(value);
    }

    @Override
    public String toString() { return baos.toString(); }
    public byte[] toByteArray() { return baos.toByteArray(); }
}
