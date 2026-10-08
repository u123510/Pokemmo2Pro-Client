package ch.qos.logback.core.pattern;

public class FormatInfo {
   private int min;
   private int max;
   private boolean leftPad;
   private boolean leftTruncate;

   public FormatInfo() {
      this.min = Integer.MIN_VALUE;
      this.max = Integer.MAX_VALUE;
      this.leftPad = true;
      this.leftTruncate = true;
   }

   public FormatInfo(int var1, int var2) {
      this.leftPad = true;
      this.leftTruncate = true;
      this.min = var1;
      this.max = var2;
   }

   public FormatInfo(int var1, int var2, boolean var3, boolean var4) {
      this.min = var1;
      this.max = var2;
      this.leftPad = var3;
      this.leftTruncate = var4;
   }

   public static FormatInfo valueOf(String var0) {
      if (var0 != null) {
         FormatInfo var1;
         var1 = new FormatInfo();
         int var2;
         int var10000 = var2 = var0.indexOf(46);
         String var3 = null;
         if (var10000 != -1) {
            var3 = var0.substring(0, var2);
            if (++var2 == var0.length()) {
               throw new IllegalArgumentException("Formatting string [" + var0 + "] should not end with '.'");
            }

            var0 = var0.substring(var2);
            var3 = var0;
            var0 = var3;
         }

         if (var0 != null && var0.length() > 0) {
            int var5;
            if ((var5 = Integer.parseInt(var0)) >= 0) {
               var1.min = var5;
            } else {
               var1.min = -var5;
               var1.leftPad = false;
            }
         }

         if (var3 != null && var3.length() > 0) {
            int var6;
            if ((var6 = Integer.parseInt(var3)) >= 0) {
               var1.max = var6;
            } else {
               var1.max = -var6;
               var1.leftTruncate = false;
            }
         }

         return var1;
      } else {
         throw new NullPointerException("Argument cannot be null");
      }
   }

   public boolean isLeftPad() {
      return this.leftPad;
   }

   public void setLeftPad(boolean var1) {
      this.leftPad = var1;
   }

   public int getMax() {
      return this.max;
   }

   public void setMax(int var1) {
      this.max = var1;
   }

   public int getMin() {
      return this.min;
   }

   public void setMin(int var1) {
      this.min = var1;
   }

   public boolean isLeftTruncate() {
      return this.leftTruncate;
   }

   public void setLeftTruncate(boolean var1) {
      this.leftTruncate = var1;
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof FormatInfo)) {
         return false;
      } else {
         FormatInfo other = (FormatInfo)var1;
         return this.min == other.min && this.max == other.max && this.leftPad == other.leftPad && this.leftTruncate == other.leftTruncate;
      }
   }

   public int hashCode() {
      int result = this.min;
      result = 31 * result + this.max;
      result = 31 * result + (this.leftPad ? 1 : 0);
      result = 31 * result + (this.leftTruncate ? 1 : 0);
      return result;
   }

   public String toString() {
      int var10000 = this.min;


      int var3 = this.max;
      boolean var1 = this.leftPad;
      boolean var2 = this.leftTruncate;
      return "FormatInfo(" + var10000 + ", " + var3 + ", " + var1 + ", " + var2 + ")";
   }
}