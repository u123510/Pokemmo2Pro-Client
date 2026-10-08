package cn.pokemmo.ui.widget.tree;

import f.*;

import java.util.ArrayList;

public abstract class AbstractTreeNode implements Zh {
   // $FF: synthetic field
   public static final boolean Cq0 = AbstractTreeNode.class.desiredAssertionStatus() ^ true;
   public final Zh ge0;
   public ArrayList CA;
   public boolean Qs0;

   public AbstractTreeNode(Zh var1) {
      if (var1 != null) {
         this.ge0 = var1;
         if (!Cq0) {
            this.Au0();
         }

      } else {
         throw new NullPointerException("parent");
      }
   }

   public final void uj() {
   }

   public final Zh getParent() {
      return this.ge0;
   }

   public final boolean zD() {
      return this.Qs0;
   }

   public final int cx() {
      ArrayList var1;
      return (var1 = this.CA) != null ? var1.size() : 0;
   }

   public final Zh rW(int var1) {
      return (Zh)this.CA.get(var1);
   }

   public final int Fi(Zh var1) {
      ArrayList var2;
      if ((var2 = this.CA) != null) {
         int var4 = 0;

         for(int var3 = var2.size(); var4 < var3; ++var4) {
            if (this.CA.get(var4) == var1) {
               return var4;
            }
         }
      }

      return -1;
   }

   public final void Dq(boolean var0) {
      if (this.Qs0 != var0) {
         this.Qs0 = var0;
         int var1 = this.ge0.Fi(this);
         if (var1 >= 0) {
            com6__0 var10000 = this.Au0();
            Zh var12 = this.ge0;
            byte var2 = 1;
            r60_0[] var3 = var10000.Z;
            if (var3 != null) {
               int var4 = var3.length;

               for(int var5 = 0; var5 < var4; ++var5) {
                  QN var6 = var3[var5].OB;
                  Cs0 var7 = (Cs0)a9_0.i40(var6.Vg0, var12);
                  if (var7 != null) {
                     Cs0 var8 = var7;

                     boolean var9;
                     while((var9 = var8.E3) && (var8 = var8.Gk) != null) {
                     }

                     if (var9) {
                        int var14 = var6.xK0(var12) + 1;
                        int var15 = var14 + var1;
                        int var16 = var15 + var2;
                        wb_1 var11 = var7.Ma0;
                        if (var11 != null) {
                           var15 = var11.eC0(var1) + var14;
                           var16 = var7.Ma0.eC0(var1 + var2) + var14;
                        }

                        ((Nj)var6).CoM7(var15, var16 - var15);
                     }
                  }
               }
            }
         }
      }

   }

   public final com6__0 Au0() {
      Zh var2 = this.ge0;
      Zh var1;
      while((var1 = var2.getParent()) != null) {
         var2 = var1;
      }

      return (com6__0)var2;
   }
}
