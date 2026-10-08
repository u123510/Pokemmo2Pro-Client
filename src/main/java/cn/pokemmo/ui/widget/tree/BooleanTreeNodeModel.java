package cn.pokemmo.ui.widget.tree;

import f.*;

public class BooleanTreeNodeModel extends a9_0 implements E7 {
   public final Cs0 Gk;
   public final QN HM;
   public boolean E3;
   public boolean Hq;
   public wb_1 Ma0;
   public Cs0[] Z5;
   public Runnable[] AW;
   public int IK0;

   public BooleanTreeNodeModel(QN var1, Zh var2, Cs0 var3) {
      super(var2);
      this.HM = var1;
      this.Gk = var3;
      int var4;
      if (var3 != null) {
         var4 = var3.IK0 + 1;
      } else {
         var4 = 0;
      }

      this.IK0 = var4;
      if (var3 != null) {
         if (var3.Z5 == null) {
            var3.Z5 = new Cs0[((Zh)var3.qm).cx()];
         }

         var3.Z5[((Zh)var3.qm).Fi(var2)] = (Cs0) this;
      }
   }

   @Override
   public final void Kj(Runnable var1) {
      this.AW = (Runnable[])a7_0.gE(this.AW, var1, Runnable.class);
   }

   @Override
   public final void j00(u1_0 var1) {
      this.AW = (Runnable[])a7_0.tp0(var1, this.AW);
   }

   @Override
   public final boolean getValue() {
      return this.E3;
   }

   @Override
   public final void Dc0(boolean var1) {
      if (this.E3 != var1) {
         this.E3 = var1;
         QN var9 = this.HM;
         this.HM.getClass();
         Object var2 = super.qm;
         Zh var3 = (Zh)super.qm;
         wb_1 var4 = this.Ma0;
         int var10;
         if (this.Ma0 != null) {
            var10 = var4.iE();
         } else {
            boolean var15;
            if ((var10 = ((Zh)var2).cx()) == 0) {
               var15 = true;
            } else {
               var15 = false;
            }

            this.Hq = var15;
         }

         int var16;
         if (this.E3) {
            var16 = var10;
         } else {
            var16 = 0;
         }

         Zh var5 = var3.getParent();
         int var21 = var16;
         Zh var17 = var3;
         var3 = var5;

         while (var3 != null) {
            Cs0 var6;
            if ((var6 = (Cs0)a9_0.i40(var9.Vg0, var3)).Ma0 == null) {
               wb_1 var7;
               wb_1 var23 = var7 = new wb_1(64);
               var6.Ma0 = var7;
               var7.wB = 1;
               int var8 = ((Zh)var6.qm).cx();
               if (var23.p2.length < var8) {
                  var7.p2 = new int[var8];
               }

               var7.VQ = var8;
               var7.DE(0, var8);
               var7.iB0(0, var8);
            }

            int var18 = ((Zh)var6.qm).Fi(var17);
            var6.Ma0.IF(var18, var21 + 1);
            int var19 = var6.Ma0.iE();
            var5 = var3.getParent();
            var21 = var19;
            var17 = var3;
            var3 = var5;
         }

         var9.Dx0 = var9.kV.Ma0.iE();
         int var13 = var9.xK0((Zh)super.qm);
         if (this.E3) {
            var9.dK0(var13 + 1, var10);
         } else {
            var9.c7(var13 + 1, var10);
         }

         var9.CoM7(var13, 1);
         lo0_0 var20;
         if (this.E3 && (var20 = lo0_0.public$(var9)) != null) {
            var20.Iu();
            int var11 = var9.DH(var13);
            int var14 = var9.Ut(var13 + var10) - var11;
            var20.Yj0(var11, var14, var9.Ux / 2);
         }

         a7_0.bH(this.AW);
      }
   }
}
