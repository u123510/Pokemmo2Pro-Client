package ch.qos.logback.core.joran.event;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.joran.spi.ElementPath;
import ch.qos.logback.core.joran.spi.JoranException;
import ch.qos.logback.core.spi.ContextAware;
import ch.qos.logback.core.spi.ContextAwareImpl;
import ch.qos.logback.core.status.Status;

public class SaxEventRecorder extends DefaultHandler implements ContextAware {
    final ContextAwareImpl contextAwareImpl;
    final ElementPath elementPath;
    List<SaxEvent> saxEventList;
    Locator locator;

    public SaxEventRecorder(Context context) {
        this(context, new ElementPath());
    }

    public SaxEventRecorder(Context context, ElementPath elementPath) {
        super();
        this.saxEventList = new ArrayList<>();
        this.contextAwareImpl = new ContextAwareImpl(context, this);
        this.elementPath = elementPath;
    }

    private void handleError(String message, Throwable throwable) throws JoranException {
        addError(message, throwable);
        throw new JoranException(message, throwable);
    }

    private SAXParser buildSaxParser() throws JoranException {
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            factory.setValidating(false);
            factory.setFeature("http://xml.org/sax/features/external-general-entities", false);
            factory.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            factory.setNamespaceAware(true);
            return factory.newSAXParser();
        } catch (SAXException e) {
            String message = "Error during parser creation or parser configuration";
            addError(message, e);
            throw new JoranException(message, e);
        } catch (ParserConfigurationException e) {
            String message = "Error during SAX paser configuration. See https://logback.qos.ch/codes.html#saxParserConfiguration";
            addError(message, e);
            throw new JoranException(message, e);
        }
    }

    public final void recordEvents(InputStream inputStream) throws JoranException {
        recordEvents(new InputSource(inputStream));
    }

    public void recordEvents(InputSource inputSource) throws JoranException {
        SAXParser parser = buildSaxParser();
        try {
            parser.parse(inputSource, this);
        } catch (SAXException e) {
            throw new JoranException("Problem parsing XML document. See previously reported errors.", e);
        } catch (IOException e) {
            handleError("I/O error occurred while parsing xml file", e);
            throw new IllegalStateException("This point can never be reached");
        } catch (Exception e) {
            handleError("Unexpected exception while parsing XML document.", e);
            throw new IllegalStateException("This point can never be reached");
        }
    }

    public void startDocument() {
    }

    public Locator getLocator() {
        return locator;
    }

    public void setDocumentLocator(Locator locator) {
        this.locator = locator;
    }

    public boolean shouldIgnoreForElementPath(String tagName) {
        return false;
    }

    public void startElement(String namespaceURI, String localName, String qName, Attributes attributes) {
        String tagName = getTagName(localName, qName);
        if (!shouldIgnoreForElementPath(tagName)) {
            elementPath.push(tagName);
        }
        ElementPath pathCopy = elementPath.duplicate();
        saxEventList.add(new StartEvent(pathCopy, namespaceURI, localName, qName, attributes, getLocator()));
    }

    public void characters(char[] chars, int start, int length) {
        String text = new String(chars, start, length);
        SaxEvent lastEvent = getLastEvent();
        if (lastEvent instanceof BodyEvent) {
            ((BodyEvent) lastEvent).append(text);
        } else if (!isSpaceOnly(text)) {
            saxEventList.add(new BodyEvent(text, getLocator()));
        }
    }

    public boolean isSpaceOnly(String text) {
        return text.trim().length() == 0;
    }

    public SaxEvent getLastEvent() {
        if (saxEventList.isEmpty()) {
            return null;
        }
        int size = saxEventList.size();
        return saxEventList.get(size - 1);
    }

    public void endElement(String namespaceURI, String localName, String qName) {
        saxEventList.add(new EndEvent(namespaceURI, localName, qName, getLocator()));
        String tagName = getTagName(localName, qName);
        if (!shouldIgnoreForElementPath(tagName)) {
            elementPath.pop();
        }
    }

    public String getTagName(String localName, String qName) {
        if (localName == null || localName.length() < 1) {
            localName = qName;
        }
        return localName;
    }

    public void error(SAXParseException exception) {
        addError("XML_PARSING - Parsing error on line " + exception.getLineNumber() + " and column " + exception.getColumnNumber());
        addError(exception.toString());
    }

    public void fatalError(SAXParseException exception) {
        addError("XML_PARSING - Parsing fatal error on line " + exception.getLineNumber() + " and column " + exception.getColumnNumber());
        addError(exception.toString());
    }

    public void warning(SAXParseException exception) {
        addWarn("XML_PARSING - Parsing warning on line " + exception.getLineNumber() + " and column " + exception.getColumnNumber(), exception);
    }

    public void addError(String message) { contextAwareImpl.addError(message); }
    public void addError(String message, Throwable throwable) { contextAwareImpl.addError(message, throwable); }
    public void addInfo(String message) { contextAwareImpl.addInfo(message); }
    public void addInfo(String message, Throwable throwable) { contextAwareImpl.addInfo(message, throwable); }
    public void addStatus(Status status) { contextAwareImpl.addStatus(status); }
    public void addWarn(String message) { contextAwareImpl.addWarn(message); }
    public void addWarn(String message, Throwable throwable) { contextAwareImpl.addWarn(message, throwable); }
    public Context getContext() { return contextAwareImpl.getContext(); }
    public void setContext(Context context) { contextAwareImpl.setContext(context); }
    public List<SaxEvent> getSaxEventList() { return saxEventList; }
}
