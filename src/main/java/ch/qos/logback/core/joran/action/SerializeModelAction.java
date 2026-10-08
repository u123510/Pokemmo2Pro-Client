package ch.qos.logback.core.joran.action;

import ch.qos.logback.core.joran.spi.SaxEventInterpretationContext;
import ch.qos.logback.core.model.Model;
import ch.qos.logback.core.model.SerializeModelModel;
import org.xml.sax.Attributes;

public class SerializeModelAction extends BaseModelAction {
    public SerializeModelAction() {
        super();
    }

    public Model buildCurrentModel(SaxEventInterpretationContext context, String name, Attributes attributes) {
        SerializeModelModel model = new SerializeModelModel();
        model.setFile(attributes.getValue("file"));
        return model;
    }
}
