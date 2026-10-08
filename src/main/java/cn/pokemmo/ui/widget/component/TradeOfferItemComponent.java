/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.ui.widget.component;

import f.*;
import java.util.*;

public class TradeOfferItemComponent extends BaseComponent {
    public final jc_2 MP;
    public final cn_0 B0;
    public final cn_0 sU;
    public final lo0_0 Oo;
    public final xe_1 Ku;
    public final xe_1 Hw;
    public final xe_1 xu0;
    public final xe_1 bH;
    public final xe_1 Pu;
    public final xe_1 q9;
    public final xe_1 d30;
    public final xe_1 pu;
    public final xe_1 fM0;
    public final xe_1 Zh0;
    public final xe_1 un;
    public final S70 Fr0;
    public gi_1 Fm;
    public K5 PA;

    public TradeOfferItemComponent(jc_2 owner) {
        super();
        this.uf("inventory-item-info");
        this.MP = owner;
        this.B0 = new cn_0();
        this.sU = new cn_0();
        this.Oo = new lo0_0(this.sU);
        this.Ku = new xe_1(sm0_0.c0(1410));
        this.Hw = new xe_1(sm0_0.c0(1437));
        this.xu0 = new xe_1(sm0_0.c0(1466));
        this.bH = new xe_1(sm0_0.c0(1703));
        this.Pu = new xe_1(sm0_0.c0(3006));
        this.q9 = new xe_1(sm0_0.c0(1412));
        this.d30 = new xe_1(sm0_0.c0(1414));
        this.pu = new xe_1(sm0_0.c0(1411));
        this.fM0 = new xe_1(sm0_0.c0(8551));
        this.Zh0 = new xe_1(sm0_0.c0(8571));
        this.un = new xe_1(sm0_0.c0(1424));
        this.Fr0 = new S70(180, 128);
        this.Ku.Ll(false);
        this.Hw.Ll(false);
        this.xu0.Ll(false);
        this.bH.Ll(false);
        this.Pu.Ll(false);
        this.q9.Ll(false);
        this.d30.Ll(false);
        this.pu.Ll(false);
        this.fM0.Ll(false);
        this.Zh0.Ll(false);
        this.un.Ll(false);
        this.SL(this.B0);
        this.SL(this.Oo);
        this.SL(this.Ku);
        this.SL(this.Hw);
        this.SL(this.xu0);
        this.SL(this.bH);
        this.SL(this.Pu);
        this.SL(this.q9);
        this.SL(this.d30);
        this.SL(this.pu);
        this.SL(this.fM0);
        this.SL(this.Zh0);
        this.SL(this.un);
        this.SL(this.Fr0);
    }

