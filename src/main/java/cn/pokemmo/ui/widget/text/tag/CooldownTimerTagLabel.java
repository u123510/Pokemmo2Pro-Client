package cn.pokemmo.ui.widget.text.tag;

import f.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.ui.widget.text.tag.BaseTaggedLabelWidget;

public class CooldownTimerTagLabel extends BaseTaggedLabelWidget {
    public static final MD0 v;
    public final TH Ql0;
    public boolean gx;
    public final byte LPT4;

    static {
        v = MD0.cB("dragActive");
        MD0.cB("dropOk");
        MD0.cB("dropBlocked");
    }

    public CooldownTimerTagLabel(TH th, byte b) {
        super("", 48, 48);
        sl().Gy0(6, 6);
        uf("pc-slot");
        this.Ql0 = th;
        this.LPT4 = b;
        cn_0 cn_02 = new cn_0("");
        cn_02.uf("label-dark");
        cn_02.Bb(100);
        SL(cn_02);
    }

    public final void Td(short s) {
        if (s > 0) {
            this.tp0.o60(yh_0.Xm0.qC0(s, (byte) 0, false));
            this.yj0 = ((cq_0) mp_1.vf0().k2.get(Short.valueOf(s))).Ay(false);
            yB0();
        } else {
            this.tp0.lo0();
            this.yj0 = null;
            yB0();
        }
        this.tp0.G1 = true;
    }

    @Override
    public final boolean nd0(i70_0 i70_02) {
        if (i70_02.Li()) {
            if (this.gx) {
                if (i70_02.LI0()) {
                    this.gx = false;
                    this.M.j70(v, false);
                }
            } else if (i70_02.VP) {
                this.gx = true;
                this.M.j70(v, true);
            }
            if (i70_02.zu == 4) {
                int n = i70_02.nA0;
                if (n == 1) {
                    TH th = this.Ql0;
                    byte b = this.LPT4;
                    if (th.Do != 2 && b >= 0 && b < th.x40.length) {
                        byte b2 = th.x40[b];
                        if (b2 >= 0 && b2 < th.Cw0.length) {
                            VU vu = th.Cw0[b2];
                            if (vu != null) {
                                lg_0.k.lPT5(new com7__0(th, vu));
                            }
                        }
                    }
                } else if (n == 0) {
                    TH th2 = this.Ql0;
                    byte b3 = this.LPT4;
                    if ((th2.uI & 8) != 0) {
                        int n2 = 0;
                        for (byte b4 = 0; b4 < th2.sE0; b4 = (byte) (b4 + 1)) {
                            if (b4 != b3 && th2.x40[b4] != b4) {
                                n2++;
                            }
                        }
                        if (n2 > 0) {
                            Qy0.yI0.dk(-1, sm0_0.c0(6039));
                            return true;
                        }
                    }
                    th2.ET[b3] = null;
                    th2.x40[b3] = -1;
                    th2.Qe0[b3].Td((short) -1);
                    th2.Ew();
                }
            }
            return true;
        }
        return super.nd0(i70_02);
    }

    @Override
    public final void K8() {
        super.K8();
    }

    @Override
    public final void Dw0(zk0_1 zk0_12) {
        if (!this.gx) {
            super.Dw0(zk0_12);
        }
    }

    @Override
    public final void Kp0(zk0_1 zk0_12, int i2, int i3, int i4) {
        this.tp0.mt0(i2, i3);
    }
}
