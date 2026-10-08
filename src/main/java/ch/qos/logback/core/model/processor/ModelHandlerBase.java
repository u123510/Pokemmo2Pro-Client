package ch.qos.logback.core.model.processor;
import ch.qos.logback.core.Context;
import ch.qos.logback.core.model.Model;
import ch.qos.logback.core.spi.ContextAwareBase;
public abstract class ModelHandlerBase extends ContextAwareBase {
    protected ModelHandlerBase(){ }
    public ModelHandlerBase(Context context){setContext(context);}
    public Class getSupportedModelClass(){return Model.class;}
    public boolean isSupportedModelType(Model model){Class type=getSupportedModelClass();if(type.isInstance(model))return true;addError("This handler can only handle models of type ["+type+"]");return false;}
    public abstract void handle(ModelInterpretationContext context,Model model) throws ModelHandlerException;
    public void postHandle(ModelInterpretationContext context,Model model) throws ModelHandlerException{}
    public String toString(){return getClass().getName();}
}
