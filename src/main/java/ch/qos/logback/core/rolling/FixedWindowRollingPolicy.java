package ch.qos.logback.core.rolling;

import ch.qos.logback.core.rolling.helper.CompressionMode;
import ch.qos.logback.core.rolling.helper.Compressor;
import ch.qos.logback.core.rolling.helper.FileFilterUtil;
import ch.qos.logback.core.rolling.helper.FileNamePattern;
import ch.qos.logback.core.rolling.helper.RenameUtil;
import ch.qos.logback.core.spi.ContextAwareBase;
import java.io.File;
import java.util.Date;

public class FixedWindowRollingPolicy extends RollingPolicyBase {
   static final String FNP_NOT_SET = "The \"FileNamePattern\" property must be set before using FixedWindowRollingPolicy. ";
   static final String PRUDENT_MODE_UNSUPPORTED = "See also http://logback.qos.ch/codes.html#tbr_fnp_prudent_unsupported";
   static final String SEE_PARENT_FN_NOT_SET = "Please refer to http://logback.qos.ch/codes.html#fwrp_parentFileName_not_set";
   public static final String ZIP_ENTRY_DATE_PATTERN = "yyyy-MM-dd_HHmm";
   private static int MAX_WINDOW_SIZE;
   int maxIndex;
   int minIndex;
   RenameUtil util;
   Compressor compressor;

   public FixedWindowRollingPolicy() {



      super();
      RenameUtil var1;
      var1 = new RenameUtil();
      this.util = var1;
      this.minIndex = 1;
      this.maxIndex = 7;
   }

   private String transformFileNamePatternFromInt2Date(String var1) {
      return FileFilterUtil.afterLastSlash(FileFilterUtil.slashify(var1)).replace("%i", "%d{yyyy-MM-dd_HHmm}");
   }

   public void start() {
      this.util.setContext(super.context);
      if (super.fileNamePatternStr != null) {
         FileNamePattern var1;
         var1 = new FileNamePattern(super.fileNamePatternStr, super.context);
         super.fileNamePattern = var1;
         ((RollingPolicyBase)this).determineCompressionMode();
         if (!((RollingPolicyBase)this).isParentPrudent()) {
            if (((RollingPolicyBase)this).getParentsRawFileProperty() != null) {
               int var2;
               int var3;
               if ((var3 = this.maxIndex) < (var2 = this.minIndex)) {
                  ((ContextAwareBase)this).addWarn("MaxIndex (" + var3 + ") cannot be smaller than MinIndex (" + var2 + ").");
                  ((ContextAwareBase)this).addWarn("Setting maxIndex to equal minIndex.");
                  this.maxIndex = this.minIndex;
               }

               var3 = this.getMaxWindowSize();
               if (this.maxIndex - this.minIndex > var3) {
                  ((ContextAwareBase)this).addWarn("Large window sizes are not allowed.");
                  int var10000 = this.maxIndex = this.minIndex + var3;
                  ((ContextAwareBase)this).addWarn("MaxIndex reduced to " + var10000);
               }

               if (super.fileNamePattern.getIntegerTokenConverter() != null) {
                  if (super.compressionMode == CompressionMode.ZIP) {
                     String var5 = this.transformFileNamePatternFromInt2Date(super.fileNamePatternStr);
                     FileNamePattern var7;
                     var7 = new FileNamePattern(var5, super.context);
                     super.zipEntryFileNamePattern = var7;
                  }

                  Compressor var6;
                  Compressor var8 = var6 = new Compressor(super.compressionMode);
                  this.compressor = var6;
                  ((ContextAwareBase)var8).setContext(super.context);
                  super.start();
               } else {
                  throw new IllegalStateException("FileNamePattern [" + super.fileNamePattern.getPattern() + "] does not contain a valid IntegerToken");
               }
            } else {
               ((ContextAwareBase)this).addError("The File name property must be set before using this rolling policy.");
               ((ContextAwareBase)this).addError("Please refer to http://logback.qos.ch/codes.html#fwrp_parentFileName_not_set");
               throw new IllegalStateException("The \"File\" option must be set.");
            }
         } else {
            ((ContextAwareBase)this).addError("Prudent mode is not supported with FixedWindowRollingPolicy.");
            ((ContextAwareBase)this).addError("See also http://logback.qos.ch/codes.html#tbr_fnp_prudent_unsupported");
            throw new IllegalStateException("Prudent mode is not supported.");
         }
      } else {
         ((ContextAwareBase)this).addError("The \"FileNamePattern\" property must be set before using FixedWindowRollingPolicy. ");
         ((ContextAwareBase)this).addError("See also http://logback.qos.ch/codes.html#tbr_fnp_not_set");
         throw new IllegalStateException("The \"FileNamePattern\" property must be set before using FixedWindowRollingPolicy. See also http://logback.qos.ch/codes.html#tbr_fnp_not_set");
      }
   }

   public int getMaxWindowSize() {
      return MAX_WINDOW_SIZE;
   }

   public void rollover() {
      if (this.maxIndex >= 0) {
         File var1;
         File var10000 = var1 = new File(super.fileNamePattern.convertInt(this.maxIndex));
         if (var1.exists()) {
            var1.delete();
         }

         for(int var3 = this.maxIndex - 1; var3 >= this.minIndex; --var3) {
            String var2 = super.fileNamePattern.convertInt(var3);
            if ((new File(var2)).exists()) {
               this.util.rename(var2, super.fileNamePattern.convertInt(var3 + 1));
            } else {
               ((ContextAwareBase)this).addInfo("Skipping roll-over for inexistent file " + var2);
            }
         }

         switch (super.compressionMode) {
            case NONE:
               this.util.rename(this.getActiveFileName(), super.fileNamePattern.convertInt(this.minIndex));
               break;
            case GZ:
               this.compressor.compress(this.getActiveFileName(), super.fileNamePattern.convertInt(this.minIndex), (String)null);
               break;
            case ZIP:
               this.compressor.compress(this.getActiveFileName(), super.fileNamePattern.convertInt(this.minIndex), super.zipEntryFileNamePattern.convert(new Date()));
               break;
         }
      }

   }

   public String getActiveFileName() {
      return ((RollingPolicyBase)this).getParentsRawFileProperty();
   }

   public int getMaxIndex() {
      return this.maxIndex;
   }

   public int getMinIndex() {
      return this.minIndex;
   }

   public void setMaxIndex(int var1) {
      this.maxIndex = var1;
   }

   public void setMinIndex(int var1) {
      this.minIndex = var1;
   }
}
