package cn.pokemmo.ui.widget.component;

import f.*;
import java.util.*;

public class WorldClockCalendarComponent extends BaseComponent {
    public static long kB = 0L;
    public int PF0;
    public int ud0;
    public int n70;
    public int jg;
    public long mt;
    public float WD0;
    public final Br0 PA0;
    public final Br0 i0;
    public final Br0 WC0;
    public final Br0 g10;
    public final Br0 rh0;
    public final Br0 GI0;
    public final Br0 Z60;
    public final com8__1 eB;
    public final cn_0 lF0;
    public final cn_0 lE0;
    public final S70 QH;

    public WorldClockCalendarComponent(PF v1, String v2) {
        this.PF0 = 0;
        this.ud0 = 0;
        this.n70 = 0;
        this.jg = 0;
        this.mt = 0L;
        this.WD0 = 0.05f;
        this.PA0 = new Br0(this);
        this.i0 = new Br0(this);
        this.WC0 = new Br0(this);
        this.g10 = new Br0(this);
        this.rh0 = new Br0(this);
        this.GI0 = new Br0(this);
        this.Z60 = new Br0(this);
        this.n70 = 0;
        this.jg = 0;
        this.eB = new com8__1();
        this.eB.aE(0.0f);
        SL(this.eB);
        String name = (v1 == null) ? "--" : v1.A60();
        this.lF0 = new cn_0(name);
        this.lE0 = new cn_0(jj0_0.hw0("/ ", v2));
        this.QH = new S70(72, 72);
        this.QH.JH().Gy0(36, 36);
        if (v1 == null) {
            this.QH.JH().o60(yh_0.Dl0().qC0((short) 0, (byte) 0, false));
        } else {
            this.QH.JH().o60(yh_0.Dl0().qC0(v1.G20(), v1.Wm(), v1.yT()));
        }
        this.QH.JH().nq0(72, 72);
        this.QH.JH().C80(250);
        SL(this.QH);
        SL(this.lF0);
        SL(this.lE0);
        ji0_0 var1_ji0 = ji0_0.Hg;
        this.WC0.Nk(new Wr[]{var1_ji0.Q20(0)});
        this.i0.Nk(new Wr[]{var1_ji0.Q20(1)});
        this.PA0.Nk(new Wr[]{var1_ji0.Q20(2)});
        this.PA0.wx0(gn_0.ORANGE);
        this.GI0.Nk(new Wr[]{var1_ji0.Nn(0)});
        this.rh0.Nk(new Wr[]{var1_ji0.Nn(1)});
        this.g10.Nk(new Wr[]{var1_ji0.Nn(2)});
        this.g10.wx0(new gn_0((byte) -1, (byte) 117, (byte) -36, (byte) 125));
        this.mt = hk0_1.lQ();
    }

    public final boolean Td0(boolean b) {
        if (b) {
            return this.ud0 >= this.jg;
        }
        return this.PF0 >= this.n70;
    }

    public final void WZ(boolean b) {
        int delay = 500;
        long curTime = hk0_1.KG;
        while (this.mt + (long) delay < curTime) {
            if (this.ud0 < this.jg && b) {
                this.ud0++;
                this.eB.aE(this.eB.NQ + this.WD0);
                long kg = hk0_1.KG;
                if (kg - kB > 100L) {
                    kB = kg;
                    tw0_0.RE0.Hq0((byte) 1, (short) 21);
                }
            }
            if (this.PF0 < this.n70 && !b) {
                this.PF0++;
                this.eB.aE(this.eB.NQ + this.WD0);
                long kg = hk0_1.KG;
                if (kg - kB > 100L) {
                    kB = kg;
                    tw0_0.RE0.Hq0((byte) 1, (short) 21);
                }
            }
            this.mt += (long) delay;
        }
    }

    @Override
    public final void HP(zk0_1 v1) {
        super.HP(v1);
        this.eB.E40(this.A20 - 297, this.SB0 + 28);
        this.eB.RY(275, 13);
        this.eB.lt0();
        this.lF0.E40(this.A20 - 290, this.SB0 + 8);
        this.lE0.E40(this.A20 - 150, this.SB0 + 8);
        this.QH.E40(this.A20 - 400, this.SB0 - 60);
        this.QH.og.G1 = (this.eB.NQ >= 0.98f);
        int y1 = -8;
        for (int i = 0; i < 10; ++i) {
            int x = i * 24 - 16;
            if (i >= this.jg) {
                this.g10.gY = x;
                this.g10.a4 = y1;
                this.g10.OA0 = true;
                this.g10.IF = 24;
                this.g10.gx0 = 24;
                this.g10.t00();
            } else if (this.jg - this.ud0 > i) {
                this.GI0.gY = x;
                this.GI0.a4 = y1;
                this.GI0.OA0 = true;
                this.GI0.IF = 24;
                this.GI0.gx0 = 24;
                this.GI0.t00();
            } else {
                this.rh0.gY = x;
                this.rh0.a4 = y1;
                this.rh0.OA0 = true;
                this.rh0.IF = 24;
                this.rh0.gx0 = 24;
                this.rh0.t00();
            }

            int y2 = 16;
            if (i >= this.n70) {
                this.PA0.gY = x;
                this.PA0.a4 = y2;
                this.PA0.OA0 = true;
                this.PA0.IF = 24;
                this.PA0.gx0 = 24;
                this.PA0.t00();
            } else if (this.n70 - this.PF0 > i) {
                this.i0.gY = x;
                this.i0.a4 = y2;
                this.i0.OA0 = true;
                this.i0.IF = 24;
                this.i0.gx0 = 24;
                this.i0.t00();
            } else {
                this.WC0.gY = x;
                this.WC0.a4 = y2;
                this.WC0.OA0 = true;
                this.WC0.IF = 24;
                this.WC0.gx0 = 24;
                this.WC0.t00();
            }
        }
        if (this.Z60 != null && Td0(true) && Td0(false)) {
            this.Z60.gY = -425;
            this.Z60.a4 = 0;
            this.Z60.OA0 = true;
            this.Z60.IF = 48;
            this.Z60.gx0 = 48;
            this.Z60.t00();
        }
    }
}
