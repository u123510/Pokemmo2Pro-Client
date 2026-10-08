package ch.qos.logback.core.joran.action;

import ch.qos.logback.core.joran.spi.SaxEventInterpretationContext;
import ch.qos.logback.core.model.Model;
import ch.qos.logback.core.model.TimestampModel;
import ch.qos.logback.core.util.OptionHelper;
import org.xml.sax.Attributes;

public class TimestampAction extends BaseModelAction {
    public static final String DATE_PATTERN_ATTRIBUTE = "datePattern";
    public static final String TIME_REFERENCE_ATTRIBUTE = "timeReference";

    public TimestampAction() {
        super();
    }

    public boolean validPreconditions(SaxEventInterpretationContext context, String name, Attributes attributes) {
        boolean valid = true;
        if (OptionHelper.isNullOrEmptyOrAllSpaces(attributes.getValue("key"))) {
            addError("Attribute named [key] cannot be empty");
            valid = false;
        }
        if (OptionHelper.isNullOrEmptyOrAllSpaces(attributes.getValue("datePattern"))) {
            addError("Attribute named [datePattern] cannot be empty");
            valid = false;
        }
        return valid;
    }

    public Model buildCurrentModel(SaxEventInterpretationContext context, String name, Attributes attributes) {
        TimestampModel model = new TimestampModel();
        model.setKey(attributes.getValue("key"));
        model.setDatePattern(attributes.getValue("datePattern"));
        model.setTimeReference(attributes.getValue("timeReference"));
        model.setScopeStr(attributes.getValue("scope"));
        return model;
    }
}
