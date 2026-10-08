package ch.qos.logback.core.model;
import java.util.Objects;
public class TimestampModel extends NamedModel {
    private static final long serialVersionUID=2096655273673863306L; public static final String CONTEXT_BIRTH="contextBirth";
    String datePattern; String timeReference; String scopeStr;
    public TimestampModel(){} public TimestampModel makeNewInstance(){return new TimestampModel();}
    public void mirror(Model m){super.mirror(m);TimestampModel x=(TimestampModel)m;datePattern=x.datePattern;timeReference=x.timeReference;scopeStr=x.scopeStr;}
    public String getKey(){return getName();} public void setKey(String v){setName(v);} public String getDatePattern(){return datePattern;} public void setDatePattern(String v){datePattern=v;} public String getTimeReference(){return timeReference;} public void setTimeReference(String v){timeReference=v;} public String getScopeStr(){return scopeStr;} public void setScopeStr(String v){scopeStr=v;}
    public int hashCode(){return 31*super.hashCode()+Objects.hash(datePattern,scopeStr,timeReference);}
    public boolean equals(Object o){if(this==o)return true;if(!(o instanceof TimestampModel)||!super.equals(o)||getClass()!=o.getClass())return false;TimestampModel x=(TimestampModel)o;return Objects.equals(datePattern,x.datePattern)&&Objects.equals(scopeStr,x.scopeStr)&&Objects.equals(timeReference,x.timeReference);}
}
