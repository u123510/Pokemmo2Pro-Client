package ch.qos.logback.classic.spi;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.util.ContextInitializer;
import ch.qos.logback.classic.util.LogbackMDCAdapter;
import ch.qos.logback.core.status.StatusUtil;
import ch.qos.logback.core.util.StatusPrinter;

public class LogbackServiceProvider implements f.lf_0 {
    static final String NULL_CS_URL = "http://logback.qos.ch/codes.html#null_CS";
    public static String REQUESTED_API_VERSION = "2.0.99";
    private LoggerContext defaultLoggerContext;
    private f.ZK0 markerFactory;
    private LogbackMDCAdapter mdcAdapter;

    private void initializeLoggerContext() {
        try {
            new ContextInitializer(defaultLoggerContext).autoConfig();
        } catch (ch.qos.logback.core.joran.spi.JoranException ex) {
            f.y2_0.Ha("Failed to auto configure default logger context", ex);
            if (!StatusUtil.contextHasStatusListener(defaultLoggerContext)) {
                StatusPrinter.printInCaseOfErrorsOrWarnings(defaultLoggerContext);
            }
        } catch (Exception ex) {
            f.y2_0.Ha("Failed to instantiate " + LoggerContext.class.getName(), ex);
        }
    }

    public void initialize() {
        defaultLoggerContext = new LoggerContext();
        defaultLoggerContext.setName("default");
        initializeLoggerContext();
        defaultLoggerContext.start();
        markerFactory = new f.zr_1();
        mdcAdapter = new LogbackMDCAdapter();
        defaultLoggerContext.setMDCAdapter(mdcAdapter);
    }

    public f.KV getLoggerFactory() { return defaultLoggerContext; }
    public f.ZK0 getMarkerFactory() { return markerFactory; }
    public f.Sm0 getMDCAdapter() { return mdcAdapter; }
    public String getRequestedApiVersion() { return REQUESTED_API_VERSION; }
}
