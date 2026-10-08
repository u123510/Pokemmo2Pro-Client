package cn.pokemmo.ui.widget.table;

import f.*;

import java.util.ArrayList;

public class TreeTableDataSource extends xt0_0 {
   public final ArrayList wJ0 = new ArrayList();
   public final ArrayList nF = new ArrayList();
   public final ArrayList ct = new ArrayList();
   public char[] me;

   public TreeTableDataSource(ay_0 var1) {
      super(var1);
      this.me = qw0_0.mL;
   }

   public final void BG0(fw0_0 var1) {
      var1.OE += super.bW;
      var1.Zg += super.PS;
      ((qq_0)var1.lr0).al(var1.OE, var1.Zg, super.Ug0, super.L70);
      try {
         dq_0 dq = ((qq_0)var1.lr0).J50;
         pt_1 frame = dq.mz0[dq.CF - 1];
         if (frame.Yw > frame.V && frame.tj > frame.YE) {
            for (int i = 0, n = this.wJ0.size(); i < n; ++i) {
               ((xt0_0)this.wJ0.get(i)).BG0(var1);
            }
         }
      } catch (Throwable error) {
         ((qq_0)var1.lr0).Lpt9();
         var1.OE -= super.bW;
         var1.Zg -= super.PS;
         throw error;
      }
      ((qq_0)var1.lr0).Lpt9();
      var1.OE -= super.bW;
      var1.Zg -= super.PS;
   }

   public final void F4(int var1, int var2) {
      var1 += super.bW;
      var2 += super.PS;
      int var3 = 0;

      for(int var4 = this.wJ0.size(); var3 < var4; ++var3) {
         ((xt0_0)this.wJ0.get(var3)).F4(var1, var2);
      }

   }

   public final void ku0(int var1, int var2, ArrayList var3) {
      var1 += super.bW;
      var2 += super.PS;
      int var4 = 0;

      for(int var5 = this.nF.size(); var4 < var5; ++var4) {
         cc_1 var10001 = (cc_1)this.nF.get(var4);
         var10001.bW += var1;
         var10001.PS += var2;
         var3.add(var10001);
      }

      var4 = 0;

      for(int var9 = this.wJ0.size(); var4 < var9; ++var4) {
         ((xt0_0)this.wJ0.get(var4)).ku0(var1, var2, var3);
      }

   }

   public final void xf() {
      int var1 = 0;

      for(int var2 = this.wJ0.size(); var1 < var2; ++var1) {
         ((xt0_0)this.wJ0.get(var1)).xf();
      }

      this.wJ0.clear();
      this.nF.clear();
      this.me = qw0_0.mL;
   }

   public final xt0_0 RZ(int var1, int var2) {
      var1 -= super.bW;
      var2 -= super.PS;
      char var3 = 0;
      int var4 = 0;
      int var5 = 0;

      char[] var6;
      while(var5 < (var6 = this.me).length && var2 >= var3) {
         int var13 = var5 + 1;
         char var7 = var6[var5];
         var5 += 2;
         char var14;
         if ((var14 = var6[var13]) > 0) {
            if (var7 == 0 || var2 < var7) {
               for(int var8 = 0; var8 < var14; ++var8) {
                  xt0_0 var9;
                  int var10;
                  if (var1 >= (var10 = (var9 = (xt0_0)this.wJ0.get(var4 + var8)).bW) && var1 < var10 + var9.Ug0 && var2 >= (var10 = var9.PS) && var2 < var10 + var9.L70) {
                     return var9.RZ(var1, var2);
                  }
               }

               if (var7 > 0 && var1 >= ((xt0_0)this.wJ0.get(var4)).bW) {
                  xt0_0 var15 = null;

                  xt0_0 var18;
                  for(int var16 = 0; var16 < var14; var15 = var18) {
                     if ((var18 = (xt0_0)this.wJ0.get(var4 + var16)).bW >= var1 && (var15 == null || var15.oJ == var18.oJ)) {
                        return var18;
                     }

                     ++var16;
                  }
               }
            }

            var4 += var14;
         }

         if (var7 > 0) {
            var3 = var7;
         }
      }

      return this;
   }

   public final boolean Iz0(xt0_0 var1) {
      boolean var2 = false;
      int var3 = 0;

      for(int var4 = this.wJ0.size(); var3 < var4; ++var3) {
         var2 |= ((xt0_0)this.wJ0.get(var3)).Iz0(var1);
      }

      if (var2) {
         super.qH = true;
      } else {
         super.Iz0(var1);
      }

      int var5 = 0;

      for(int var6 = this.wJ0.size(); var5 < var6; ++var5) {
         xt0_0 var7;
         if ((var7 = (xt0_0)this.wJ0.get(var5)).Wt0) {
            var7.qH = super.qH;
         }
      }

      return super.qH;
   }
}
