package ch.qos.logback.core.model.processor;

import java.util.Map;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.boolex.EventEvaluator;
import ch.qos.logback.core.joran.spi.DefaultNestedComponentRegistry;
import ch.qos.logback.core.model.EventEvaluatorModel;
import ch.qos.logback.core.model.Model;
import ch.qos.logback.core.spi.ContextAware;
import ch.qos.logback.core.spi.LifeCycle;
import ch.qos.logback.core.util.OptionHelper;

public class EventEvaluatorModelHandler extends ModelHandlerBase {
    EventEvaluator<?> evaluator;
    boolean inError;

    public EventEvaluatorModelHandler(Context context) {
        super(context);
        this.inError = false;
    }

    public static ModelHandlerBase makeInstance(Context context, ModelInterpretationContext mic) {
        return new EventEvaluatorModelHandler(context);
    }

    private String defaultClassName(ModelInterpretationContext mic, EventEvaluatorModel model) {
        DefaultNestedComponentRegistry registry = mic.getDefaultNestedComponentRegistry();
        return registry.findDefaultComponentTypeByTag(model.getTag());
    }

    @Override
    public Class<?> getSupportedModelClass() {
        return EventEvaluatorModel.class;
    }

    @Override
    public void handle(ModelInterpretationContext mic, Model model) {
        EventEvaluatorModel evaluatorModel = (EventEvaluatorModel) model;
        String className = evaluatorModel.getClassName();
        if (OptionHelper.isNullOrEmptyOrAllSpaces(className)) {
            className = defaultClassName(mic, evaluatorModel);
            if (OptionHelper.isNullOrEmptyOrAllSpaces(className)) {
                this.inError = true;
                addError("Mandatory \"class\" attribute missing for <evaluator>");
                addError("No default classname could be found.");
                return;
            }
            addInfo("Assuming default evaluator class [" + className + "]");
        } else {
            className = mic.getImport(className);
        }
        String name = mic.subst(evaluatorModel.getName());
        try {
            @SuppressWarnings("unchecked")
            Class<? extends EventEvaluator<?>> type = (Class<? extends EventEvaluator<?>>) Class.forName(className);
            this.evaluator = (EventEvaluator<?>) OptionHelper.instantiateByClassName(className, type, context);
            ((ContextAware) this.evaluator).setContext(context);
            this.evaluator.setName(name);
            mic.pushObject(this.evaluator);
        } catch (Exception ex) {
            this.inError = true;
            addError("Could not create evaluator of type " + className + "].", ex);
        }
    }

    @Override
    public void postHandle(ModelInterpretationContext mic, Model model) {
        if (this.inError) return;
        if (this.evaluator instanceof LifeCycle) {
            ((LifeCycle) this.evaluator).start();
            addInfo("Starting evaluator named [" + this.evaluator.getName() + "]");
        }
        if (mic.peekObject() != this.evaluator) {
            addWarn("The object on the top the of the stack is not the evaluator pushed earlier.");
            return;
        }
        mic.popObject();
        try {
            @SuppressWarnings("unchecked")
            Map<String, EventEvaluator<?>> map = (Map<String, EventEvaluator<?>>) context.getObject("EVALUATOR_MAP");
            if (map == null) {
                addError("Could not find EvaluatorMap");
                return;
            }
            map.put(this.evaluator.getName(), this.evaluator);
        } catch (Exception ex) {
            addError("Could not set evaluator named [" + this.evaluator + "].", ex);
        }
    }
}
