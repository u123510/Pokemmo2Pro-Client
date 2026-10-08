package cn.pokemmo.ui.widget.tree;

import f.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;

public class CompositeTreeNodeWidget extends O8 {
   public final con__6 LPT7;
   public final Map<Byte, sv_2> l40;
   public ArrayList OP;
   public final tb0_1[] SO;

   public CompositeTreeNodeWidget(byte var1, con__6 var2, sv_2[] var3, byte var4) {
      super(var1, var4);
      this.LPT7 = var2;
      HashMap<Byte, sv_2> var6 = new HashMap<>();
      int var7 = var3.length;

      for (int var8 = 0; var8 < var7; var8++) {
         sv_2 var5;
         var6.put((var5 = var3[var8]).UF0(), var5);
      }

      this.l40 = Collections.unmodifiableMap(var6);
      this.SO = Arrays.stream(var3).map(CompositeTreeNodeWidget::ZJ0).flatMap(Stream::of).toArray(CompositeTreeNodeWidget::X30);
   }

   public static String[] Me0(int var0) {
      return new String[var0];
   }

   public static String bi0(sv_2 var0) {
      return var0.Uf0.M2();
   }

   public static String L60(sv_2 var0) {
      return var0.Uf0.M2();
   }

   public static String[] WH0(int var0) {
      return new String[var0];
   }

   public static tb0_1[] X30(int var0) {
      return new tb0_1[var0];
   }

   public static tb0_1[] ZJ0(sv_2 var0) {
      return var0.Uf0.zz();
   }

   @Override
   public final void dj(a10_0 var1) {
      Iterator var2 = this.l40.values().iterator();

      while (var2.hasNext()) {
         ((sv_2)var2.next()).Uf0.dj(var1);
      }

      super.lpT2 = var1;
   }

   @Override
   public final con__6 Td0() {
      return this.LPT7;
   }

   @Override
   public final tb0_1[] zz() {
      return this.SO;
   }

   @Override
   public final tb0_1[] NC(O8 var1) {
      Iterator var3 = this.l40.values().iterator();

      sv_2 var2;
      do {
         if (!var3.hasNext()) {
            var2 = null;
            break;
         }
      } while ((var2 = (sv_2)var3.next()).Uf0 != var1);

      return var2.Uf0.zz();
   }

   @Override
   public final String BO() {
      String[] var3 = this.l40.values().stream().map(CompositeTreeNodeWidget::L60).toArray(CompositeTreeNodeWidget::WH0);
      byte var1 = 15;
      byte var2 = 10;
      return sm0_0.fg0((byte)2, lpt6__2.Q80, var1, var2, var3);
   }

   @Override
   public final O8 L40(byte var1) {
      if (this.l40.containsKey(var1)) {
         return ((sv_2)this.l40.get(var1)).Uf0;
      } else {
         throw null;
      }
   }

   @Override
   public final O8 Sf(byte var1) {
      Iterator var3 = this.l40.values().iterator();

      while (var3.hasNext()) {
         sv_2 var2;
         if ((var2 = (sv_2)var3.next()).JK0 == var1) {
            return var2.Uf0;
         }
      }

      return null;
   }

   @Override
   public final byte Fr(O8 var1) {
      Iterator var3 = this.l40.entrySet().iterator();

      while (var3.hasNext()) {
         Entry var2;
         if (((sv_2)(var2 = (Entry)var3.next()).getValue()).Uf0 == var1) {
            return (Byte)var2.getKey();
         }
      }

      return -1;
   }

   @Override
   public final void Dt(float var1, float var2) {
      this.OP = new ArrayList();
      boolean var3;
      if (this.l40.size() > 1) {
         var3 = true;
      } else {
         var3 = false;
      }

      for (sv_2 var10001 : this.l40.values()) {
         O8 var5 = var10001.Uf0;
         byte var6 = var10001.JK0;
         if (var3) {
            if (var6 < 1) {
               var1 = -0.46F;
            } else {
               var1 = 0.46F;
            }

            if (var6 < 1) {
               var2 = -0.46F;
            } else {
               var2 = 0.46F;
            }
         }

         var5.Dt(var1, var2);
         if (var5.v10() != null) {
            this.OP.addAll(var5.v10());
         }
      }
   }

   @Override
   public final void Vs0(int var1, int var2) {
      boolean var3;
      if (this.l40.size() > 1) {
         var3 = true;
      } else {
         var3 = false;
      }

      for (sv_2 var10001 : this.l40.values()) {
         O8 var4 = var10001.Uf0;
         byte var5 = var10001.JK0;
         if (var3) {
            if (var5 < 1) {
               var1 = -24;
            } else {
               var1 = 24;
            }

            if (var5 < 1) {
               var2 = -12;
            } else {
               var2 = 12;
            }
         }

         var4.Vs0(var1, var2);
      }
   }

   @Override
   public final void vy() {
      Iterator var1 = this.l40.values().iterator();

      while (var1.hasNext()) {
         ((sv_2)var1.next()).Uf0.vy();
      }
   }

   @Override
   public final void LPT7() {
      Iterator var1 = this.l40.values().iterator();

      while (var1.hasNext()) {
         ((sv_2)var1.next()).Uf0.LPT7();
      }
   }

   @Override
   public final List v10() {
      return this.OP;
   }

