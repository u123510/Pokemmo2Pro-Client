package ch.qos.logback.core.joran.event;

import org.xml.sax.Locator;

public class BodyEvent extends SaxEvent {
    private String text;

    public BodyEvent(String text, Locator locator) {
        super(null, null, null, locator);
        this.text = text;
    }

    public String getText() {
        return text == null ? null : text.trim();
    }

    public String toString() {
        return "BodyEvent(" + getText() + ")" + locator.getLineNumber() + "," + locator.getColumnNumber();
    }

    public void append(String value) {
        text = text + value;
    }
}
