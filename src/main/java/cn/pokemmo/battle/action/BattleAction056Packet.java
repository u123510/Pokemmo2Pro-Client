package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleAction056Packet extends Nt implements eb0_0 {
   public final short v90;
   public final gc_2 tf;
   public final byte kd;
   public final byte Nt0;

   public BattleAction056Packet(short var1, gc_2 var2, byte var3, byte var4) {
      this.v90 = var1;
      this.tf = var2;
      this.kd = var3;
      this.Nt0 = var4;
   }

   public final byte BL0() {
      return 56;
   }

   public final void IE0(PF var1, PF var2, boolean var3, boolean var4, short var5, boolean var6, ML0 var7, qn_1 var8) {
      mc0_1 var11 = gu0.l2.lPT6(this.v90);
      if (var2.uk() == 0) {
         return;
      }
      byte level = this.Nt0;
      if (level < 1) {
         int message = var11.X80() ? 5043 : 6068;
         var7.wJ(sm0_0.Bx(message, new String[]{var2.A60(), sm0_0.c0(var11.Nl)}), "", null);
         boolean active = this.Nt0 != 0;
         xy_0.qv(var7, var2, this.tf, this.kd, this.Nt0, active);
         if (active) {
            var7.lZ.add(new com2__4(var7, var2, var2, this.tf, this.Nt0, true));
         }
      } else {
         int messageId = 938 + (this.tf.CoM2 - 1) * 3;
         messageId += (Math.min(level, (byte)3) - 1) * 21;
         int textId = var7.yd0.QX(messageId, var2);
         String[] values = {var2.A60(), sm0_0.c0(var11.Nl)};
         var7.I1(sm0_0.fg0((byte)2, lpt6__2.Q80, 14, textId, values), "", null);
         var7.lZ.add(new com2__4(var7, var2, var2, this.tf, this.Nt0, true));
      }
   }
}

