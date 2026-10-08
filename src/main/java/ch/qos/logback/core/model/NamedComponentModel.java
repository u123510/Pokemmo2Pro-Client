package ch.qos.logback.core.model;
import java.util.Objects;
public class NamedComponentModel extends ComponentModel implements INamedModel {
    private static final long serialVersionUID = -6388316680413871442L; String name;
    public NamedComponentModel(){super();} public NamedComponentModel makeNewInstance(){return new NamedComponentModel();}
    public void mirror(Model m){super.mirror(m);name=((NamedComponentModel)m).name;} public String getName(){return name;} public void setName(String v){name=v;}
    public String toString(){return "NamedComponentModel [name="+name+", className="+className+", tag="+tag+", bodyText="+bodyText+"]";}
    public int hashCode(){return 31*super.hashCode()+Objects.hash(name);} public boolean equals(Object o){return this==o||(super.equals(o)&&getClass()==o.getClass()&&Objects.equals(name,((NamedComponentModel)o).name));}
}
