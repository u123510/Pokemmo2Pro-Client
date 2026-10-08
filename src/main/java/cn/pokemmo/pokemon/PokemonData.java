package cn.pokemmo.pokemon;

import f.*;
import cn.pokemmo.pokemon.pokedex.*;
import java.util.Arrays;

/**
 * 宝可梦核心实例数据模型 (Pokemon Data Model)
 * 管理单只宝可梦的全国图鉴物种编号、6 维个体值 IV (0-31)、6 维努力值 EV (0-252, 总和 510)、
 * 4 个配招 Move ID 与对应 PP、当前等级与经验值、性格 Nature、特性 Ability、
 * 亲密度、异色闪光标记、持有道具、原始训练家 (OT) 与自定义昵称。
 *
 * 原混淆类: f.CE
 */
public class PokemonData implements Cloneable {
    public final CE asBridge() {
        return ((Object) this) instanceof CE ? (CE) (Object) this : null;
    }

    public final short getSpeciesId() {
        return this.Yb0;
    }

    public final String getNickname() {
        return this.bj;
    }

    public final String getOriginalTrainer() {
        return this.kX;
    }

    public final short[] getMoves() {
        return this.Gu;
    }

    public final byte[] getMovePPs() {
        return this.TC0;
    }

    public final short[] getStats() {
        return this.iI0;
    }

    public final rz_0 getNature() {
        return this.yb;
    }

    public final boolean isShiny() {
        return ca();
    }

   public CH0 YD0;
   public b Hf0;
   public CH0 W50;
   public _volatile JF;
   public short ou0;
   public short Yb0;
   public int vQ;
   public CH0 C70;
   public String bj;
   public String kX;
   public byte jw0;
   public byte H1;
   public byte wj;
   public short VD;
   public short pQ;
   public short ZE0;
   public int Lr0;
   public byte WH0;
   public short bm;
   public final short[] Gu;
   public final byte[] TC0;
   public final short[] iI0;
   public byte sl;
   public byte GD0;
   public byte Fe;
   public byte y8;
   public byte zc;
   public byte vO;
   public byte aJ0;
   public byte dZ;
   public byte QQ;
   public byte ZF0;
   public int al0;
   public byte Xn0;
   public long gU;
   public short IB;
   public int t50;
   public short SW;
   public final short[] V3;
   public i40_0 kQ;
   public QL N00;
   public QL[] bG0;
   public rz_0 yb;
   public xg_1 GK0;

   public PokemonData(CH0 var1) {
      CH0 var2 = CH0.j1;
      this.W50 = CH0.j1;
      this.C70 = var2;
      this.bj = "";
      this.kX = "";
      this.ZE0 = -1;
      this.Gu = new short[4];
      this.TC0 = new byte[4];
      this.iI0 = new short[6];
      this.QQ = 3;
      this.V3 = new short[4];
      this.kQ = null;
      this.N00 = QL.lQ;
      this.bG0 = QL.rn0;
      this.yb = rz_0.YB;
      this.GK0 = xg_1.rv;
      this.YD0 = var1;
      this.t50 = (int)(System.currentTimeMillis() / 1000L);
   }

   public static byte kq(byte var0) {
      if (var0 == 0) {
         return 0;
      } else if ((var0 | 8) == var0) {
         return 8;
      } else if ((var0 | -128) == var0) {
         return -128;
      } else if ((var0 | 16) == var0) {
         return 16;
      } else if ((var0 | 32) == var0) {
         return 32;
      } else if ((var0 | 64) == var0) {
         return 64;
      } else {
         return (byte)((var0 & 7) > 0 ? 7 : 0);
      }
   }

   public final void tI() {
      this.yb = (rz_0)rz_0.RM.BM((byte)((this.vQ & 4294967295L) % 25L));
   }

   public final CH0 Mw0() {
      return this.YD0;
   }

   public final CH0 Zy() {
      return this.W50;
   }

   public final _volatile nq() {
      return this.JF;
   }

   public final short b70() {
      return this.ou0;
   }

   public final short SA0() {
      return this.Yb0;
   }

