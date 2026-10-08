package ch.qos.logback.core.joran.event.stax;

import javax.xml.stream.Location;

public class EndEvent extends StaxEvent {
    public EndEvent(String name, Location location) {
        super(name, location);
    }

    public String toString() {
        return "EndEvent(" + getName() + ")  [" + location.getLineNumber() + "," + location.getColumnNumber() + "]";
    }
}
