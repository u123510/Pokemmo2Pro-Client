package ch.qos.logback.classic.boolex;

import f.HA0;
import f.nf0_1;
import java.util.List;

public class MarkerList {
    private final List<HA0> markers;

    public MarkerList(List<HA0> markers) {
        this.markers = markers;
    }

    public boolean contains(String name) {
        if (name == null || name.trim().length() == 0 || markers == null || markers.isEmpty()) {
            return false;
        }
        return markers.stream().anyMatch(marker -> ((nf0_1) marker).UE(name));
    }

    public HA0 getFirstMarker() {
        if (markers == null || markers.isEmpty()) {
            return null;
        }
        return markers.get(0);
    }
}
