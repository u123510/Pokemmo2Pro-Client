package cn.pokemmo.world.entity;

import f.*;
import java.util.Comparator;

/**
 * 大世界地图场景实体基类 (World Entity Base)
 * 封装场景所有生物实体（玩家角色、NPC、野生精灵跟随者）的坐标方位、物理朝向、动作与渲染挂载。
 *
 * 原混淆类: f.bi0_1
 */
public abstract class WorldEntity extends PH0 {
    public bi0_1 asBridge() {
        return (bi0_1) (Object) this;
    }

    public static final Comparator<bi0_1> ya0 = bi0_1::Uf;

    public final zv_2 ba0;
    public final EA0 il0;
    public mg_0 hj;
    public KF rd;
    public boolean Xe;
    public byte PD0;
    public RL0 wq0;

    public WorldEntity(CH0 cH0, zv_2 zv_22, byte by) {
        super(cH0);
        this.il0 = new EA0(asBridge());
        this.hj = this.at();
        this.Xe = false;
        this.wq0 = RL0.S60;
        this.ba0 = zv_22;
        this.PD0 = by;
    }

    public static int Uf(bi0_1 a, bi0_1 b) {
        if (b.pu.equals(tw0_0.e60.jB0.pu)) {
            return 100;
        }
        if (b instanceof KF) {
            return 99;
        }
        return a.na0().compareTo(b.na0());
    }

    public abstract mg_0 at();

    public final zv_2 g90() {
        return this.ba0;
    }

    public final short try$() {
        return this.ba0.Lq0;
    }

    public final short WR() {
        return this.ba0.B5;
    }

    public float E7() {
        return this.ba0.Com6();
    }

    public byte KJ0() {
        return 1;
    }

    public byte zK() {
        return 1;
    }

    public final EA0 Hp0() {
        return this.il0;
    }

    public mg_0 uR() {
        return this.hj;
    }

    public void Vl(boolean bl) {
        this.il0.w7();
        if (this.rd != null) {
            this.rd.Vl(bl);
        }
    }

    public abstract byte QU();

    public abstract short ki0();

    public boolean Ou() {
        return false;
    }

    public boolean uv() {
        return this.Xe;
    }

    public final boolean oI0() {
        return (this.PD0 & 2) != 0;
    }

    public boolean LH0() {
        return (this.PD0 & 1) != 0;
    }

    public void n6(boolean bl) {
        this.PD0 = bl ? (byte) (this.PD0 | 1) : (byte) (this.PD0 & 0xFFFFFFFE);
    }

    public final boolean Ze() {
        return (this.PD0 & 0x10) != 0;
    }

    public void ql(short s, byte by, boolean bl) {
        KF kf = this.rd;
        if (kf != null) {
            kf.Lu0 = s;
            kf.zD = by;
            kf.Pm0 = bl;
        }
    }

    public short mI0() {
        KF kf = this.rd;
        if (kf == null) {
            return 0;
        }
        return kf.Lu0;
    }

    public byte QL() {
        KF kf = this.rd;
        if (kf == null) {
            return 0;
        }
        return kf.zD;
    }

    public final boolean Jf0() {
        if (this.rd == null) {
            return false;
        }
        if ((this.PD0 & 0xFFFFFF80) != 0) {
            return true;
        }
        if (this.uR().wJ0()) {
            return false;
        }
        return (this.PD0 & 0x33) == 0;
    }

    public bi0_1 Lm() {
        return null;
    }

    public boolean Gw0() {
        return false;
    }

    public final boolean iz0(byte by) {
        return (this.PD0 & by) != 0;
    }

    public boolean aB() {
        return this instanceof pk0_2;
    }

    public String jh() {
        return "";
    }

    public final void PC0(RL0 rL0) {
        if (rL0 != RL0.S60 && this == tw0_0.e60.jB0) {
            return;
        }
        this.wq0 = rL0;
    }

    public boolean CI0() {
        return false;
    }

    public boolean vx0() {
        return true;
    }

    public ec0_1 Gi() {
        return null;
    }

    public final boolean a1(byte by, LT lT) {
        if (this.ba0.Lpt2 != lT.gr0()) {
            return false;
        }
        if (N50.Aa((byte) this.ba0.uS) && (this.ba0.o0 != lT.F2().Bm0 || this.ba0.ID0 != lT.F2().case$)) {
            return false;
        }
        if (lT.Tz() < this.ba0.Lq0) {
            return false;
        }
        short s = this.ba0.Lq0;
        if (lT.Tz() >= this.KJ0() + s) {
            return false;
        }
        if (lT.HR() <= this.ba0.B5 - this.zK()) {
            return false;
        }
        zv_2 zv = this.ba0;
        if (lT.HR() > zv.B5) {
            return false;
        }
        if (!N50.Aa((byte) zv.uS)) {
            byte jt = this.ba0.JT;
            if (lT.Es() == jt || jt < 0 && lT.Es() == 0) {
                return true;
            }
            return false;
        }
        if (by < 0) {
            return true;
        }
        byte jt = this.ba0.JT;
        if (jt < 0) {
            return true;
        }
        if (by / 3 == jt / 3) {
            return true;
        }
        return false;
    }

    public final void z90() {
        byte b = this.ba0.o0;
    }

    public final void nB0() {
        byte b = this.ba0.ID0;
    }
}
