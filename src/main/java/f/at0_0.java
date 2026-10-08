package f;

// $FF: synthetic class
/**
 * 编译器合成类 (Synthetic Switch Table) - f.at0_0
 * 由 Javac 编译 Enum Switch 语句生成的合成跳转表，保留在 f 包中供字节码与反射调用。
 */
public abstract class at0_0 {
   // $FF: synthetic field
   public static final int[] Bt0;

   private at0_0() {
   }

   static {
      int[] var10000 = Bt0 = new int[((tf0_0[])tf0_0.pe0.clone()).length];
      byte var10001 = 0;

      try {
         var10000[var10001] = 1;
      } catch (NoSuchFieldError var1) {
      }

      label65: {
         try {
            var10000 = Bt0;
         } catch (NoSuchFieldError var7) {
            var10001 = 0;
            break label65;
         }

         var10001 = 1;

         try {
            var10000[var10001] = 2;
         } catch (NoSuchFieldError var6) {
            var10001 = 0;
         }
      }

      label66: {
         try {
            var10000 = Bt0;
         } catch (NoSuchFieldError var5) {
            var10001 = 0;
            break label66;
         }

         var10001 = 2;

         try {
            var10000[var10001] = 3;
         } catch (NoSuchFieldError var4) {
            var10001 = 0;
         }
      }

      label67: {
         try {
            var10000 = Bt0;
         } catch (NoSuchFieldError var3) {
            var10001 = 0;
            break label67;
         }

         var10001 = 3;

         try {
            var10000[var10001] = 4;
         } catch (NoSuchFieldError var2) {
            var10001 = 0;
         }
      }

   }
}
