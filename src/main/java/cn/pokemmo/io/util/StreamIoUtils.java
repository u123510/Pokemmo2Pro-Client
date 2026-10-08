package cn.pokemmo.io.util;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.StringWriter;

public class StreamIoUtils {
    public static byte[] readBytes(InputStream in, int estimatedSize) {
        byte[] buffer = new byte[Math.max(0, estimatedSize)];
        int totalRead = 0;

        try {
            while (true) {
                int read = in.read(buffer, totalRead, buffer.length - totalRead);
                if (read <= 0) {
                    return buffer;
                }
                totalRead += read;
                if (totalRead == buffer.length) {
                    int next = in.read();
                    if (next == -1) {
                        return buffer;
                    }
                    byte[] expanded = new byte[buffer.length * 2];
                    System.arraycopy(buffer, 0, expanded, 0, totalRead);
                    expanded[totalRead++] = (byte) next;
                    buffer = expanded;
                }
            }
        } catch (IOException ex) {
            sneakyThrow(ex);
            return null;
        }
    }

    public static int copyStream(InputStream in, OutputStream out, byte[] buffer) {
        int total = 0;
        try {
            while (true) {
                int count = in.read(buffer);
                if (count == -1) {
                    return total;
                }
                out.write(buffer, 0, count);
                total += count;
            }
        } catch (IOException ex) {
            sneakyThrow(ex);
            return total;
        }
    }

    public static String readString(InputStream in, int estimatedSize) {
        InputStreamReader reader = new InputStreamReader(in);
        StringWriter writer = new StringWriter(Math.max(0, estimatedSize));
        char[] buffer = new char[4096];
        try {
            while (true) {
                int count = reader.read(buffer);
                if (count == -1) {
                    return writer.toString();
                }
                writer.write(buffer, 0, count);
            }
        } catch (IOException ex) {
            sneakyThrow(ex);
            return null;
        }
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable ignored) {
            }
        }
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> void sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
