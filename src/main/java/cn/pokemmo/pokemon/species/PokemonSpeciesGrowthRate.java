package cn.pokemmo.pokemon.species;

import f.*;

import java.util.Arrays;

public class PokemonSpeciesGrowthRate {
   public static final SS hG0 = new SS();
   public nj0_0 COM3;
   public final SQ kn0 = new SQ();
   public final SQ jC = new SQ();
   public final w7_0 KU = new w7_0();
   public byte zx0 = 0;
   public byte Vo0 = 0;
   public final byte[][] PB0 = new byte[4][4];

   public final AG0[] U(short var1, byte var2, boolean var3) {
      short var4 = rg0_0.dM(var1);
      ht_0 var5 = var4 > 0 ? QI.Py.kN((byte)10, var4, false) : null;
      if (var5 instanceof IH) {
         IH var6 = (IH)var5;
         int[] var7 = var6.hj0.Zw0();
         Arrays.sort(var7);
         AG0[] var8 = new AG0[var7.length];
         for (int var9 = 0; var9 < var7.length; var9++) {
            Wr var10 = (Wr)var6.hj0.get(var7[var9]);
            var8[var9] = new AG0(var10, 0, 0, var10.fr0, var10.Tq);
         }
         return var8;
      }

      if (var3) {
         int var6 = var1 | var2 << 16;
         ty0 var7 = (ty0)this.jC.get(var6);
         if (var7 != null) {
            AG0[] var8 = (AG0[])this.kn0.get(var6);
            if (var8 != null) {
               return var8;
            }
            var8 = var7.bb0(this.zx0, this.Vo0);
            if (var8 != null) {
               this.kn0.j10(this.kn0.yw0(var6), var8);
               return var8;
            }
         }
      }

      boolean var6 = (var2 & 32) != 0;
      int var7 = var2 & 31;
      if (rg0_0.gu(var1, var6, false, var7) - 1 < 0) {
         return null;
      }
      short var8 = rg0_0.Prn(var7, var1);
      ej_1 var9;
      if (var8 > 0) {
         var9 = this.COM3.AF(var8);
      } else {
         short var10 = (short)(rg0_0.gu(var1, var6, false, var7) + 4095);
         if ((var2 & 64) != 0) {
            var10 = (short)(var10 + 2000);
         }
         var9 = this.COM3.AF(var10);
      }
      AG0[] var10 = new AG0[var9.TK.length];
      for (int var11 = 0; var11 < var10.length; var11++) {
         var10[var11] = new AG0(var9.TK[var11], 0, 0, -1, -1);
      }
      return var10;
   }
}
