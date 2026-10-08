package cn.pokemmo.collection.map;

import f.*;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;

public class LinearObjectMap implements Iterable {
   public Object[] ev;
   public Object[] hv;
   public int tb0;
   public final boolean ek;
   public transient sf0_1 tu0;
   public transient sf0_1 zZ;
   public transient com7__4 X3;
   public transient com7__4 Iq;
   public transient sd0_1 Vn;
   public transient sd0_1 CY;

   public final Object Ip(Object var1) {
      return this.vC(var1, null);
   }

   public final Object vC(Object var1, Object var2) {
      Object[] var3 = this.ev;
      int var4 = this.tb0 - 1;
      if (var1 == null) {
         while (var4 >= 0) {
            if (var3[var4] == var1) {
               return this.hv[var4];
            }

            var4--;
         }
      } else {
         while (var4 >= 0) {
            if (var1.equals(var3[var4])) {
               return this.hv[var4];
            }

            var4--;
         }
      }

      return var2;
   }

   public final boolean Vd(Object var1) {
      Object[] var3 = this.ev;
      int var2 = this.tb0 - 1;
      if (var1 == null) {
         while (var2 >= 0) {
            int var4 = var2;
            var2 += -1;
            if (var3[var4] == var1) {
               return true;
            }
         }
      } else {
         while (var2 >= 0) {
            int var10002 = var2;
            var2 += -1;
            if (var1.equals(var3[var10002])) {
               return true;
            }
         }
      }

      return false;
   }

   public final void cq(int var1) {
      int var2 = this.tb0;
      if (var1 < this.tb0) {
         Object[] var6 = this.ev;
         int var3;
         this.tb0 = var3 = var2 - 1;
         if (this.ek) {
            int var7 = var1 + 1;
            int var4 = var3 - var1;
            System.arraycopy(var6, var7, var6, var1, var4);
            Object[] var9 = this.hv;
            var3 = this.tb0 - var1;
            System.arraycopy(this.hv, var7, var9, var1, var3);
         } else {
            var6[var1] = var6[var3];
            this.hv[var1] = this.hv[var3];
         }

         int var5;
         var6[var5 = this.tb0] = null;
         this.hv[var5] = null;
      } else {
         throw new IndexOutOfBoundsException(String.valueOf(var1));
      }
   }

   public final void clear() {
      Arrays.fill(this.ev, 0, this.tb0, null);
      Arrays.fill(this.hv, 0, this.tb0, null);
      this.tb0 = 0;
   }

   public final void JK(int var1) {
      Object[] var2;
      Object[] var10003 = var2 = (Object[])Array.newInstance(this.ev.getClass().getComponentType(), var1);
      Object[] var10004 = this.ev;
      int var3 = Math.min(this.tb0, var2.length);
      System.arraycopy(var10004, 0, var2, 0, var3);
      this.ev = var10003;
      Object[] var5;
      Object[] var10001 = var5 = (Object[])Array.newInstance(this.hv.getClass().getComponentType(), var1);
      Object[] var10002 = this.hv;
      int var4 = Math.min(this.tb0, var5.length);
      System.arraycopy(var10002, 0, var5, 0, var4);
      this.hv = var10001;
   }

   @Override
   public final int hashCode() {
      Object[] var7 = this.ev;
      Object[] var1 = this.hv;
      int var2 = 0;
      int var3 = 0;

      for (int var4 = this.tb0; var3 < var4; var3++) {
         Object var5;
         Object var8 = var5 = var7[var3];
         Object var6 = var1[var3];
         if (var8 != null) {
            var2 += var5.hashCode() * 31;
         }

         if (var6 != null) {
            var2 += var6.hashCode();
         }
      }

      return var2;
   }

