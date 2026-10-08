package ch.qos.logback.core.recovery;

public class RecoveryCoordinator {
    public static final long BACKOFF_COEFFICIENT_MIN = 20L;
    public static final long BACKOFF_MULTIPLIER = 4L;
    static long BACKOFF_COEFFICIENT_MAX = 327680L;
    private static long UNSET = -1L;
    private long backOffCoefficient;
    private long currentTime;
    private long next;

    public RecoveryCoordinator() {
        backOffCoefficient = BACKOFF_COEFFICIENT_MIN;
        currentTime = UNSET;
        next = getCurrentTime() + getBackoffCoefficient();
    }

    public RecoveryCoordinator(long currentTime) {
        backOffCoefficient = BACKOFF_COEFFICIENT_MIN;
        this.currentTime = currentTime;
        next = getCurrentTime() + getBackoffCoefficient();
    }

    private long getCurrentTime() {
        return currentTime != UNSET ? currentTime : System.currentTimeMillis();
    }

    private long getBackoffCoefficient() {
        long value = backOffCoefficient;
        if (value < BACKOFF_COEFFICIENT_MAX) backOffCoefficient = value * BACKOFF_MULTIPLIER;
        return value;
    }

    public boolean isTooSoon() {
        long now = getCurrentTime();
        if (now > next) {
            next = now + getBackoffCoefficient();
            return false;
        }
        return true;
    }

    public void setCurrentTime(long currentTime) { this.currentTime = currentTime; }
}
