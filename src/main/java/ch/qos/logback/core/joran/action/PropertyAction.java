package ch.qos.logback.core.joran.action;

import ch.qos.logback.core.joran.spi.SaxEventInterpretationContext;
import ch.qos.logback.core.model.Model;
import ch.qos.logback.core.model.PropertyModel;
import org.xml.sax.Attributes;

public class PropertyAction extends BaseModelAction {
    static final String RESOURCE_ATTRIBUTE = "resource";

    public PropertyAction() {
        super();
    }

    public boolean validPreconditions(SaxEventInterpretationContext context, String name, Attributes attributes) {
        if ("substitutionProperty".equals(name)) {
            addWarn("[substitutionProperty] element has been deprecated. Please use the [variable] element instead.");
        }
        return true;
    }

    public Model buildCurrentModel(SaxEventInterpretationContext context, String name, Attributes attributes) {
        PropertyModel model = new PropertyModel();
        model.setName(attributes.getValue("name"));
        model.setValue(attributes.getValue("value"));
        model.setFile(attributes.getValue("file"));
        model.setResource(attributes.getValue("resource"));
        model.setScopeStr(attributes.getValue("scope"));
        return model;
    }
}