   public final short Kr() {
      if (this.vn()) {
         return yh_0.BE;
      }

      short var1 = this.Yb0;
      return yh_0.Ed(this.ZF0, var1);
   }

   public final boolean I() {
      return (this.IB & 9) != 0;
   }

   public final boolean u3() {
      return (this.IB & 8) != 0;
   }

   public final void n7(short var1) {
      this.IB = var1;
      if (this.I() && this.N00 == QL.lQ) {
         this.N00 = QL.N8;
      } else if (!this.I() && this.N00 == QL.N8) {
         this.N00 = QL.lQ;
      }
   }

   public final boolean ca() {
      return (this.IB & 2) != 0;
   }

   public final boolean aUX() {
      return (this.IB & 16) != 0;
   }

   public final boolean xk() {
      return (this.IB & 64) != 0;
   }

   public final boolean TH() {
      return this.Yb0 == 492 && this.ZF0 == 1;
   }

   public final boolean pg() {
      return this.Yb0 == 492 && (this.IB & 256) != 0;
   }

   public final boolean iB() {
      return (this.IB & 128) != 0;
   }

   public final boolean aR() {
      return (this.IB & 4) != 0;
   }

   public final CH0 x40() {
      return this.C70;
   }

   public final String Ql0() {
      return this.bj.contains("{STRING_") ? sm0_0.dd(this.bj) : this.bj;
   }

   public final boolean Y1() {
      String var1;
      return (var1 = this.kX) != null && !var1.isEmpty();
   }

   public final String eM() {
      return this.kX;
   }

   public final byte tr0() {
      return this.wj;
   }

   public final short JW() {
      return this.VD;
   }

   public final void hB(short var1) {
      if (var1 <= 0) {
         var1 = 0;
      }

      this.VD = var1;
   }

   public final short rh0() {
      short var1 = this.ZE0;
      return this.ZE0 != -1 ? var1 : this.pQ;
   }

   public final boolean COM6() {
      return this.rh0() > 0;
   }

   public final int OR() {
      return this.Lr0;
   }

   public final short Dn0() {
      return this.bm;
   }

   public final short[] B5() {
      return this.Gu;
   }

   public final short UD(int var1) {
      return this.Gu[var1];
   }

   public final boolean Mb(short var1) {
      if (var1 == 0) {
         return false;
      }

      if (var1 == 165) {
         int var2 = 0;

         while (true) {
            byte[] var3 = this.TC0;
            if (var2 >= this.TC0.length) {
               return true;
            }

            if (var3[var2] > 0) {
               break;
            }

            var2++;
         }
      }

      int var4 = 0;

      while (true) {
         short[] var5 = this.Gu;
         if (var4 >= this.Gu.length) {
            return false;
         }

         if (var5[var4] == var1) {
            return true;
         }

         var4++;
      }
   }

   public final byte xm(int var1) {
      return this.TC0[var1];
   }

   public final short ns0(int var1) {
      return this.V3[var1];
   }

   public final boolean df0() {
      int var1 = 0;

      while (true) {
         short[] var2 = this.V3;
         if (var1 >= this.V3.length) {
            return false;
         }

         if (var2[var1] > 0) {
            return true;
         }

         var1++;
      }
   }

   public final short ZY(gc_2 var1) {
      if (var1.j8) {
         return 0;
      }

      byte var2 = var1.v10;
      return this.iI0[var2];
   }

   public final short f80() {
      return this.Vr(-1);
   }

   public final short Vr(int var1) {
      short var2 = 0;
      int var3 = 0;

      while (true) {
         short[] var4 = this.iI0;
         if (var3 >= this.iI0.length) {
            return var2;
         }

         if (var3 != var1) {
            var2 += var4[var3];
         }

         var3++;
      }
   }

   public final short ob(ib0_0 var1) {
      if (var1 == ib0_0.sh) {
         return (short)(this.sl & 0xFF);
      } else if (var1 == ib0_0.Ah0) {
         return (short)(this.GD0 & 0xFF);
      } else if (var1 == ib0_0.LpT4) {
         return (short)(this.Fe & 0xFF);
      } else if (var1 == ib0_0.ms) {
         return (short)(this.y8 & 0xFF);
      } else {
         return var1 == ib0_0.V70 ? (short)(this.zc & 0xFF) : 0;
      }
   }

