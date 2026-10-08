package ch.qos.logback.classic.boolex;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.boolex.EventEvaluatorBase;
import f.HA0;
import f.nf0_1;
import java.util.ArrayList;
import java.util.List;

public class OnMarkerEvaluator extends EventEvaluatorBase<ILoggingEvent> {
    private final List<String> markerList = new ArrayList<>();

    public void addMarker(String marker) {
        markerList.add(marker);
    }

    @Override
    public boolean evaluate(ILoggingEvent event) {
        List<HA0> markers = event.getMarkerList();
        if (markers == null || markers.isEmpty()) {
            return false;
        }
        for (String markerName : markerList) {
            for (HA0 marker : markers) {
                if (((nf0_1) marker).UE(markerName)) {
                    return true;
                }
            }
        }
        return false;
    }
}
