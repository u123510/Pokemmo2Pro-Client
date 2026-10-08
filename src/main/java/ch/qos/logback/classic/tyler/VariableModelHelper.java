package ch.qos.logback.classic.tyler;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.joran.action.ActionUtil;
import ch.qos.logback.core.model.PropertyModel;
import ch.qos.logback.core.model.util.PropertyModelHandlerHelper;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.util.ContextUtil;
import ch.qos.logback.core.util.Loader;
import ch.qos.logback.core.util.OptionHelper;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

public class VariableModelHelper extends ContextAwareBase {
    private final TylerConfiguratorBase tylerConfiguratorBase;
    private final ch.qos.logback.core.model.util.VariableSubstitutionsHelper variableSubstitutionsHelper;

    public VariableModelHelper(Context context, TylerConfiguratorBase tylerConfiguratorBase) {
        super(tylerConfiguratorBase);
        this.context = context;
        this.tylerConfiguratorBase = tylerConfiguratorBase;
        this.variableSubstitutionsHelper = new ch.qos.logback.core.model.util.VariableSubstitutionsHelper(context);
    }

    public void updateProperties(PropertyModel model) {
        ActionUtil.Scope scope = ActionUtil.stringToScope(model.getScopeStr());
        if (PropertyModelHandlerHelper.checkFileAttributeSanity(model)) {
            String file = tylerConfiguratorBase.subst(model.getFile());
            try (InputStream input = new FileInputStream(file)) {
                loadAndSetProperties(input, scope);
            } catch (java.io.FileNotFoundException ex) {
                addError("Could not find properties file [" + file + "].", ex);
            } catch (IOException | IllegalArgumentException ex) {
                addError("Could not read properties file [" + file + "].", ex);
            }
            return;
        }
        if (PropertyModelHandlerHelper.checkResourceAttributeSanity(model)) {
            String resource = tylerConfiguratorBase.subst(model.getResource());
            URL url = Loader.getResourceBySelfClassLoader(resource);
            if (url == null) {
                addError("Could not find resource [" + resource + "].");
                return;
            }
            try (InputStream input = url.openStream()) {
                loadAndSetProperties(input, scope);
            } catch (IOException ex) {
                addError("Could not read resource file [" + resource + "].", ex);
            }
            return;
        }
        if (PropertyModelHandlerHelper.checkValueNameAttributesSanity(model)) {
            String value = tylerConfiguratorBase.subst(model.getValue().trim());
            setProperty(model.getName(), value, scope);
            return;
        }
        addError("In <property> element, either the \"file\" attribute alone, or the \"resource\" element alone, or both the \"name\" and \"value\" attributes must be set.");
    }

    public void loadAndSetProperties(InputStream input, ActionUtil.Scope scope) throws IOException {
        Properties properties = new Properties();
        properties.load(input);
        setProperties(properties, scope);
    }

    public void setProperties(Properties properties, ActionUtil.Scope scope) {
        switch (scope) {
            case LOCAL -> variableSubstitutionsHelper.addSubstitutionProperties(properties);
            case CONTEXT -> new ContextUtil(getContext()).addProperties(properties);
            case SYSTEM -> OptionHelper.setSystemProperties(this, properties);
        }
    }

    public void setProperty(String name, String value, ActionUtil.Scope scope) {
        switch (scope) {
            case LOCAL -> variableSubstitutionsHelper.addSubstitutionProperty(name, value);
            case CONTEXT -> getContext().putProperty(name, value);
            case SYSTEM -> OptionHelper.setSystemProperty(this, name, value);
        }
    }
}
