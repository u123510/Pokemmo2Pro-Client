package ch.qos.logback.core.testUtil;

import ch.qos.logback.core.read.ListAppender;

public class DelayingListAppender extends ListAppender {
    public int delay;
    public boolean interrupted;

    public DelayingListAppender() {
        delay = 1;
        interrupted = false;
    }

    public void setDelay(int delay) { this.delay = delay; }

    @Override
    public void append(Object event) {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException ignored) {
            interrupted = true;
        }
        super.append(event);
    }
}
