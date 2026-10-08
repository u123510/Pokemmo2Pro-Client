package ch.qos.logback.core.model.processor;
import ch.qos.logback.core.model.Model;
import ch.qos.logback.core.spi.FilterReply;
public class AllowAllModelFilter implements ModelFilter { public AllowAllModelFilter(){} public FilterReply decide(Model model){return FilterReply.ACCEPT;} }
