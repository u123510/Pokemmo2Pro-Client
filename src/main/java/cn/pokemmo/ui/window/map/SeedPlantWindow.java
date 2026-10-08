package cn.pokemmo.ui.window.map;

import f.*;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/**
 * 树果种子种植弹窗
 *
 * 原混淆类: f.ef_0
 */
public class SeedPlantWindow extends yz_1 implements tr_1  {
    public final ef_0 asBridge() {
        return (ef_0) (Object) this;
    }

    public final byte Gr0;
    public final f80_0[] coM7;
    public final fy_2 Zt0;
    public final xe_1 Ds0;
    public final xe_1 gs0;
    public final f80_0 K7;
    public final Qv0 u0;

    public SeedPlantWindow(byte b) {
        this.Gr0 = b;
        Pb0(this::zA);
        uf("seed-plant-dialog");
        Hy(sm0_0.c0(8560));
        fy_2 fy_2Var = new fy_2();
        this.Zt0 = fy_2Var;
        xe_1 xe_1Var = new xe_1(sm0_0.c0(8561));
        this.Ds0 = xe_1Var;
        xe_1 xe_1Var2 = new xe_1(sm0_0.c0(nf0_0.Bq0));
        this.gs0 = xe_1Var2;
        xe_1Var.RR(this::No);
        xe_1Var2.RR(this::zA);
        this.coM7 = new f80_0[4];
        for (int i = 0; i < this.coM7.length; i++) {
            this.coM7[i] = new f80_0(asBridge());
            this.coM7[i].of(new Or0(asBridge(), this.coM7[i], i));
        }
        f80_0 f80_0Var = new f80_0(asBridge());
        this.K7 = f80_0Var;
        f80_0Var.Hr(12, 10);
        Qv0 qv0Var = new Qv0("\n\n");
        this.u0 = qv0Var;
        f80_0Var.Ll(false);
        qv0Var.Ll(false);
        this.Zt0.H10().qd(15);
        ya_1 v3 = this.Zt0.lo0().LPt3(this.coM7).X20(this.Zt0.lo0()).qd(15);
        bo_0.ph0(this.Zt0.lo0(), new le0_2[] {f80_0Var, qv0Var}, v3, 15);
        this.Zt0.x40(this.Zt0.H10().LPt3(new le0_2[] {this.Ds0, this.gs0}).X20(this.Zt0.H10()).Ze0());
        this.Zt0.WQ(
            this.Zt0.lo0().X20(
                this.Zt0.H10().Ze0()
                    .Kn0(this.coM7[0]).Ze0()
                    .Kn0(this.coM7[1]).Ze0()
                    .Kn0(this.coM7[2]).Ze0()
                    .Kn0(this.coM7[3]).Ze0()
            ).X20(
                this.Zt0.H10().Ze0().LPt3(new le0_2[] {f80_0Var, qv0Var}).Ze0()
            ).X20(
                this.Zt0.lo0().Kn0(this.Ds0).Kn0(this.gs0)
            )
        );
        SL(this.Zt0);
    }

