package ch.qos.logback.core.joran.action;

import ch.qos.logback.core.joran.spi.SaxEventInterpretationContext;
import ch.qos.logback.core.model.IncludeModel;
import ch.qos.logback.core.model.Model;
import org.xml.sax.Attributes;

public class IncludeAction extends Action {
    private static final String FILE_ATTR = "file";
    private static final String URL_ATTR = "url";
    private static final String RESOURCE_ATTR = "resource";
    private static final String OPTIONAL_ATTR = "optional";
    Model parentModel;
    IncludeModel includeModel;
    boolean inError;

    public IncludeAction() {
        this.inError = false;
    }

    private void fillInIncludeModelAttributes(IncludeModel model, String name, Attributes attributes) {
        model.setTag(name);
        String file = attributes.getValue("file");
        String url = attributes.getValue("url");
        String resource = attributes.getValue("resource");
        this.includeModel.setFile(file);
        this.includeModel.setUrl(url);
        this.includeModel.setResource(resource);
    }

    @Override
    public void begin(SaxEventInterpretationContext context, String name, Attributes attributes) {
        String optional = attributes.getValue("optional");
        IncludeModel model = new IncludeModel();
        this.includeModel = model;
        model.setOptional(optional);
        fillInIncludeModelAttributes(model, name, attributes);
        if (!context.isModelStackEmpty()) {
            this.parentModel = context.peekModel();
        }
        model.setLineNumber(Action.getLineNumber(context));
        context.pushModel(model);
    }

    @Override
    public void end(SaxEventInterpretationContext context, String name) {
        if (this.inError) {
            return;
        }
        Model top = context.peekModel();
        if (top != this.includeModel) {
            addWarn("The object at the of the stack is not the model [" + this.includeModel.idString() + "] pushed earlier.");
            addWarn("This is wholly unexpected.");
        }
        if (this.parentModel != null) {
            this.parentModel.addSubModel(this.includeModel);
            context.popModel();
        }
    }
}
