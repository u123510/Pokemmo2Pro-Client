package cn.pokemmo.world.tile.behavior;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class ElevatorWarpTileBehavior extends BaseTileBehavior {
   public final pd0_1 rn;
   public final byte nj0;
   public final kq0_0 eH0;

   public ElevatorWarpTileBehavior(kq0_0 var1, pd0_1 var2, byte var3) {
      this.eH0 = var1;
      this.rn = var2;
      this.nj0 = var3;
   }

   @Override
   public final boolean xB(LT var1, LT var2, bi0_1 var3, byte var4) {
      if (var3 != tw0_0.e60.jB0) {
         return false;
      }

      pd0_1 var5;
      if ((var5 = this.rn.k0(this.nj0, var3, true)) != null) {
         tw0_0.rl.xm = new fz_2((CJ)(Object)this, var5);
      }

      return false;
   }
}
