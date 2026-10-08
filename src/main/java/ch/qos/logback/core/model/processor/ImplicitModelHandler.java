package ch.qos.logback.core.model.processor;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.joran.action.ImcplicitActionDataForBasicProperty;
import ch.qos.logback.core.joran.action.ImplicitModelData;
import ch.qos.logback.core.joran.action.ImplicitModelDataForComplexProperty;
import ch.qos.logback.core.joran.util.PropertySetter;
import ch.qos.logback.core.joran.util.beans.BeanDescriptionCache;
import ch.qos.logback.core.model.ComponentModel;
import ch.qos.logback.core.model.ImplicitModel;
import ch.qos.logback.core.model.Model;
import ch.qos.logback.core.spi.ContextAware;
import ch.qos.logback.core.spi.LifeCycle;
import ch.qos.logback.core.joran.spi.NoAutoStartUtil;
import ch.qos.logback.core.util.AggregationType;
import ch.qos.logback.core.util.Loader;
import ch.qos.logback.core.util.OptionHelper;

public class ImplicitModelHandler extends ModelHandlerBase {
    public static final String IGNORING_UNKNOWN_PROP = "Ignoring unknown property";
    private final BeanDescriptionCache beanDescriptionCache;
    private ImplicitModelData implicitModelData;
    boolean inError;

    public ImplicitModelHandler(Context context, BeanDescriptionCache beanDescriptionCache) {
        super(context);
        this.inError = false;
        this.beanDescriptionCache = beanDescriptionCache;
    }

    public static ImplicitModelHandler makeInstance(Context context, ModelInterpretationContext mic) {
        return new ImplicitModelHandler(context, mic.getBeanDescriptionCache());
    }

    private void postHandleComplex(ModelInterpretationContext mic, Model model,
                                   ImplicitModelDataForComplexProperty data) {
        PropertySetter setter = new PropertySetter(beanDescriptionCache, data.getNestedComplexProperty());
        setter.setContext(context);
        if (setter.computeAggregationType("parent") == AggregationType.AS_COMPLEX_PROPERTY) {
            setter.setComplexProperty("parent", data.parentBean.getObj());
        }
        Object nested = data.getNestedComplexProperty();
        if (NoAutoStartUtil.shouldBeStarted(nested)) {
            ((LifeCycle) nested).start();
        }
        if (mic.peekObject() != nested) {
            addError("The object on the top the of the stack is not the component pushed earlier.");
            return;
        }
        mic.popObject();
        if (data.aggregationType == AggregationType.AS_COMPLEX_PROPERTY) {
            data.parentBean.setComplexProperty(model.getTag(), nested);
        } else if (data.aggregationType == AggregationType.AS_COMPLEX_PROPERTY_COLLECTION) {
            data.parentBean.addComplexProperty(model.getTag(), nested);
        } else {
            addError("Unexpected aggregationType " + data.aggregationType);
        }
    }

    @Override
    public Class<?> getSupportedModelClass() {
        return ImplicitModel.class;
    }

    @Override
    public void handle(ModelInterpretationContext mic, Model model) {
        ImplicitModel implicit = (ImplicitModel) model;
        if (mic.isObjectStackEmpty()) {
            this.inError = true;
            return;
        }
        String propertyName = implicit.getTag();
        Object parent = mic.peekObject();
        PropertySetter setter = new PropertySetter(beanDescriptionCache, parent);
        setter.setContext(context);
        AggregationType aggregationType = setter.computeAggregationType(propertyName);
        switch (aggregationType) {
            case AS_COMPLEX_PROPERTY:
            case AS_COMPLEX_PROPERTY_COLLECTION:
                ImplicitModelDataForComplexProperty complex = new ImplicitModelDataForComplexProperty(setter, aggregationType, propertyName);
                this.implicitModelData = complex;
                doComplex(mic, implicit, complex);
                return;
            case AS_BASIC_PROPERTY:
            case AS_BASIC_PROPERTY_COLLECTION:
                ImcplicitActionDataForBasicProperty basic = new ImcplicitActionDataForBasicProperty(setter, aggregationType, propertyName);
                this.implicitModelData = basic;
                doBasicProperty(mic, model, basic);
                return;
            default:
                addError("PropertySetter.computeAggregationType returned " + aggregationType);
                return;
        }
    }

    public void doBasicProperty(ModelInterpretationContext mic, Model model,
                                ImcplicitActionDataForBasicProperty data) {
        String body = mic.subst(model.getBodyText());
        if (data.aggregationType == AggregationType.AS_BASIC_PROPERTY_COLLECTION) {
            data.parentBean.addBasicProperty(data.propertyName, body);
        } else if (data.aggregationType == AggregationType.AS_BASIC_PROPERTY) {
            data.parentBean.setProperty(data.propertyName, body);
        } else {
            addError("Unexpected aggregationType " + data.aggregationType);
        }
    }

    public void doComplex(ModelInterpretationContext mic, ComponentModel model,
                          ImplicitModelDataForComplexProperty data) {
        String className = mic.getImport(mic.subst(model.getClassName()));
        try {
            Class<?> componentClass;
            if (!OptionHelper.isNullOrEmptyOrAllSpaces(className)) {
                componentClass = Loader.loadClass(className, context);
            } else {
                String propertyName = data.propertyName;
                AggregationType aggregationType = data.getAggregationType();
                componentClass = data.parentBean.getClassNameViaImplicitRules(propertyName, aggregationType,
                        mic.getDefaultNestedComponentRegistry());
            }
            if (componentClass == null) {
                data.inError = true;
                addError("Could not find an appropriate class for property [" + model.getTag() + "]");
                return;
            }
            if (OptionHelper.isNullOrEmptyOrAllSpaces(className)) {
                addInfo("Assuming default type [" + componentClass.getName() + "] for [" + model.getTag() + "] property");
            }
            Object nested = componentClass.getConstructor().newInstance();
            data.setNestedComplexProperty(nested);
            if (nested instanceof ContextAware) {
                ((ContextAware) nested).setContext(context);
            }
            mic.pushObject(nested);
        } catch (Exception ex) {
            data.inError = true;
            addError("Could not create component [" + model.getTag() + "] of type [" + className + "]", ex);
        }
    }

    @Override
    public void postHandle(ModelInterpretationContext mic, Model model) {
        if (this.inError || this.implicitModelData == null || this.implicitModelData.inError) return;
        if (this.implicitModelData instanceof ImplicitModelDataForComplexProperty) {
            postHandleComplex(mic, model, (ImplicitModelDataForComplexProperty) this.implicitModelData);
        }
    }
}
