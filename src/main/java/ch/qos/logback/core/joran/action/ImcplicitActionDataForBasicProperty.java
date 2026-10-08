package ch.qos.logback.core.joran.action;

import ch.qos.logback.core.joran.util.PropertySetter;
import ch.qos.logback.core.util.AggregationType;

public class ImcplicitActionDataForBasicProperty extends ImplicitModelData {
    public ImcplicitActionDataForBasicProperty(PropertySetter parentBean, AggregationType aggregationType, String propertyName) {
        super(parentBean, aggregationType, propertyName);
    }
}
