package ch.qos.logback.classic.boolex;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.classic.spi.LoggerContextVO;
import ch.qos.logback.classic.spi.ThrowableProxy;
import ch.qos.logback.classic.spi.IThrowableProxy;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.boolex.JaninoEventEvaluatorBase;
import ch.qos.logback.core.boolex.Matcher;
import f.HA0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class JaninoEventEvaluator extends JaninoEventEvaluatorBase<ILoggingEvent> {
    public static final String IMPORT_LEVEL = "import ch.qos.logback.classic.Level;\r\n";
    public static final List<String> DEFAULT_PARAM_NAME_LIST = new ArrayList<>();
    public static final List<Class<?>> DEFAULT_PARAM_TYPE_LIST = new ArrayList<>();

    static {
        DEFAULT_PARAM_NAME_LIST.add("DEBUG");
        DEFAULT_PARAM_NAME_LIST.add("INFO");
        DEFAULT_PARAM_NAME_LIST.add("WARN");
        DEFAULT_PARAM_NAME_LIST.add("ERROR");
        DEFAULT_PARAM_NAME_LIST.add("event");
        DEFAULT_PARAM_NAME_LIST.add("message");
        DEFAULT_PARAM_NAME_LIST.add("formattedMessage");
        DEFAULT_PARAM_NAME_LIST.add("logger");
        DEFAULT_PARAM_NAME_LIST.add("loggerContext");
        DEFAULT_PARAM_NAME_LIST.add("level");
        DEFAULT_PARAM_NAME_LIST.add("timeStamp");
        DEFAULT_PARAM_NAME_LIST.add("marker");
        DEFAULT_PARAM_NAME_LIST.add("markerList");
        DEFAULT_PARAM_NAME_LIST.add("mdc");
        DEFAULT_PARAM_NAME_LIST.add("throwableProxy");
        DEFAULT_PARAM_NAME_LIST.add("throwable");

        DEFAULT_PARAM_TYPE_LIST.add(Integer.TYPE);
        DEFAULT_PARAM_TYPE_LIST.add(Integer.TYPE);
        DEFAULT_PARAM_TYPE_LIST.add(Integer.TYPE);
        DEFAULT_PARAM_TYPE_LIST.add(Integer.TYPE);
        DEFAULT_PARAM_TYPE_LIST.add(ILoggingEvent.class);
        DEFAULT_PARAM_TYPE_LIST.add(String.class);
        DEFAULT_PARAM_TYPE_LIST.add(String.class);
        DEFAULT_PARAM_TYPE_LIST.add(String.class);
        DEFAULT_PARAM_TYPE_LIST.add(LoggerContextVO.class);
        DEFAULT_PARAM_TYPE_LIST.add(Integer.TYPE);
        DEFAULT_PARAM_TYPE_LIST.add(Long.TYPE);
        DEFAULT_PARAM_TYPE_LIST.add(HA0.class);
        DEFAULT_PARAM_TYPE_LIST.add(MarkerList.class);
        DEFAULT_PARAM_TYPE_LIST.add(Map.class);
        DEFAULT_PARAM_TYPE_LIST.add(IThrowableProxy.class);
        DEFAULT_PARAM_TYPE_LIST.add(Throwable.class);
    }

    public String getDecoratedExpression() {
        String expression = getExpression();
        if (!expression.contains("return")) {
            expression = "return " + expression + ";";
            addInfo("Adding [return] prefix and a semicolon suffix. Expression becomes [" + expression + "]");
            addInfo("See also http://logback.qos.ch/codes.html#block");
        }
        return IMPORT_LEVEL + expression;
    }

    @Override
    public String[] getParameterNames() {
        ArrayList<String> names = new ArrayList<>();
        names.addAll(DEFAULT_PARAM_NAME_LIST);
        for (Matcher matcher : matcherList) {
            names.add(matcher.getName());
        }
        return names.toArray(CoreConstants.EMPTY_STRING_ARRAY);
    }

    @Override
    public Class<?>[] getParameterTypes() {
        ArrayList<Class<?>> types = new ArrayList<>();
        types.addAll(DEFAULT_PARAM_TYPE_LIST);
        for (Matcher ignored : matcherList) {
            types.add(Matcher.class);
        }
        return types.toArray(CoreConstants.EMPTY_CLASS_ARRAY);
    }

    @Override
    public Object[] getParameterValues(ILoggingEvent event) {
        int matcherCount = matcherList.size();
        Object[] values = new Object[DEFAULT_PARAM_NAME_LIST.size() + matcherCount];
        values[0] = Level.DEBUG_INTEGER;
        values[1] = Level.INFO_INTEGER;
        values[2] = Level.WARN_INTEGER;
        values[3] = Level.ERROR_INTEGER;
        values[4] = event;
        values[5] = event.getMessage();
        values[6] = event.getFormattedMessage();
        values[7] = event.getLoggerName();
        values[8] = event.getLoggerContextVO();
        values[9] = event.getLevel().toInteger();
        values[10] = Long.valueOf(event.getTimeStamp());
        MarkerList markerListValue = new MarkerList(event.getMarkerList());
        values[11] = markerListValue.getFirstMarker();
        values[12] = markerListValue;
        values[13] = event.getMDCPropertyMap();
        IThrowableProxy throwableProxy = event.getThrowableProxy();
        values[14] = throwableProxy;
        values[15] = throwableProxy instanceof ThrowableProxy ? ((ThrowableProxy) throwableProxy).getThrowable() : null;
        for (int i = 0; i < matcherCount; i++) {
            values[16 + i] = matcherList.get(i);
        }
        return values;
    }
}
