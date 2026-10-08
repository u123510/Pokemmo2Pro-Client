package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class StatAction101Packet extends Nt implements eb0_0 {
   public final byte PF0;
   public final short[][] oN;

   public StatAction101Packet(byte var1, short[][] var2) {
      this.PF0 = var1;
      this.oN = var2;
   }

   public static String PM(int var0) {
      String var10000;
      if (sm0_0.cU.l90(var0)) {
         var10000 = sm0_0.c0(var0);
      } else {
         qa0_1 var2 = tw0_0.Ll0.YB0;
         qa0_1 var1 = tw0_0.Ll0.LPT2;
         var10000 = mz_1.TG0(var0, true, var2, var1);
      }

      return var10000;
   }

   @Override
   public final byte BL0() {
      return 101;
   }

   @Override
   public final void IE0(PF var1, PF var2, boolean var3, boolean var4, short var5, boolean var6, ML0 var7, qn_1 var8) {
      if (this.PF0 >= -1) {
         var7.wJ(sm0_0.c0(310270), "", null);
         var7.wJ(PM(271038997), "", null);
         var7.wJ(PM(271039024), "", null);
         var7.wJ(PM(271039148), "", null);
         var7.wJ(PM(271039269), "", null);
         var7.wJ("", "", null);
         vm_0 var9;
         var9 = new vm_0((Ku0) this, var7);
         var7.lZ.add(var9);
      }
   }
}
