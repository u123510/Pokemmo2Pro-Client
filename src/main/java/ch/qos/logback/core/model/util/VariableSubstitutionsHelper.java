package ch.qos.logback.core.model.util;

import java.util.HashMap;
import java.util.Map;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.spi.ScanException;
import ch.qos.logback.core.util.OptionHelper;

public class VariableSubstitutionsHelper extends ContextAwareBase implements ch.qos.logback.core.spi.ContextAwarePropertyContainer {
    protected Map<String, String> propertiesMap;

    public VariableSubstitutionsHelper(Context context) {
        super();
        setContext(context);
        this.propertiesMap = new HashMap<>();
    }

    public VariableSubstitutionsHelper(Context context, Map<String, String> propertiesMap) {
        super();
        setContext(context);
        this.propertiesMap = new HashMap<>(propertiesMap);
    }

    @Override
    public String subst(String value) {
        if (value == null) return null;
        try {
            return OptionHelper.substVars(value, this, context);
        } catch (IllegalArgumentException | ScanException ex) {
            addError("Problem while parsing [" + value + "]", ex);
            return null;
        }
    }

    @Override
    public void addSubstitutionProperty(String key, String value) {
        if (key == null || value == null) return;
        propertiesMap.put(key, value.trim());
    }

    @Override
    public String getProperty(String key) {
        return propertiesMap.get(key);
    }

    @Override
    public Map<String, String> getCopyOfPropertyMap() {
        return new HashMap<>(propertiesMap);
    }
}