    public final void No() {
        RJ0 rj0 = tw0_0.rl.NC[1];
        pi_0 v2 = new pi_0();
        for (f80_0 slot : this.coM7) {
            short wE0 = slot.wE0;
            if (wE0 >= 1) {
                int i8 = v2.lpt2(wE0);
                boolean isNew;
                if (i8 < 0) {
                    i8 = -i8 - 1;
                    byte[] bArr = v2.y10;
                    bArr[i8] = (byte) (bArr[i8] + 1);
                    isNew = false;
                } else {
                    v2.y10[i8] = 1;
                    isNew = true;
                }
                byte b = v2.Ut[i8];
                if (isNew) {
                    v2.OC0(v2.H6);
                }
            }
        }
        int i3 = v2.Rv;
        if (i3 < 1) {
            zA();
            return;
        }
        boolean i4 = true;
        short[] v5 = new short[i3];
        short[] jA0 = v2.jA0;
        byte[] ut = v2.Ut;
        int i8 = ut.length;
        int i9 = 0;
        while (true) {
            i8--;
            if (i8 <= 0) {
                break;
            }
            if (ut[i8] == 1) {
                v5[i9++] = jA0[i8];
            }
        }
        for (int i6 = 0; i6 < i3; i6++) {
            short i7 = v5[i6];
            short i8_cnt = (short) (v2.aU(i7) * 2);
            if (!rj0.Dj0((byte) -1, i7, i8_cnt)) {
                i4 = false;
            }
        }
        if (i4) {
            int i3_min = 2499;
            int i4_keys = v2.Rv;
            short[] v5_keys = new short[i4_keys];
            short[] jA0_2 = v2.jA0;
            byte[] ut_2 = v2.Ut;
            int i8_len = ut_2.length;
            int i9_idx = 0;
            while (true) {
                i8_len--;
                if (i8_len <= 0) {
                    break;
                }
                if (ut_2[i8_len] == 1) {
                    v5_keys[i9_idx++] = jA0_2[i8_len];
                }
            }
            for (int i6 = 0; i6 < i4_keys; i6++) {
                short s_key = v5_keys[i6];
                int div = rj0.a90(s_key) / v2.aU(s_key);
                if (div < i3_min) {
                    i3_min = (short) div;
                }
            }
            short seedId = this.K7.wE0;
            String seedName;
            if (seedId < 1) {
                seedName = "???";
            } else {
                seedName = sm0_0.c0(gu0.l2.lPT6(seedId).Nl);
            }
            String msg = sm0_0.wa0(8563, seedName);
            uf0_0 uf0_0Var = new uf0_0(msg, i3_min, new yw_1(asBridge()), asBridge());
            Qy0.yI0.F9(Qy0.yI0.fU(), uf0_0Var);
        } else {
            byte gr0 = this.Gr0;
            yj_1 v4 = new yj_1(10, 0);
            v4.uo0((short) 1);
            for (f80_0 slot : this.coM7) {
                short wE0 = slot.wE0;
                if (wE0 >= 1) {
                    v4.uo0(wE0);
                }
            }
            short[] qE = v4.qE();
            byte[] bArr = new byte[qE.length * 2];
            ShortBuffer sb = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asShortBuffer();
            for (short s : qE) {
                sb.put(s);
            }
            tw0_0.rl.hB(gr0, bArr);
            xe0();
        }
    }

    public final void zA() {
        tw0_0.rl.ze0(this.Gr0, (byte) 0);
        xe0();
    }

    public final void x00() {
        lpt6__0.v90(this.coM7[0]);
    }

    @Override
    public final void K8() {
        super.K8();
        lt0();
        N80(pa0_0.Ol);
    }

    @Override
    public final boolean nd0(i70_0 v1) {
        if (E00.ZU(v1.zu) && v1.iT()) {
            for (int i2 = 0; i2 < this.coM7.length; i2++) {
                int key = v1.finally$;
                rp_0 rp = rp_0.sJ0;
                int unused = dw_2.ff;
                if (rp != null && rp.Ov(key) && this.coM7[i2].Of()) {
                    Runnable r = this.coM7[i2].M40;
                    if (r != null) {
                        r.run();
                    }
                    return true;
                }
            }
            int key2 = v1.finally$;
            rp_0 rp = rp_0.sJ0;
            int unused = dw_2.ff;
            if (rp != null && rp.Ov(key2) && this.Ds0.Of()) {
                a7_0.bH(this.Ds0.ER.Fc0);
                return true;
            }
            int key3 = v1.finally$;
            rp_0 nK0 = rp_0.nK0;
            if (nK0 != null && nK0.Ov(key3)) {
                a7_0.bH(this.gs0.ER.Fc0);
                return true;
            }
            if (rp != null && rp.Ov(key3) && this.gs0.Of()) {
                a7_0.bH(this.gs0.ER.Fc0);
                return true;
            }
            int key4 = v1.finally$;
            rp_0 kC0 = rp_0.kC0;
            if (kC0 != null && kC0.Ov(key4)) {
                Uz(-1, true);
                if (this.K7.Of()) {
                    Uz(-1, true);
                }
                return true;
            }
            rp_0 I90 = rp_0.I90;
            if (I90 != null && I90.Ov(key4)) {
                Uz(-1, true);
                if (this.K7.Of()) {
                    Uz(-1, true);
                }
                return true;
            }
            int key5 = v1.finally$;
            rp_0 sync = rp_0.synchronized$;
            if (sync != null && sync.Ov(key5)) {
                Uz(1, true);
                if (this.K7.Of()) {
                    Uz(1, true);
                }
                return true;
            }
            rp_0 ni = rp_0.Ni;
            if (ni != null && ni.Ov(key5)) {
                Uz(1, true);
                if (this.K7.Of()) {
                    Uz(1, true);
                }
                return true;
            }
        }
        return super.nd0(v1);
    }
}
