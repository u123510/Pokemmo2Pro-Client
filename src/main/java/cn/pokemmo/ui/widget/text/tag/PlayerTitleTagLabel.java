package cn.pokemmo.ui.widget.text.tag;

import f.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.ui.widget.text.tag.BaseTaggedLabelWidget;

public class PlayerTitleTagLabel extends BaseTaggedLabelWidget implements Runnable {
    public final lf0_0 bp0;
    public final RP Ki0;
    public final int IC0;
    public final int r4;
    public boolean W4;

    public PlayerTitleTagLabel(lf0_0 v1, QY v2) {
        super("", v1.rC0, v1.rC0);
        int ic0 = -1;
        int r4_val = -1;
        switch (v2.At0) {
            case 0:
                ic0 = 4;
                r4_val = 5;
                break;
            case 1:
                break;
            case 2:
                r4_val = 6;
                break;
            case 3:
                ic0 = 19;
                r4_val = 6;
                break;
            case 4:
                ic0 = 20;
                r4_val = 6;
                break;
            default:
                ic0 = 20;
                r4_val = 21;
                break;
        }
        this.IC0 = ic0;
        this.r4 = r4_val;
        this.W4 = false;
        this.bp0 = v1;
        uf("townmap-cursor");
        this.Ki0 = v2;
        cI();
        int ax = v1.ax;
        int offset = ax * 4;
        sy(v2.l40 * ax - offset, v2.fQ * ax - offset);
        RR(this);
    }

    public PlayerTitleTagLabel(lf0_0 v1, uz_1 v2) {
        super("", v1.rC0, v1.rC0);
        this.IC0 = -1;
        this.r4 = -1;
        this.W4 = false;
        this.bp0 = v1;
        uf("townmap-cursor");
        this.Ki0 = v2;
        cI();
        int rC0 = v1.rC0;
        sy(v2.l40 * rC0 + v1.DA, v2.fQ * rC0 + v1.rE0);
        RR(this);
        lt0();
    }

    public PlayerTitleTagLabel(lf0_0 v1, qg_1 v2) {
        super("", v1.rC0, v1.rC0);
        this.IC0 = -1;
        this.r4 = -1;
        this.W4 = false;
        this.bp0 = v1;
        uf("townmap-cursor");
        this.Ki0 = v2;
        cI();
        if (v2.At0 == 0) {
            int ax = v1.ax;
            int offset = ax * 4;
            sy(v2.lpT9 * ax - offset, v2.By0 * ax - offset);
        } else {
            int rC0 = v1.rC0;
            sy(v2.l40 * rC0 + v1.DA, v2.fQ * rC0 + v1.rE0);
        }
        RR(this);
        lt0();
    }

    public final void cI() {
        RP rp = this.Ki0;
        byte b = rp.eW;
        if (b == 2) {
            lf0_0 lf = this.bp0;
            int i3;
            if (lf.BT == this && lf.Yd0 && rp.MF0) {
                i3 = this.r4;
            } else {
                i3 = this.IC0;
            }
            short jx = rp.Jx;
            boolean w4;
            if (jx != -1) {
                w4 = tw0_0.rl.yh0.Ny(b, jx);
            } else {
                w4 = true;
            }
            this.W4 = w4;
            if (i3 < 1 || !w4) {
                this.tp0.lo0();
                return;
            }
            Wr wr = tw0_0.Ll0.Qz0.ma0[i3];
            wr.H8();
            this.tp0.Nk(new Wr[]{wr});
            Br0 br = this.tp0;
            int fr0 = wr.fr0;
            int ax = this.bp0.ax;
            int w = fr0 * ax;
            int h = wr.Tq * ax;
            br.OA0 = true;
            br.IF = w;
            br.gx0 = h;
            int offset = (ax * 8) / 2 + (-1 * (w / 2));
            br.gY = offset;
            br.a4 = offset;
            return;
        }
        if (b == 3) {
            int i1 = Lo0.my0[rp.l40][rp.fQ];
            short jx = rp.Jx;
            boolean w4;
            if (jx != -1) {
                w4 = tw0_0.rl.yh0.Ny(b, jx);
            } else {
                w4 = true;
            }
            this.W4 = w4;
            if (i1 > 0) {
                Wr wr = tw0_0.Ll0.nC0.ir0[w4 ? 0 : 1][i1 - 1];
                wr.H8();
                this.tp0.Nk(new Wr[]{wr});
                Br0 br = this.tp0;
                int fr0 = wr.fr0;
                int tq = wr.Tq;
                br.OA0 = true;
                br.IF = fr0;
                br.gx0 = tq;
                int ax = this.bp0.ax;
                br.EJ0 = (float) ax;
                int gy;
                int a4;
                if (ax == 1 || i1 == 1 || i1 == 7) {
                    gy = ax * -4;
                    a4 = ax * -3;
                } else if (i1 == 2) {
                    gy = ax * -4;
                    a4 = 0;
                } else if (i1 == 6) {
                    gy = 0;
                    a4 = ax * -3;
                } else {
                    gy = ax * -1;
                    a4 = 0;
                }
                br.gY = gy;
                br.a4 = a4;
            }
            return;
        }
        if (b == 4) {
            short jx = rp.Jx;
            boolean w4;
            if (jx != -1) {
                w4 = tw0_0.rl.yh0.Ny(b, jx);
            } else {
                w4 = false;
            }
            this.W4 = w4;
            qg_1 qg = (qg_1) this.Ki0;
            if (qg.Lr0 == 432 && !tw0_0.rl.yh0.Ny((byte) 4, (short) 1490)) {
                this.W4 = true;
            }
            if (this.W4) {
                this.tp0.lo0();
                return;
            }
            Wr u9 = tw0_0.Ll0.t1.U9;
            AG0 ag0 = new AG0(u9, qg.Lr0, qg.pL, qg.HE, qg.RB);
            this.tp0.o60(new AG0[]{ag0});
            Br0 br = this.tp0;
            int gj = ag0.gj;
            int g6 = ag0.g6;
            br.OA0 = true;
            br.IF = gj;
            br.gx0 = g6;
            int ax = this.bp0.ax;
            br.EJ0 = (float) ax;
            int offset = ax * 4;
            br.gY = offset;
            br.a4 = offset;
        }
    }

    @Override
    public final void run() {
        lf0_0 lf = this.bp0;
        if (lf.BT == this) {
            if (this.W4 && this.Ki0.MF0) {
                tw0_0.rl.fk0.uQ(new rp_2(this.Ki0.ZD0));
                this.bp0.Wh0.Iz(false, null);
            }
        } else {
            lf.Ax((dg_1) this);
        }
    }
}
