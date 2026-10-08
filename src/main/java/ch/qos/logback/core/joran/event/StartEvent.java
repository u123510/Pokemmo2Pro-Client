package ch.qos.logback.core.joran.event;

import org.xml.sax.Attributes;
import org.xml.sax.Locator;
import org.xml.sax.helpers.AttributesImpl;

import ch.qos.logback.core.joran.spi.ElementPath;

public class StartEvent extends SaxEvent {
    public final Attributes attributes;
    public final ElementPath elementPath;

    public StartEvent(ElementPath elementPath, String namespaceURI, String localName, String qName, Attributes attributes, Locator locator) {
        super(namespaceURI, localName, qName, locator);
        this.attributes = new AttributesImpl(attributes);
        this.elementPath = elementPath;
    }

    public Attributes getAttributes() { return attributes; }

    public String toString() {
        StringBuilder builder = new StringBuilder("StartEvent(");
        builder.append(getQName());
        if (attributes != null) {
            for (int i = 0; i < attributes.getLength(); i++) {
                builder.append(' ');
                builder.append(attributes.getLocalName(i));
                builder.append("=\"");
                builder.append(attributes.getValue(i));
                builder.append('"');
            }
        }
        builder.append(")  [");
        builder.append(locator.getLineNumber());
        builder.append(',');
        builder.append(locator.getColumnNumber());
        builder.append(']');
        return builder.toString();
    }
}
