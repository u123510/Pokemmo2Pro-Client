package ch.qos.logback.classic.net;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.net.AbstractSocketAppender;
import ch.qos.logback.core.spi.PreSerializationTransformer;

public class SocketAppender extends AbstractSocketAppender {
   private static final PreSerializationTransformer pst = new LoggingEventPreSerializationTransformer();
   private boolean includeCallerData;

   public SocketAppender() {
      super();
      this.includeCallerData = false;
   }

   public void postProcessEvent(ILoggingEvent event) {
      if (this.includeCallerData) {
         event.getCallerData();
      }
   }

   public void setIncludeCallerData(boolean includeCallerData) {
      this.includeCallerData = includeCallerData;
   }

   public PreSerializationTransformer getPST() {
      return pst;
   }

   public void postProcessEvent(Object event) {
      this.postProcessEvent((ILoggingEvent)event);
   }
}
