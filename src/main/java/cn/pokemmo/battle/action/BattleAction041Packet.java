package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleAction041Packet extends ka_0 {
   public final short ja0;
   public final CH0 CI0;

   public BattleAction041Packet(short var1, CH0 var2, short var3) {
      super(var3);
      this.ja0 = var1;
      this.CI0 = var2;
   }

   @Override
   public final byte BL0() {
      return 41;
   }

   @Override
   public final void IE0(PF var1, PF var2, boolean var3, boolean var4, short var5, boolean var6, ML0 var7, qn_1 var8) {
      a10_0 registry = tw0_0.PK0;
      if (registry == null) {
         return;
      }
      short code = this.ja0;
      if (code == 273) {
         var2.F(super.rA);
         var7.lZ.add(new ii_1(var2, var7.Hi(var2), null, false, false));
         String label = "";
         PF translated = registry.nd0(this.CI0);
         if (translated == null) {
            tb0_1 entry = registry.yD0(this.CI0);
            if (entry != null) {
               label = entry.B3.Ky0();
            }
         } else {
            label = translated.A60();
         }
         int textId = var7.yd0.QX(700, var1);
         var7.wJ(sm0_0.fg0((byte)2, lpt6__2.Q80, (byte)14, textId, new String[]{label}), "", null);
      } else if (code == 361 || code == 461) {
         if (code == 361) {
            var7.lZ.add(new kw_0((byte)0, new A6(var1).vv(var2)));
            int textId = var7.yd0.QX(697, var2);
            var7.wJ(sm0_0.fg0((byte)2, lpt6__2.Q80, (byte)14, textId, new String[]{var2.A60()}), "", null);
         } else {
            var7.lZ.add(new kw_0((byte)0, new yl_1(var1).vv(var2)));
            int textId = var7.yd0.QX(694, var2);
            var7.wJ(sm0_0.fg0((byte)2, lpt6__2.Q80, (byte)14, textId, new String[]{var2.A60()}), "", null);
         }
         var2.F(super.rA);
         var7.lZ.add(new ii_1(var2, var7.Hi(var2), null, false, false));
      }
   }
}
