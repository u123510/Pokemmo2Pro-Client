package ch.qos.logback.core.spi;

public abstract interface PropertyContainer {
    public abstract void addSubstitutionProperty(java.lang.String arg0, java.lang.String arg1);
    public abstract java.lang.String getProperty(java.lang.String arg0);
    public abstract java.util.Map getCopyOfPropertyMap();
    default void addSubstitutionProperties(java.util.Properties arg0) {
        if (arg0 == null) return;
        for (String key : arg0.stringPropertyNames()) {
            addSubstitutionProperty(key, arg0.getProperty(key));
        }
    }
}
