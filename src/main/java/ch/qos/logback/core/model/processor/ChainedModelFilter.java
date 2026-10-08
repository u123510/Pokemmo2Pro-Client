package ch.qos.logback.core.model.processor;
import ch.qos.logback.core.model.Model;
import ch.qos.logback.core.spi.FilterReply;
import java.util.ArrayList;
import java.util.List;
public class ChainedModelFilter implements ModelFilter {
    List modelFilters;
    public ChainedModelFilter(){modelFilters=new ArrayList();}
    public static ChainedModelFilter newInstance(){return new ChainedModelFilter();}
    public ChainedModelFilter allow(Class type){modelFilters.add(new AllowModelFilter(type));return this;}
    public ChainedModelFilter deny(Class type){modelFilters.add(new DenyModelFilter(type));return this;}
    public ChainedModelFilter denyAll(){modelFilters.add(new DenyAllModelFilter());return this;}
    public ChainedModelFilter allowAll(){modelFilters.add(new AllowAllModelFilter());return this;}
    public FilterReply decide(Model model){for(Object value:modelFilters){FilterReply reply=((ModelFilter)value).decide(model);if(reply==FilterReply.ACCEPT||reply==FilterReply.DENY)return reply;}return FilterReply.NEUTRAL;}
}
