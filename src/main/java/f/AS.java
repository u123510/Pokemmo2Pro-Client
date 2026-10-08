package f;

// $FF: synthetic class
/**
 * 编译器合成类 (Synthetic Switch Table) - f.AS
 * 由 Javac 编译 Enum Switch 语句生成的合成跳转表，保留在 f 包中供字节码与反射调用。
 */
public abstract class AS {
   // $FF: synthetic field
   public static final int[] rw;

   static {
      xj_0[] tmp = (xj_0[])QuarantineArrays.obj(xj_0.class, "Su0");
      if (tmp == null) {
         tmp = new xj_0[0];
      }

      int[] var10000 = rw = new int[tmp.length];

      label43: {
         try {
            xj_0 var6 = xj_0.Jr;
         } catch (NoSuchFieldError var4) {
            boolean var10001 = false;
            break label43;
         }

         byte var7 = 0;

         try {
            var10000[var7] = 1;
         } catch (NoSuchFieldError var3) {
            var7 = 0;
         }
      }

      label44: {
         try {
            var10000 = rw;
            xj_0 var10 = xj_0.Jr;
         } catch (NoSuchFieldError var2) {
            boolean var9 = false;
            break label44;
         }

         byte var11 = 6;

         try {
            var10000[var11] = 2;
         } catch (NoSuchFieldError var1) {
            var11 = 0;
         }
      }

   }
}
