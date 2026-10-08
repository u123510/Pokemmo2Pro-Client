package cn.pokemmo.ui.twl.core;

import f.*;

import f.COM5_;
import f.fl_2;
import f.dy0_0;
import f.vp_1;
import f.RF;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.text.ParseException;

/**
 * 简单数学表达式解析器 (SimpleMathParser)
 */
public class TwlSimpleMathParser {
   public final String m20;
   public final fl_2 jK;
   public int VN;


   public TwlSimpleMathParser(String var1, fl_2 var2) {
      this.m20 = var1;
      this.jK = var2;
   }

   public final int n50(boolean var1) {
      try {
         int var2 = this.p7();
         if (var2 == -1) {
            if (var1) {
               return 0;
            }

            this.VA(-1);
         }

         int var3 = 0;

         while (true) {
            var3++;
            this.qA();
            int var4 = this.p7();
            if (var4 == -1) {
               return var3;
            }

            if (var4 == 44 && var1) {
               this.VN++;
            } else {
               this.VA(var4);
            }
         }
      } catch (Exception var5) {
         if (var5 instanceof ParseException) {
            throw sneaky(var5);
         }

         throw sneaky(new ParseException("Unable to execute", this.VN).initCause(var5));
      }
   }

   public final void qA() {
      this.ul();

      while (true) {
         int var1 = this.p7();
         if (var1 == 43) {
            this.VN++;
            this.ul();
            fl_2 var2 = this.jK;
            Number var3 = var2.A10();
            Number var4 = var2.A10();
            Number var5;
            if (var4 instanceof Integer && var3 instanceof Integer) {
               var5 = var4.intValue() + var3.intValue();
            } else {
               var5 = var4.floatValue() + var3.floatValue();
            }

            var2.B.add(var5);
         } else {
            if (var1 != 45) {
               return;
            }

            this.VN++;
            this.ul();
            fl_2 var6 = this.jK;
            Number var7 = var6.A10();
            Number var8 = var6.A10();
            Number var9;
            if (var8 instanceof Integer && var7 instanceof Integer) {
               var9 = var8.intValue() - var7.intValue();
            } else {
               var9 = var8.floatValue() - var7.floatValue();
            }

            var6.B.add(var9);
         }
      }
   }

   public final void ul() {
      this.tK();

      while (true) {
         int var1 = this.p7();
         if (var1 == 42) {
            this.VN++;
            this.tK();
            fl_2 var2 = this.jK;
            Number var3 = var2.A10();
            Number var4 = var2.A10();
            Number var5;
            if (var4 instanceof Integer && var3 instanceof Integer) {
               var5 = var4.intValue() * var3.intValue();
            } else {
               var5 = var4.floatValue() * var3.floatValue();
            }

            var2.B.add(var5);
         } else {
            if (var1 != 47) {
               return;
            }

            this.VN++;
            this.tK();
            fl_2 var6 = this.jK;
            Number var7 = var6.A10();
            Number var8 = var6.A10();
            Number var9;
            if (var8 instanceof Integer && var7 instanceof Integer) {
               if (var7.intValue() == 0) {
                  throw new IllegalStateException("division by zero");
               }

               var9 = var8.intValue() / var7.intValue();
            } else {
               if (Math.abs(var7.floatValue()) == 0.0F) {
                  throw new IllegalStateException("division by zero");
               }

               var9 = var8.floatValue() / var7.floatValue();
            }

            var6.B.add(var9);
         }
      }
   }

   public final void tK() {
      int var1 = this.p7();
      char var2 = (char)var1;
      if (Character.isJavaIdentifierStart(var2)) {
         int var3 = this.VN;

         while (this.VN < this.m20.length() && Character.isJavaIdentifierPart(this.m20.charAt(this.VN))) {
            this.VN++;
         }

         String var4 = this.m20.substring(var3, this.VN);
         int var5 = this.p7();
         if (var5 == 40) {
            this.VN++;
            int var6 = 1;
            this.qA();

            while (true) {
               int var7 = this.p7();
               if (var7 == 41) {
                  this.VN++;
                  this.callFunction(var4, var6);
                  return;
               }

               if (var7 != 44) {
                  this.VA(var7);
               }

               this.VN++;
               var6++;
               this.qA();
            }
         }

         this.resolveVariable(var4);
         this.resolveSuffixes(var5);
      } else if (var1 == 45) {
         this.VN++;
         this.tK();
         fl_2 var8 = this.jK;
         Number var9 = var8.A10();
         if (var9 instanceof Integer) {
            var8.B.add(-var9.intValue());
         } else {
            var8.B.add(-var9.floatValue());
         }
      } else if (var1 == 46 || var1 == 43 || Character.isDigit(var2)) {
         this.parseNumber();
      } else if (var1 == 40) {
         this.VN++;
         this.qA();
         int var10 = this.p7();
         if (var10 != 41) {
            this.VA(var10);
         }

         this.VN++;
      }
   }

