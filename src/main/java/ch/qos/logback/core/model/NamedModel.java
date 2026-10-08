package ch.qos.logback.core.model;
import java.util.Objects;
public class NamedModel extends Model implements INamedModel {
    private static final long serialVersionUID = 3549881638769570183L; String name;
    public NamedModel(){super();} public NamedModel makeNewInstance(){return new NamedModel();}
    public void mirror(Model m){super.mirror(m);name=((NamedModel)m).name;} public String getName(){return name;} public void setName(String v){name=v;}
    public int hashCode(){return 31*super.hashCode()+Objects.hash(name);} public boolean equals(Object o){return this==o||(super.equals(o)&&getClass()==o.getClass()&&Objects.equals(name,((NamedModel)o).name));}
}
