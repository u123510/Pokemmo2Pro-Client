package ch.qos.logback.core.recovery;

import java.io.IOException;

public interface RecoveryListener {
    void newFailure(IOException exception);
    void recoveryOccured();
}
