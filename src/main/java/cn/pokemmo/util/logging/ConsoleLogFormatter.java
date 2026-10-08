package cn.pokemmo.util.logging;

import f.*;

import java.text.MessageFormat;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class ConsoleLogFormatter extends Handler {
    public static final String M7;
    public static final int PM;
    public static final int kH;
    public static final int lS;
    public static final int X4;

    static {
        M7 = Logger.class.getName();
        PM = Level.FINEST.intValue();
        kH = Level.FINE.intValue();
        lS = Level.INFO.intValue();
        X4 = Level.WARNING.intValue();
    }

    public ConsoleLogFormatter() {
    }

    public static void Iy() {
        LogManager.getLogManager().getLogger("").addHandler(new ad_0());
    }

    public static void CS() {
        Logger logger = LogManager.getLogManager().getLogger("");
        Handler[] handlers = logger.getHandlers();
        int length = handlers.length;
        for (int i = 0; i < length; i++) {
            logger.removeHandler(handlers[i]);
        }
    }

    public static String tz(LogRecord logRecord) {
        String message = logRecord.getMessage();
        if (message == null) {
            return null;
        }
        ResourceBundle resourceBundle = logRecord.getResourceBundle();
        if (resourceBundle != null) {
            try {
                message = resourceBundle.getString(message);
            } catch (MissingResourceException missingResourceException) {
            }
        }
        Object[] parameters = logRecord.getParameters();
        if (parameters != null && parameters.length > 0) {
            try {
                return MessageFormat.format(message, parameters);
            } catch (IllegalArgumentException illegalArgumentException) {
                return message;
            }
        }
        return message;
    }

    @Override
    public final void close() {
    }

    @Override
    public final void flush() {
    }

    @Override
    public final void publish(LogRecord logRecord) {
        if (logRecord == null) {
            return;
        }
        String loggerName = logRecord.getLoggerName();
        if (loggerName == null) {
            loggerName = "unknown.jul.logger";
        }
        dl_1 logger = Cq0.t00(loggerName);
        if (logRecord.getMessage() == null) {
            logRecord.setMessage("");
        }
        if (logger instanceof ce_1) {
            ce_1 ce_1 = (ce_1) logger;
            int intValue = logRecord.getLevel().intValue();
            int i;
            if (intValue <= PM) {
                i = 0;
            } else if (intValue <= kH) {
                i = 10;
            } else if (intValue <= lS) {
                i = 20;
            } else if (intValue <= X4) {
                i = 30;
            } else {
                i = 40;
            }
            String tz = tz(logRecord);
            String str = M7;
            Throwable thrown = logRecord.getThrown();
            ce_1.log(null, str, i, tz, null, thrown);
            return;
        }
        String tz2 = tz(logRecord);
        int intValue2 = logRecord.getLevel().intValue();
        if (intValue2 <= PM || intValue2 <= kH) {
            logRecord.getThrown();
            logger.getClass();
        } else if (intValue2 <= lS) {
            logger.info(tz2, logRecord.getThrown());
        } else if (intValue2 <= X4) {
            logger.warn(tz2, logRecord.getThrown());
        } else {
            logger.error(tz2, logRecord.getThrown());
        }
    }
}
