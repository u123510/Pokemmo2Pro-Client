package cn.pokemmo.util;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.COM3_
 */
public class Modern_Util_Com3 implements lf_0 {

   public final nh_1 Y3;
   public final zr_1 nK0;
   public final pq_1 C40;

   public Modern_Util_Com3() {
      nh_1 var1;
      var1 = new nh_1();
      this.Y3 = var1;
      zr_1 var2;
      var2 = new zr_1();
      this.nK0 = var2;
      pq_1 var3;
      var3 = new pq_1();
      this.C40 = var3;
   }

   @Override
   public final KV getLoggerFactory() {
      return this.Y3;
   }

   @Override
   public final ZK0 getMarkerFactory() {
      return this.nK0;
   }

   @Override
   public final Sm0 getMDCAdapter() {
      return this.C40;
   }

   @Override
   public final String getRequestedApiVersion() {
      throw new UnsupportedOperationException();
   }

   @Override
   public final void initialize() {
   }
}

