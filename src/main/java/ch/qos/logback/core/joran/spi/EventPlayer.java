package ch.qos.logback.core.joran.spi;

import ch.qos.logback.core.joran.event.BodyEvent;
import ch.qos.logback.core.joran.event.EndEvent;
import ch.qos.logback.core.joran.event.SaxEvent;
import ch.qos.logback.core.joran.event.StartEvent;
import java.util.ArrayList;
import java.util.List;

public class EventPlayer {
    final SaxEventInterpreter interpreter;
    final List saxEvents;
    int currentIndex;

    public EventPlayer(SaxEventInterpreter interpreter, List saxEvents) {
        this.interpreter = interpreter;
        this.saxEvents = saxEvents;
    }

    public List getCopyOfPlayerEventList() {
        return new ArrayList(this.saxEvents);
    }

    public void play() {
        this.currentIndex = 0;
        while (this.currentIndex < this.saxEvents.size()) {
            SaxEvent event = (SaxEvent) this.saxEvents.get(this.currentIndex);
            if (event instanceof StartEvent) {
                this.interpreter.startElement((StartEvent) event);
            } else if (event instanceof BodyEvent) {
                this.interpreter.characters((BodyEvent) event);
            } else if (event instanceof EndEvent) {
                this.interpreter.endElement((EndEvent) event);
            }
            this.currentIndex++;
        }
    }

    public void addEventsDynamically(List events, int offset) {
        this.saxEvents.addAll(this.currentIndex + offset, events);
    }
}
