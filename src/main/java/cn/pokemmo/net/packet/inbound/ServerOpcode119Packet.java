package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.HashMap;

public class ServerOpcode119Packet extends GH {
   public static final HashMap uY = new HashMap();
   public CH0 mc;
   public boolean TJ0;
   public byte[] XR;

   public ServerOpcode119Packet(k20_0 var1, ByteBuffer var2) {
      super(var1, var2);
   }

   @Override
   public final void Oj0() {
      this.mc = this.pE();
      boolean var1;
      if ((super.Rj.get() & 255) == 1) {
         var1 = true;
      } else {
         var1 = false;
      }

      this.TJ0 = var1;
      byte[] var10001 = new byte[super.Rj.getShort() & 65535];
      super.Rj.get(var10001);
      this.XR = var10001;
   }

   @Override
   public final void os0() {
      HashMap var1 = uY;
      ByteArrayOutputStream var2;
      if ((var2 = (ByteArrayOutputStream)uY.get(this.mc)) == null) {
         var2 = new ByteArrayOutputStream();
         var1.put(this.mc, var2);
      }

      try {
         var2.write(this.XR);
      } catch (IOException var3) {
      }

      if (this.TJ0) {
         uY.remove(this.mc);
         xr_0 var4 = new xr_0(var2.toByteArray());
         if (!var4.KA) {
            int var5;
            if ((var5 = var4.Lc0) >= 26 && var5 <= 26) {
               tw0_0.rl.qK(sm0_0.c0(5803));
            } else {
               tw0_0.rl.qK(sm0_0.c0(5030));
            }
         } else {
            var4.Dc0 = false;
            tw0_0.Jp = var4;
            var4.run();
         }
      }
   }
}