   private void callFunction(String var1, int var2) {
      fl_2 var3 = this.jK;
      var3.getClass();
      Object[] var4 = new Object[var2];

      for (int var5 = var2 - 1; var5 >= 0; var5--) {
         int var6 = var3.B.size();
         if (var6 == 0) {
            throw new IllegalStateException("stack underflow");
         }

         var4[var5] = var3.B.remove(var6 - 1);
      }

      vp_1 var10 = (vp_1)var3.sm0.get(var1);
      if (var10 == null) {
         throw new IllegalArgumentException("Unknown function");
      }

      Object var11;
      int var7 = 0;
      while (true) {
         if (var7 >= var2) {
            int[] var8 = new int[var2];
            for (int var9 = 0; var9 < var2; var9++) {
               var8[var9] = ((Number)var4[var9]).intValue();
            }

            var11 = var10.n10(var8);
            break;
         }

         if (!(var4[var7] instanceof Integer)) {
            float[] var12 = new float[var2];
            for (int var13 = 0; var13 < var2; var13++) {
               var12[var13] = ((Number)var4[var13]).floatValue();
            }

            var11 = var10.I4(var12);
            break;
         }

         var7++;
      }

      var3.B.add(var11);
   }

   private void resolveVariable(String var1) {
      Hp0 var2 = (Hp0)this.jK;
      xd0_2 var3 = var2.qA0;

      while (var3 != null) {
         Object var4 = var3.wa0.B20(var1);
         if (var4 == null) {
            var4 = var3.vn(var1, false);
         }

         if (var4 != null) {
            var2.B.add(var4);
            return;
         }

         var3 = var3.gn0;
      }

      Object var5 = var2.xi.AK.wa0.B20(var1);
      if (var5 == null) {
         var5 = (Y30)var2.xi.D4.get(var1);
      }

      if (var5 == null) {
         throw new IllegalArgumentException(jj0_0.hw0("variable not found: ", var1));
      }

      var2.B.add(var5);
   }

   private void resolveSuffixes(int var1) {
      while (var1 == 46 || var1 == 91) {
         int var2 = this.VN + 1;
         this.VN = var2;
         if (var1 == 46) {
            while (this.VN < this.m20.length() && Character.isJavaIdentifierPart(this.m20.charAt(this.VN))) {
               this.VN++;
            }

            String var3 = this.m20.substring(var2, this.VN);
            this.resolveField(var3);
         } else {
            this.tK();
            int var4 = this.p7();
            if (var4 != 93) {
               this.VA(var4);
            }

            this.VN++;
            this.resolveArrayIndex();
         }

         var1 = this.p7();
      }
   }

   private void resolveField(String var1) {
      fl_2 var2 = this.jK;
      int var3 = var2.B.size();
      if (var3 == 0) {
         throw new IllegalStateException("stack underflow");
      }

      Object var4 = var2.B.remove(var3 - 1);
      if (var4 == null) {
         throw new IllegalStateException("null pointer");
      }

      Object var5 = null;
      boolean var6 = false;
      if (var4 instanceof xd0_2) {
         Object var7 = ((xd0_2)var4).W70.B20(var1);
         if (var7 != null) {
            var5 = (xd0_2)var7;
            var6 = true;
         }
      }

      if (!var6 && var4 instanceof LC0) {
         var5 = ((LC0)var4).wa0.B20(var1);
         if (var5 == null) {
            throw new IllegalArgumentException(jj0_0.hw0("field not found: ", var1));
         }

         var6 = true;
      }

      if (!var6) {
         if (var4 instanceof wl0_2 && "border".equals(var1)) {
            ux0_0 var8 = null;
            if (var4 instanceof ix_1) {
               var8 = ((ix_1)var4).MY();
            }

            var5 = var8 != null ? var8 : ux0_0.mf0;
         } else {
            var5 = this.reflectField(var4, var1);
         }
      }

      var2.B.add(var5);
   }

