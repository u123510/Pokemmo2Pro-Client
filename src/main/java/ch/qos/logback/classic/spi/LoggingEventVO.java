package ch.qos.logback.classic.spi;

import ch.qos.logback.classic.Level;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import f.HA0;

public class LoggingEventVO implements ILoggingEvent, Serializable {
    private static final long serialVersionUID = 6550451766513496491L;
    private static final int NULL_ARGUMENT_ARRAY = -1;
    private static final String NULL_ARGUMENT_ARRAY_ELEMENT = "NULL_ARGUMENT_ARRAY_ELEMENT";
    private static final int ARGUMENT_ARRAY_DESERIALIZATION_LIMIT = 128;
    private String threadName;
    private String loggerName;
    private LoggerContextVO loggerContextVO;
    private transient Level level;
    private String message;
    private transient String formattedMessage;
    private transient Object[] argumentArray;
    private ThrowableProxyVO throwableProxy;
    private StackTraceElement[] callerDataArray;
    private List<HA0> markerList;
    private List<?> keyValuePairList;
    private Map<String,String> mdcPropertyMap;
    private long timestamp;
    private int nanoseconds;
    private long sequenceNumber;

    public LoggingEventVO() {}

    public static LoggingEventVO build(ILoggingEvent event) {
        LoggingEventVO vo = new LoggingEventVO();
        vo.loggerName = event.getLoggerName();
        vo.loggerContextVO = event.getLoggerContextVO();
        vo.threadName = event.getThreadName();
        vo.level = event.getLevel();
        vo.message = event.getMessage();
        vo.argumentArray = event.getArgumentArray();
        vo.markerList = event.getMarkerList();
        vo.keyValuePairList = event.getKeyValuePairs();
        vo.mdcPropertyMap = event.getMDCPropertyMap();
        vo.timestamp = event.getTimeStamp();
        vo.nanoseconds = event.getNanoseconds();
        vo.sequenceNumber = event.getSequenceNumber();
        vo.throwableProxy = ThrowableProxyVO.build(event.getThrowableProxy());
        if (event.hasCallerData()) vo.callerDataArray = event.getCallerData();
        return vo;
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        out.writeInt(level.levelInt);
        if (argumentArray == null) {
            out.writeInt(-1);
        } else {
            out.writeInt(argumentArray.length);
            for (Object arg : argumentArray) {
                out.writeObject(arg == null ? NULL_ARGUMENT_ARRAY_ELEMENT : arg.toString());
            }
        }
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        level = Level.toLevel(in.readInt());
        int length = in.readInt();
        if (length < -1 || length > ARGUMENT_ARRAY_DESERIALIZATION_LIMIT) {
            throw new InvalidObjectException("Argument array length is invalid: " + length);
        }
        if (length == -1) return;
        argumentArray = new String[length];
        for (int i = 0; i < length; i++) {
            Object value = in.readObject();
            if (!NULL_ARGUMENT_ARRAY_ELEMENT.equals(value)) argumentArray[i] = value;
        }
    }

    public String getThreadName(){return threadName;}
    public LoggerContextVO getLoggerContextVO(){return loggerContextVO;}
    public String getLoggerName(){return loggerName;}
    public Level getLevel(){return level;}
    public String getMessage(){return message;}
    public String getFormattedMessage(){
        if(formattedMessage==null){
            formattedMessage=argumentArray==null?message:f.mo_2.fC(message,argumentArray).G;
        }
        return formattedMessage;
    }
    public Object[] getArgumentArray(){return argumentArray;}
    public IThrowableProxy getThrowableProxy(){return throwableProxy;}
    public StackTraceElement[] getCallerData(){return callerDataArray;}
    public boolean hasCallerData(){return callerDataArray!=null;}
    public List<HA0> getMarkerList(){return markerList;}
    public long getTimeStamp(){return timestamp;}
    public int getNanoseconds(){return nanoseconds;}
    public long getSequenceNumber(){return sequenceNumber;}
    public long getContextBirthTime(){return loggerContextVO.getBirthTime();}
    public LoggerContextVO getContextLoggerRemoteView(){return loggerContextVO;}
    public Map<String,String> getMDCPropertyMap(){return mdcPropertyMap;}
    public Map<String,String> getMdc(){return mdcPropertyMap;}
    public List<?> getKeyValuePairs(){return keyValuePairList;}
    public void prepareForDeferredProcessing(){}

    @Override public int hashCode(){
        long ts=timestamp;
        int h=31+(message==null?0:message.hashCode());
        h=(h+ (threadName==null?0:threadName.hashCode()))*31+(int)(ts^(ts>>>32));
        return h;
    }
    @Override public boolean equals(Object o){
        if(this==o)return true;if(o==null||getClass()!=o.getClass())return false;
        LoggingEventVO v=(LoggingEventVO)o;
        return timestamp==v.timestamp
            && java.util.Objects.equals(message,v.message)
            && java.util.Objects.equals(loggerName,v.loggerName)
            && java.util.Objects.equals(threadName,v.threadName)
            && java.util.Objects.equals(markerList,v.markerList)
            && java.util.Objects.equals(mdcPropertyMap,v.mdcPropertyMap);
    }
}
