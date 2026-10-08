package cn.pokemmo.world.entity;

import f.*;

/**
 * 玩家主角与同屏玩家角色实体 (Player Actor)
 * 承载玩家外观服饰自定义、公会标签、自行车/冲浪/滑板装扮状态、跟随精灵及对话气泡挂载。
 *
 * 原混淆类: f.E90
 */
public class PlayerActor extends bi0_1 {
    @Override
    public E90 asBridge() {
        return (E90) (Object) this;
    }

    public static final xa0_1 Ie0 = new xa0_1();
    public String oc0;
    public byte fH0;
    public byte Vv;
    public boolean Ac0;
    public mg_0 L8;
    public final ec0_1 J1;
    public MO bg0;
    public String Ll0;
    public String ea;
    public float DM;
    public boolean LPt7;
    public boolean uL0;
    public boolean w9;
    public boolean oD;
    public boolean Lpt3;
    public boolean FI0;
    public byte St;
    public short LY;

    public PlayerActor(CH0 v1, String v2, byte i3, byte i4, qe0_2 v5, zv_2 v6, byte i7, RL0 v8,
               byte i9, short i10, short i11, byte i12, String v13) {
        super(v1, v6, i7);
        this.Ac0 = false;
        this.DM = 0.0f;
        this.LPt7 = false;
        this.uL0 = false;
        this.w9 = false;
        this.St = (byte) -1;
        this.LY = (short) -1;
        this.oc0 = v2;
        this.fH0 = i3;
        this.Vv = i4;
        this.J1 = new ec0_1(i4, v5);
        PC0(v8);
        Yj(i9, i10);
        this.rd = new KF(this, i11, i12);
        this.Ll0 = v13;
        Cj0();
        De0();
    }

    public final void Cj0() {
        if (this.Ll0.isEmpty()) {
            this.ea = this.oc0;
            return;
        }
        this.ea = new StringBuilder("[")
                .append(this.Ll0)
                .append("]")
                .append(this.oc0)
                .toString();
    }

    public final void De0() {
        BR v1 = tw0_0.rl;
        if (v1 == null) {
            this.LPt7 = false;
            this.uL0 = false;
            this.w9 = false;
            return;
        }

        fa0_0 v2 = v1.q50;
        this.LPt7 = v2 != null && v2.lx.containsKey(this.pu);

        pk_0 v3 = v1.xI0;
        this.uL0 = v3 != null && v3.MH0(this.pu);

        yi_1 v4 = v1.gd0;
        this.w9 = v4 != null && v4.Wc.containsKey(this.pu);
    }

    public final mg_0 uR() {
        return this.L8;
    }

    public final byte QU() {
        return this.St == (byte) -1 ? (byte) 0 : this.St;
    }

    public final mg_0 at() {
        this.L8 = new lm_1(this);
        return this.L8;
    }

    public final void sE0(MO v1, boolean i2) {
        if (this.bg0 != null) {
            this.bg0.Jz0 = false;
        }
        this.bg0 = v1;
        if (v1 != null) {
            v1.Jz0 = i2;
            if (i2) {
                v1.il0.p6(KF.oZ(this));
            }
            return;
        }
        this.rd.il0.p6(KF.oZ(this));
    }

    public final String na0() {
        return this.oc0;
    }

    public final byte K60() {
        return this.Vv;
    }

    public final ec0_1 Gi() {
        return this.J1;
    }

    public final void Vl(boolean i1) {
        super.Vl(i1);
        EE[] v1 = this.J1.auX;
        for (int i2 = 0; i2 < v1.length; i2++) {
            v1[i2].ZH = (int) (v1[i2].ZH + hk0_1.HI0);
        }
    }

    public final boolean Ou() {
        return this.Ac0;
    }

    public final short ki0() {
        short i1 = this.Vv == 0 ? (short) 0 : (short) 7;
        if (this.LH0() || this.Ze()) {
            return (short) (i1 + 2);
        }
        if (this.oI0()) {
            return (short) (i1 + 1);
        }
        return i1;
    }

    public final boolean aB() {
        return true;
    }

    public final String jh() {
        return this.ea;
    }

    public final void n6(boolean i1) {
        super.n6(i1);
        this.rd.il0.h10();
        this.rd.il0.p6(KF.oZ(this));
    }

    public final void Yj(byte i1, short i2) {
        if (this.St == i1 && this.LY == i2) {
            return;
        }
        this.St = i1;
        this.LY = i2;
        if (i1 == (byte) -1 || i2 == (short) -1) {
            this.L8 = new lm_1(this);
            return;
        }
        if (!(this.L8 instanceof en0_0)) {
            this.L8 = new en0_0(asBridge());
        }
        en0_0 v3 = (en0_0) this.L8;
        v3.LpT6 = i1;
        v3.ku0 = i2;
        v3.V0 = i2 == (short) 10;
        if (i1 == (byte) 1) {
            this.L8.w5 = QI.Py.kN(i1, i2, false).XC(12);
        } else if (i1 == (byte) 0) {
            this.L8.w5 = QI.Py.kN(i1, i2, false).XC(11);
        }
    }

    public final void zf() {
        BR v1 = tw0_0.rl;
        if (v1 == null || v1.cJ0 == null || v1.cJ0.jB0 != this) {
            return;
        }
        if ((this.PD0 & 64) != 0) {
            v1.Ep.k5(-1, this.oc0, (short) 1001);
        } else {
            v1.Ep.BW((short) 1001);
        }
    }

    public final bi0_1 Lm() {
        return this.bg0;
    }
}
