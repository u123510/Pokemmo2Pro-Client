package ch.qos.logback.classic.model;

import ch.qos.logback.core.model.Model;
import ch.qos.logback.core.model.processor.PhaseIndicator;
import ch.qos.logback.core.model.processor.ProcessingPhase;
import java.util.Objects;

@PhaseIndicator(phase = ProcessingPhase.SECOND)
public class LoggerModel extends Model {
    private static final long serialVersionUID = 5326913660697375316L;
    private String name;
    private String level;
    private String additivity;
    public LoggerModel makeNewInstance() { return new LoggerModel(); }
    @Override public void mirror(Model model) {
        super.mirror(model);
        LoggerModel other = (LoggerModel) model;
        name = other.name; level = other.level; additivity = other.additivity;
    }
    public String getName() { return name; }
    public void setName(String value) { name = value; }
    public String getLevel() { return level; }
    public void setLevel(String value) { level = value; }
    public String getAdditivity() { return additivity; }
    public void setAdditivity(String value) { additivity = value; }
    @Override public String toString() { return getClass().getSimpleName() + " name=" + name + "]"; }
    @Override public int hashCode() { return 31 * super.hashCode() + Objects.hash(additivity, level, name); }
    @Override public boolean equals(Object object) {
        if (this == object) return true;
        if (!super.equals(object) || getClass() != object.getClass()) return false;
        LoggerModel other = (LoggerModel) object;
        return Objects.equals(additivity, other.additivity) && Objects.equals(level, other.level) && Objects.equals(name, other.name);
    }
}
