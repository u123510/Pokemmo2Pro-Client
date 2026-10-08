package ch.qos.logback.core.model.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Map;
import java.util.Properties;

import ch.qos.logback.core.joran.action.ActionUtil;
import ch.qos.logback.core.model.PropertyModel;
import ch.qos.logback.core.spi.ContextAware;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.spi.ContextAwarePropertyContainer;
import ch.qos.logback.core.util.ContextUtil;
import ch.qos.logback.core.util.Loader;
import ch.qos.logback.core.util.OptionHelper;

public class PropertyModelHandlerHelper extends ContextAwareBase {
    public static final String HANDLE_PROPERTY_MODEL_METHOD_NAME = "handlePropertyModel";

    public PropertyModelHandlerHelper(ContextAware contextAware) {
        super(contextAware);
    }

    public static boolean checkFileAttributeSanity(PropertyModel model) {
        return !OptionHelper.isNullOrEmptyOrAllSpaces(model.getFile())
                && OptionHelper.isNullOrEmptyOrAllSpaces(model.getName())
                && OptionHelper.isNullOrEmptyOrAllSpaces(model.getValue())
                && OptionHelper.isNullOrEmptyOrAllSpaces(model.getResource());
    }

    public static boolean checkResourceAttributeSanity(PropertyModel model) {
        return !OptionHelper.isNullOrEmptyOrAllSpaces(model.getResource())
                && OptionHelper.isNullOrEmptyOrAllSpaces(model.getName())
                && OptionHelper.isNullOrEmptyOrAllSpaces(model.getValue())
                && OptionHelper.isNullOrEmptyOrAllSpaces(model.getFile());
    }

    public static boolean checkValueNameAttributesSanity(PropertyModel model) {
        return !OptionHelper.isNullOrEmptyOrAllSpaces(model.getName())
                && !OptionHelper.isNullOrEmptyOrAllSpaces(model.getValue())
                && OptionHelper.isNullOrEmptyOrAllSpaces(model.getFile())
                && OptionHelper.isNullOrEmptyOrAllSpaces(model.getResource());
    }

    public static void setProperty(ContextAwarePropertyContainer container, String key, String value, ActionUtil.Scope scope) {
        switch (scope) {
            case SYSTEM:
                OptionHelper.setSystemProperty(container, key, value);
                break;
            case CONTEXT:
                container.getContext().putProperty(key, value);
                break;
            case LOCAL:
                container.addSubstitutionProperty(key, value);
                break;
            default:
                break;
        }
    }

    public static void setProperties(ContextAwarePropertyContainer container, Properties properties, ActionUtil.Scope scope) {
        switch (scope) {
            case SYSTEM:
                OptionHelper.setSystemProperties(container, properties);
                break;
            case CONTEXT:
                new ContextUtil(container.getContext()).addProperties(properties);
                break;
            case LOCAL:
                container.addSubstitutionProperties(properties);
                break;
            default:
                break;
        }
    }

    public static void loadAndSetProperties(ContextAwarePropertyContainer container, InputStream input, ActionUtil.Scope scope) throws IOException {
        Properties properties = new Properties();
        properties.load(input);
        setProperties(container, properties, scope);
    }

    public void handlePropertyModel(ContextAwarePropertyContainer container, String name, String value,
                                    String file, String resource, String scopeStr) {
        PropertyModel model = new PropertyModel();
        model.setName(name);
        model.setValue(value);
        model.setFile(file);
        model.setResource(resource);
        model.setScopeStr(scopeStr);
        handlePropertyModel(container, model);
    }

    public void handlePropertyModel(ContextAwarePropertyContainer container, PropertyModel model) {
        ActionUtil.Scope scope = ActionUtil.stringToScope(model.getScopeStr());
        if (checkFileAttributeSanity(model)) {
            String file = container.subst(model.getFile());
            try (FileInputStream input = new FileInputStream(file)) {
                loadAndSetProperties(container, input, scope);
            } catch (FileNotFoundException ex) {
                addError("Could not find properties file [" + file + "].", ex);
            } catch (IOException | IllegalArgumentException ex) {
                addError("Could not read properties file [" + file + "].", ex);
            }
            return;
        }
        if (checkResourceAttributeSanity(model)) {
            String resource = container.subst(model.getResource());
            URL url = Loader.getResourceBySelfClassLoader(resource);
            if (url == null) {
                addError("Could not find resource [" + resource + "].");
                return;
            }
            try (InputStream input = url.openStream()) {
                loadAndSetProperties(container, input, scope);
            } catch (IOException | IllegalArgumentException ex) {
                addError("Could not read resource file [" + resource + "].", ex);
            }
            return;
        }
        if (checkValueNameAttributesSanity(model)) {
            String value = container.subst(model.getValue().trim());
            ActionUtil.setProperty(container, model.getName(), value, scope);
            return;
        }
        addError("In <property> element, either the \"file\" attribute alone, or the \"resource\" element alone, or both the \"name\" and \"value\" attributes must be set.");
    }
}
