package ch.qos.logback.classic;

import f.HA0;
import f.xu0_0;

public class ClassicConstants {
    public static final String USER_MDC_KEY = "user";
    public static final String LOGBACK_CONTEXT_SELECTOR = "logback.ContextSelector";
    public static final String CONFIG_FILE_PROPERTY = "logback.configurationFile";
    public static final String MODEL_CONFIG_FILE_PROPERTY = "logback.scmoFile";
    public static final String JNDI_CONFIGURATION_RESOURCE = "java:comp/env/logback/configuration-resource";
    public static final String JNDI_CONTEXT_NAME = "java:comp/env/logback/context-name";
    public static final int MAX_DOTS = 16;
    public static final int DEFAULT_MAX_CALLEDER_DATA_DEPTH = 8;
    public static final String REQUEST_REMOTE_HOST_MDC_KEY = "req.remoteHost";
    public static final String REQUEST_USER_AGENT_MDC_KEY = "req.userAgent";
    public static final String REQUEST_REQUEST_URI = "req.requestURI";
    public static final String REQUEST_QUERY_STRING = "req.queryString";
    public static final String REQUEST_REQUEST_URL = "req.requestURL";
    public static final String REQUEST_METHOD = "req.method";
    public static final String REQUEST_X_FORWARDED_FOR = "req.xForwardedFor";
    public static final String GAFFER_CONFIGURATOR_FQCN = "ch.qos.logback.classic.gaffer.GafferConfigurator";
    public static final String FINALIZE_SESSION = "FINALIZE_SESSION";
    public static final HA0 FINALIZE_SESSION_MARKER = xu0_0.N3("FINALIZE_SESSION");
    public static final String AUTOCONFIG_FILE = "logback.xml";
    public static final String TEST_AUTOCONFIG_FILE = "logback-test.xml";

    public ClassicConstants() {
    }
}
