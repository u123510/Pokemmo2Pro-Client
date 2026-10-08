package ch.qos.logback.core.testUtil;

import java.io.IOException;
import java.io.PrintStream;

public class XTeeOutputStream extends TeeOutputStream {
    boolean closed;

    public XTeeOutputStream(PrintStream targetPS) {
        super(targetPS);
        closed = false;
    }

    @Override
    public void close() throws IOException {
        closed = true;
        super.close();
    }

    public boolean isClosed() { return closed; }
}
