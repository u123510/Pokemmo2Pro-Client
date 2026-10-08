package ch.qos.logback.core.joran.event.stax;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.joran.spi.ElementPath;
import ch.qos.logback.core.joran.spi.JoranException;
import ch.qos.logback.core.spi.ContextAwareBase;

public class StaxEventRecorder extends ContextAwareBase {
    List<StaxEvent> eventList;
    ElementPath globalElementPath;

    public StaxEventRecorder(Context context) {
        eventList = new ArrayList<>();
        globalElementPath = new ElementPath();
        setContext(context);
    }

    private void read(XMLEventReader reader) throws XMLStreamException {
        while (reader.hasNext()) {
            XMLEvent event = reader.nextEvent();
            int type = event.getEventType();
            if (type == XMLStreamConstants.START_ELEMENT) {
                addStartElement(event);
            } else if (type == XMLStreamConstants.END_ELEMENT) {
                addEndEvent(event);
            } else if (type == XMLStreamConstants.CHARACTERS) {
                addCharacters(event);
            }
        }
    }

    private void addStartElement(XMLEvent event) {
        StartElement startElement = event.asStartElement();
        String name = startElement.getName().getLocalPart();
        globalElementPath.push(name);
        ElementPath path = globalElementPath.duplicate();
        StartEvent startEvent = new StartEvent(path, name, startElement.getAttributes(), startElement.getLocation());
        eventList.add(startEvent);
    }

    private void addCharacters(XMLEvent event) {
        Characters characters = event.asCharacters();
        StaxEvent lastEvent = getLastEvent();
        if (lastEvent instanceof BodyEvent) {
            ((BodyEvent) lastEvent).append(characters.getData());
        } else if (!characters.isWhiteSpace()) {
            eventList.add(new BodyEvent(characters.getData(), event.getLocation()));
        }
    }

    private void addEndEvent(XMLEvent event) {
        EndElement endElement = event.asEndElement();
        String name = endElement.getName().getLocalPart();
        eventList.add(new EndEvent(name, endElement.getLocation()));
        globalElementPath.pop();
    }

    public void recordEvents(InputStream inputStream) throws JoranException {
        try {
            XMLEventReader reader = XMLInputFactory.newInstance().createXMLEventReader(inputStream);
            read(reader);
        } catch (XMLStreamException e) {
            throw new JoranException("Problem parsing XML document. See previously reported errors.", e);
        }
    }

    public List<StaxEvent> getEventList() { return eventList; }

    public StaxEvent getLastEvent() {
        if (eventList.isEmpty()) {
            return null;
        }
        int size = eventList.size();
        if (size == 0) {
            return null;
        }
        return eventList.get(size - 1);
    }
}
