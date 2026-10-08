package ch.qos.logback.core.model;
import java.util.Objects;
public class ComponentModel extends Model {
    private static final long serialVersionUID = -7117814935763453139L; String className;
    public ComponentModel(){super();} public ComponentModel makeNewInstance(){return new ComponentModel();}
    public void mirror(Model m){super.mirror(m);className=((ComponentModel)m).className;} public String getClassName(){return className;} public void setClassName(String v){className=v;}
    public String toString(){return getClass().getSimpleName()+" [tag="+tag+", className="+className+", bodyText="+bodyText+"]";}
    public int hashCode(){return 31*super.hashCode()+Objects.hash(className);} public boolean equals(Object o){return this==o||(super.equals(o)&&getClass()==o.getClass()&&Objects.equals(className,((ComponentModel)o).className));}
}
