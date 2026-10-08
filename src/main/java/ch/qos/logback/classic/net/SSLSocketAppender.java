package ch.qos.logback.classic.net;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.net.AbstractSSLSocketAppender;
import ch.qos.logback.core.spi.PreSerializationTransformer;

public class SSLSocketAppender extends AbstractSSLSocketAppender {
   private final PreSerializationTransformer pst;
   private boolean includeCallerData;

   public SSLSocketAppender() {

      super();
      LoggingEventPreSerializationTransformer var1;
      var1 = new LoggingEventPreSerializationTransformer();
      this.pst = var1;
   }

   public void postProcessEvent(ILoggingEvent var1) {
      if (this.includeCallerData) {
         var1.getCallerData();
      }

   }

   public void postProcessEvent(Object var1) {
      this.postProcessEvent((ILoggingEvent)var1);
   }

   public void setIncludeCallerData(boolean var1) {
      this.includeCallerData = var1;
   }

   public PreSerializationTransformer getPST() {
      return this.pst;
   }
}
