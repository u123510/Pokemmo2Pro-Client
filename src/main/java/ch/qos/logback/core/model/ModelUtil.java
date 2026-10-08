package ch.qos.logback.core.model;
import ch.qos.logback.core.joran.action.ActionUtil;
import ch.qos.logback.core.model.processor.ModelInterpretationContext;
import java.util.Properties;
public class ModelUtil {
    public ModelUtil(){}
    public static void resetForReuse(Model model){if(model!=null)model.resetForReuse();}
    @Deprecated public static void setProperty(ModelInterpretationContext context,String key,String value,ActionUtil.Scope scope){ch.qos.logback.core.model.util.PropertyModelHandlerHelper.setProperty(context,key,value,scope);}
    @Deprecated public static void setProperties(ModelInterpretationContext context,Properties properties,ActionUtil.Scope scope){ch.qos.logback.core.model.util.PropertyModelHandlerHelper.setProperties(context,properties,scope);}
}
