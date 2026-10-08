package ch.qos.logback.classic.log4j;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.classic.spi.IThrowableProxy;
import ch.qos.logback.classic.spi.StackTraceElementProxy;
import ch.qos.logback.core.LayoutBase;
import ch.qos.logback.core.helpers.Transform;
import java.util.Map;
import java.util.Set;

public class XMLLayout extends LayoutBase {
   private final int DEFAULT_SIZE = 256;
   private final int UPPER_LIMIT = 2048;
   private StringBuilder buf;
   private boolean locationInfo;
   private boolean properties;

   public XMLLayout() {
      super();
      this.buf = new StringBuilder(DEFAULT_SIZE);
      this.locationInfo = false;
      this.properties = false;
   }

   public void start() {
      super.start();
   }

   public void setLocationInfo(boolean locationInfo) {
      this.locationInfo = locationInfo;
   }

   public boolean getLocationInfo() {
      return this.locationInfo;
   }

   public void setProperties(boolean properties) {
      this.properties = properties;
   }

   public boolean getProperties() {
      return this.properties;
   }

   public String doLayout(Object object) {
      ILoggingEvent event = (ILoggingEvent) object;
      if (this.buf.capacity() > this.UPPER_LIMIT) {
         this.buf = new StringBuilder(this.DEFAULT_SIZE);
      } else {
         this.buf.setLength(0);
      }

      this.buf.append("<log4j:event logger=\"");
      this.buf.append(Transform.escapeTags(event.getLoggerName()));
      this.buf.append("\"\r\n");
      this.buf.append("             timestamp=\"");
      this.buf.append(event.getTimeStamp());
      this.buf.append("\" level=\"");
      this.buf.append(event.getLevel());
      this.buf.append("\" thread=\"");
      this.buf.append(Transform.escapeTags(event.getThreadName()));
      this.buf.append("\">\r\n");
      this.buf.append("  <log4j:message>");
      this.buf.append(Transform.escapeTags(event.getFormattedMessage()));
      this.buf.append("</log4j:message>\r\n");
      IThrowableProxy throwableProxy = event.getThrowableProxy();
      if (throwableProxy != null) {
         StackTraceElementProxy[] stepArray = throwableProxy.getStackTraceElementProxyArray();
         this.buf.append("  <log4j:throwable><![CDATA[");
         for (StackTraceElementProxy step : stepArray) {
            this.buf.append('\t');
            this.buf.append(step.toString());
            this.buf.append("\r\n");
         }
         this.buf.append("]]></log4j:throwable>\r\n");
      }

      if (this.locationInfo) {
         StackTraceElement[] callerDataArray = event.getCallerData();
         if (callerDataArray != null && callerDataArray.length > 0) {
            StackTraceElement callerData = callerDataArray[0];
            this.buf.append("  <log4j:locationInfo class=\"");
            this.buf.append(callerData.getClassName());
            this.buf.append("\"\r\n");
            this.buf.append("                      method=\"");
            this.buf.append(Transform.escapeTags(callerData.getMethodName()));
            this.buf.append("\" file=\"");
            this.buf.append(Transform.escapeTags(callerData.getFileName()));
            this.buf.append("\" line=\"");
            this.buf.append(callerData.getLineNumber());
            this.buf.append("\"/>\r\n");
         }
      }

      if (this.getProperties()) {
         Map mdc = event.getMDCPropertyMap();
         if (mdc != null && mdc.size() != 0) {
            Set entrySet = mdc.entrySet();
            this.buf.append("  <log4j:properties>");
            for (Object entryObject : entrySet) {
               Map.Entry entry = (Map.Entry) entryObject;
               this.buf.append("\r\n    <log4j:data");
               this.buf.append(" name='" + Transform.escapeTags((String) entry.getKey()) + "'");
               this.buf.append(" value='" + Transform.escapeTags((String) entry.getValue()) + "'");
               this.buf.append(" />");
            }
            this.buf.append("\r\n  </log4j:properties>");
         }
      }

      this.buf.append("\r\n</log4j:event>\r\n\r\n");
      return this.buf.toString();
   }

   public String getContentType() {
      return "text/xml";
   }
}
