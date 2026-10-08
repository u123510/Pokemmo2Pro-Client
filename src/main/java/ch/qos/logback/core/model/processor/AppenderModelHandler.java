package ch.qos.logback.core.model.processor;

import java.util.Map;

import ch.qos.logback.core.Appender;
import ch.qos.logback.core.Context;
import ch.qos.logback.core.spi.LifeCycle;
import ch.qos.logback.core.model.AppenderModel;
import ch.qos.logback.core.model.Model;
import ch.qos.logback.core.spi.AppenderAttachable;
import ch.qos.logback.core.spi.ContextAware;
import ch.qos.logback.core.util.OptionHelper;

public class AppenderModelHandler extends ModelHandlerBase {
    public Appender<?> appender;
    private boolean inError;
    private boolean skipped;
    public AppenderAttachable<?> appenderAttachable;

    public AppenderModelHandler(Context context) {
        super(context);
        this.inError = false;
        this.skipped = false;
    }

    public static ModelHandlerBase makeInstance(Context context, ModelInterpretationContext mic) {
        return new AppenderModelHandler(context);
    }

    @Override
    public void handle(ModelInterpretationContext mic, Model model) throws ModelHandlerException {
        this.appender = null;
        this.inError = false;
        AppenderModel appenderModel = (AppenderModel) model;
        String name = mic.subst(appenderModel.getName());
        if (!mic.hasDependers(name)) {
            addWarn("Appender named [" + name + "] not referenced. Skipping further processing.");
            this.skipped = true;
            model.markAsSkipped();
            return;
        }
        addInfo("Processing appender named [" + name + "]");
        String className = mic.getImport(appenderModel.getClassName());
        try {
            addInfo("About to instantiate appender of type [" + className + "]");
            @SuppressWarnings("unchecked")
            Class<? extends Appender<?>> appenderClass = (Class<? extends Appender<?>>) Class.forName(className);
            this.appender = (Appender<?>) OptionHelper.instantiateByClassName(className, appenderClass, context);
            ((ContextAware) this.appender).setContext(context);
            this.appender.setName(name);
            mic.pushObject(this.appender);
        } catch (Exception ex) {
            this.inError = true;
            addError("Could not create an Appender of type [" + className + "].", ex);
            throw new ModelHandlerException(ex);
        }
    }

    @Override
    public void postHandle(ModelInterpretationContext mic, Model model) {
        if (this.inError || this.skipped) return;
        Appender<?> current = this.appender;
        if (current instanceof LifeCycle) {
            ((LifeCycle) current).start();
        }
        String name = current.getName();
        mic.markStartOfNamedDependee(name);
        Object top = mic.peekObject();
        @SuppressWarnings("unchecked")
        Map<String, Appender<?>> bag = (Map<String, Appender<?>>) mic.getObjectMap().get("APPENDER_BAG");
        bag.put(name, current);
        if (current != top) {
            addWarn("The object at the of the stack is not the appender named [" + ((Appender<?>) top).getName() + "] pushed earlier.");
        } else {
            mic.popObject();
        }
    }
}
