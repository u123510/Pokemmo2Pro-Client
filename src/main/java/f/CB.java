package f;

// $VF: synthetic class
/**
 * 编译器合成类 (Synthetic Switch Table) - f.CB
 * 由 Javac 编译 Enum Switch 语句生成的合成跳转表，保留在 f 包中供字节码与反射调用。
 */
public abstract class CB {
   public static final int[] ye;

   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   static {
      int var0 = Math.max(cy0_0.Mm.Cu, Math.max(cy0_0.Vr0.Cu, cy0_0.Kt0.Cu)) + 1;
      int[] var10000 = ye = new int[var0];
      int var10001 = cy0_0.Mm.Cu;

      try {
         var10000[var10001] = 1;
      } catch (NoSuchFieldError var3) {
      }

      label40: {
         try {
            var10000 = ye;
         } catch (NoSuchFieldError var5) {
            break label40;
         }

          var10001 = cy0_0.Vr0.Cu;

         try {
            var10000[var10001] = 2;
         } catch (NoSuchFieldError var2) {
         }
      }

      label41: {
         try {
            var10000 = ye;
         } catch (NoSuchFieldError var4) {
            break label41;
         }

          var10001 = cy0_0.Kt0.Cu;

         try {
            var10000[var10001] = 3;
         } catch (NoSuchFieldError var1) {
         }
      }
   }
}
