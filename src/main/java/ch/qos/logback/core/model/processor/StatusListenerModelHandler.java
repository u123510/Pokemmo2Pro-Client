package ch.qos.logback.core.model.processor;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.model.Model;
import ch.qos.logback.core.model.StatusListenerModel;
import ch.qos.logback.core.spi.ContextAware;
import ch.qos.logback.core.spi.LifeCycle;
import ch.qos.logback.core.status.StatusListener;
import ch.qos.logback.core.util.OptionHelper;

public class StatusListenerModelHandler extends ModelHandlerBase {
    boolean inError;
    Boolean effectivelyAdded;
    StatusListener statusListener;
    public StatusListenerModelHandler(Context context) { super(context); inError=false; effectivelyAdded=null; statusListener=null; }
    public static ModelHandlerBase makeInstance(Context context, ModelInterpretationContext interpretationContext) { return new StatusListenerModelHandler(context); }
    private boolean isEffectivelyAdded() { return effectivelyAdded != null && effectivelyAdded.booleanValue(); }
    public Class getSupportedModelClass() { return StatusListenerModel.class; }
    public void handle(ModelInterpretationContext context, Model model) {
        StatusListenerModel statusModel=(StatusListenerModel)model;
        String className=statusModel.getClassName();
        if (OptionHelper.isNullOrEmptyOrAllSpaces(className)) { addError("Empty class name for StatusListener"); inError=true; return; }
        try {
            className=context.getImport(className);
            statusListener=(StatusListener)OptionHelper.instantiateByClassName(className, StatusListener.class, getContext());
            effectivelyAdded=Boolean.valueOf(getContext().getStatusManager().add(statusListener));
            if (statusListener instanceof ContextAware) ((ContextAware)statusListener).setContext(getContext());
            addInfo("Added status listener of type ["+statusModel.getClassName()+"]");
            context.pushObject(statusListener);
        } catch (Exception exception) {
            inError=true;
            addError("Could not create an StatusListener of type ["+statusModel.getClassName()+"].", exception);
        }
    }
    public void postHandle(ModelInterpretationContext context, Model model) {
        if (inError) return;
        if (isEffectivelyAdded() && statusListener instanceof LifeCycle) ((LifeCycle)statusListener).start();
        if (context.peekObject()!=statusListener) { addWarn("The object at the of the stack is not the statusListener pushed earlier."); return; }
        context.popObject();
    }
}
