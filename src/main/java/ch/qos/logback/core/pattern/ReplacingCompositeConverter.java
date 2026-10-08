package ch.qos.logback.core.pattern;

import java.util.List;
import java.util.regex.Pattern;

public class ReplacingCompositeConverter extends CompositeConverter {
   Pattern pattern;
   String regex;
   String replacement;

   public void start() {
      List var1;
      if ((var1 = ((DynamicConverter)this).getOptionList()) == null) {
         ((DynamicConverter)this).addError("at least two options are expected whereas you have declared none");
      } else {
         int var2;
         if ((var2 = var1.size()) < 2) {
            ((DynamicConverter)this).addError("at least two options are expected whereas you have declared only " + var2 + "as [" + String.valueOf(var1) + "]");
         } else {
            ReplacingCompositeConverter var10000 = this;
            ReplacingCompositeConverter var10001 = this;
            ReplacingCompositeConverter var10003 = this;
            String var3;
            this.regex = var3 = (String)var1.get(0);
            var10003.pattern = Pattern.compile(var3);
            var10001.replacement = (String)var1.get(1);
            var10000.start();
         }
      }
   }

   public String transform(Object var1, String var2) {
      return !super.started ? var2 : this.pattern.matcher(var2).replaceAll(this.replacement);
   }
}
