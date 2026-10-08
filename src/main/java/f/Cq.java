package f;

import cn.pokemmo.battle.BattleFormat;

/**
 * 兼容垫片 (Shim) - 对战赛制模式枚举
 * 核心定义已迁移至 {@link BattleFormat}
 */
public enum Cq {
   Wn0((byte)0, (byte)1, (byte)1, 100, null),
   ez((byte)1, (byte)2, (byte)2, 101, null),
   UNMAPPED_2((byte)2, (byte)2, (byte)2, 102, null),
   UNMAPPED_3((byte)3, (byte)2, (byte)2, 103, null),
   Jd((byte)4, (byte)1, (byte)1, -1, null),
   Hs0((byte)5, (byte)3, (byte)3, 104, null),
   Jz0((byte)6, (byte)1, (byte)5, -1, null),
   yH((byte)7, (byte)3, (byte)3, 107, new int[]{1}),
   yL((byte)8, (byte)1, (byte)1, -1, null),
   Sa0((byte)9, (byte)4, (byte)3, -1, null);

   public static final Cq[] NZ;
   public static final bm0_1 QV = new bm0_1();
   public final byte WW;
   public final byte e50;
   public final byte Lw0;
   public final int YV;
   public final int[] U7;

   private Cq(byte var1, byte var2, byte var3, int var4, int[] var5) {
      this.WW = var1;
      this.e50 = var2;
      this.Lw0 = var3;
      this.YV = var4;
      this.U7 = var5;
      if (var5 != null) {
         int var10000 = var5[0];
      }
   }

   public static Cq Gl(byte var0) {
      return (Cq)t_0.BI0(QV.BM(var0), Cq.class, var0);
   }

   static {
      NZ = new Cq[]{Wn0, ez, Hs0, yH};
      for (Cq var0 : values()) {
         QV.gE0(var0.WW, var0);
      }
   }

   public final byte Un(byte var1) {
      return var1 > 0 ? this.Lw0 : this.e50;
   }

   public final int MI() {
      return this.YV;
   }

   public final boolean po0(int var1) {
      int[] var2 = this.U7;
      if (var2 == null) {
         return true;
      }

      for (int var3 : var2) {
         if (var3 == var1) {
            return true;
         }
      }

      return false;
   }

   public final cn.pokemmo.battle.BattleFormat toDomain() {
      return cn.pokemmo.battle.BattleFormat.fromObfuscated(this);
   }

   public static Cq fromDomain(cn.pokemmo.battle.BattleFormat domain) {
      return domain != null ? domain.toObfuscated() : null;
   }

   public BattleFormat asModern() {
      return toDomain();
   }

   public static Cq asBridge(BattleFormat modern) {
      return fromDomain(modern);
   }
}

