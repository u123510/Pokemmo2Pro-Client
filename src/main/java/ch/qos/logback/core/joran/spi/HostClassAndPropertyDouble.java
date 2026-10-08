package ch.qos.logback.core.joran.spi;

public class HostClassAndPropertyDouble {
    final Class<?> hostClass;
    final String propertyName;

    public HostClassAndPropertyDouble(Class<?> hostClass, String propertyName) {
        this.hostClass = hostClass;
        this.propertyName = propertyName;
    }

    public Class<?> getHostClass() {
        return hostClass;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public int hashCode() {
        int result = 31;
        result = (result + (hostClass == null ? 0 : hostClass.hashCode())) * 31;
        result += propertyName == null ? 0 : propertyName.hashCode();
        return result;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        HostClassAndPropertyDouble other = (HostClassAndPropertyDouble) object;
        if (hostClass == null ? other.hostClass != null : !hostClass.equals(other.hostClass)) {
            return false;
        }
        return propertyName == null ? other.propertyName == null : propertyName.equals(other.propertyName);
    }
}
