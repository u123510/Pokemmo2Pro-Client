package ch.qos.logback.core.joran.util;

import java.lang.reflect.Method;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.joran.spi.DefaultNestedComponentRegistry;
import ch.qos.logback.core.joran.util.beans.BeanDescription;
import ch.qos.logback.core.joran.util.beans.BeanDescriptionCache;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.util.AggregationType;
import ch.qos.logback.core.util.PropertySetterException;
import ch.qos.logback.core.util.StringUtil;

public class PropertySetter extends ContextAwareBase {
    protected final Object obj;
    protected final Class<?> objClass;
    protected final BeanDescription beanDescription;
    protected final AggregationAssessor aggregationAssessor;

    public PropertySetter(BeanDescriptionCache beanDescriptionCache, Object obj) {
        this.obj = obj;
        this.objClass = obj.getClass();
        this.beanDescription = beanDescriptionCache.getBeanDescription(objClass);
        this.aggregationAssessor = new AggregationAssessor(beanDescriptionCache, objClass);
    }

    private void setProperty(Method method, String value) throws PropertySetterException {
        Class<?>[] parameterTypes = method.getParameterTypes();
        try {
            Object converted = StringToObjectConverter.convertArg(this, value, parameterTypes[0]);
            if (converted == null) {
                throw new PropertySetterException("Conversion to type [" + String.valueOf(parameterTypes[0]) + "] failed.");
            }
            Object[] args = new Object[] { converted };
            method.invoke(obj, args);
        } catch (PropertySetterException e) {
            throw e;
        } catch (Exception e) {
            throw new PropertySetterException(e);
        } catch (Throwable t) {
            throw new PropertySetterException("Conversion to type [" + String.valueOf(parameterTypes[0]) + "] failed. ", t);
        }
    }

    private boolean isSanityCheckSuccessful(String name, Method method, Class<?>[] parameterTypes, Object value) {
        Class<?> valueClass = value.getClass();
        if (parameterTypes.length != 1) {
            addError("Wrong number of parameters in setter method for property [" + name + "] in " + obj.getClass().getName());
            return false;
        }
        if (!parameterTypes[0].isAssignableFrom(valueClass)) {
            addError("A \"" + valueClass.getName() + "\" object is not assignable to a \"" + parameterTypes[0].getName() + "\" variable.");
            addError("The class \"" + parameterTypes[0].getName() + "\" was loaded by [" + String.valueOf(parameterTypes[0].getClassLoader()) + "] whereas object of type \"" + valueClass.getName() + "\" was loaded by [" + String.valueOf(valueClass.getClassLoader()) + "].");
            return false;
        }
        return true;
    }

    public void setContext(Context context) {
        super.setContext(context);
        aggregationAssessor.setContext(context);
    }

    public void setProperty(String name, String value) {
        if (value == null) {
            return;
        }
        Method setter = aggregationAssessor.findSetterMethod(name);
        if (setter == null) {
            addWarn("No setter for property [" + name + "] in " + objClass.getName() + ".");
            return;
        }
        try {
            setProperty(setter, value);
        } catch (PropertySetterException ex) {
            addWarn("Failed to set property [" + name + "] to value \"" + value + "\". ", ex);
        }
    }

    public AggregationType computeAggregationType(String name) {
        return aggregationAssessor.computeAggregationType(name);
    }

    public Class<?> getObjClass() {
        return objClass;
    }

    public void addComplexProperty(String name, Object value) {
        Method adder = aggregationAssessor.findAdderMethod(name);
        if (adder == null) {
            addError("Could not find method [add" + name + "] in class [" + objClass.getName() + "].");
            return;
        }
        if (!isSanityCheckSuccessful(name, adder, adder.getParameterTypes(), value)) {
            return;
        }
        invokeMethodWithSingleParameterOnThisObject(adder, value);
    }

    public void invokeMethodWithSingleParameterOnThisObject(Method method, Object value) {
        Class<?> valueClass = value.getClass();
        try {
            Object[] args = new Object[] { value };
            method.invoke(obj, args);
        } catch (Exception e) {
            addError("Could not invoke method " + method.getName() + " in class " + obj.getClass().getName() + " with parameter of type " + valueClass.getName(), e);
        }
    }

    public void addBasicProperty(String name, String value) {
        if (value == null) {
            return;
        }
        String capitalized = StringUtil.capitalizeFirstLetter(name);
        Method adder = aggregationAssessor.findAdderMethod(capitalized);
        if (adder == null) {
            addError("No adder for property [" + capitalized + "].");
            return;
        }
        Class<?>[] parameterTypes = adder.getParameterTypes();
        isSanityCheckSuccessful(capitalized, adder, parameterTypes, value);
        try {
            Object converted = StringToObjectConverter.convertArg(this, value, parameterTypes[0]);
            if (converted != null) {
                invokeMethodWithSingleParameterOnThisObject(adder, converted);
            }
        } catch (Throwable t) {
            addError("Conversion to type [" + String.valueOf(parameterTypes[0]) + "] failed. ", t);
        }
    }

    public void setComplexProperty(String name, Object value) {
        Method setter = aggregationAssessor.findSetterMethod(name);
        if (setter == null) {
            addWarn("Not setter method for property [" + name + "] in " + obj.getClass().getName());
            return;
        }
        if (!isSanityCheckSuccessful(name, setter, setter.getParameterTypes(), value)) {
            return;
        }
        try {
            invokeMethodWithSingleParameterOnThisObject(setter, value);
        } catch (Exception e) {
            addError("Could not set component " + String.valueOf(value) + " for parent component " + String.valueOf(obj), e);
        }
    }

    public Object getObj() {
        return obj;
    }

    public Class<?> getClassNameViaImplicitRules(String name, AggregationType aggregationType, DefaultNestedComponentRegistry registry) {
        return aggregationAssessor.getClassNameViaImplicitRules(name, aggregationType, registry);
    }
}
