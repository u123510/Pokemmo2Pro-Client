package ch.qos.logback.core.joran.event.stax;

import javax.xml.stream.Location;

public class BodyEvent extends StaxEvent {
    private String text;

    public BodyEvent(String text, Location location) {
        super(null, location);
        this.text = text;
    }

    public String getText() { return text; }

    public void append(String value) {
        text = text + value;
    }

    public String toString() {
        return "BodyEvent(" + getText() + ")" + location.getLineNumber() + "," + location.getColumnNumber();
    }
}
