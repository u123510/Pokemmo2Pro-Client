package cn.pokemmo.rom.gba.sprite;

import f.*;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;

public class GbaSpriteAnimationData extends ht_0 {
   public final int AA;
   public final boolean sp;
   public final byte qM;
   public final int Db;
   public final int FZ;
   public final int Jb0;
   public int ph0;
   public Wr[] Ug;
   public final qa0_1 on;
   public int ow;
   public i8_0 mR;
   public final byte T4;
   public boolean zd0;
   public byte k30;

   public GbaSpriteAnimationData(int var1, int var2, qa0_1 var3) {
      this.ph0 = 0;
      this.Ug = null;
      this.mR = null;
      this.zd0 = false;
      this.k30 = -1;
      this.on = var3;
      ByteBuffer var7;
      (var7 = var3.vy0()).position(var2);
      this.AA = var1;
      this.sp = var7.getShort() == -1;
      var2 = var7.get();
      byte qMValue = (byte)var2;
      byte var4;
      byte var10000 = var4 = var7.get();
      this.T4 = var4;
      if (var10000 == 16) {
         qMValue = (byte)(var2 + 26);
         var7.getInt();
         var7.getInt();
         this.Jb0 = G90.GF0(var7.getInt());
         this.Db = 16;
         this.FZ = 16;
      } else if (var4 == -1) {
         qMValue = (byte)(var2 + 26);
         var7.getInt();
         var7.getInt();
         if (var1 == 159) {
            this.Jb0 = G90.GF0(var7.getInt());
            this.Db = 32;
            this.FZ = 32;
         } else if (var1 == 180) {
            this.Db = 64;
            this.FZ = 64;
            var7.getInt();
            var7.getInt();
            var7.getInt();
            this.Jb0 = ((Buffer)var7).position();
         } else {
            this.Jb0 = G90.GF0(var7.getInt());
            this.Db = 16;
            this.FZ = 16;
         }
      } else if (var4 == 17) {
         var7.getInt();
         this.Db = var7.getShort() & '\uffff';
         this.FZ = var7.getShort() & '\uffff';
         var7.getInt();
         var7.getInt();
         var7.getInt();
         var7.getInt();
         this.Jb0 = G90.GF0(var7.getInt());
         var7.getInt();
      } else {
         this.Db = 16;
         this.FZ = 16;
         this.Jb0 = 0;
         this.Ug = new Wr[0];
      }

      this.qM = qMValue;

   }

   public GbaSpriteAnimationData() {
      super();
      this.ph0 = 0;
      this.Ug = null;
      this.mR = null;
      this.zd0 = false;
      this.k30 = -1;
      this.on = null;
      this.AA = -1;
      this.Db = 16;
      this.FZ = 16;
      this.sp = true;
      this.qM = 0;
      this.T4 = 0;
      this.Jb0 = 0;
      Wr[] var2;
      Wr[] var10001 = var2 = new Wr[3];
      Wr var1 = Wr.Mk0;
      var10001[0] = var1;
      var10001[1] = var1;
      var10001[2] = var1;
      this.Ug = var2;
   }

   public final void qs() {
      ByteBuffer var1;
      (var1 = this.on.VL0.slice().order(ByteOrder.LITTLE_ENDIAN)).position(this.Jb0);
      ArrayList var2;
      var2 = new ArrayList();
      this.k30 = c8_0.JD0.YG();
      i8_0 var5;
      if (this.zd0) {
         byte var10000 = this.on.rt0();
         byte var3 = this.k30;
         byte var4 = this.qM;
         var5 = this.mR;
         fv0_0 var7;
         if ((var7 = (fv0_0)Bg.e50.f5(Bg.fz0(var10000, var3, var4, 0))) != null) {
            var5 = var5.e20();

            for(int var10 = 0; var10 < 16; ++var10) {
               int var6;
               if ((var6 = var7.Np[var10]) != 0) {
                  var5.ax[var10] = var6;
               }
            }
         }
      } else {
         var5 = this.mR;
      }

      int var8;
      Wr var12;
      for(; (this.ow < 1 || ((Buffer)var1).position() < this.ow) && G90.Uh0(var8 = var1.getInt()); var2.add(var12)) {
         var8 = G90.GF0(var8);
         var1.getShort();
         var1.getShort();
         int var11;
         if ((var11 = this.AA) != 165 && var11 != 161 && var11 != 153) {
            if (var11 == 93) {
               Iv0 var14;
               var14 = new Iv0(asBridge(), var8, var5);
               Wr var18 = var12 = new Wr(var14);
            } else if (var11 == 151) {
               vj0_1 var15;
               var15 = new vj0_1(asBridge(), var8, var5);
               Wr var19 = var12 = new Wr(var15);
            } else {
               DF var16;
               var16 = new DF(asBridge(), var8, var5);
               Wr var20 = var12 = new Wr(var16);
            }
         } else {
            hf_0 var13;
            var13 = new hf_0(asBridge(), var8, var5);
            Wr var17 = var12 = new Wr(var13);
         }
      }

      this.Ug = (Wr[])var2.toArray(new Wr[0]);
   }

   public final byte Lx0() {
      return this.T4;
   }

   public final Wr li0(int var1) {
      if (this.Ug == null) {
         this.qs();
      }

      if (this.zd0 && this.k30 != c8_0.JD0.YG()) {
         this.qs();
      }

      Wr[] var2;
      if ((var2 = this.Ug).length == 0) {
         return null;
      } else {
         if (var1 < 0 || var1 >= var2.length) {
            var1 = 0;
         }

         if (var2[var1] == null) {
            this.qs();
         }

         return this.Ug[var1];
      }
   }

   public final boolean XC(int var1) {
      return this.ph0 > var1;
   }

   public final Wr[] z4() {
      if (this.Ug == null) {
         this.qs();
      }

      Wr[] var1;
      return (var1 = this.Ug).length == 0 ? new Wr[0] : (Wr[])Arrays.copyOf(var1, var1.length);
   }

   public final PO asBridge() {
      return (PO) (Object) this;
   }
}
