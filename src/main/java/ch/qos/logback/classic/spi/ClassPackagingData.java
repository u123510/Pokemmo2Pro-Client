package ch.qos.logback.classic.spi;

import java.io.Serializable;

@Deprecated
public class ClassPackagingData implements Serializable {
    private static final long serialVersionUID = -804643281218337001L;
    private String codeLocation;
    private String version;
    private boolean exact;
    public ClassPackagingData() {}
    public ClassPackagingData(String codeLocation, String version) { this(codeLocation, version, true); }
    public ClassPackagingData(String codeLocation, String version, boolean exact) {
        this.codeLocation = codeLocation; this.version = version; this.exact = exact;
    }
    public String getCodeLocation() { return codeLocation; }
    public String getVersion() { return version; }
    public boolean isExact() { return exact; }
    public void setCodeLocation(String value) { codeLocation = value; }
    public void setVersion(String value) { version = value; }
    public void setExact(boolean value) { exact = value; }
    @Override public int hashCode() { return 31 + (codeLocation == null ? 0 : codeLocation.hashCode()); }
    @Override public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ClassPackagingData other = (ClassPackagingData) obj;
        return exact == other.exact
                && java.util.Objects.equals(codeLocation, other.codeLocation)
                && java.util.Objects.equals(version, other.version);
    }
}
