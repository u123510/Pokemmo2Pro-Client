package ch.qos.logback.core.rolling;

import ch.qos.logback.core.util.Duration;
import ch.qos.logback.core.util.FileSize;
import ch.qos.logback.core.util.InvocationGate;
import ch.qos.logback.core.util.SimpleInvocationGate;
import java.io.File;

public class SizeBasedTriggeringPolicy extends TriggeringPolicyBase {
   public static final String SEE_SIZE_FORMAT = "http://logback.qos.ch/codes.html#sbtp_size_format";
   public static final long DEFAULT_MAX_FILE_SIZE = 10485760L;
   FileSize maxFileSize;
   InvocationGate invocationGate;
   Duration checkIncrement;

   public SizeBasedTriggeringPolicy() {



      super();
      FileSize var1;
      var1 = new FileSize(10485760L);
      this.maxFileSize = var1;
      SimpleInvocationGate var2;
      var2 = new SimpleInvocationGate();
      this.invocationGate = var2;
      this.checkIncrement = null;
   }

   public void start() {
      if (this.checkIncrement != null) {
         this.invocationGate = new SimpleInvocationGate(this.checkIncrement);
      }

      super.start();
   }

   public boolean isTriggeringEvent(File var1, Object var2) {
      long var3 = System.currentTimeMillis();
      if (this.invocationGate.isTooSoon(var3)) {
         return false;
      } else {
         return var1.length() >= this.maxFileSize.getSize();
      }
   }

   public FileSize getMaxFileSize() {
      return this.maxFileSize;
   }

   public void setMaxFileSize(FileSize var1) {
      this.maxFileSize = var1;
   }

   public Duration getCheckIncrement() {
      return this.checkIncrement;
   }

   public void setCheckIncrement(Duration var1) {
      this.checkIncrement = var1;
   }
}
