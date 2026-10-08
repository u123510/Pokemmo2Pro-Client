package ch.qos.logback.core.read;

import ch.qos.logback.core.AppenderBase;
import ch.qos.logback.core.helpers.CyclicBuffer;

public class CyclicBufferAppender extends AppenderBase {
    CyclicBuffer cb;
    int maxSize;

    public CyclicBufferAppender() {
        maxSize = 512;
    }

    @Override
    public void start() {
        cb = new CyclicBuffer(maxSize);
        super.start();
    }

    @Override
    public void stop() {
        cb = null;
        super.stop();
    }

    @Override
    public void append(Object event) {
        if (!isStarted()) return;
        cb.add(event);
    }

    public int getLength() {
        return isStarted() ? cb.length() : 0;
    }

    public Object get(int index) {
        return isStarted() ? cb.get(index) : null;
    }

    public void reset() {
        cb.clear();
    }

    public int getMaxSize() { return maxSize; }
    public void setMaxSize(int maxSize) { this.maxSize = maxSize; }
}
