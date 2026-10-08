package ch.qos.logback.core.model.processor;

import javax.naming.Context;
import javax.naming.NamingException;

import ch.qos.logback.core.model.InsertFromJNDIModel;
import ch.qos.logback.core.model.Model;
import ch.qos.logback.core.joran.action.ActionUtil;
import ch.qos.logback.core.util.JNDIUtil;
import ch.qos.logback.core.util.OptionHelper;

public class InsertFromJNDIModelHandler extends ModelHandlerBase {
    public InsertFromJNDIModelHandler(ch.qos.logback.core.Context context) {
        super(context);
    }

    public static ModelHandlerBase makeInstance(ch.qos.logback.core.Context context, ModelInterpretationContext mic) {
        return new InsertFromJNDIModelHandler(context);
    }

    @Override
    public Class<?> getSupportedModelClass() {
        return InsertFromJNDIModel.class;
    }

    @Override
    public void handle(ModelInterpretationContext mic, Model model) {
        InsertFromJNDIModel m = (InsertFromJNDIModel) model;
        String envEntryName = mic.subst(m.getEnvEntryName());
        String as = mic.subst(m.getAs());
        ActionUtil.Scope scope = ActionUtil.stringToScope(mic.subst(m.getScopeStr()));
        int errors = 0;
        if (OptionHelper.isNullOrEmptyOrAllSpaces(envEntryName)) {
            addError("[env-entry-name] missing");
            errors = 1;
        }
        if (OptionHelper.isNullOrEmptyOrAllSpaces(as)) {
            addError("[as] missing");
            errors++;
        }
        if (errors != 0) {
            return;
        }
        try {
            Context initialContext = JNDIUtil.getInitialContext();
            String value = JNDIUtil.lookupString(initialContext, envEntryName);
            if (OptionHelper.isNullOrEmptyOrAllSpaces(value)) {
                addError("[" + envEntryName + "] has null or empty value");
            } else {
                addInfo("Setting variable [" + as + "] to [" + value + "] in " + scope + " scope");
                ch.qos.logback.core.model.util.PropertyModelHandlerHelper.setProperty(mic, as, value, scope);
            }
        } catch (NamingException ex) {
            addError("Failed to lookup JNDI env-entry [" + envEntryName + "]");
        }
    }
}