   @Override
   public final boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      }

      if (!(var1 instanceof LinearObjectMap)) {
         return false;
      }

      LinearObjectMap var2 = (LinearObjectMap)var1;
      int var8 = this.tb0;
      if (var2.tb0 != this.tb0) {
         return false;
      }

      Object[] var7 = this.ev;
      Object[] var3 = this.hv;

      for (int var4 = 0; var4 < var8; var4++) {
         Object var5 = var7[var4];
         Object var6;
         if ((var6 = var3[var4]) == null) {
            if (var2.vC(var5, nb_2.Com5) != null) {
               return false;
            }
         } else if (!var6.equals(var2.vC(var5, null))) {
            return false;
         }
      }

      return true;
   }

   @Override
   public final String toString() {
      if (this.tb0 == 0) {
         return "{}";
      }

      Object[] var1 = this.ev;
      Object[] var2 = this.hv;
      b3_0 var3 = new b3_0(32);
      var3.GC0('{');
      var3.Rs(var1[0]);
      var3.GC0('=');
      var3.Rs(var2[0]);

      for (int var4 = 1; var4 < this.tb0; var4++) {
         var3.sV(", ");
         var3.Rs(var1[var4]);
         var3.GC0('=');
         var3.Rs(var2[var4]);
      }

      var3.GC0('}');
      return var3.toString();
   }

   @Override
   public final Iterator iterator() {
      return this.ED();
   }

   public final sf0_1 ED() {
      if (this.tu0 == null) {
         this.tu0 = new sf0_1(this);
         this.zZ = new sf0_1(this);
      }

      sf0_1 var3 = this.tu0;
      if (!this.tu0.zn) {
         var3.Dn = 0;
         var3.zn = true;
         this.zZ.zn = false;
         return var3;
      } else {
         sf0_1 var10000 = this.zZ;
         sf0_1 var10002 = this.zZ;
         this.zZ.Dn = 0;
         var10002.zn = true;
         var3.zn = false;
         return var10000;
      }
   }

   public final com7__4 K00() {
      if (this.X3 == null) {
         this.X3 = new com7__4(this);
         this.Iq = new com7__4(this);
      }

      com7__4 var3 = this.X3;
      if (!this.X3.Zj) {
         var3.KJ = 0;
         var3.Zj = true;
         this.Iq.Zj = false;
         return var3;
      } else {
         com7__4 var10000 = this.Iq;
         com7__4 var10002 = this.Iq;
         this.Iq.KJ = 0;
         var10002.Zj = true;
         var3.Zj = false;
         return var10000;
      }
   }

   public final sd0_1 eL0() {
      if (this.Vn == null) {
         this.Vn = new sd0_1(this);
         this.CY = new sd0_1(this);
      }

      sd0_1 var3 = this.Vn;
      if (!this.Vn.gn0) {
         var3.LJ = 0;
         var3.gn0 = true;
         this.CY.gn0 = false;
         return var3;
      } else {
         sd0_1 var10000 = this.CY;
         sd0_1 var10002 = this.CY;
         this.CY.LJ = 0;
         var10002.gn0 = true;
         var3.gn0 = false;
         return var10000;
      }
   }

   public final void n3(Object var1, Object var2) {
      int var4;
      label41: {
         Object[] var3 = this.ev;
         if (var1 == null) {
            var4 = 0;

            for (int var5 = this.tb0; var4 < var5; var4++) {
               if (var3[var4] == var1) {
                  break label41;
               }
            }
         } else {
            var4 = 0;

            for (int var7 = this.tb0; var4 < var7; var4++) {
               if (var1.equals(var3[var4])) {
                  break label41;
               }
            }
         }

         var4 = -1;
      }

      if (var4 == -1) {
         int var6 = this.tb0;
         if (this.tb0 == this.ev.length) {
            this.JK(Math.max(8, (int)(var6 * 1.75F)));
         }

         var4 = this.tb0++;
      }

      this.ev[var4] = var1;
      this.hv[var4] = var2;
   }

   public final void qq0(Object var1) {
      Object[] var2 = this.ev;
      if (var1 == null) {
         int var3 = 0;

         for (int var4 = this.tb0; var3 < var4; var3++) {
            if (var2[var3] == var1) {
               Object var10002 = this.hv[var3];
               this.cq(var3);
               return;
            }
         }
      } else {
         int var5 = 0;

         for (int var6 = this.tb0; var5 < var6; var5++) {
            if (var1.equals(var2[var5])) {
               Object var7 = this.hv[var5];
               this.cq(var5);
               return;
            }
         }
      }
   }

   public LinearObjectMap() {
      this(true, 16);
   }

   public LinearObjectMap(int var1) {
      this(true, var1);
   }

   public LinearObjectMap(boolean var1, int var2) {
      this.ek = var1;
      this.ev = new Object[var2];
      this.hv = new Object[var2];
   }

   public LinearObjectMap(boolean var1, int var2, Class var3, Class var4) {
      this.ek = var1;
      this.ev = (Object[])iy0_0.ix(var3, var2);
      this.hv = (Object[])iy0_0.ix(var4, var2);
   }

   public LinearObjectMap(Class var1, Class var2) {
      this(false, 16, var1, var2);
   }

   public LinearObjectMap(LinearObjectMap var1) {
      this(var1.ek, var1.tb0, var1.ev.getClass().getComponentType(), var1.hv.getClass().getComponentType());
      this.tb0 = var1.tb0;
      System.arraycopy(var1.ev, 0, this.ev, 0, this.tb0);
      System.arraycopy(var1.hv, 0, this.hv, 0, this.tb0);
   }

   public LinearObjectMap(cf_2 var1) {
      this(var1.ek, var1.tb0, var1.ev.getClass().getComponentType(), var1.hv.getClass().getComponentType());
      this.tb0 = var1.tb0;
      System.arraycopy(var1.ev, 0, this.ev, 0, this.tb0);
      System.arraycopy(var1.hv, 0, this.hv, 0, this.tb0);
   }
}
