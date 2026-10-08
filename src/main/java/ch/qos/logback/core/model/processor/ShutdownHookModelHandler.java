package ch.qos.logback.core.model.processor;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.hook.ShutdownHook;
import ch.qos.logback.core.hook.ShutdownHookBase;
import ch.qos.logback.core.hook.DefaultShutdownHook;
import ch.qos.logback.core.model.Model;
import ch.qos.logback.core.model.ShutdownHookModel;
import ch.qos.logback.core.util.OptionHelper;

public class ShutdownHookModelHandler extends ModelHandlerBase {
    static final String OLD_SHUTDOWN_HOOK_CLASSNAME = "ch.qos.logback.core.hook.DelayingShutdownHook";
    static final String DEFAULT_SHUTDOWN_HOOK_CLASSNAME = DefaultShutdownHook.class.getName();
    public static final String RENAME_WARNING = OLD_SHUTDOWN_HOOK_CLASSNAME + " was renamed as " + DEFAULT_SHUTDOWN_HOOK_CLASSNAME;
    boolean inError;
    ShutdownHook hook;
    public ShutdownHookModelHandler(Context context) { super(context); inError=false; hook=null; }
    public static ModelHandlerBase makeInstance(Context context, ModelInterpretationContext interpretationContext) { return new ShutdownHookModelHandler(context); }
    public Class getSupportedModelClass() { return ShutdownHookModel.class; }
    public void handle(ModelInterpretationContext context, Model model) {
        String className = ((ShutdownHookModel) model).getClassName();
        if (OptionHelper.isNullOrEmptyOrAllSpaces(className)) { className=DEFAULT_SHUTDOWN_HOOK_CLASSNAME; addInfo("Assuming className ["+className+"]"); }
        else { className=context.getImport(className); if (OLD_SHUTDOWN_HOOK_CLASSNAME.equals(className)) { className=DEFAULT_SHUTDOWN_HOOK_CLASSNAME; addWarn(RENAME_WARNING); addWarn("Please use the new class name"); } }
        try {
            addInfo("About to instantiate shutdown hook of type ["+className+"]");
            hook=(ShutdownHookBase)OptionHelper.instantiateByClassName(className, ShutdownHookBase.class, getContext());
            hook.setContext(getContext());
            context.pushObject(hook);
        } catch (Exception exception) {
            addError("Could not create a shutdown hook of type ["+className+"].", exception); inError=true;
        }
    }
    public void postHandle(ModelInterpretationContext context, Model model) {
        if (inError) return;
        if (context.peekObject()!=hook) { addWarn("The object on the top the of the stack is not the hook object pushed earlier."); return; }
        Thread thread=new Thread(hook, "Logback shutdown hook ["+getContext().getName()+"]");
        addInfo("Registering shutdown hook with JVM runtime.");
        getContext().putObject("SHUTDOWN_HOOK", thread);
        Runtime.getRuntime().addShutdownHook(thread);
        context.popObject();
    }
}
