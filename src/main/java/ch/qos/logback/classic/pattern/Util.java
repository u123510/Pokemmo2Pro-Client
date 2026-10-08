package ch.qos.logback.classic.pattern;

import f.HA0;
import f.nf0_1;
import java.util.HashMap;
import java.util.Map;

public class Util {
    static Map cache = new HashMap();

    public static boolean match(HA0 marker, HA0[] markerArray) {
        if (markerArray == null) throw new IllegalArgumentException("markerArray should not be null");
        for (HA0 candidate : markerArray) {
            if (((nf0_1) candidate).gJ(marker)) return true;
        }
        return false;
    }
}
