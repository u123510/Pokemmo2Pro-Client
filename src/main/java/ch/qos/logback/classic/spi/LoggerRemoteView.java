package ch.qos.logback.classic.spi;
import ch.qos.logback.classic.LoggerContext;
import java.io.Serializable;
public class LoggerRemoteView implements Serializable {
 private static final long serialVersionUID=5028223666108713696L; final LoggerContextVO loggerContextView; final String name;
 public LoggerRemoteView(String name,LoggerContext context){this.name=name; if(context.getLoggerContextRemoteView()==null)throw new AssertionError(); this.loggerContextView=context.getLoggerContextRemoteView();}
 public LoggerContextVO getLoggerContextView(){return loggerContextView;} public String getName(){return name;}
}
