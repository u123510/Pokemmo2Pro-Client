package ch.qos.logback.core.model;
import java.util.Objects;
public class SerializeModelModel extends Model {
    private static final long serialVersionUID=16385651235687L; String file;
    public SerializeModelModel(){} public SerializeModelModel makeNewInstance(){return new SerializeModelModel();} public String getFile(){return file;} public void setFile(String v){file=v;}
    public boolean equals(Object o){return this==o||(o!=null&&getClass()==o.getClass()&&super.equals(o)&&Objects.equals(file,((SerializeModelModel)o).file));}
    public int hashCode(){return Objects.hash(super.hashCode(),file);}
}
