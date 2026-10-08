package ch.qos.logback.core.model;
import java.util.Objects;
public class InsertFromJNDIModel extends Model {
    private static final long serialVersionUID=-7803377963650426197L;
    public static final String ENV_ENTRY_NAME_ATTR="env-entry-name";
    public static final String AS_ATTR="as";
    String as; String envEntryName; String scopeStr;
    public InsertFromJNDIModel(){}
    public InsertFromJNDIModel makeNewInstance(){return new InsertFromJNDIModel();}
    public void mirror(Model m){super.mirror(m);InsertFromJNDIModel x=(InsertFromJNDIModel)m;as=x.as;envEntryName=x.envEntryName;scopeStr=x.scopeStr;}
    public String getScopeStr(){return scopeStr;} public void setScopeStr(String v){scopeStr=v;} public String getAs(){return as;} public void setAs(String v){as=v;} public String getEnvEntryName(){return envEntryName;} public void setEnvEntryName(String v){envEntryName=v;}
    public int hashCode(){return 31*super.hashCode()+Objects.hash(as,envEntryName,scopeStr);}
    public boolean equals(Object o){if(this==o)return true;if(!(o instanceof InsertFromJNDIModel)||!super.equals(o)||getClass()!=o.getClass())return false;InsertFromJNDIModel x=(InsertFromJNDIModel)o;return Objects.equals(as,x.as)&&Objects.equals(envEntryName,x.envEntryName)&&Objects.equals(scopeStr,x.scopeStr);}
}
