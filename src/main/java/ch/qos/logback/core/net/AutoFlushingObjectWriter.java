package ch.qos.logback.core.net;

import ch.qos.logback.core.net.ObjectWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class AutoFlushingObjectWriter
implements ObjectWriter {
    private final ObjectOutputStream objectOutputStream;
    private final int resetFrequency;
    private int writeCounter = 0;

    public AutoFlushingObjectWriter(ObjectOutputStream objectOutputStream, int n) {
        this.objectOutputStream = objectOutputStream;
        this.resetFrequency = n;
    }

    private void preventMemoryLeak() throws IOException {
        int n;
        this.writeCounter = n = this.writeCounter + 1;
        if (n >= this.resetFrequency) {
            this.objectOutputStream.reset();
            this.writeCounter = 0;
        }
    }

    @Override
    public void write(Object object) throws IOException {
        AutoFlushingObjectWriter autoFlushingObjectWriter = this;
        autoFlushingObjectWriter.objectOutputStream.writeObject(object);
        autoFlushingObjectWriter.objectOutputStream.flush();
        autoFlushingObjectWriter.preventMemoryLeak();
    }
}
