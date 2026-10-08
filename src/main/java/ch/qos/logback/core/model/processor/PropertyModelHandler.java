package ch.qos.logback.core.model.processor;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.model.Model;
import ch.qos.logback.core.model.PropertyModel;
import ch.qos.logback.core.model.util.PropertyModelHandlerHelper;

public class PropertyModelHandler extends ModelHandlerBase {
    public PropertyModelHandler(Context context) { super(context); }
    public static ModelHandlerBase makeInstance(Context context, ModelInterpretationContext interpretationContext) { return new PropertyModelHandler(context); }
    public Class getSupportedModelClass() { return PropertyModel.class; }
    public void handle(ModelInterpretationContext context, Model model) {
        PropertyModel propertyModel = (PropertyModel) model;
        PropertyModelHandlerHelper helper = new PropertyModelHandlerHelper(this);
        helper.setContext(getContext());
        helper.handlePropertyModel(context, propertyModel);
    }
}
