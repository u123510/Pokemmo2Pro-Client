package ch.qos.logback.core.joran.conditional;

import ch.qos.logback.core.spi.PropertyContainer;
import ch.qos.logback.core.util.OptionHelper;

public class PropertyWrapperForScripts {
    PropertyContainer local;
    PropertyContainer context;

    public PropertyWrapperForScripts() {
        super();
    }

    public void setPropertyContainers(PropertyContainer local, PropertyContainer context) {
        this.local = local;
        this.context = context;
    }

    public boolean isNull(String key) {
        return OptionHelper.propertyLookup(key, local, context) == null;
    }

    public boolean isDefined(String key) {
        return OptionHelper.propertyLookup(key, local, context) != null;
    }

    public String p(String key) {
        return property(key);
    }

    public String property(String key) {
        String value = OptionHelper.propertyLookup(key, local, context);
        return value == null ? "" : value;
    }
}
