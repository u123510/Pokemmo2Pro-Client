package ch.qos.logback.core.recovery;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.status.ErrorStatus;
import ch.qos.logback.core.status.InfoStatus;
import ch.qos.logback.core.status.Status;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public abstract class ResilientOutputStreamBase extends OutputStream {
    static final int STATUS_COUNT_LIMIT = 8;
    private int noContextWarning;
    private int statusCount;
    private Context context;
    private RecoveryCoordinator recoveryCoordinator;
    protected OutputStream os;
    protected boolean presumedClean;
    List<RecoveryListener> recoveryListeners;

    public ResilientOutputStreamBase() {
        presumedClean = true;
        recoveryListeners = new ArrayList<>(0);
    }

    private boolean isPresumedInError() {
        return recoveryCoordinator != null && !presumedClean;
    }

    private void postSuccessfulWrite() {
        if (recoveryCoordinator == null) return;
        recoveryCoordinator = null;
        statusCount = 0;
        for (RecoveryListener listener : recoveryListeners) listener.recoveryOccured();
        addStatus(new InfoStatus("Recovered from IO failure on " + getDescription(), this));
    }

    public void addRecoveryListener(RecoveryListener listener) { recoveryListeners.add(listener); }
    public void removeRecoveryListener(RecoveryListener listener) { recoveryListeners.remove(listener); }

    @Override
    public void write(byte[] bytes, int offset, int length) {
        if (isPresumedInError()) {
            if (!recoveryCoordinator.isTooSoon()) attemptRecovery();
            return;
        }
        try {
            os.write(bytes, offset, length);
            postSuccessfulWrite();
        } catch (IOException e) {
            postIOFailure(e);
        }
    }

    @Override
    public void write(int value) {
        if (isPresumedInError()) {
            if (!recoveryCoordinator.isTooSoon()) attemptRecovery();
            return;
        }
        try {
            os.write(value);
            postSuccessfulWrite();
        } catch (IOException e) {
            postIOFailure(e);
        }
    }

    @Override
    public void flush() {
        if (os == null) return;
        try {
            os.flush();
            postSuccessfulWrite();
        } catch (IOException e) {
            postIOFailure(e);
        }
    }

    public abstract String getDescription();
    public abstract OutputStream openNewOutputStream() throws IOException;

    public void postIOFailure(IOException exception) {
        addStatusIfCountNotOverLimit(new ErrorStatus("IO failure while writing to " + getDescription(), this, exception));
        presumedClean = false;
        if (recoveryCoordinator == null) {
            recoveryCoordinator = new RecoveryCoordinator();
            for (RecoveryListener listener : recoveryListeners) listener.newFailure(exception);
        }
    }

    @Override
    public void close() throws IOException {
        if (os != null) os.close();
    }

    public void attemptRecovery() {
        try { close(); } catch (IOException ignored) { }
        addStatusIfCountNotOverLimit(new InfoStatus("Attempting to recover from IO failure on " + getDescription(), this));
        try {
            os = openNewOutputStream();
            presumedClean = true;
        } catch (IOException e) {
            addStatusIfCountNotOverLimit(new ErrorStatus("Failed to open " + getDescription(), this, e));
        }
    }

    public void addStatusIfCountNotOverLimit(Status status) {
        statusCount++;
        if (statusCount < STATUS_COUNT_LIMIT) addStatus(status);
        if (statusCount == STATUS_COUNT_LIMIT) {
            addStatus(status);
            addStatus(new InfoStatus("Will supress future messages regarding " + getDescription(), this));
        }
    }

    public void addStatus(Status status) {
        if (context == null) {
            if (noContextWarning++ == 0) System.out.println("LOGBACK: No context given for " + this);
            return;
        }
        if (context.getStatusManager() != null) context.getStatusManager().add(status);
    }

    public Context getContext() { return context; }
    public void setContext(Context context) { this.context = context; }
}
