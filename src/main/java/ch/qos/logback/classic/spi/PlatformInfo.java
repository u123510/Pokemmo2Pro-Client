package ch.qos.logback.classic.spi;

public class PlatformInfo {
    private static final int UNINITIALIZED = -1;
    private static int hasJMXObjectName = UNINITIALIZED;

    public static boolean hasJMXObjectName() {
        if (hasJMXObjectName == UNINITIALIZED) {
            try {
                Class.forName("javax.management.ObjectName");
                hasJMXObjectName = 1;
            } catch (Throwable ex) {
                hasJMXObjectName = 0;
            }
        }
        return hasJMXObjectName == 1;
    }
}
