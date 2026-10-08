package cn.pokemmo.world.map;

import f.*;

public class MapZoneConnectionDescriptor extends bi0_1 {
   public final bi0_1 KL0;
   public final in_2 Ix0;
   public short Lu0;
   public byte zD;
   public boolean Pm0;

   public MapZoneConnectionDescriptor(bi0_1 var1, short var2, byte var3) {
      this(var1, oZ(var1), var2, var3);
   }

   public MapZoneConnectionDescriptor(bi0_1 var1, zv_2 var2, short var3, byte var4) {
      super(q20_0.xp0().vJ(), var2, (byte)0);
      in_2 var5 = new in_2(2000);
      this.Ix0 = var5;
      this.KL0 = var1;
      var5.ng0();
      this.Lu0 = var3;
      this.zD = var4;
   }

   public static zv_2 oZ(bi0_1 var0) {
      LT var1;
      if ((var1 = var0.ba0.LPt1()) == null) {
         return new zv_2(var0.ba0);
      }

      LT var2;
      if ((var2 = var1.F2().gv(var1, var0.ba0.Y30, -1)) != null && !var2.LPt1()) {
         if (var2.Es() != var1.Es()) {
            return new zv_2(var0.ba0);
         }

         if (Math.abs(var2.S80() - var1.S80()) > 2.0F) {
            return new zv_2(var0.ba0);
         }

         byte var12 = var2.F2().dw;
         byte var3 = var2.F2().Bm0;
         byte var4 = var2.F2().case$;
         boolean var5 = var2.gr0();
         short var6 = var2.Tz();
         short var7 = var2.HR();
         byte var8 = var2.Es();
         short var10003 = var2.Tz();
         short var9 = var2.HR();
         short var10 = var0.ba0.Lq0;
         byte var11 = tx_1.Zk(var10003, var9, var10, var0.ba0.B5);
         return new zv_2(var12, var3, var4, var5, var6, var7, var8, var11);
      } else {
         return new zv_2(var0.ba0);
      }
   }

   @Override
   public final void ql(short var1, byte var2, boolean var3) {
      this.Lu0 = var1;
      this.zD = var2;
      this.Pm0 = var3;
   }

   @Override
   public final short mI0() {
      return this.Lu0;
   }

   @Override
   public final byte QL() {
      return this.zD;
   }

   @Override
   public final mg_0 at() {
      return new Ai0((KF) this);
   }

   @Override
   public final byte QU() {
      return this.KL0.ba0.uS;
   }

   @Override
   public final short ki0() {
      return 303;
   }

   @Override
   public final String na0() {
      return "";
   }

   @Override
   public final boolean uv() {
      return this.KL0.uv();
   }

   @Override
   public final boolean LH0() {
      return this.KL0.LH0();
   }

   @Override
   public final boolean vx0() {
      mg_0 var1;
      return this.KL0.mI0() != 0 && this.KL0.Jf0() && ((Ai0)(var1 = super.hj)).yv != null && ((Ai0)var1).wT > 127;
   }

   @Override
   public final mg_0 uR() {
      return (Ai0)super.hj;
   }
}
