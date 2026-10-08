package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ServerOpcode154Packet extends GH {
   public CH0 cz;
   public byte mT;

   public ServerOpcode154Packet(k20_0 var1, ByteBuffer var2) {
      super(var1, var2);
   }

   public final void Oj0() {
      this.cz = this.pE();
      this.mT = super.Rj.get();
   }

   public final void os0() {
      Ge0 ge0 = this.sr0();
      CH0 ch0 = this.cz;
      byte b0 = this.mT;
      BU bu;
      qu_2 qu_2;
      if ((bu = ((BR)ge0).lZ.zK0) != null && (qu_2 = bu.de0) != null && qu_2.dw0.equals(ch0)) {
         boolean flag1 = false;
         boolean flag = false;
         JB0[] ajb0 = qu_2.KA;
         int i = qu_2.KA.length;

         for (int j = 0; j < i; j++) {
            JB0 jb0;
            if ((jb0 = ajb0[j]).Uw.sA == b0) {
               jb0.Td.pw0(false);
               jb0.Td.Ll(false);
               jb0.Gv.pw0(false);
               jb0.Gv.Ll(false);
               jb0.Uw.ww = true;
            }

            o60_0 o60_0;
            if (!(o60_0 = jb0.Uw).ww) {
               byte b1;
               if ((b1 = o60_0.Q7) == 0) {
                  flag1 = true;
               } else if (b1 == 1) {
                  flag = true;
               }
            }
         }

         xe_1 xe_1 = qu_2.uJ0;
         if (qu_2.uJ0 != null && !flag1) {
            xe_1.pw0(false);
            qu_2.uJ0.Ll(false);
         }

         xe_1 xe_1x = qu_2.Y60;
         if (qu_2.Y60 != null && !flag) {
            xe_1x.pw0(false);
            qu_2.Y60.Ll(false);
            qu_2.A7.pw0(false);
            qu_2.A7.Ll(false);
         }
      }
   }
}
