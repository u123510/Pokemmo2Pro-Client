package cn.pokemmo.ui.widget.pc;

import f.*;

import java.util.ArrayList;

public class PcStorageTradeSlotWidget extends ye_0 {
    public final tx_0 Xa0;
    public final byte VA0;
    public VU bY;

    public PcStorageTradeSlotWidget(QT qt, NK nk, Mj mj, tx_0 tx_02, byte b) {
        super(qt, nk, mj, (short) -1);
        this.Xa0 = tx_02;
        this.VA0 = b;
    }

    public static Vt0 Ea0(jb0_0[] jb0_0Arr, BU bu) {
        Vt0 vt0 = new Vt0();
        at_0 at_0 = new at_0(sm0_0.c0(2300));
        at_0 at_02 = new at_0(sm0_0.c0(1414));
        at_0.eu0 = () -> kv(jb0_0Arr, bu);
        at_02.eu0 = () -> Q20(jb0_0Arr);
        if (bu == null) {
            return vt0;
        }
        vt0.hx.add(at_0);
        vt0.hx.add(at_02);
        return vt0;
    }

    public static void Q20(jb0_0[] jb0_0Arr) {
        int length = jb0_0Arr.length;
        for (int i = 0; i < length; i++) {
            jb0_0 jb0_02 = jb0_0Arr[i];
            if (jb0_02.ol0() != null && (jb0_02 instanceof com6__3)) {
                com6__3 com6__32 = (com6__3) jb0_02;
                BR br = tw0_0.rl;
                byte b = com6__32.Xa0.wo;
                byte b2 = com6__32.VA0;
                CH0 ch0 = CH0.j1;
                br.fk0.uQ(new cw_2(b, b2, ch0));
            }
        }
    }

    public static void kv(jb0_0[] jb0_0Arr, BU bu) {
        int length = jb0_0Arr.length;
        for (int i = 0; i < length; i++) {
            jb0_0 jb0_02 = jb0_0Arr[i];
            VU ol0 = jb0_02.ol0();
            qo_1 qo_12 = qo_1.DL;
            bu.FI(ol0, jb0_02, qo_12, false);
        }
    }

    @Override
    public final VU ol0() {
        return this.bY;
    }

    @Override
    public final _volatile h80() {
        VU vu = this.bY;
        if (vu == null) {
            return this.Vt0.Jn0;
        }
        return vu.I8.JF;
    }

    @Override
    public final short Xh0() {
        VU vu = this.bY;
        if (vu == null) {
            return this.Hr0;
        }
        return vu.I8.ou0;
    }

    @Override
    public final void av0(sg_2 sg_22) {
        VU ol0 = sg_22.ol0();
        BR br = tw0_0.rl;
        byte b = this.Xa0.wo;
        byte b2 = this.VA0;
        CH0 ch0;
        if (ol0 == null) {
            ch0 = CH0.j1;
        } else {
            ch0 = ol0.pu;
        }
        br.fk0.uQ(new cw_2(b, b2, ch0));
    }

    @Override
    public final boolean nd0(i70_0 i70_02) {
        int i = i70_02.zu;
        if (E00.C10(i)) {
            if (i == 3) {
                lo0_0 lo0_02 = this.mD0.bH;
                if (lo0_02.Em0 == null) {
                    return super.nd0(i70_02);
                }
                mh_1 mh_12 = lo0_02.Em0.cL;
                mh_12.HV.sj0(lo0_02.Wc, true);
            } else if (i == 4) {
                lo0_0 lo0_03 = this.mD0.bH;
                if (lo0_03.Em0 == null) {
                    return super.nd0(i70_02);
                }
                mh_1 mh_13 = lo0_03.Em0.cL;
                mh_13.HV.sj0(lo0_03.Wc, true);
                mh_1 mh_14 = lo0_03.Em0.cL;
                C90 c90 = lo0_03.Wc;
                if (c90 == null) {
                    mh_14.getClass();
                    throw new NullPointerException("processor cannot be null");
                }
                mh_14.HV.P6(0, c90);
            }
        }
        return super.nd0(i70_02);
    }

    @Override
    public final void TG0(i70_0 i70_02) {
        if (this.Vt0.Jn0 == _volatile.Bf0) {
            int i = i70_02.nA0;
            if (i == 0 && (i70_02.J30 & 9) != 0) {
                LPT8(!this.ER.U20());
                return;
            }
            if (i == 0 && !i70_02.VP) {
                if (this.bY != null) {
                    if (this.ER.U20()) {
                        ye_0[] uO = this.O3.uO();
                        if (uO.length > 0) {
                            Vt0 ea0 = Ea0(uO, Qy0.yI0.zK0);
                            int i2 = i70_02.f8;
                            UA.rL(ea0, this, i2, i70_02.AN);
                        }
                    } else {
                        BU bu = Qy0.yI0.zK0;
                        jb0_0[] jb0_0Arr = new jb0_0[]{this};
                        Vt0 ea02 = Ea0(jb0_0Arr, bu);
                        int i3 = i70_02.f8;
                        UA.rL(ea02, this, i3, i70_02.AN);
                    }
                }
                if (!this.ER.U20()) {
                    ye_0[] uO2 = this.O3.uO();
                    int length = uO2.length;
                    for (int i4 = 0; i4 < length; i4++) {
                        uO2[i4].LPT8(false);
                    }
                }
                Runnable runnable = this.Nj;
                if (runnable != null) {
                    runnable.run();
                }
            } else if (i == 1) {
                BU.T50.FI(this.bY, this, qo_1.DL, false);
            }
        }
    }
}
