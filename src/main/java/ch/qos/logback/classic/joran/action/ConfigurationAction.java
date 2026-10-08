package ch.qos.logback.classic.joran.action;

import ch.qos.logback.classic.model.ConfigurationModel;
import ch.qos.logback.core.joran.action.BaseModelAction;
import ch.qos.logback.core.joran.spi.SaxEventInterpretationContext;
import ch.qos.logback.core.model.Model;
import org.xml.sax.Attributes;

public class ConfigurationAction extends BaseModelAction {
    static final String INTERNAL_DEBUG_ATTR = "debug";
    static final String SCAN_ATTR = "scan";
    static final String SCAN_PERIOD_ATTR = "scanPeriod";
    static final String PACKAGING_DATA_ATTR = "packagingData";

    @Override
    public Model buildCurrentModel(SaxEventInterpretationContext context, String name, Attributes attributes) {
        ConfigurationModel model = new ConfigurationModel();
        model.setDebugStr(attributes.getValue("debug"));
        model.setScanStr(attributes.getValue("scan"));
        model.setScanPeriodStr(attributes.getValue("scanPeriod"));
        model.setPackagingDataStr(attributes.getValue("packagingData"));
        return model;
    }
}
