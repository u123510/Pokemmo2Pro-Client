package cn.pokemmo.pokemon.pokedex;

import f.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * 宝可梦图鉴基础种族条目 (Pokédex Entry)
 * 存储宝可梦物种的基础种族值、属性、特性、进化链、技能学习表与图鉴编号。
 * 原混淆类: f.cq_0
 */
public class PokedexEntry {
    public static final short[] L60 = new short[0];
    public final short dR;
    public final int bW;
    public int zq;
    public int sE0;
    public int yi0;
    public int ce0;
    public int wL0;
    public int this$;
    public i40_0 av0;
    public i40_0 aUx;
    public he0_1 uC;
    public boolean J4;
    public int AT;
    public short[] MZ;
    public short[] rA0;
    public int Ai;
    public q1_0 yw;
    public au_1 B2;
    public au_1 Cw;
    public final short[] h5;
    public short iv0;
    public short Com7;
    public byte ar;
    public cq_0 kT;
    public cq_0 ng;
    public byte a20;
    public short OR;
    public short vF;
    public short Cu0;
    public List<pu0_0> WC;
    public final ArrayList Xn;
    public final short[] Dz;
    public boolean jD;
    public boolean Hd;
    public final byte[] HG0;
    public N2 gq0;
    public final HashSet lD;
    public final short[][] r50;
    public cq_0 By;

    public PokedexEntry(short s) {
        this.zq = 0;
        this.sE0 = 0;
        this.yi0 = 0;
        this.ce0 = 0;
        this.wL0 = 0;
        this.this$ = 0;
        this.av0 = i40_0.c90;
        this.aUx = i40_0.c90;
        this.uC = he0_1.FK0;
        this.J4 = false;
        this.AT = 0;
        this.rA0 = L60;
        this.Ai = 0;
        this.yw = q1_0.yA0;
        this.B2 = au_1.PI;
        this.Cw = au_1.PI;
        this.h5 = new short[3];
        this.kT = null;
        this.ng = null;
        this.a20 = -1;
        this.OR = 0;
        this.vF = 0;
        this.Cu0 = 0;
        this.WC = new ArrayList<>();
        this.Xn = new ArrayList();
        this.Dz = new short[6];
        this.jD = false;
        this.Hd = false;
        this.HG0 = new byte[6];
        this.gq0 = N2.J8;
        this.lD = new HashSet();
        this.r50 = new short[Wx0.h90.length][0];
        this.By = null;
        this.dR = s;
        this.bW = s + 150000;
        this.Dz[5] = s;
    }

    public final cq_0 asBridge() {
        return ((Object) this) instanceof cq_0 ? (cq_0) (Object) this : null;
    }

    public final short getNationalId() {
        return this.dR;
    }

    public final String getName() {
        return zj();
    }

    public final int getBaseHp() {
        return this.zq;
    }

    public final int getBaseAttack() {
        return this.sE0;
    }

    public final int getBaseDefense() {
        return this.yi0;
    }

    public final int getBaseSpAttack() {
        return this.ce0;
    }

    public final int getBaseSpDefense() {
        return this.wL0;
    }

    public final int getBaseSpeed() {
        return this.this$;
    }

    public final i40_0 getType1() {
        return this.av0;
    }

    public final i40_0 getType2() {
        return this.aUx;
    }

    public final cq_0 getPreEvolution() {
        return this.By;
    }

    public final cq_0 getEvolution() {
        return this.ng;
    }

    public final void AB0() {
        gc_2[] me = gc_2.ME;
        int length = me.length;
        for (int i = 0; i < length; i++) {
            gc_2 gc_2 = me[i];
            if (!gc_2.j8) {
                this.HG0[gc_2.v10] = (byte) ((this.OR >> (gc_2.v10 * 2)) & 3);
            }
        }
    }

    public final short Lh(int i) {
        if (i < 0 || i > 2) {
            return 0;
        }
        if (i == 1) {
            short[] sArr = this.h5;
            if (sArr[i] < 1) {
                return sArr[0];
            }
        }
        return this.h5[i];
    }

    public final short[] kC0() {
        return this.h5;
    }

    public final short Nm() {
        return this.dR;
    }

    public final String zj() {
        return Ay(false);
    }

    public final String Ay(boolean z) {
        if (this.dR == 0) {
            return "???";
        }
        if (!z && this.kT != null) {
            return this.kT.Ay(false);
        }
        return sm0_0.c0(this.bW);
    }

    public final String FZ() {
        short targetDr;
        int i;
        if (this.kT != null) {
            i = this.kT.Qz(this.a20) - 1;
            targetDr = this.kT.dR;
        } else {
            i = this.dR;
            targetDr = this.dR;
        }
        if (targetDr > 493) {
            i += 16;
        }
        int i2 = i + 155000;
        if (!sm0_0.cU.l90(i2)) {
            return "";
        }
        return sm0_0.c0(i2);
    }

    public final short oH() {
        return MN((byte) -1);
    }

    public final short MN(byte b) {
        if (b >= 0 && b < this.Dz.length) {
            return this.Dz[b];
        }
        return this.Dz[this.Dz.length - 1];
    }

    public final i40_0 OE0(byte b) {
        if (this.dR == 493 && b > 0) {
            return i40_0.COm3(b);
        }
        return this.av0;
    }

    public final i40_0 F70(byte b) {
        if (this.dR == 493 && b > 0) {
            return i40_0.COm3(b);
        }
        return this.aUx;
    }

    public final q1_0 H5() {
        return this.yw;
    }

    public final int Fb(gc_2 gc_2) {
        switch (gc_2.ordinal()) {
            case 0:
                return this.zq;
            case 1:
                return this.sE0;
            case 2:
                return this.yi0;
            case 3:
                return this.ce0;
            case 4:
                return this.wL0;
            case 5:
                return this.this$;
            default:
                return 0;
        }
    }

    public final byte BU() {
        return this.ar;
    }

    public final short Qz(byte b) {
        if (b != 0 && this.dR != 493) {
            return (short) ((this.Com7 + 652) + (b - 1));
        }
        return this.dR;
    }

    public final short[] G60(Wx0 wx0) {
        return this.r50[wx0.Jn];
    }

    public final boolean dG(Wx0 wx0, short s) {
        short[] sArr = this.r50[wx0.Jn];
        int length = sArr.length;
        for (int i = 0; i < length; i++) {
            if (sArr[i] == s) {
                return true;
            }
        }
        return false;
    }

    public final cq_0 Gr0() {
        return this.By;
    }

    public final cq_0 Xt() {
        if (this.ng != null) {
            return this.ng;
        }
        return asBridge();
    }

    public final boolean N80(byte b) {
        int i = this.Ai;
        if (i == 0) {
            return b == 0;
        }
        if (i == 254) {
            return b == 1;
        }
        if (i == 255) {
            return b == -1;
        }
        return b == 0 || b == 1;
    }

    public final boolean IK(byte b, short s) {
        for (pu0_0 pu0_0 : this.WC) {
            if (pu0_0.HA0 == s && pu0_0.yL <= b) {
                return true;
            }
        }
        Wx0[] h90 = Wx0.h90;
        int length = h90.length;
        for (int i = 0; i < length; i++) {
            if (dG(h90[i], s)) {
                return true;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (cq_0 cq_0 = this.By; cq_0 != null && !arrayList.contains(cq_0); cq_0 = cq_0.By) {
            if (cq_0.IK(b, s)) {
                return true;
            }
            arrayList.add(cq_0);
        }
        return false;
    }
}
