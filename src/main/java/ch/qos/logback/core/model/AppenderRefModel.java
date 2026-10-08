package ch.qos.logback.core.model;

import java.util.Objects;
import ch.qos.logback.core.model.processor.PhaseIndicator;
import ch.qos.logback.core.model.processor.ProcessingPhase;

@PhaseIndicator(phase = ProcessingPhase.SECOND)
public class AppenderRefModel extends Model {
    private static final long serialVersionUID = 5238705468395447547L;
    String ref;

    public AppenderRefModel() {}

    @Override
    public AppenderRefModel makeNewInstance() {
        return new AppenderRefModel();
    }

    @Override
    public void mirror(Model m) {
        super.mirror(m);
        ref = ((AppenderRefModel) m).ref;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String v) {
        ref = v;
    }

    @Override
    public int hashCode() {
        return 31 * super.hashCode() + Objects.hash(ref);
    }

    @Override
    public boolean equals(Object o) {
        return this == o || (super.equals(o) && getClass() == o.getClass() && Objects.equals(ref, ((AppenderRefModel) o).ref));
    }
}
