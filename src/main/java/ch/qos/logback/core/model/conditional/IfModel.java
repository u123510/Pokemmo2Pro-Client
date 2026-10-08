package ch.qos.logback.core.model.conditional;
import ch.qos.logback.core.model.Model;
import java.util.Objects;
public class IfModel extends Model {
    public enum BranchState { IN_ERROR, IF_BRANCH, ELSE_BRANCH }
    private static final long serialVersionUID=1516046821762377019L; String condition; BranchState branchState;
    public IfModel(){branchState=null;} public IfModel makeNewInstance(){return new IfModel();}
    public void mirror(Model m){super.mirror(m);IfModel x=(IfModel)m;condition=x.condition;branchState=x.branchState;}
    public String getCondition(){return condition;} public void setCondition(String v){condition=v;} public BranchState getBranchState(){return branchState;} public void setBranchState(BranchState v){branchState=v;} public void setBranchState(boolean v){branchState=v?BranchState.IF_BRANCH:BranchState.ELSE_BRANCH;} public void resetBranchState(){setBranchState((BranchState)null);}
    public String toString(){return getClass().getSimpleName()+" [condition=\""+condition+"\"]";} public int hashCode(){return 31*super.hashCode()+Objects.hash(branchState,condition);}
    public boolean equals(Object o){if(this==o)return true;if(!(o instanceof IfModel)||!super.equals(o)||getClass()!=o.getClass())return false;IfModel x=(IfModel)o;return branchState==x.branchState&&Objects.equals(condition,x.condition);}
}
