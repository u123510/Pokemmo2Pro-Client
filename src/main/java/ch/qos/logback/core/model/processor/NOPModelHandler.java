package ch.qos.logback.core.model.processor;
import ch.qos.logback.core.Context;
import ch.qos.logback.core.model.Model;
public class NOPModelHandler extends ModelHandlerBase { public NOPModelHandler(Context context){super(context);} public static NOPModelHandler makeInstance(Context context,ModelInterpretationContext mic){return new NOPModelHandler(context);} public void handle(ModelInterpretationContext mic,Model model){} }
