package ch.qos.logback.classic.pattern;

public abstract class ThrowableHandlingConverter extends ClassicConverter {
    public boolean handlesThrowable() {
        return true;
    }
}
