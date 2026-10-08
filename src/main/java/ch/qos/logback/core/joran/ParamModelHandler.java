package ch.qos.logback.core.joran;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.joran.util.PropertySetter;
import ch.qos.logback.core.joran.util.beans.BeanDescriptionCache;
import ch.qos.logback.core.model.Model;
import ch.qos.logback.core.model.ParamModel;
import ch.qos.logback.core.model.processor.ModelHandlerBase;
import ch.qos.logback.core.model.processor.ModelInterpretationContext;

public class ParamModelHandler extends ModelHandlerBase {
    private final BeanDescriptionCache beanDescriptionCache;

    public ParamModelHandler(Context context, BeanDescriptionCache beanDescriptionCache) {
        super(context);
        this.beanDescriptionCache = beanDescriptionCache;
    }

    public static ModelHandlerBase makeInstance(Context context, ModelInterpretationContext mic) {
        return new ParamModelHandler(context, mic.getBeanDescriptionCache());
    }

    public Class<?> getSupportedModelClass() {
        return ParamModel.class;
    }

    public void handle(ModelInterpretationContext mic, Model model) {
        ParamModel paramModel = (ParamModel) model;
        String value = mic.subst(paramModel.getValue());
        Object target = mic.peekObject();
        PropertySetter setter = new PropertySetter(beanDescriptionCache, target);
        setter.setContext(context);
        setter.setProperty(mic.subst(paramModel.getName()), value);
    }
}
