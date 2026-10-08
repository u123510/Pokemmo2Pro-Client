package ch.qos.logback.core.property;

import ch.qos.logback.core.PropertyDefinerBase;
import ch.qos.logback.core.util.Loader;
import ch.qos.logback.core.util.OptionHelper;

public class ResourceExistsPropertyDefiner extends PropertyDefinerBase {
    String resourceStr;

    public ResourceExistsPropertyDefiner() {
    }

    public String getResource() { return resourceStr; }
    public void setResource(String resource) { resourceStr = resource; }

    @Override
    public String getPropertyValue() {
        if (OptionHelper.isNullOrEmptyOrAllSpaces(resourceStr)) {
            addError("The \"resource\" property must be set.");
            return null;
        }
        return booleanAsStr(Loader.getResourceBySelfClassLoader(resourceStr) != null);
    }
}
