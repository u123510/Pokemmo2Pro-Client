package ch.qos.logback.classic.spi;

import ch.qos.logback.classic.Logger;
import java.util.Comparator;

public class LoggerComparator implements Comparator<Logger> {
    @Override public int compare(Logger first, Logger second) {
        if (first.getName().equals(second.getName())) return 0;
        if ("ROOT".equals(first.getName())) return -1;
        if ("ROOT".equals(second.getName())) return 1;
        return first.getName().compareTo(second.getName());
    }
}
