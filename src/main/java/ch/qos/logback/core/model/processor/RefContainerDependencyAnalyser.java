package ch.qos.logback.core.model.processor;
import ch.qos.logback.core.Context;
import ch.qos.logback.core.model.Model;
@PhaseIndicator(phase=ProcessingPhase.DEPENDENCY_ANALYSIS)
public class RefContainerDependencyAnalyser extends ModelHandlerBase {
    final Class modelClass;
    public RefContainerDependencyAnalyser(Context context,Class modelClass){super(context);this.modelClass=modelClass;}
    public boolean isSupportedModelType(Model model){if(modelClass.isInstance(model))return true;addError("This handler can only handle models of type "+modelClass.getName());return false;}
    public void handle(ModelInterpretationContext context,Model model){context.pushModel(model);}
    public void postHandle(ModelInterpretationContext context,Model model){Model popped=context.popModel();if(popped!=model)addError("Popped model ["+String.valueOf(popped)+"] different than expected ["+String.valueOf(model)+"]");}
}
