package ch.qos.logback.core.net;

import ch.qos.logback.core.net.AutoFlushingObjectWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ObjectWriterFactory {
    public AutoFlushingObjectWriter newAutoFlushingObjectWriter(OutputStream outputStream) throws IOException {
        return new AutoFlushingObjectWriter(new ObjectOutputStream(outputStream), 70);
    }
}
