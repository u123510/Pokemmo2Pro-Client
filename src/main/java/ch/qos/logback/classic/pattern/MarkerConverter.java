package ch.qos.logback.classic.pattern;

import ch.qos.logback.classic.spi.ILoggingEvent;
import java.util.List;
import f.HA0;

public class MarkerConverter extends ClassicConverter {
    private static String EMPTY = "";

    @Override
    public String convert(ILoggingEvent event) {
        List<HA0> markers = event.getMarkerList();
        if (markers == null || markers.isEmpty()) {
            return EMPTY;
        }
        if (markers.size() == 1) {
            return markers.get(0).toString();
        }
        StringBuffer result = new StringBuffer(32);
        for (int i = 0; i < markers.size(); i++) {
            if (i != 0) {
                result.append(' ');
            }
            result.append(markers.get(i).toString());
        }
        return result.toString();
    }
}
