package ch.qos.logback.core.joran.spi;

import java.net.URL;

import ch.qos.logback.core.status.StatusManager;

public class XMLUtil {
    public static final int ILL_FORMED = 1;
    public static final int UNRECOVERABLE_ERROR = 2;

    public XMLUtil() {
        super();
    }

    public static int checkIfWellFormed(URL url, StatusManager statusManager) {
        return 0;
    }
}
