package cn.pokemmo.ui.window.map;

import f.*;

import java.util.stream.IntStream;

/**
 * 树果物品小窗
 *
 * 原混淆类: f.ur_1
 */
public class BerryItemWindow extends yz_1 implements tr_1  {
    public final ur_1 asBridge() {
        return (ur_1) (Object) this;
    }

    public final VU eM;
    public fy_2 PP;
    public final K5 tp0;
    public dg0_0 Db;
    public xe_1 aD;
    public final StringBuilder T0;
    public final cn_0 fy;
    public final int[] Er;
    public int eG;
    public int oU;

    public BerryItemWindow(VU v1, K5 v2) {
        this.T0 = new StringBuilder();
        this.fy = new cn_0("");
        this.oU = -1;
        Pb0(this::close);
        this.eM = v1;
        this.tp0 = v2;
        short[] kC0 = v1.i3().kC0();
        int i4 = v1.RJ().ca() ? kC0.length : kC0.length - 1;
        int[] err = IntStream.range(0, i4)
            .map(i -> COM5(kC0, i))
            .distinct()
            .filter(ur_1::WJ0)
            .toArray();
        this.Er = err;
        if (err.length <= 1) {
            tw0_0.rl.qK(sm0_0.c0(6005));
            close();
            return;
        }
        xe_1[] btnArr = new xe_1[this.Er.length];
        for (int i = 0; i < this.Er.length; i++) {
            xe_1 btn = new xe_1(sm0_0.c0(this.Er[i] + 210000));
            btnArr[i] = btn;
            int idx = i;
            btn.RR(() -> Ij(idx));
        }
        this.eG = kC0[v1.RJ().an()];
        if (tw0_0.kz0()) {
            uf("mysterious-gem");
        } else {
            uf("seed-plant-dialog");
            Hy(sm0_0.c0(100031));
        }
        fy_2 fy2 = new fy_2();
        this.PP = fy2;
        dg0_0 dg0 = new dg0_0();
        this.Db = dg0;
        dg0.Db(v1);
        dg0.Mj0(false);
        dg0.Xr0(lb0_2.FP(v1));
        cn_0 cn0 = new cn_0(sm0_0.wa0(8590, v1.na0()));
        xe_1 xe1 = new xe_1(sm0_0.c0(60));
        this.aD = xe1;
        xe_1 xe2 = new xe_1(sm0_0.c0(nf0_0.Bq0));
        this.aD.RR(() -> lpT1(v1));
        this.aD.pw0(false);
        xe2.RR(this::close);

        ya_1 y1 = fy2.H10().qd(15);
        ya_1 y2 = bo_0.ph0(fy2.lo0(), new le0_2[]{dg0}, y1, 15);
        ya_1 y3 = bo_0.ph0(fy2.lo0(), new le0_2[]{cn0}, y2, 15);
        ya_1 y4 = bo_0.ph0(fy2.lo0(), new le0_2[]{this.fy}, fy2.lo0().LPt3(btnArr).X20(y3).qd(15), 15);
        fy2.x40(fy2.H10().LPt3(new le0_2[]{this.aD, xe2}).X20(y4).Ze0());
        fy2.WQ(fy2.lo0().X20(fy2.H10().Ze0().Kn0(dg0).Ze0()).X20(fy2.H10().Ze0().LPt3(new le0_2[]{cn0}).Ze0()).X20(fy2.H10().Ze0().LPt3(btnArr).Ze0()).X20(fy2.H10().Ze0().LPt3(new le0_2[]{this.fy}).Ze0()).X20(fy2.lo0().Kn0(this.aD).Kn0(xe2)));
        SL(fy2);
    }

    public static boolean WJ0(int i) {
        return i != 0;
    }

    public static int COM5(short[] sArr, int i) {
        return sArr[i];
    }

    public final void close() {
        BU bu = BU.T50;
        ur_1 ur = bu.K3;
        if (ur != null) {
            ur.xe0();
            bu.K3 = null;
        }
    }

    @Override
    public final void K8() {
        if (tw0_0.kz0()) {
            kh0();
            this.PP.vf(pa0_0.Ol);
            this.PP.oY(500, 520);
        } else {
            super.K8();
            lt0();
            N80(pa0_0.Ol);
        }
    }

    public final void iy() {
        K5 k5 = this.tp0;
        hl0_0 hl0 = k5.nn;
        short s = hl0.wQ;
        CH0 br = hl0.Br;
        VU vu = this.eM;
        CH0 pu = vu.pu;
        short[] h5 = vu.SC.h5;
        byte b = (byte) S.os0((short) this.Er[this.oU], h5);
        tw0_0.rl.sn0(s, br, pu, (short) 1, b);
        BU bu = BU.T50;
        ur_1 ur = bu.K3;
        if (ur != null) {
            ur.xe0();
            bu.K3 = null;
        }
    }

    public final void lpT1(VU v1) {
        if (this.oU < 0) {
            return;
        }
        String str = sm0_0.Bx(8591, new String[]{
            v1.na0(),
            sm0_0.c0(this.eG + 210000),
            sm0_0.c0(this.Er[this.oU] + 210000)
        });
        Qy0.yI0.sr0(new lpt3__4(str, this::iy, asBridge()));
    }

    public final void Ij(int i) {
        this.oU = i;
        int i1 = this.Er[i];
        this.T0.setLength(0);
        if (i1 == this.eG) {
            this.T0.append(sm0_0.c0(i1 + 220000));
            this.T0.append("\n\n");
            this.T0.append(sm0_0.Bx(8592, new String[]{
                this.eM.na0(),
                sm0_0.c0(i1 + 210000)
            }));
            this.aD.pw0(false);
            this.fy.Sk(this.T0.toString());
        } else {
            this.T0.append(sm0_0.c0(i1 + 220000));
            this.aD.pw0(true);
            this.fy.Sk(this.T0.toString());
        }
    }
}
