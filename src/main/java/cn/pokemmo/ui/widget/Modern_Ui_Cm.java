package cn.pokemmo.ui.widget;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.Cm
 */
public class Modern_Ui_Cm implements Fx0, NA {

   public int TD0;
   public int NL;
   public L50 VK0;
   public Fx0 rI;
   public final QN aP;

   public Modern_Ui_Cm(QN var1) {
      this.aP = var1;
      L50 var2;
      var2 = new L50(5, 5);
      this.VK0 = var2;
      var1.m00();
   }

   @Override
   public final void Ib(Jn0 var1) {
      LC0 var10001 = (LC0)var1;
      this.TD0 = ((LC0)var1).H10(10, "treeIndent");
      L50 var2 = L50.Uy;
      this.VK0 = (L50)var10001.N30("treeButtonSize", true, L50.class, var2);
   }

   @Override
   public String vV() {
      return "TreeLeafCellRenderer";
   }

   @Override
   public final void In(Object var1) {
      throw new UnsupportedOperationException("Don't call this method");
   }

   @Override
   public final int y8() {
      Fx0 var1;
      return (var1 = this.rI) != null ? var1.y8() : 1;
   }

   @Override
   public final int rm0() {
      Fx0 var1 = this.rI;
      return this.rI != null ? Math.max(this.VK0.Eg0, var1.rm0()) : this.VK0.Eg0;
   }

   @Override
   public final le0_2 m90(int var1, int var2, int var3, int var4, boolean var5) {
      Fx0 var6 = this.rI;
      if (this.rI != null) {
         int var7;
         var1 += var7 = this.NL * this.TD0 + this.VK0.Com9;
         int var8 = var3 - var7;
         return var6.m90(var1, var2, Math.max(0, var8), var4, var5);
      } else {
         return null;
      }
   }

   @Override
   public le0_2 zS(le0_2 var1) {
      Fx0 var2;
      return (var2 = this.rI) instanceof NA ? ((NA)var2).zS(var1) : null;
   }

   @Override
   public void NM(le0_2 var1, int var2, int var3, int var4, int var5) {
      Fx0 var6 = this.rI;
      if (this.rI instanceof NA) {
         NA var10000 = (NA)var6;
         int var7;
         int var9 = var2 + (var7 = this.NL * this.TD0);
         int var8 = Math.max(0, var4 - var7);
         var10000.NM(var1, var9, var3, var8, var5);
      }
   }
}

