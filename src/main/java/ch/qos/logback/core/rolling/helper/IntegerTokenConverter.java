package ch.qos.logback.core.rolling.helper;

import ch.qos.logback.core.pattern.DynamicConverter;
import ch.qos.logback.core.pattern.FormatInfo;
import ch.qos.logback.core.pattern.FormattingConverter;

public class IntegerTokenConverter extends DynamicConverter implements MonoTypedConverter {
   public static final String CONVERTER_KEY = "i";

   public String convert(int var1) {
      String var4 = Integer.toString(var1);
      FormatInfo var5;
      if ((var5 = ((FormattingConverter)this).getFormattingInfo()) == null) {
         return var4;
      } else {
         int var6 = var5.getMin();
         StringBuilder var2;
         var2 = new StringBuilder();

         for(int var3 = var4.length(); var3 < var6; ++var3) {
            var2.append('0');
         }

         return var2.append(var4).toString();
      }
   }

   public String convert(Object var1) {
      if (var1 != null) {
         if (var1 instanceof Integer) {
            return this.convert((Integer)var1);
         } else {
            String var10002 = String.valueOf(var1);
            throw new IllegalArgumentException("Cannot convert " + var10002 + " of type" + var1.getClass().getName());
         }
      } else {
         throw new IllegalArgumentException("Null argument forbidden");
      }
   }

   public boolean isApplicable(Object var1) {
      return var1 instanceof Integer;
   }
}
