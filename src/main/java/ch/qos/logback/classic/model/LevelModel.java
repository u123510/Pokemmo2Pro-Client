package ch.qos.logback.classic.model;

import ch.qos.logback.core.model.Model;
import java.util.Objects;

public class LevelModel extends Model {
    private static final long serialVersionUID = -7287549849308062148L;
    private String value;
    public LevelModel makeNewInstance() { return new LevelModel(); }
    @Override public void mirror(Model model) { super.mirror(model); value = ((LevelModel) model).value; }
    public String getValue() { return value; }
    public void setValue(String value) { this.value = value; }
    @Override public int hashCode() { return 31 * super.hashCode() + Objects.hash(value); }
    @Override public boolean equals(Object object) {
        if (this == object) return true;
        if (!super.equals(object) || getClass() != object.getClass()) return false;
        return Objects.equals(value, ((LevelModel) object).value);
    }
}
