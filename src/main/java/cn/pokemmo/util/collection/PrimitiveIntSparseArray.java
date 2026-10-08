package cn.pokemmo.util.collection;

import f.*;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Arrays;
import java.util.ConcurrentModificationException;

public class PrimitiveIntSparseArray extends GX implements S1 {
   static final long serialVersionUID = 1L;
   public transient Object[] td;
   public int gm0;

   public PrimitiveIntSparseArray() {
   }

   public PrimitiveIntSparseArray(int var1) {
      super(4096);
      this.gm0 = km_2.Lo0;
   }

   @Override
   public final int La(int var1) {
      int var10000 = super.La(var1);
      this.td = new Object[var10000];
      return var10000;
   }

   @Override
   public final void Pl(int var1) {
      int[] var6 = super.dH;
      int var2 = super.dH.length;
      Object[] var3 = this.td;
      byte[] var4 = super.Ut;
      super.dH = new int[var1];
      this.td = new Object[var1];
      super.Ut = new byte[var1];

      while (true) {
         int var10000 = var2;
         var2 += -1;
         if (var10000 <= 0) {
            return;
         }

         if (var4[var2] == 1) {
            int var5 = this.yw0(var6[var2]);
            this.td[var5] = var3[var2];
         }
      }
   }

   @Override
   public final Object get(int var1) {
      int var2;
      return (var2 = this.bY(var1)) < 0 ? null : this.td[var2];
   }

   public final Object uu0(int var1, Object var2) {
      return this.j10(this.yw0(var1), var2);
   }

   public final Object V30(int var1) {
      Object var2 = null;
      if ((var1 = this.bY(var1)) >= 0) {
         var2 = this.td[var1];
         this.td[var1] = null;
         super.dx0(var1);
      }

      return var2;
   }

   @Override
   public final void dx0(int var1) {
      this.td[var1] = null;
      super.dx0(var1);
   }

   public final void clear() {
      super.Rv = 0;
      super.YB0 = this.uT();
      int var2 = super.dH.length;
      int var1 = this.gm0;
      Arrays.fill(super.dH, 0, var2, var1);
      Arrays.fill(super.Ut, 0, super.Ut.length, (byte)0);
      Arrays.fill(this.td, 0, this.td.length, null);
   }

   public final int[] Zw0() {
      int[] var1 = new int[super.Rv];
      int[] var2;
      int[] var10000 = var2 = super.dH;
      byte[] var6 = super.Ut;
      int var3 = var10000.length;
      int var4 = 0;

      while (true) {
         int var7 = var3;
         var3 += -1;
         if (var7 <= 0) {
            return var1;
         }

         if (var6[var3] == 1) {
            int var5 = var4 + 1;
            var1[var4] = var2[var3];
            var4 = var5;
         }
      }
   }

   public final boolean kM(V90 var1) {
      byte[] var4 = super.Ut;
      Object[] var2;
      int var3 = (var2 = this.td).length;

      do {
         int var5 = var3;
         var3 += -1;
         if (var5 <= 0) {
            return true;
         }
      } while (var4[var3] != 1 || var1.Jf0(var2[var3]));

      return false;
   }

   @Override
   public final boolean equals(Object var1) {
      if (!(var1 instanceof S1)) {
         return false;
      }

      S1 var2 = (S1)var1;
      if (var2.size() != super.Rv) {
         return false;
      }

      int var3 = this.size();
      try {
         for (int var4 = this.uT() - 1; var4 >= 0; var4--) {
            if (var3 != super.Rv) {
               throw new ConcurrentModificationException();
            }
            if (super.Ut[var4] != 1) {
               continue;
            }
            int var5 = super.dH[var4];
            Object var6 = this.td[var4];
            if (var6 == null) {
               if (var2.get(var5) != null || !var2.COm1(var5)) {
                  return false;
               }
            } else if (!var6.equals(var2.get(var5))) {
               return false;
            }
         }
      } catch (ClassCastException var7) {
         return true;
      }
      return true;
   }

   @Override
   public final int hashCode() {
      int var1 = 0;
      Object[] var2 = this.td;
      byte[] var3 = super.Ut;
      int var4 = this.td.length;

      while (true) {
         int var10000 = var4;
         var4 += -1;
         if (var10000 <= 0) {
            return var1;
         }

         if (var3[var4] == 1) {
            int var5 = super.dH[var4];
            Object var6 = var2[var4];
            int var7 = var6 == null ? 0 : var6.hashCode();
            var1 += var5 ^ var7;
         }
      }
   }

   @Override
   public final void writeExternal(ObjectOutput var1) {
      try {
         var1.writeByte(0);
         var1.writeByte(0);
         var1.writeFloat(super.na0);
         var1.writeFloat(super.yk0);
         var1.writeInt(this.gm0);
         var1.writeInt(super.Rv);
         for (int var2 = super.Ut.length - 1; var2 >= 0; var2--) {
            if (super.Ut[var2] == 1) {
               var1.writeInt(super.dH[var2]);
               var1.writeObject(this.td[var2]);
            }
         }
      } catch (IOException var3) {
         PrimitiveIntSparseArray.<RuntimeException>H40(var3);
      }
   }

   @Override
   public final void readExternal(ObjectInput var1) {
      try {
         var1.readByte();
         super.readExternal(var1);
         this.gm0 = var1.readInt();
         int var2 = var1.readInt();
         this.td = new Object[super.La(var2)];
         for (int var3 = var2 - 1; var3 >= 0; var3--) {
            int var4 = var1.readInt();
            Object var5 = var1.readObject();
            this.j10(this.yw0(var4), var5);
         }
      } catch (IOException | ClassNotFoundException var6) {
         PrimitiveIntSparseArray.<RuntimeException>H40(var6);
      }
   }

   @SuppressWarnings("unchecked")
   private static <T extends Throwable> void H40(Throwable var0) throws T {
      throw (T)var0;
   }

   @Override
   public final String toString() {
      StringBuilder var1;
      var1 = new StringBuilder("{");
      boolean var2 = true;
      byte[] var3 = super.Ut;
      int[] var4;
      int[] var10000 = var4 = super.dH;
      Object[] var8 = this.td;
      int var5 = var10000.length;

      while (true) {
         int var9 = var5;
         var5 += -1;
         if (var9 <= 0) {
            var1.append("}");
            return var1.toString();
         }

         if (var3[var5] == 1) {
            int var6 = var4[var5];
            Object var7 = var8[var5];
            if (var2) {
               var2 = false;
            } else {
               var1.append(",");
            }

            var1.append(var6);
            var1.append("=");
            var1.append(var7);
         }
      }
   }

   public final Object j10(int var1, Object var2) {
      Object var3 = null;
      boolean var4 = true;
      if (var1 < 0) {
         var1 = -var1 - 1;
         var3 = this.td[var1];
         var4 = false;
      }

      this.td[var1] = var2;
      if (var4) {
         this.OC0(super.pRN);
      }

      return var3;
   }

   public final void JZ(Fz0 var1) {
      byte[] var2 = super.Ut;
      int[] var3;
      int[] var10000 = var3 = super.dH;
      Object[] var6 = this.td;
      int var4 = var10000.length;

      while (true) {
         int var7 = var4;
         var4 += -1;
         if (var7 <= 0) {
            return;
         }

         if (var2[var4] == 1) {
            int var5 = var3[var4];
            if (!var1.j80(var5, var6[var4])) {
               return;
            }
         }
      }
   }
}
