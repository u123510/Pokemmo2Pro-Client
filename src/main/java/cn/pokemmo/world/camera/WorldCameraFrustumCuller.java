package cn.pokemmo.world.camera;

import f.*;

import java.util.ArrayList;

public abstract class WorldCameraFrustumCuller {
    public static final dl_1 G3;
    public static final C8 ez;
    public static boolean z0;
    public boolean fX;
    public boolean UU;
    public es_1 qf;
    public float qH;
    public boolean vn0;
    public boolean ue;
    public final in_2 N30;

    static {
        G3 = Cq0.E1(WorldCameraFrustumCuller.class);
        ez = new C8();
        z0 = false;
    }

    public WorldCameraFrustumCuller() {
        this.fX = false;
        this.UU = false;
        this.qf = new es_1();
        this.qH = 0.0F;
        this.vn0 = true;
        this.N30 = new in_2(150);
    }

    public void ql0() {
        boolean b;
        if (tw0_0.Eu(3)) {
            Qy0.yI0.getClass();
            b = Qy0.QF0(Qy0.yI0) == null;
        } else {
            b = false;
        }
        this.ue = b;
        Jm0(tw0_0.e60.N60());
    }

    public boolean Jm0(_else _else) {
        if (!tw0_0.Eu(3)) {
            return false;
        }
        if (!this.fX || !this.ue) {
            return false;
        }
        in_2 in_2 = this.N30;
        in_2.getClass();
        if (System.currentTimeMillis() < in_2.ar) {
            return true;
        }
        if (lg_0.lW.eC0(70) || lg_0.lW.eC0(81)) {
            HF0();
            this.N30.ng0();
        } else if (lg_0.lW.eC0(69)) {
            uD0();
            this.N30.ng0();
        } else if (lg_0.lW.eC0(3)) {
            M9();
            aN(Bc());
            this.N30.ng0();
        }
        return true;
    }

    public void ph0() {
        this.UU = true;
        yt_1 yt_1 = tw0_0.e60;
        if (yt_1 == null) {
            return;
        }
        for (Object obj : yt_1.pn0.values()) {
            bi0_1 bi0_1 = (bi0_1) obj;
            if (bi0_1.rd != null && bi0_1.Jf0()) {
                ((Ai0) bi0_1.hj).is();
            }
            bi0_1.uR().is();
        }
        E90 e90 = tw0_0.e60.jB0;
        if (e90 != null) {
            if (e90.Jf0()) {
                ((Ai0) e90.hj).is();
            }
            e90.L8.is();
        }
    }

    public void bw() {
    }

    public abstract boolean yp(byte b);

    public abstract void Dt0(int i, int i2);

    public abstract void HF0();

    public abstract void uD0();

    public abstract void Yt(double d);

    public abstract void aN(float f);

    public abstract float Bc();

    public abstract void M9();

    public abstract void dispose();

    public boolean VK() {
        return false;
    }

    public boolean wp(LT lt, boolean z, boolean z2) {
        return false;
    }

    public boolean o7(byte b, C8 c8, int i, boolean z, boolean z2, boolean z3) {
        return false;
    }

    public void VI(boolean z, short s, short s2, float f, float f2, float f3, float f4, short s3) {
    }

    public void Tm0(boolean z) {
    }

    public String g80() {
        return "";
    }

    public abstract Tv0 So();

    public ly0_0 Ej0() {
        return null;
    }

    public void yd(short[] sArr) {
        if (sArr.length < 1) {
            return;
        }
        if (sArr[0] == -28672) {
            int size = tw0_0.rl.r1(_volatile.BV).VW.size();
            I2 zd = this.qf.ZD();
            while (zd.hasNext()) {
                ((nv0_0) zd.next()).GN(size);
            }
        }
    }

    public void Lo0(boolean z) {
    }

    public void vT() {
        G3.info("Reloading map.");
    }

    public final void coM7(_else _else) {
        tW tW = _else.pG;
        if (tW == tW.cH && !_else.Z10) {
            this.qH = 0.0F;
            tw0_0.rl.c50 = 0;
            return;
        }
        if (tW == tW.RN) {
            this.qH = 0.0F;
            tw0_0.rl.c50 = 0;
        }
        float f = this.qH;
        float f2 = (float) tw0_0.rl.c50;
        if (f - f2 >= 0.0F) {
            float f3 = f - lg_0.S4.uL * 2.0F;
            this.qH = f3;
            if (f3 < 0.0F) {
                this.qH = 0.0F;
            }
        }
        float f4 = f2 - this.qH;
        if (f4 > 0.0F) {
            float f5 = this.qH + lg_0.S4.uL * 2.0F;
            this.qH = f5;
            if (f5 > 6.0F) {
                this.qH = 6.0F;
            }
        }
    }

    public abstract void qq0(PRN_ prn_);

    public ff_0 Fq0() {
        return null;
    }

    public abstract void GU(boolean z);

    public abstract void Xf0();

    public void KU(boolean z, CH0 ch0) {
    }

    public abstract void RU(bi0_1 bi0_1, iq0_0 iq0_0, ArrayList arrayList);

    public void IK() {
    }

    public /* synthetic */ void C30(byte b, C8 c8, int i, boolean z, boolean z2, boolean z3) {
        o7(b, c8, i, z, z2, z3);
    }

    public /* synthetic */ void Lq0(short[] sArr) {
        yd(sArr);
    }
}
