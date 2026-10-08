package ch.qos.logback.classic.pattern;

import ch.qos.logback.classic.spi.ILoggingEvent;
import java.util.List;

public class KeyValuePairConverter extends ClassicConverter {
   static final String DOUBLE_OPTION_STR = "DOUBLE";
   static final String SINGLE_OPTION_STR = "SINGLE";
   static final String NONE_OPTION_STR = "NONE";

   ValueQuoteSpecification valueQuoteSpec;

   public KeyValuePairConverter() {
      this.valueQuoteSpec = ValueQuoteSpecification.DOUBLE;
   }

   private ValueQuoteSpecification optionStrToSpec(String var1) {
      if (var1 == null) {
         return ValueQuoteSpecification.DOUBLE;
      } else if ("DOUBLE".equalsIgnoreCase(var1)) {
         return ValueQuoteSpecification.DOUBLE;
      } else if ("SINGLE".equalsIgnoreCase(var1)) {
         return ValueQuoteSpecification.SINGLE;
      } else {
         return "NONE".equalsIgnoreCase(var1) ? ValueQuoteSpecification.NONE : ValueQuoteSpecification.DOUBLE;
      }
   }

   public void start() {
      this.valueQuoteSpec = this.optionStrToSpec(this.getFirstOption());
      super.start();
   }

   public String convert(ILoggingEvent var1) {
      List var2 = var1.getKeyValuePairs();
      if (var2 == null || var2.isEmpty()) {
         return "";
      } else {
         StringBuilder var3 = new StringBuilder();

         for (int var4 = 0; var4 < var2.size(); ++var4) {
            if (var4 > 0) {
               var3.append(' ');
            }

            Object var5 = var2.get(var4);
            Character var6 = this.valueQuoteSpec.asChar();
            if (var6 != null) {
               var3.append(var6.charValue());
            }

            var3.append(var5);
            if (var6 != null) {
               var3.append(var6.charValue());
            }
         }

         return var3.toString();
      }
   }

   enum ValueQuoteSpecification {
      NONE,
      SINGLE,
      DOUBLE;

      Character asChar() {
         switch (this.ordinal()) {
            case 0:
               return null;
            case 1:
               return Character.valueOf('\'');
            case 2:
               return Character.valueOf('"');
            default:
               throw new IllegalStateException();
         }
      }
   }
}