package ch.qos.logback.core.model.processor;
import ch.qos.logback.core.Context;
import ch.qos.logback.core.model.AppenderRefModel;
import ch.qos.logback.core.model.Model;
@PhaseIndicator(phase=ProcessingPhase.DEPENDENCY_ANALYSIS)
public class AppenderRefDependencyAnalyser extends ModelHandlerBase {
    public AppenderRefDependencyAnalyser(Context context){super(context);}
    public Class getSupportedModelClass(){return AppenderRefModel.class;}
    public void handle(ModelInterpretationContext context,Model model){AppenderRefModel ref=(AppenderRefModel)model;String name=context.subst(ref.getRef());Model depender=null;if(!context.isModelStackEmpty())depender=context.peekModel();context.addDependencyDefinition(new DependencyDefinition(depender,name));}
}
