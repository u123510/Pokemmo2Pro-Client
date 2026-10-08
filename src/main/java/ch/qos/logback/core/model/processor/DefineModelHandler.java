package ch.qos.logback.core.model.processor;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.joran.action.ActionUtil;
import ch.qos.logback.core.model.DefineModel;
import ch.qos.logback.core.model.Model;
import ch.qos.logback.core.spi.ContextAware;
import ch.qos.logback.core.spi.LifeCycle;
import ch.qos.logback.core.spi.PropertyDefiner;
import ch.qos.logback.core.util.OptionHelper;

public class DefineModelHandler extends ModelHandlerBase {
    boolean inError;
    PropertyDefiner definer;
    String propertyName;
    ActionUtil.Scope scope;

    public DefineModelHandler(Context context) {
        super(context);
    }

    public static DefineModelHandler makeInstance(Context context, ModelInterpretationContext mic) {
        return new DefineModelHandler(context);
    }

    @Override
    public Class<?> getSupportedModelClass() {
        return DefineModel.class;
    }

    @Override
    public void handle(ModelInterpretationContext mic, Model model) throws ModelHandlerException {
        this.definer = null;
        this.inError = false;
        this.propertyName = null;
        DefineModel define = (DefineModel) model;
        this.propertyName = define.getName();
        this.scope = ActionUtil.stringToScope(define.getScopeStr());
        if (OptionHelper.isNullOrEmptyOrAllSpaces(this.propertyName)) {
            addError("Missing property name for property definer. Near [" + model.getTag() + "] line " + model.getLineNumber());
            this.inError = true;
        }
        String className = define.getClassName();
        if (OptionHelper.isNullOrEmptyOrAllSpaces(className)) {
            addError("Missing class name for property definer. Near [" + model.getTag() + "] line " + model.getLineNumber());
            this.inError = true;
        } else {
            className = mic.getImport(className);
        }
        if (this.inError) return;
        try {
            addInfo("About to instantiate property definer of type [" + className + "]");
            @SuppressWarnings("unchecked")
            Class<? extends PropertyDefiner> type = (Class<? extends PropertyDefiner>) Class.forName(className);
            this.definer = (PropertyDefiner) OptionHelper.instantiateByClassName(className, type, context);
            ((ContextAware) this.definer).setContext(context);
            mic.pushObject(this.definer);
        } catch (Exception ex) {
            this.inError = true;
            addError("Could not create an PropertyDefiner of type [" + className + "].", ex);
            throw new ModelHandlerException(ex);
        }
    }

    @Override
    public void postHandle(ModelInterpretationContext mic, Model model) {
        if (this.inError) return;
        if (mic.peekObject() != this.definer) {
            addWarn("The object at the of the stack is not the property definer for property named [" + this.propertyName + "] pushed earlier.");
            return;
        }
        mic.popObject();
        if (this.definer instanceof LifeCycle) {
            ((LifeCycle) this.definer).start();
        }
        String value = this.definer.getPropertyValue();
        if (value != null) {
            addInfo("Setting property " + this.propertyName + "=" + value + " in scope " + this.scope);
            ActionUtil.setProperty(mic, this.propertyName, value, this.scope);
        }
    }
}
