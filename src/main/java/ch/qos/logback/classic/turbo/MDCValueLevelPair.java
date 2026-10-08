package ch.qos.logback.classic.turbo;

import ch.qos.logback.classic.Level;

public class MDCValueLevelPair {
    private String value;
    private Level level;
    public String getValue() { return value; }
    public void setValue(String value) { this.value = value; }
    public Level getLevel() { return level; }
    public void setLevel(Level level) { this.level = level; }
}
