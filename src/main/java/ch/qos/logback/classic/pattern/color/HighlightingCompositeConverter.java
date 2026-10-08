package ch.qos.logback.classic.pattern.color;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.pattern.color.ForegroundCompositeConverterBase;

public class HighlightingCompositeConverter extends ForegroundCompositeConverterBase<ILoggingEvent> {
   public String getForegroundColorCode(ILoggingEvent var1) {
      int var2;
      if ((var2 = var1.getLevel().toInt()) != 20000) {
         if (var2 != 30000) {
            return var2 != 40000 ? "39" : "1;31";
         } else {
            return "31";
         }
      } else {
         return "34";
      }
   }
}
