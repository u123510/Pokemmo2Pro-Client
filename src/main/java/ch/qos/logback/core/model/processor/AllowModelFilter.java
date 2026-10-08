package ch.qos.logback.core.model.processor;
import ch.qos.logback.core.model.Model;
import ch.qos.logback.core.spi.FilterReply;
public class AllowModelFilter implements ModelFilter { final Class allowedModelType; public AllowModelFilter(Class type){allowedModelType=type;} public FilterReply decide(Model model){return model.getClass()==allowedModelType?FilterReply.ACCEPT:FilterReply.NEUTRAL;} }
