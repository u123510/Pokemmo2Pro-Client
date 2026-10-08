package ch.qos.logback.classic.sift;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.sift.AbstractDiscriminator;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.util.OptionHelper;
import java.util.Map;

public class MDCBasedDiscriminator extends AbstractDiscriminator<ILoggingEvent> {
   private String key;
   private String defaultValue;

   public String getDiscriminatingValue(ILoggingEvent var1) {
      Map var2;
      if ((var2 = var1.getMDCPropertyMap()) == null) {
         return this.defaultValue;
      } else {
         String var3;
         return (var3 = (String)var2.get(this.key)) == null ? this.defaultValue : var3;
      }
   }

   public void start() {
      int var1 = 0;
      if (OptionHelper.isNullOrEmptyOrAllSpaces(this.key)) {
         var1 = 1;
         ((ContextAwareBase)this).addError("The \"Key\" property must be set");
      }

      if (OptionHelper.isNullOrEmptyOrAllSpaces(this.defaultValue)) {
         ++var1;
         ((ContextAwareBase)this).addError("The \"DefaultValue\" property must be set");
      }

      if (var1 == 0) {
         super.started = true;
      }

   }

   public String getKey() {
      return this.key;
   }

   public void setKey(String var1) {
      this.key = var1;
   }

   public String getDefaultValue() {
      return this.defaultValue;
   }

   public void setDefaultValue(String var1) {
      this.defaultValue = var1;
   }
}
