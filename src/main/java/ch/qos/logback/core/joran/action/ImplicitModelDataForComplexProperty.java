package ch.qos.logback.core.joran.action;

import ch.qos.logback.core.joran.util.PropertySetter;
import ch.qos.logback.core.util.AggregationType;

public class ImplicitModelDataForComplexProperty extends ImplicitModelData {
    private Object nestedComplexProperty;

    public ImplicitModelDataForComplexProperty(PropertySetter parentBean, AggregationType aggregationType, String propertyName) {
        super(parentBean, aggregationType, propertyName);
    }

    public Object getNestedComplexProperty() {
        return this.nestedComplexProperty;
    }

    public void setNestedComplexProperty(Object nestedComplexProperty) {
        this.nestedComplexProperty = nestedComplexProperty;
    }
}