   public final byte TG0() {
      return this.vO;
   }

   public final byte N40() {
      return this.aJ0;
   }

   public final byte mm0() {
      return this.dZ;
   }

   public final byte PRn() {
      return this.QQ;
   }

   public final byte RI(gc_2 var1) {
      return var1.j8 ? 0 : (byte)(this.al0 >> var1.v10 * 5 & -225);
   }

   public final short X3() {
      short var1 = 0;
      gc_2[] var2 = gc_2.Wp;
      int var3 = gc_2.Wp.length;

      for (int var4 = 0; var4 < var3; var4++) {
         var1 = (short)(this.RI(var2[var4]) + var1);
      }

      return var1;
   }

   public final byte Sx() {
      byte var1 = 0;
      gc_2[] var2 = gc_2.Wp;
      int var3 = gc_2.Wp.length;

      for (int var4 = 0; var4 < var3; var4++) {
         byte var5;
         if ((var5 = this.RI(var2[var4])) > var1) {
            var1 = var5;
         }
      }

      return var1;
   }

   public final gc_2 yW() {
      gc_2 var1 = null;
      byte var2 = 0;
      gc_2[] var3 = gc_2.Wp;
      int var4 = gc_2.Wp.length;

      for (int var5 = 0; var5 < var4; var5++) {
         gc_2 var6;
         byte var7;
         if ((var7 = this.RI(var6 = var3[var5])) > var2) {
            var1 = var6;
            var2 = var7;
         }
      }

      var3 = gc_2.Wp;
      var4 = gc_2.Wp.length;

      for (int var10 = 0; var10 < var4; var10++) {
         gc_2 var11;
         if ((var11 = var3[var10]) != var1 && this.RI(var11) == var2) {
            return null;
         }
      }

      return var1;
   }

   public final byte an() {
      return this.Xn0;
   }

   public final boolean gS(int var1) {
      return (this.gU & 1L << var1) != 0L;
   }

   public final boolean W8(int var1, int var2) {
      return (this.gU >> var1 * 3 + 1 & 7L) >= var2;
   }

   public final int LPT5() {
      return this.t50;
   }

   public final boolean vn() {
      return (this.SW & 1) != 0;
   }

   public final rz_0 W4() {
      return this.yb;
   }

   public final QL No() {
      return this.N00;
   }

   public final boolean dO(QL var1) {
      if (var1 != QL.Uy0 && var1 != QL.lQ) {
         if (var1 == QL.N8) {
            return this.I();
         }

         QL[] var4;
         int var2 = (var4 = this.bG0).length;

         for (int var3 = 0; var3 < var2; var3++) {
            if (var4[var3] == var1) {
               return true;
            }
         }

         return false;
      } else {
         return true;
      }
   }

   public final byte Vd(byte var1, int var2) {
      if (var1 == 1) {
         return 1;
      }

      double var3;
      double var5 = (var3 = var1) * 0.2;
      double var7 = var2 >= 0 && var2 <= 3 ? (byte)(this.WH0 >> var2 * 2 & 3) : 0;
      return (byte)(Math.floor(var5 * var7) + var3);
   }

   public final void QK(short var1, gc_2 var2) {
      if (!var2.j8) {
         byte var7 = var2.v10;
         byte var3 = 0;
         short var4 = 252;
         if (var1 < 0) {
            var1 = var3;
         } else if (var1 > var4) {
            var1 = var4;
         }

         var1 = (short)var1;
         if (this.Vr(var7) + var1 > 510) {
            var1 = (short)(510 - this.Vr(var7));
         }

         short[] var5;
         if ((var5 = this.iI0)[var7] != var1) {
            var5[var7] = var1;
         }
      }
   }

   public final void w40(QL var1) {
      if (!this.dO(var1)) {
         if (var1.new$()) {
            QL[] var10002 = Arrays.copyOf(this.bG0, this.bG0.length + 1);
            var10002[var10002.length - 1] = var1;
            this.bG0 = var10002;
            if (this.N00 == QL.lQ) {
               this.N00 = var1;
            }
         }
      }
   }
}

