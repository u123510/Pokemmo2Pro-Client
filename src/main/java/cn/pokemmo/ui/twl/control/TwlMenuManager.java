package cn.pokemmo.ui.twl.control;

import f.*;
import cn.pokemmo.ui.twl.core.*;

import java.util.IdentityHashMap;

/**
 * 弹出菜单总管控件 (MenuManager)
 */
public class TwlMenuManager extends qj_0 {
   public final boolean YG = false;
   public final IdentityHashMap pH0;
   public final l2_0 Br;
   public final rh_0 RX;
   public boolean TF;
   public le0_2 en0;
   public com8__3 um;

   public TwlMenuManager(le0_2 var1) {
      super(var1);
      this.pH0 = new IdentityHashMap();
      this.Br = new l2_0((TJ0) this);
      this.RX = new rh_0((TJ0) this);
   }

   public final String Ck() {
      return "menumanager";
   }

   public final le0_2 M10(int var1, EP var2, le0_2 var3, boolean var4) {
      le0_2 le0_2;
      if ((le0_2 = (le0_2)this.pH0.get(var2)) == null) {
         le0_2 = var2.tU((TJ0) this, var1 + 1, var3);
         this.pH0.put(var2, le0_2);
      }

      if (le0_2.K20 == this) {
         var1++;

         while (this.fU() > var1) {
            this.fC0(this.fU() - 1);
         }

         return le0_2;
      } else {
         if (super.K20 == null) {
            if (!this.c3()) {
               this.Md0();
               return null;
            }

            super.K20.uM(this);
         }

         while (this.fU() > var1) {
            this.fC0(this.fU() - 1);
         }

         this.F9(this.fU(), le0_2);
         le0_2.lt0();
         if (var4) {
            int i;
            int j;
            label61: {
               int menuWidth = le0_2.Mx;
               int k = var3.A20;
               int parentWidth = var3.Mx;
               i = k + parentWidth;
               j = var3.SB0;
                // The first menu level opens above/centered on the anchor. The
                // original bytecode tests the menu depth, not the popup width.
                if (var1 == 0) {
                  int l = i;
                  i = parentWidth / 2 + k - menuWidth / 2;
                  j -= le0_2.OB;
                  if (l + menuWidth <= this.cz() || (i = k + parentWidth - menuWidth) >= super.A20 + super.e80) {
                     break label61;
                  }
               } else if (i + menuWidth <= this.cz() || (i = k - menuWidth) >= super.A20 + super.e80) {
                  break label61;
               }

               i = this.cz() - menuWidth;
            }

            var1 = le0_2.OB;
            if (j + le0_2.OB > this.VM()) {
               j = Math.max(super.SB0 + super.y9, this.VM() - var1);
            }

            if (i < 0) {
               i = 0;
            }

            if (j < 0) {
               j = 0;
            }

            le0_2.sy(i, j);
         }

         return le0_2;
      }
   }

   public final void Md0() {
      com8__3 com8__3 = this.um;
      if (this.um != null) {
         com8__3.wg0();
      }

      zk0_1 zk0_1x = super.Em0;
      super.Md0();
      this.em();
      this.pH0.clear();
      if (zk0_1x != null && !zk0_1x.Cr0) {
         zk0_1x.iH0(2, null);
      }
   }

   public final void C(zk0_1 var1) {
      (this.um = new com8__3(var1)).Mu(300);
      this.um.bm0 = this.RX;
   }

   public final void K8() {
   }

   public final le0_2 r1(i70_0 var1) {
      this.TF = false;
      le0_2 result = super.r1(var1);
      if (result == this && this.YG && super.LI0.no0(var1)) {
         le0_2 childResult = super.LI0.r1(var1);
         if (childResult != null) {
            this.TF = true;
            result = childResult;
         }
      }

      le0_2 selected = this.UA0();
      if (this.en0 != selected) {
         this.en0 = selected;
         if (this.YG && result.K20 == super.LI0 && result instanceof Z80) {
            this.Ks();
         } else if (this.um != null) {
            this.um.wg0();
            this.um.Gi0();
         }
      }

      return result;
   }

   public boolean jb0(i70_0 var1) {
      if (this.YG && super.LI0.nd0(var1)) {
         return true;
      }

      if (super.jb0(var1)) {
         return true;
      }

      if (var1.zu == 5) {
         if (super.VA0) {
            this.Md0();
         }

         return true;
      }

      return false;
   }

   public final le0_2 UA0() {
      return this.TF ? super.LI0.UA0() : super.UA0();
   }

   public final void Ks() {
      le0_2 le0_2 = this.en0;
      if (this.en0 instanceof Runnable && le0_2.OI) {
         ((Runnable)le0_2).run();
      } else if (le0_2 != this) {
         int i = -1;

         while (le0_2 != null) {
            if (le0_2 instanceof X80) {
               i = ((X80)le0_2).throw$;
               break;
            }

            le0_2 = le0_2.K20;
         }

         if (i != -1) {
            while (this.fU() > i) {
               this.fC0(this.fU() - 1);
            }
         }
      }
   }
/*
      le0_2 le0_2xx;
      le0_2 le0_2x;
      if ((le0_2xx = super.r1(var1)) == this && this.YG && super.LI0.no0(var1) && (le0_2x = super.LI0.r1(var1)) != null) {
         this.TF = true;
         le0_2xx = le0_2x;
      }

      le0_2 le0_2xx = this.UA0();
      if (this.en0 != le0_2xx) {
         this.en0 = le0_2xx;
         if (this.YG && le0_2xx.K20 == super.LI0 && le0_2xx instanceof Z80) {
            this.Ks();
         } else {
            com8__3 com8__3 = this.um;
            if (this.um != null) {
               com8__3.wg0();
               this.um.Gi0();
            }
         }
      }

      return le0_2xx;
   }

   public boolean jb0(i70_0 var1) {
      if (this.YG && super.LI0.nd0(var1)) {
         return true;
      }

      if (super.jb0(var1)) {
         return true;
      }

      if (var1.zu == 5) {
         if (super.VA0) {
            this.Md0();
         }

         return true;
      } else {
         return false;
      }
   }

   public final le0_2 UA0() {
      return this.TF ? super.LI0.UA0() : super.UA0();
   }

   public final void Ks() {
      le0_2 le0_2 = this.en0;
      if (this.en0 instanceof Runnable && le0_2.OI) {
         ((Runnable)le0_2).run();
      } else if (le0_2 != this) {
         int i = -1;

         while (le0_2 != null) {
            if (le0_2 instanceof X80) {
               i = ((X80)le0_2).throw$;
               break;
            }

            le0_2 = le0_2.K20;
         }

         if (i != -1) {
            while (this.fU() > i) {
               this.fC0(this.fU() - 1);
            }
         }
      }
   }
*/
}
