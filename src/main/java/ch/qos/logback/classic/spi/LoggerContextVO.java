package ch.qos.logback.classic.spi;

import ch.qos.logback.classic.LoggerContext;
import java.io.Serializable;
import java.util.Map;
import java.util.Objects;

public class LoggerContextVO implements Serializable {
    private static final long serialVersionUID = 5488023392483144387L;
    protected String name;
    protected Map<String,String> propertyMap;
    protected long birthTime;
    public LoggerContextVO(LoggerContext context){this(context.getName(),context.getCopyOfPropertyMap(),context.getBirthTime());}
    public LoggerContextVO(String name, Map<String,String> map, long birthTime){this.name=name;this.propertyMap=map;this.birthTime=birthTime;}
    public String getName(){return name;} public Map<String,String> getPropertyMap(){return propertyMap;} public long getBirthTime(){return birthTime;}
    public String toString(){return "LoggerContextVO{name='"+name+"', propertyMap="+propertyMap+", birthTime="+birthTime+"}";}
    public boolean equals(Object o){if(this==o)return true;if(!(o instanceof LoggerContextVO))return false;LoggerContextVO v=(LoggerContextVO)o;return birthTime==v.birthTime&&Objects.equals(name,v.name)&&Objects.equals(propertyMap,v.propertyMap);}
    public int hashCode(){return ((31*(name==null?0:name.hashCode()))+(propertyMap==null?0:propertyMap.hashCode()))*31+(int)(birthTime^(birthTime>>>32));}
}