   private Object reflectField(Object var1, String var2) {
      Class<?> var3 = var1.getClass();

      try {
         if (var3.isArray()) {
            if (!"length".equals(var2)) {
               throw new UnknownFieldMarker();
            }

            return Array.getLength(var1);
         }

         Method var4 = fl_2.il(var3, var2);
         if (var4 == null) {
            Class<?>[] var5 = var3.getInterfaces();
            for (Class<?> var7 : var5) {
               var4 = fl_2.il(var7, var2);
               if (var4 != null) {
                  break;
               }
            }
         }

         if (var4 == null) {
            throw new UnknownFieldMarker();
         }

         return var4.invoke(var1, new Object[0]);
      } catch (UnknownFieldMarker var8) {
         throw new IllegalStateException("unknown field '" + var2 + "' of class '" + var3 + "'");
      } catch (Throwable var9) {
         throw new IllegalStateException("error accessing field '" + var2 + "' of class '" + var3 + "'", var9);
      }
   }

   private void resolveArrayIndex() {
      fl_2 var1 = this.jK;
      Number var2 = var1.A10();
      int var3 = var1.B.size();
      if (var3 == 0) {
         throw new IllegalStateException("stack underflow");
      }

      Object var4 = var1.B.remove(var3 - 1);
      if (var4 == null) {
         throw new IllegalStateException("null pointer");
      }

      if (!var4.getClass().isArray()) {
         throw new IllegalStateException("array expected");
      }

      try {
         var1.B.add(Array.get(var4, var2.intValue()));
      } catch (ArrayIndexOutOfBoundsException var5) {
         throw new IllegalStateException("array index out of bounds", var5);
      }
   }

   private void parseNumber() {
      int var1 = this.m20.length();
      int var2 = this.VN;
      int var3 = this.m20.charAt(var2);
      if (var3 == 43) {
         var2 = this.VN + 1;
         this.VN = var2;
      } else if (var3 == 48) {
         int var4 = this.VN + 1;
         if (var4 < var1 && this.m20.charAt(var4) == 'x') {
            this.VN += 2;
            var2 = this.VN;

            while (this.VN < var1 && "0123456789abcdefABCDEF".indexOf(this.m20.charAt(this.VN)) >= 0) {
               this.VN++;
            }

            int var5 = this.VN;
            if (var5 - var2 > 8) {
               throw sneaky(new ParseException("Number to large at " + this.VN, this.VN));
            }

            if (var5 == var2) {
               this.VA(var5 < var1 ? this.m20.charAt(var5) : -1);
            }

            this.jK.B.add((int)Long.parseLong(this.m20.substring(var2, var5), 16));
            return;
         }
      }

      while (this.VN < var1 && Character.isDigit(this.m20.charAt(this.VN))) {
         this.VN++;
      }

      Number var6;
      if (this.VN < var1 && this.m20.charAt(this.VN) == '.') {
         do {
            this.VN++;
         } while (this.VN < var1 && Character.isDigit(this.m20.charAt(this.VN)));

         int var7 = this.VN;
         if (var7 - var2 <= 1) {
            this.VA(-1);
         }

         var6 = Float.valueOf(this.m20.substring(var2, var7));
      } else {
         var6 = Integer.valueOf(this.m20.substring(var2, this.VN));
      }

      this.jK.B.add(var6);
   }

   public final int p7() {
      while (this.VN != this.m20.length()) {
         if (!Character.isWhitespace(this.m20.charAt(this.VN))) {
            return this.m20.charAt(this.VN);
         }

         this.VN++;
      }

      return -1;
   }

   public final void VA(int var1) {
      if (var1 < 0) {
         throw sneaky(new ParseException("Unexpected end of string", this.VN));
      }

      throw sneaky(new ParseException("Unexpected character '" + (char)var1 + "' at " + this.VN, this.VN));
   }

   private static RuntimeException sneaky(Throwable var0) {
      TwlSimpleMathParser.<RuntimeException>sneakyThrow(var0);
      return null;
   }

   @SuppressWarnings("unchecked")
   private static <T extends Throwable> void sneakyThrow(Throwable var0) throws T {
      throw (T)var0;
   }

   private static final class UnknownFieldMarker extends RuntimeException {
      private static final long serialVersionUID = 1L;
   }
}
