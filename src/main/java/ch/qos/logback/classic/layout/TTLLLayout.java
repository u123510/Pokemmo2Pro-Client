package ch.qos.logback.classic.layout;

import ch.qos.logback.classic.pattern.ThrowableProxyConverter;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.LayoutBase;
import ch.qos.logback.core.util.CachingDateFormatter;
import java.util.List;

public class TTLLLayout extends LayoutBase<ILoggingEvent> {
   static final char DOUBLE_QUOTE_CHAR = '"';
   CachingDateFormatter cachingDateFormatter;
   ThrowableProxyConverter tpc;

   public TTLLLayout() {
      super();
      this.cachingDateFormatter = new CachingDateFormatter("HH:mm:ss.SSS");
      this.tpc = new ThrowableProxyConverter();
   }

   private void kvp(ILoggingEvent var1, StringBuilder var2) {
      List var3 = var1.getKeyValuePairs();
      if (var3 != null && !var3.isEmpty()) {
         for (int var4 = 0; var4 < var3.size(); ++var4) {
            if (var4 > 0) {
               var2.append(' ');
            }
            var2.append(var3.get(var4));
         }
      }
   }

   public void start() {
      this.tpc.start();
      super.start();
   }

   public String doLayout(ILoggingEvent var1) {
      if (!this.isStarted()) {
         return "";
      } else {
         StringBuilder var2 = new StringBuilder();
         long var3 = var1.getTimeStamp();
         var2.append(this.cachingDateFormatter.format(var3));
         var2.append(" [");
         var2.append(var1.getThreadName());
         var2.append("] ");
         var2.append(var1.getLevel().toString());
         var2.append(" ");
         var2.append(var1.getLoggerName());
         var2.append(" -");
         this.kvp(var1, var2);
         var2.append("- ");
         var2.append(var1.getFormattedMessage());
         var2.append(CoreConstants.LINE_SEPARATOR);
         if (var1.getThrowableProxy() != null) {
            var2.append(this.tpc.convert(var1));
         }
         return var2.toString();
      }
   }
}
