package cn.pokemmo.ui.widget.table;

import f.*;

public class TreeTableColumnModel extends Cm {
   public Cs0 FJ;

   public TreeTableColumnModel(QN var1) {
      super(var1);
   }

   public final String vV() {
      return "TreeNodeCellRenderer";
   }

   public final le0_2 zS(le0_2 var1) {
      Fx0 var2 = super.rI;
      if (super.rI instanceof NA) {
         NA var9 = (NA)var2;
         QB var3 = null;
         if (var1 instanceof QB) {
            var3 = (QB)var1;
         }

         if (this.FJ.Hq) {
            if (var3 != null) {
               var1 = null;
            }

            return var9.zS(var1);
         } else {
            if (var3 == null) {
               var3 = new QB();
            }

            W9 var5 = var3.SG;
            ((tq_0)var5.ER).Hs(this.FJ);
            le0_2 var6 = var9.zS(var3.a90);
            var1 = var3.a90;
            if (var3.a90 != var6) {
               if (var1 != null) {
                  var3.fC0(1);
               }

               var3.a90 = var6;
               if (var6 != null) {
                  var3.F9(1, var6);
               }
            }

            return var3;
         }
      } else {
         if (this.FJ.Hq) {
            return null;
         }

         W9 var7;
         if ((var7 = (W9)var1) == null) {
            var7 = new W9();
            var7.uf("treeButton");
         }

         Cs0 var4 = this.FJ;
         ((tq_0)var7.ER).Hs(var4);
         return var7;
      }
   }

   public final void NM(le0_2 var1, int var2, int var3, int var4, int var5) {
      int var12;
      var4 -= var12 = super.NL * super.TD0;
      int var13 = Math.min(Math.max(0, var4), super.VK0.Com9);
      int var6 = var2 + var12;
      var1.sy(var6, kq_0.lpT2(var5, super.VK0.Eg0, 2, var3));
      Fx0 var15 = super.rI;
      if (super.rI instanceof NA) {
         NA var16 = (NA)var15;
         QB var10000 = (QB)var1;
         QB var7;
         W9 var8;
         W9 var10001 = var8 = (var7 = (QB)var1).SG;
         var7.oY(Math.max(0, var4), var5);
         var10001.oY(var13, super.VK0.Eg0);
         le0_2 var9;
         if ((var9 = var10000.a90) != null) {
            int var10 = var8.A20 + var8.Mx;
            int var11 = var1.Mx;
            var16.NM(var9, var10, var3, var11, var5);
         }
      } else {
         var1.oY(var13, super.VK0.Eg0);
      }
   }
}
