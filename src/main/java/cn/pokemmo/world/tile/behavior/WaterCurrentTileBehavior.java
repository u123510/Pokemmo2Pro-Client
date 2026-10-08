package cn.pokemmo.world.tile.behavior;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import java.util.Iterator;

public class WaterCurrentTileBehavior extends BaseTileBehavior {
   public static void Wt(WaterCurrentTileBehavior var0, LT var1) {
      var0.getClass();
      yt_1 var5 = tw0_0.e60;
      byte var2 = 0;
      Iterator var3 = tw0_0.e60.pn0.values().iterator();

      while (var3.hasNext()) {
         bi0_1 var4;
         if ((var4 = (bi0_1)var3.next()) != null
            && var4.ba0.o0 == var1.F2().Bm0
            && var4.ba0.ID0 == var1.F2().case$
            && var4.ba0.Lq0 == var1.Tz()
            && var4.ba0.B5 == var1.HR()
            && var4.ba0.JT >= 3) {
            var2 = 1;
         }
      }

      E90 var6;
      if ((var6 = var5.jB0) != null
         && var6.ba0.o0 == var1.F2().Bm0
         && var6.ba0.ID0 == var1.F2().case$
         && var6.ba0.Lq0 == var1.Tz()
         && var6.ba0.B5 == var1.HR()
         && var6.ba0.JT >= 3) {
         var2 = 1;
      }

      int var7 = var1.xl0() / 8 * 8;
      if (var2 != 0) {
         var2 = 7;
      } else {
         var2 = 6;
      }

      short var8 = (short)(var7 + var2);
      if (var1.xl0() != var8) {
         var1.HU(var1.uj(), var8);
      }
   }

   @Override
   public final boolean aH(LT var1, bi0_1 var2, byte var3, byte var4) {
      if (var2.oI0() && var2.ba0.JT >= 3) {
         return true;
      } else {
         lg_0.k.lPT5(new Et0((Q1)(Object)this, var1));
         return (Object)this instanceof xm_2;
      }
   }

   @Override
   public final boolean zF(LT var1, bi0_1 var2, byte var3, byte var4) {
      if (var2.oI0() && var2.ba0.JT >= 3) {
         return true;
      } else {
         lg_0.k.lPT5(new ad0_1((Q1)(Object)this, var1));
         return false;
      }
   }

   @Override
   public final boolean fu(LT var1, bi0_1 var2, byte var3) {
      lg_0.k.lPT5(new os_1((Q1)(Object)this, var1));
      return false;
   }

   @Override
   public final void K40(bi0_1 var1, LT var2) {
      lg_0.k.lPT5(new Z((Q1)(Object)this, var2));
   }
}
