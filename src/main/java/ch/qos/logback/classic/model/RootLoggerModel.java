package ch.qos.logback.classic.model;

import ch.qos.logback.core.model.Model;
import ch.qos.logback.core.model.processor.PhaseIndicator;
import ch.qos.logback.core.model.processor.ProcessingPhase;
import java.util.Objects;

@PhaseIndicator(phase = ProcessingPhase.SECOND)
public class RootLoggerModel extends Model {
    private static final long serialVersionUID = -2811453129653502831L;
    private String level;
    public RootLoggerModel makeNewInstance() { return new RootLoggerModel(); }
    @Override public void mirror(Model model) { super.mirror(model); level = ((RootLoggerModel) model).level; }
    public String getLevel() { return level; }
    public void setLevel(String value) { level = value; }
    @Override public int hashCode() { return 31 * super.hashCode() + Objects.hash(level); }
    @Override public boolean equals(Object object) {
        if (this == object) return true;
        if (!super.equals(object) || getClass() != object.getClass()) return false;
        return Objects.equals(level, ((RootLoggerModel) object).level);
    }
}
