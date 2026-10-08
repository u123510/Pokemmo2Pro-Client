package ch.qos.logback.core.joran.event.stax;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.stream.Location;
import javax.xml.stream.events.Attribute;

import ch.qos.logback.core.joran.spi.ElementPath;

public class StartEvent extends StaxEvent {
    List<Attribute> attributes;
    public ElementPath elementPath;

    public StartEvent(ElementPath elementPath, String name, Iterator<?> attributes, Location location) {
        super(name, location);
        populateAttributes(attributes);
        this.elementPath = elementPath;
    }

    private void populateAttributes(Iterator<?> iterator) {
        while (iterator.hasNext()) {
            if (attributes == null) {
                attributes = new ArrayList<>(2);
            }
            attributes.add((Attribute) iterator.next());
        }
    }

    public ElementPath getElementPath() { return elementPath; }
    public List<Attribute> getAttributeList() { return attributes; }

    public Attribute getAttributeByName(String name) {
        if (attributes == null) {
            return null;
        }
        Iterator<Attribute> iterator = attributes.iterator();
        while (iterator.hasNext()) {
            Attribute attribute = iterator.next();
            QName qName = attribute.getName();
            if (name.equals(qName.getLocalPart())) {
                return attribute;
            }
        }
        return null;
    }

    public String toString() {
        return "StartEvent(" + getName() + ")  [" + location.getLineNumber() + "," + location.getColumnNumber() + "]";
    }
}
