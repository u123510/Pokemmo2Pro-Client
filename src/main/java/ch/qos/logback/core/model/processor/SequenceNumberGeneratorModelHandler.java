package ch.qos.logback.core.model.processor;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.model.Model;
import ch.qos.logback.core.model.SequenceNumberGeneratorModel;
import ch.qos.logback.core.spi.ContextAware;
import ch.qos.logback.core.spi.SequenceNumberGenerator;
import ch.qos.logback.core.util.OptionHelper;

public class SequenceNumberGeneratorModelHandler extends ModelHandlerBase {
    SequenceNumberGenerator sequenceNumberGenerator;
    private boolean inError;
    public SequenceNumberGeneratorModelHandler(Context context) { super(context); }
    public static ModelHandlerBase makeInstance(Context context, ModelInterpretationContext interpretationContext) { return new SequenceNumberGeneratorModelHandler(context); }
    public Class getSupportedModelClass() { return SequenceNumberGeneratorModel.class; }
    public void handle(ModelInterpretationContext context, Model model) {
        String className = ((SequenceNumberGeneratorModel) model).getClassName();
        if (OptionHelper.isNullOrEmptyOrAllSpaces(className)) { addWarn("Missing className. This should have been caught earlier."); inError = true; return; }
        className = context.getImport(className);
        try {
            addInfo("About to instantiate SequenceNumberGenerator of type [" + className + "]");
            SequenceNumberGenerator generator = (SequenceNumberGenerator) OptionHelper.instantiateByClassName(className, SequenceNumberGenerator.class, getContext());
            this.sequenceNumberGenerator = generator;
            ((ContextAware) generator).setContext(getContext());
            context.pushObject(generator);
        } catch (Exception exception) {
            inError = true;
            addError("Could not create a SequenceNumberGenerator of type [" + className + "].", exception);
            throw new RuntimeException(new ModelHandlerException(exception));
        }
    }
    public void postHandle(ModelInterpretationContext context, Model model) {
        if (inError) return;
        Object top = context.peekObject();
        if (top != sequenceNumberGenerator) { addWarn("The object at the of the stack is not the hook pushed earlier."); return; }
        context.popObject();
        addInfo("Registering " + String.valueOf(top) + " with context.");
        getContext().setSequenceNumberGenerator(sequenceNumberGenerator);
    }
}
