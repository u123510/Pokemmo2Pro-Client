package ch.qos.logback.core.pattern.parser;

import ch.qos.logback.core.pattern.FormatInfo;

public class FormattingNode extends Node {
   FormatInfo formatInfo;

   public FormattingNode(int var1) {
      super(var1);
   }

   public FormattingNode(int var1, Object var2) {
      super(var1, var2);
   }

   public FormatInfo getFormatInfo() {
      return this.formatInfo;
   }

   public void setFormatInfo(FormatInfo var1) {
      this.formatInfo = var1;
   }

   public boolean equals(Object var1) {
      if (!super.equals(var1)) {
         return false;
      } else if (!(var1 instanceof FormattingNode)) {
         return false;
      } else {
         FormattingNode var3 = (FormattingNode)var1;
         return (this.formatInfo != null) ? this.formatInfo.equals(var3.formatInfo) : (var3.formatInfo == null);
      }
   }

   public int hashCode() {
      int var2 = super.hashCode() * 31;
      FormatInfo var1;
      int var3;
      if ((var1 = this.formatInfo) != null) {
         var3 = var1.hashCode();
      } else {
         var3 = 0;
      }

      return var2 + var3;
   }
}
