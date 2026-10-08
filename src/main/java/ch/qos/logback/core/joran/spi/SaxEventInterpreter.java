package ch.qos.logback.core.joran.spi;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.joran.action.NOPAction;
import ch.qos.logback.core.joran.event.BodyEvent;
import ch.qos.logback.core.joran.event.EndEvent;
import ch.qos.logback.core.joran.event.StartEvent;
import ch.qos.logback.core.spi.ContextAwareBase;
import java.util.List;
import java.util.Stack;
import java.util.function.Supplier;
import org.xml.sax.Attributes;
import org.xml.sax.Locator;

public class SaxEventInterpreter {
    private static Action NOP_ACTION_SINGLETON;
    private final RuleStore ruleStore;
    private final SaxEventInterpretationContext interpretationContext;
    private Supplier implicitActionSupplier;
    private final CAI_WithLocatorSupport cai;
    private ElementPath elementPath;
    Locator locator;
    EventPlayer eventPlayer;
    Context context;
    Stack actionStack;
    ElementPath skip;

    public SaxEventInterpreter(Context context, RuleStore ruleStore, ElementPath elementPath, List saxEvents) {
        this.skip = null;
        this.context = context;
        this.cai = new CAI_WithLocatorSupport(context, this);
        this.ruleStore = ruleStore;
        this.interpretationContext = new SaxEventInterpretationContext(context, this);
        this.elementPath = elementPath;
        this.actionStack = new Stack();
        this.eventPlayer = new EventPlayer(this, saxEvents);
    }

    private void startElement(String namespaceURI, String localName, String qName, Attributes attributes) {
        String tagName = getTagName(localName, qName);
        this.elementPath.push(tagName);
        if (this.skip != null) {
            pushEmptyActionOntoActionStack();
            return;
        }
        Action action = getApplicableAction(this.elementPath, attributes);
        if (action != null) {
            this.actionStack.add(action);
            callBeginAction(action, tagName, attributes);
        } else {
            pushEmptyActionOntoActionStack();
            this.cai.addError("no applicable action for [" + tagName + "], current ElementPath  is [" + this.elementPath + "]");
        }
    }

    private void pushEmptyActionOntoActionStack() {
        this.actionStack.push(NOP_ACTION_SINGLETON);
    }

    private void endElement(String namespaceURI, String localName, String qName) {
        Action action = (Action) this.actionStack.pop();
        ElementPath currentSkip = this.skip;
        if (currentSkip != null) {
            if (currentSkip.equals(this.elementPath)) {
                this.skip = null;
            }
        } else if (action != NOP_ACTION_SINGLETON) {
            callEndAction(action, getTagName(localName, qName));
        }
        this.elementPath.pop();
    }

    private void callBodyAction(Action action, String body) {
        if (action == null) {
            return;
        }
        try {
            action.body(this.interpretationContext, body);
        } catch (ActionException exception) {
            this.cai.addError("Exception in body() method for action [" + String.valueOf(action) + "]", exception);
        }
    }

    private void callEndAction(Action action, String tagName) {
        if (action == null) {
            return;
        }
        try {
            action.end(this.interpretationContext, tagName);
        } catch (RuntimeException exception) {
            this.cai.addError("RuntimeException in Action for tag [" + tagName + "]", exception);
        } catch (ActionException exception) {
            this.cai.addError("ActionException in Action for tag [" + tagName + "]", exception);
        }
    }

    static {
        NOP_ACTION_SINGLETON = new NOPAction();
    }

    public EventPlayer getEventPlayer() {
        return this.eventPlayer;
    }

    public ElementPath getCopyOfElementPath() {
        return this.elementPath.duplicate();
    }

    public SaxEventInterpretationContext getSaxEventInterpretationContext() {
        return this.interpretationContext;
    }

    public void startDocument() {
    }

    public void startElement(StartEvent event) {
        setDocumentLocator(event.getLocator());
        startElement(event.namespaceURI, event.localName, event.qName, event.attributes);
    }

    public void characters(BodyEvent event) {
        setDocumentLocator(event.locator);
        String body = event.getText();
        Action action = (Action) this.actionStack.peek();
        if (action != null) {
            body = body.trim();
            if (body.length() > 0) {
                callBodyAction(action, body);
            }
        }
    }

    public void endElement(EndEvent event) {
        setDocumentLocator(event.locator);
        endElement(event.namespaceURI, event.localName, event.qName);
    }

    public Locator getLocator() {
        return this.locator;
    }

    public void setDocumentLocator(Locator locator) {
        this.locator = locator;
    }

    public String getTagName(String localName, String qName) {
        if (localName == null || localName.length() < 1) {
            localName = qName;
        }
        return localName;
    }

    public void setImplicitActionSupplier(Supplier supplier) {
        this.implicitActionSupplier = supplier;
    }

    public Action getApplicableAction(ElementPath path, Attributes attributes) {
        Supplier supplier = this.ruleStore.matchActions(path);
        if (supplier != null) {
            Action action = (Action) supplier.get();
            ((ContextAwareBase) action).setContext(this.context);
            return action;
        }
        Action action = (Action) this.implicitActionSupplier.get();
        ((ContextAwareBase) action).setContext(this.context);
        return action;
    }

    public void callBeginAction(Action action, String tagName, Attributes attributes) {
        if (action == null) {
            return;
        }
        try {
            action.begin(this.interpretationContext, tagName, attributes);
        } catch (RuntimeException exception) {
            this.skip = this.elementPath.duplicate();
            this.cai.addError("RuntimeException in Action for tag [" + tagName + "]", exception);
        } catch (ActionException exception) {
            this.skip = this.elementPath.duplicate();
            this.cai.addError("ActionException in Action for tag [" + tagName + "]", exception);
        }
    }

    public RuleStore getRuleStore() {
        return this.ruleStore;
    }
}
