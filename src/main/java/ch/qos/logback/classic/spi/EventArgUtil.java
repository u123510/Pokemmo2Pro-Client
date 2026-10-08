package ch.qos.logback.classic.spi;

public class EventArgUtil {
    public static final Throwable extractThrowable(Object[] args) {
        if (args == null || args.length == 0) return null;
        Object last = args[args.length - 1];
        return last instanceof Throwable ? (Throwable) last : null;
    }
    public static Object[] trimmedCopy(Object[] args) {
        if (args == null || args.length == 0) {
            throw new IllegalStateException("non-sensical empty or null argument array");
        }
        Object[] copy = new Object[args.length - 1];
        System.arraycopy(args, 0, copy, 0, copy.length);
        return copy;
    }
    public static Object[] arrangeArguments(Object[] args) { return args; }
    public static boolean successfulExtraction(Throwable t) { return t != null; }
}