    public final void rL0(K5 k5) {
        this.PA = k5;
        this.Ku.Ll(false);
        this.Hw.Ll(false);
        this.xu0.Ll(false);
        this.bH.Ll(false);
        this.Pu.Ll(false);
        this.q9.Ll(false);
        this.d30.Ll(false);
        this.pu.Ll(false);
        this.fM0.Ll(false);
        this.Zh0.Ll(false);
        this.un.Ll(false);
        gi_1 oldFm = this.Fm;
        if (oldFm != null) {
            this.u3(oldFm);
        }
        if (k5 == null) {
            this.Fr0.og.lo0();
            this.B0.Sk("");
            this.sU.Sk("");
            return;
        }
        mc0_1 item = k5.cL;
        if (item.Iq != null) {
            gi_1 gi_12;
            hl0_0 hl0_02 = k5.nn;
            byte by = hl0_02.N50;
            gi_12 = new gi_1(item, by, hl0_02.pe, false, false, "");
            this.Fm = gi_12;
            this.F9(this.fU(), gi_12);
            this.sU.Sk("");
            this.B0.Sk(k5.Ua());
        } else {
            this.sU.Sk(lb0_2.Sp0(item, false, false));
            this.B0.Sk(k5.Ua());
        }
        this.Fr0.og.Nk(gh_1.aH0.F10(k5.cL, false));
        int n = 96;
        int n2 = 96;
        this.Fr0.og.OA0 = true;
        this.Fr0.og.IF = n;
        this.Fr0.og.gx0 = n2;
        this.Fr0.og.Dg(pa0_0.Ol);
        if (k5.cL.dB0(false) != JU.O4 && tw0_0.PK0 == null && !tw0_0.rl.nz()) {
            Object object2 = tw0_0.rl.DD(k5.cL.zK);
            if (object2 != null) {
                final EK event = (EK)object2;
                ed0_0 ed0_02 = event.zD0;
                if (ed0_02.Dr) {
                    this.xu0.Ll(true);
                    this.xu0.pw0(true);
                    this.xu0.SU(sm0_0.c0(1465));
                    this.xu0.ER.Fc0 = null;
                    this.xu0.RR(() -> this.Ya(k5, event));
                } else if ((long)ed0_02.ly - System.currentTimeMillis() / 1000L < 0L) {
                    this.xu0.Ll(true);
                    this.xu0.pw0(true);
                    this.xu0.SU(sm0_0.c0(1466));
                    this.xu0.ER.Fc0 = null;
                    this.xu0.RR(() -> this.Am0(k5));
                } else {
                    this.xu0.Ll(true);
                    this.xu0.pw0(false);
                    this.xu0.SU(tx_1.i((int)((long)((EK)object2).zD0.ly - System.currentTimeMillis() / 1000L), true));
                    this.xu0.ER.Fc0 = null;
                }
                this.bH.Ll(true);
                this.bH.ER.Fc0 = null;
                this.bH.RR(() -> this.Z7(event));
            } else {
                this.Ku.Ll(true);
                this.Ku.ER.Fc0 = null;
                this.Ku.RR(() -> this.fH0(k5));
            }
            if (k5.cL.g0 != QL.lQ) {
                this.Pu.Ll(true);
                this.Pu.ER.Fc0 = null;
                this.Pu.RR(() -> this.E8(k5));
            }
            if ((object2 = k5.cL.Iq) != null && ((X90)object2).wk(32768)) {
                this.Hw.Ll(true);
                this.Hw.ER.Fc0 = null;
                this.Hw.RR(() -> this.BV(k5));
            }
            if ((object2 = BU.T50.z6) != null && ((IA)object2).YF(k5.nn.wQ) > -1) {
                this.d30.Ll(true);
                this.d30.ER.Fc0 = null;
                this.d30.RR(() -> this.YI0(k5));
            } else {
                this.q9.Ll(true);
                this.q9.ER.Fc0 = null;
                this.q9.RR(new uh_2((f.HD0)(Object)this, k5));
            }
        }
        mc0_1 comparable = k5.cL;
        l5_0 l5_02 = comparable.Yt0;
        if (l5_02 != l5_0.Jy && l5_02 != l5_0.Hj && comparable.ii0) {
            this.pu.Ll(true);
            this.pu.ER.Fc0 = null;
            this.pu.RR(() -> this.QQ(k5));
        }
        if (k5.nn.P.LPt4 && k5.cL.X80() && k5.cL.Z8 != 1446) {
            K5 replacement = tw0_0.rl.NC[1].Mq0((short)1028);
            this.fM0.Ll(true);
            this.fM0.ER.Fc0 = null;
            this.fM0.RR(() -> this.uj(replacement, k5));
            this.Zh0.Ll(true);
            this.Zh0.ER.Fc0 = null;
            this.Zh0.RR(() -> this.K30(k5));
        }
        if (k5.cL.To0(true)) {
            this.un.Ll(true);
            this.un.ER.Fc0 = null;
            this.un.RR(() -> this.AF(k5));
        }
        this.K8();
    }

    @Override
    public final void K8() {
        int height = this.K20.OB - 60;
        this.oY(600, height);
        this.A20(pa0_0.Mk, 0, 60);
        this.Oo.RY(400, this.OB - 50);
        this.Oo.g2(400, this.OB - 50);
        I2 iterator = this.t30.ZD();
        while (iterator.hasNext()) {
            ((le0_2)iterator.next()).lt0();
        }
        this.B0.nk0(pa0_0.dC0, 10);
        pa0_0 style = pa0_0.qQ;
        this.Oo.nk0(style, 40);
        gi_1 gi_12 = this.Fm;
        if (gi_12 != null) {
            gi_12.nk0(style, 40);
        }
        style = pa0_0.Mk;
        this.Fr0.nk0(style, 50);
        int n2 = 180;
        xe_1 xe_12 = this.Ku;
        if (xe_12.eE) {
            xe_12.nk0(style, n2);
            n2 = 240;
        }
        xe_12 = this.Hw;
        if (xe_12.eE) {
            xe_12.nk0(style, n2);
            n2 += 60;
        }
        xe_12 = this.xu0;
        if (xe_12.eE) {
            xe_12.nk0(style, n2);
            n2 += 60;
        }
        xe_12 = this.bH;
        if (xe_12.eE) {
            xe_12.nk0(style, n2);
            n2 += 60;
        }
        xe_12 = this.Pu;
        if (xe_12.eE) {
            xe_12.nk0(style, n2);
            n2 += 60;
        }
        xe_12 = this.q9;
        if (xe_12.eE) {
            xe_12.nk0(style, n2);
            n2 += 60;
        }
        xe_12 = this.d30;
        if (xe_12.eE) {
            xe_12.nk0(style, n2);
            n2 += 60;
        }
        xe_12 = this.pu;
        if (xe_12.eE) {
            xe_12.nk0(style, n2);
            n2 += 60;
        }
        xe_12 = this.Zh0;
        if (xe_12.eE) {
            xe_12.nk0(style, n2);
            n2 += 60;
        }
        xe_12 = this.fM0;
        if (xe_12.eE) {
            xe_12.nk0(style, n2);
            n2 += 60;
        }
        xe_1 last = this.un;
        if (last.eE) {
            last.nk0(style, n2);
        }
    }