   @Override
   public final ii0_2 b90() {
      return ((sv_2)this.l40.get(0)).Uf0.b90();
   }

   @Override
   public final boolean Sw() {
      Iterator var1 = this.l40.values().iterator();

      while (var1.hasNext()) {
         if (!((sv_2)var1.next()).Uf0.Sw()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public final String Zc() {
      return ((sv_2)this.l40.get(0)).Uf0.Zc();
   }

   @Override
   public final String M2() {
      int var1;
      if ((var1 = this.l40.size()) != 0) {
         return var1 != 1
            ? sm0_0.Bx(this.l40.size() - -200456, this.l40.values().stream().map(CompositeTreeNodeWidget::bi0).toArray(CompositeTreeNodeWidget::Me0))
            : ((sv_2)this.l40.get(0)).Uf0.M2();
      } else {
         return "";
      }
   }

   @Override
   public final String zn() {
      throw new UnsupportedOperationException();
   }

   @Override
   public final String bM(O8 var1) {
      Iterator var3 = this.l40.values().iterator();

      sv_2 var2;
      do {
         if (!var3.hasNext()) {
            var2 = null;
            break;
         }
      } while ((var2 = (sv_2)var3.next()).Uf0 != var1);

      return var2.Uf0.zn();
   }

   @Override
   public final boolean pq(ML0 var1, boolean var2, String var3, SZ[] var4, int var5) {
      if (super.ZG0 != var1.yd0.Ez0()) {
         byte var6 = 0;

         while (true) {
            a10_0 var7 = var1.yd0;
            byte var8 = super.ZG0;
            if (var6 >= (byte)var7.wI0[var8].length) {
               break;
            }

            PF var15;
            if ((var15 = var7.Ce(var8, var6)) != null && !var15.zi0.hf0() && var15.LpT9.oW.x > 0.0F) {
               bv0_0 var17 = new bv0_0(var15);
               var17.Si = false;
               var1.lZ.add(new kw_0(var17));
            }

            var6++;
         }
      }

      boolean var14 = false;
      Iterator var16 = this.l40.values().iterator();

      while (var16.hasNext()) {
         byte var18 = ((sv_2)var16.next()).JK0;
         eu_2 var9 = new eu_2(this, var18);
         var1.lZ.add(var9);
         if (var4 != null && var4.length > var18) {
            var14 |= var1.Yn0(var4[var18]);
         }
      }

      if (!var2 && !var3.isEmpty()) {
         var14 = true;
         short var13;
         if ((byte)this.l40.size() > 1) {
            var13 = 5018;
         } else {
            var13 = 5017;
         }

         var1.wJ(sm0_0.Bx(var13, var3, this.M2()), "", null);
      }

      if (!var2 && var5 > 0) {
         var14 = true;
         lpt6__2 var19 = lpt6__2.Q80;
         byte var10 = 15;
         byte var11 = 58;
         String[] var12;
         String[] var10002 = var12 = new String[2];
         var10002[0] = var3;
         var10002[1] = var5 + "";
         var1.wJ(sm0_0.fg0((byte)2, var19, var10, var11, var12), "", null);
      }

      return var14;
   }

   @Override
   public final byte f90() {
      return ((sv_2)this.l40.get(0)).Uf0.f90();
   }

   @Override
   public final short WK0() {
      return ((sv_2)this.l40.get(0)).Uf0.WK0();
   }

   @Override
   public final void Im(byte var1, byte var2) {
      sv_2 var7 = null;
      sv_2 var3 = null;
      Iterator var4 = this.l40.values().iterator();

      while (var4.hasNext()) {
         sv_2 var5;
         byte var6;
         if ((var6 = (var5 = (sv_2)var4.next()).JK0) == var1) {
            var7 = var5;
         } else if (var6 == var2) {
            var3 = var5;
         }
      }

      if (var7 != null) {
         var7.JK0 = var2;
      }

      if (var3 != null) {
         var3.JK0 = var1;
      }
   }

   @Override
   public final void dispose() {
      Iterator var1 = this.l40.values().iterator();

      while (var1.hasNext()) {
         ((sv_2)var1.next()).Uf0.dispose();
      }
   }

   @Override
   public final void ho0() {
      this.l40.size();
   }

   @Override
   public final void Wa0(hl0_1 var1) {
      Iterator var2 = this.l40.values().iterator();

      while (var2.hasNext()) {
         ((sv_2)var2.next()).Uf0.Wa0(var1);
      }
   }

   @Override
   public final void aE0(float var1, byte var2) {
      if (this.l40.size() == 2) {
         if (var2 < 1) {
            var1 = -0.96F;
         } else {
            var1 = -0.2F;
         }
      } else {
         var1 = var2 * 0.76F + -1.52F;
      }

      ((sv_2)this.l40.get(var2)).Uf0.aE0(var1, var2);
   }

   @Override
   public final void Cq0(int var1, boolean var2) {
      for (sv_2 var10001 : this.l40.values()) {
         O8 var3 = var10001.Uf0;
         int var4 = var10001.JK0;
         if (this.l40.size() == 2) {
            if (var4 < 1) {
               var4 = -24;
            } else {
               var4 = 24;
            }
         } else {
            int var7 = this.l40.size() * 12;
            var4 = var4 * -24 + var7;
         }

         var3.Cq0(var4, var2);
      }
   }
}
