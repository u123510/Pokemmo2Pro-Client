package ch.qos.logback.core.model.processor;
import ch.qos.logback.core.model.Model;
import ch.qos.logback.core.spi.FilterReply;
public class DenyModelFilter implements ModelFilter { final Class deniedModelType; public DenyModelFilter(Class type){deniedModelType=type;} public FilterReply decide(Model model){return model.getClass()==deniedModelType?FilterReply.DENY:FilterReply.NEUTRAL;} }
