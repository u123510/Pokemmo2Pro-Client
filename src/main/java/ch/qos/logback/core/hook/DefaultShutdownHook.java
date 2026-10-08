package ch.qos.logback.core.hook;

import ch.qos.logback.core.util.Duration;

public class DefaultShutdownHook extends ShutdownHookBase {
    public static final Duration DEFAULT_DELAY = Duration.buildByMilliseconds(0.0D);
    private Duration delay;

    public DefaultShutdownHook() {
        delay = DEFAULT_DELAY;
    }

    public Duration getDelay() { return delay; }
    public void setDelay(Duration delay) { this.delay = delay; }

    @Override
    public void run() {
        if (delay.getMilliseconds() > 0L) {
            addInfo("Sleeping for " + delay);
            try {
                Thread.sleep(delay.getMilliseconds());
            } catch (InterruptedException ignored) {
            }
        }
        stop();
    }
}
