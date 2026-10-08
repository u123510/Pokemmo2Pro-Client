package ch.qos.logback.core.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Model implements Serializable {
    private static final long serialVersionUID = -797372668713068159L;
    boolean handled;
    boolean skipped;
    String tag;
    String bodyText;
    int lineNumber;
    List<Model> subModels;

    public Model() { this.subModels = new ArrayList<>(); }
    public static Model duplicate(Model source) {
        Model copy = source.makeNewInstance(); source.mirror(copy);
        for (Object value : source.subModels) copy.subModels.add(duplicate((Model) value));
        return copy;
    }
    public Model makeNewInstance() { return new Model(); }
    public void mirror(Model target) { target.tag=tag; target.bodyText=bodyText; target.lineNumber=lineNumber; }
    public void markAsSkipped() { skipped=true; }
    public void deepMarkAsSkipped() { markAsSkipped(); for(Object m:subModels)((Model)m).deepMarkAsSkipped(); }
    public void resetForReuse() { handled=false; skipped=false; for(Object m:subModels)((Model)m).resetForReuse(); }
    public boolean isSkipped(){return skipped;} public boolean isUnhandled(){return !handled;} public boolean isHandled(){return handled;} public void markAsHandled(){handled=true;}
    public String getTag(){return tag;} public void setTag(String v){tag=v;} public int getLineNumber(){return lineNumber;} public void setLineNumber(int v){lineNumber=v;}
    public List<Model> getSubModels(){return subModels;} public void addSubModel(Model m){subModels.add(m);} public String getBodyText(){return bodyText;}
    public void addText(String text){bodyText=bodyText==null?text:bodyText+text;}
    public String idString(){return "<"+tag+"> at line "+lineNumber;}
    public int hashCode(){return Objects.hash(bodyText,lineNumber,subModels,tag);}
    public boolean equals(Object o){if(this==o)return true;if(o==null||getClass()!=o.getClass())return false;Model m=(Model)o;return lineNumber==m.lineNumber&&Objects.equals(bodyText,m.bodyText)&&Objects.equals(subModels,m.subModels)&&Objects.equals(tag,m.tag);}
    public String toString(){return getClass().getSimpleName()+" [tag="+tag+", bodyText="+bodyText+", id="+hashCode()+"]";}
}