    public final void AF(K5 k5) {
        short s = k5.nn.PA0;
        if (s > 1) {
            uf0_0 existing = (uf0_0)jq0_0.tK0(Qy0.yI0, uf0_0.class);
            if (existing != null) {
                lpt6__0.v90(existing);
                return;
            }
            String title = sm0_0.wa0(1432, sm0_0.c0(k5.cL.Nl));
            wj_1 callback = new wj_1((f.HD0)(Object)this, k5);
            jc_2 owner = (jc_2)this.K20;
            uf0_0 popup = new uf0_0(title, s, callback, owner);
            Qy0 qy0 = Qy0.yI0;
            qy0.F9(qy0.fU(), popup);
        } else {
            ((jc_2)this.K20).NUL(k5, (short)1);
        }
    }

    public final void K30(K5 comparable) {
        K5 k5 = comparable;
        short s = 372;
        CH0 target = CH0.j1;
        CH0 cH0 = k5.nn.Br;
        short s2 = 0;
        byte by = -1;
        ((jc_2)this.K20).ew0();
        tw0_0.rl.sn0(s, target, cH0, s2, by);
    }

    public final void uj(K5 comparable, K5 comparable2) {
        if (comparable == null) {
            tw0_0.rl.qK(sm0_0.c0(8580));
            return;
        }
        hl0_0 hl0_02 = comparable.nn;
        short s = hl0_02.wQ;
        CH0 source = hl0_02.Br;
        CH0 target = comparable2.nn.Br;
        short s2 = 1;
        byte by = -1;
        ((jc_2)this.K20).ew0();
        tw0_0.rl.sn0(s, source, target, s2, by);
    }

    public final void QQ(K5 k5) {
        ((jc_2)this.K20).v6(k5, true);
    }

    public final void YI0(K5 k5) {
        IA iA = BU.T50.z6;
        if (iA != null) {
            iA.Ji(k5.nn.wQ, (short)0);
            Qy0.yI0.dk(-1, sm0_0.wa0(1416, k5.Ua()));
        }
        this.rL0(k5);
    }

    public final void BV(K5 comparable) {
        if (tw0_0.PK0 == null && !tw0_0.rl.nz()) {
            Qy0.yI0.dk(-1, sm0_0.wa0(5956, comparable.Fh0()));
            hl0_0 hl0_02 = comparable.nn;
            short s = hl0_02.wQ;
            CH0 source = hl0_02.Br;
            CH0 cH0 = CH0.j1;
            short s2 = 1;
            byte by = 1;
            ((jc_2)this.K20).ew0();
            tw0_0.rl.sn0(s, source, cH0, s2, by);
            return;
        }
        Qy0.yI0.dk(-1, sm0_0.c0(6002));
    }

    public final void E8(K5 k5) {
        this.MP.close();
        a10_0 world = bc_1.km(k5.cL.g0);
        if (world == null) {
            return;
        }
        pf0_2 battle = new pf0_2();
        world.Tk0.add(battle);
        tw0_0.PK0 = world;
    }

    public final void fH0(K5 k5) {
        ((jc_2)this.K20).IC0(k5);
    }

    public final void Z7(EK eK) {
        BU.T50.FI(eK.n2, this, qo_1.DL, false);
    }

    public final void Am0(K5 k5) {
        TradeOfferItemComponent hD0 = this;
        ((jc_2)hD0.K20).IC0(k5);
        ((jc_2)hD0.K20).close();
    }

    public final void Ya(K5 k5, EK eK) {
        ((jc_2)this.K20).cOm5(k5, eK);
    }
}
