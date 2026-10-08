package ch.qos.logback.core.encoder;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class NonClosableInputStream extends FilterInputStream {
    public NonClosableInputStream(InputStream inputStream) {
        super(inputStream);
    }

    @Override
    public void close() throws IOException {
    }

    public void realClose() throws IOException {
        super.close();
    }
}
