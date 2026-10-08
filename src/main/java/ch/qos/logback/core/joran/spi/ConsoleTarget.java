package ch.qos.logback.core.joran.spi;

import java.io.IOException;
import java.io.OutputStream;

public enum ConsoleTarget {
    SystemOut("System.out", new OutputStream() {
        public void write(int value) throws IOException {
            System.out.write(value);
        }

        public void write(byte[] bytes) throws IOException {
            System.out.write(bytes);
        }

        public void write(byte[] bytes, int offset, int length) throws IOException {
            System.out.write(bytes, offset, length);
        }

        public void flush() throws IOException {
            System.out.flush();
        }
    }),
    SystemErr("System.err", new OutputStream() {
        public void write(int value) throws IOException {
            System.err.write(value);
        }

        public void write(byte[] bytes) throws IOException {
            System.err.write(bytes);
        }

        public void write(byte[] bytes, int offset, int length) throws IOException {
            System.err.write(bytes, offset, length);
        }

        public void flush() throws IOException {
            System.err.flush();
        }
    });

    private final String name;
    private final OutputStream stream;

    ConsoleTarget(String name, OutputStream stream) {
        this.name = name;
        this.stream = stream;
    }

    public static ConsoleTarget findByName(String name) {
        for (ConsoleTarget target : values()) {
            if (target.name.equalsIgnoreCase(name)) {
                return target;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public OutputStream getStream() {
        return stream;
    }

    public String toString() {
        return name;
    }
}
