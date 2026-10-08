package ch.qos.logback.classic.model;

import ch.qos.logback.core.model.Model;
import java.util.Objects;

public class ConfigurationModel extends Model {
    private static final long serialVersionUID = 1286156598561818515L;
    private String debugStr;
    private String scanStr;
    private String scanPeriodStr;
    private String packagingDataStr;

    public ConfigurationModel makeNewInstance() { return new ConfigurationModel(); }
    @Override public void mirror(Model model) {
        super.mirror(model);
        ConfigurationModel other = (ConfigurationModel) model;
        debugStr = other.debugStr; scanStr = other.scanStr;
        scanPeriodStr = other.scanPeriodStr; packagingDataStr = other.packagingDataStr;
    }
    public String getDebugStr() { return debugStr; }
    public void setDebugStr(String value) { debugStr = value; }
    public String getScanStr() { return scanStr; }
    public void setScanStr(String value) { scanStr = value; }
    public String getScanPeriodStr() { return scanPeriodStr; }
    public void setScanPeriodStr(String value) { scanPeriodStr = value; }
    public String getPackagingDataStr() { return packagingDataStr; }
    public void setPackagingDataStr(String value) { packagingDataStr = value; }
    @Override public int hashCode() { return 31 * super.hashCode() + Objects.hash(debugStr, packagingDataStr, scanPeriodStr, scanStr); }
    @Override public boolean equals(Object object) {
        if (this == object) return true;
        if (!super.equals(object) || getClass() != object.getClass()) return false;
        ConfigurationModel other = (ConfigurationModel) object;
        return Objects.equals(debugStr, other.debugStr) && Objects.equals(packagingDataStr, other.packagingDataStr)
                && Objects.equals(scanPeriodStr, other.scanPeriodStr) && Objects.equals(scanStr, other.scanStr);
    }
}
