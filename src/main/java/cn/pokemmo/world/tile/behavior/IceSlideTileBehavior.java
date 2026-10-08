package cn.pokemmo.world.tile.behavior;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class IceSlideTileBehavior extends BaseTileBehavior {
   public final RA0 p30;
   public final byte lN;
   public final k70_0 eM0;

   public IceSlideTileBehavior(k70_0 state, RA0 target, byte index) {
      super();
      this.eM0 = state;
      this.p30 = target;
      this.lN = index;
   }

   @Override
   public final boolean aH(LT action, bi0_1 actor, byte direction, byte unused) {
      RA0 target = this.p30;
      int next = target.my;
      byte index = this.lN;
      if (next != index) {
         return false;
      }

      int flags = k70_0.iD[target.RC0][index];
      switch (direction) {
         case 0:
            if ((flags & 2) != 0) {
               target.my0("sandbag02_u");
               next = target.Ze0 == 1 ? index - 2 : index - 1;
            } else {
               target.my0("sandbag01_u");
            }
            break;
         case 1:
            if ((flags & 1) != 0) {
               this.p30.my0("sandbag02_d");
               next = this.p30.Ze0 == 1 ? index + 2 : index + 1;
            } else {
               target.my0("sandbag01_d");
            }
            break;
         case 2:
            if ((flags & 4) != 0) {
               if ((flags & 16) != 0) {
                  target.my0("sandbag02_r");
                  next = index + 1;
               } else {
                  target.my0("sandbag02_r");
                  next = index - 1;
               }
            } else {
               target.my0("sandbag01_r");
            }
            break;
         case 3:
            if ((flags & 8) != 0) {
               target.my0("sandbag02_l");
               next = (flags & 16) != 0 ? index - 1 : index + 1;
            } else {
               target.my0("sandbag01_l");
            }
            break;
         default:
            break;
      }

      target = this.p30;
      if (target.my != next) {
         target.si((byte)next, true);
         tw0_0.rl.xm = new od0_0((Hy0)(Object)this);
      }
      return false;
   }
}
