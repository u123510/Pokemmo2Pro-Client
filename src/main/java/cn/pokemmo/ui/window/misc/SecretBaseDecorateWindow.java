package cn.pokemmo.ui.window.misc;

import f.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 秘密基地家具装饰布置窗口
 *
 * 原混淆类: f.pe0_2
 */
public class SecretBaseDecorateWindow extends R90 implements tr_1  {
    public final pe0_2 asBridge() {
        return (pe0_2) (Object) this;
    }

    public final ur_0 El;
    public final lo0_0 HM;
    public final fy_2 EW;
    public int Ub;
    public int hB0;
    public MV PY;
    public int zh0;
    public final ArrayList nF0;
    public final ArrayList ED;

    public SecretBaseDecorateWindow(ur_0 v1) {
        super();
        this.Ub = 0;
        this.hB0 = 0;
        this.PY = null;
        this.zh0 = -1;
        this.nF0 = new ArrayList();
        this.ED = new ArrayList();
        this.El = v1;
        uf("base-frame-padded");
        fy_2 fy = new fy_2();
        this.EW = fy;
        fy.WQ(fy.lo0());
        fy.x40(fy.H10());
        this.HM = new lo0_0(fy);
        SL(this.HM);
        rr0();
    }

    public final void rr0() {
        String str = "";
        this.hB0 = 0;
        this.nF0.clear();
        this.ED.clear();
        this.EW.L4.Ja0();
        this.EW.pJ0.Ja0();
        int ub = this.Ub;
        if (ub == 0) {
            String s0 = _case.P0.tG((byte) 1, (byte) 5, 0);
            gy(1, s0);
            String s1 = _case.P0.tG((byte) 1, (byte) 5, 1);
            gy(2, s1);
            String s2 = _case.P0.tG((byte) 1, (byte) 5, 2);
            eS(s2, new Cc());
            Ge0.Vv0 = 0;
            com6__1.WI0.cI0((short) 0, (short) 0);
        } else if (ub == 1) {
            str = _case.P0.tG((byte) 1, (byte) 5, 0);
            xe_1 btn1 = gy(100, sm0_0.c0(270250));
            btn1.yj0 = sm0_0.c0(270255);
            btn1.yB0();

            xe_1 btn2 = eS(sm0_0.c0(270251), new gv_1(asBridge()));
            btn2.yj0 = sm0_0.c0(270256);
            btn2.yB0();

            xe_1 btn3 = gy(102, sm0_0.c0(270252));
            btn3.yj0 = sm0_0.c0(270257);
            btn3.yB0();

            xe_1 btn4 = gy(0, sm0_0.c0(270253));
            btn4.yj0 = sm0_0.c0(270258).replace("|br|", "\n");
            btn4.yB0();
        } else if (ub == 2) {
            Q8(g6_0.dG(271017642, g6_0.LS));
            eS(sm0_0.c0(nf0_0.uT).toUpperCase(), new hr_0());
            this.hB0 = 1;
            xe_1 btn = gy(0, sm0_0.c0(nf0_0.Yt).toUpperCase());
            btn.yj0 = sm0_0.c0(270258).replace("|br|", "\n");
            btn.yB0();
        } else if (ub == 3) {
            Q8(sm0_0.vs(270309, new byte[]{2}, new String[]{this.PY.wp0.FL0()}));
            eS(sm0_0.c0(nf0_0.uT).toUpperCase(), new T50(asBridge()));
            this.hB0 = 1;
            xe_1 btn = gy(this.zh0, sm0_0.c0(nf0_0.Yt).toUpperCase());
            btn.yj0 = sm0_0.c0(270258).replace("|br|", "\n");
            btn.yB0();
        } else if (ub == 100 || ub == 102) {
            if (ub == 100) {
                str = sm0_0.c0(270250);
            } else {
                str = sm0_0.c0(270252);
            }
            ib_0 ib = tw0_0.rl.coM2(gl_2.SR);
            Q8(sm0_0.Bx(6754, new String[]{"" + ib.oS.size(), "80"}));
            for (int i = 0; i < 8; i++) {
                gy(this.Ub * 10 + i, sm0_0.c0(270200 + i));
            }
            xe_1 btn = gy(1, sm0_0.c0(270253));
            btn.yj0 = sm0_0.c0(270258).replace("|br|", "\n");
            btn.yB0();
        } else if ((ub >= 1000 && ub <= 1010) || (ub >= 1020 && ub <= 1030)) {
            int i1 = ub - 1000;
            int i3 = 100;
            if (ub >= 1020 && ub <= 1030) {
                i1 = ub - 1020;
                i3 = 102;
            }
            ib_0 ib = tw0_0.rl.coM2(gl_2.SR);
            String title = sm0_0.c0(270200 + i1);
            w7_0 w7 = new w7_0();
            for (ur_0 ur : ur_0.sC0) {
                mw_1 mw = tw0_0.rl.ja[ur.yI];
                if (mw != null) {
                    for (C4 c4 : mw.ax()) {
                        AtomicInteger count = (AtomicInteger) w7.f5(c4.gz);
                        if (count == null) {
                            count = new AtomicInteger(0);
                            w7.coM4(c4.gz, count);
                        }
                        count.incrementAndGet();
                    }
                }
            }
            MV[] mvs;
            synchronized (ib.oS) {
                mvs = (MV[]) ib.oS.values().toArray(new MV[ib.oS.size()]);
            }
            Arrays.sort(mvs, new j40_0());
            for (MV mv : mvs) {
                int isPlaced = 0;
                AtomicInteger ai = (AtomicInteger) w7.f5(mv.KZ.coM3);
                if (ai != null) {
                    isPlaced = 1;
                    if (ai.decrementAndGet() < 1) {
                        w7.sX(mv.KZ.coM3);
                    }
                }
                if (mv.wp0.cC == i1) {
                    String placedSuffix = (isPlaced != 0) ? " - PLACED" : "";
                    String name = mv.wp0.FL0() + placedSuffix;
                    xe_1 btn = eS(name, new TG(asBridge(), i3, isPlaced != 0, mv));
                    String desc;
                    if (!mv.wp0.oF0) {
                        desc = sm0_0.c0(1451);
                    } else {
                        desc = sm0_0.c0(295000 + mv.wp0.su);
                    }
                    btn.yj0 = desc.replace("|br|", "\n");
                    btn.yB0();
                }
            }
            if (this.nF0.isEmpty()) {
                Q8(sm0_0.c0(270312));
            }
            xe_1 btn = gy(i3, sm0_0.c0(270253));
            btn.yj0 = sm0_0.c0(270258).replace("|br|", "\n");
            btn.yB0();
            str = title;
        }

        Hy(str);
        this.EW.lt0();
        lt0();
        K8();
        if (this.hB0 >= this.nF0.size()) {
            this.hB0 = this.nF0.size() - 1;
        }
        if (this.hB0 < 0) {
            this.hB0 = 0;
        }
        xe_1 sel = this.hB0 < this.nF0.size() ? (xe_1) this.nF0.get(this.hB0) : null;
        if (sel != null) {
            lpt6__0.v90(sel);
            if (this.HM != null) {
                this.HM.Rn(sel);
            }
        }
    }

    @Override
    public final void K8() {
        this.EW.RY(186, 10);
        this.EW.lt0();
        this.EW.vu0 = new L50(0, 0);
        this.EW.rc();
        int h = this.nF0.size() * 30 + 30;
        for (Object obj : this.ED) {
            cn_0 cn = (cn_0) obj;
            h += cn.OB;
        }
        if (h > 250) {
            h = 250;
        }
        this.HM.RY(210, h);
        this.HM.lt0();
        this.HM.vi(7, 7, 7, 7);
        RY(200, 1);
        lt0();
        super.K8();
    }

    public final xe_1 gy(int i1, String v2) {
        xe_1 btn = new xe_1(v2);
        btn.RR(new NE(asBridge(), i1));
        this.EW.pJ0.Kn0(btn);
        this.EW.L4.Kn0(btn);
        this.nF0.add(btn);
        return btn;
    }

    public final xe_1 eS(String v1, Runnable v2) {
        xe_1 btn = new xe_1(v1);
        btn.RR(v2);
        this.EW.pJ0.Kn0(btn);
        this.EW.L4.Kn0(btn);
        this.nF0.add(btn);
        return btn;
    }

    public final void Q8(String v1) {
        ba0_1 ba = new ba0_1(v1);
        ba.vv0 = 180;
        ba.qF0(pa0_0.Ol);
        this.EW.pJ0.X20(new I7(this.EW).Ze0().Kn0(ba).Ze0());
        this.EW.L4.X20(this.EW.hb(new le0_2[]{ba}));
        this.ED.add(ba);
    }

    @Override
    public final void C(zk0_1 v1) {
        if (this.hB0 >= this.nF0.size()) {
            this.hB0 = this.nF0.size() - 1;
        }
        if (this.hB0 < 0) {
            this.hB0 = 0;
        }
        xe_1 sel = this.hB0 < this.nF0.size() ? (xe_1) this.nF0.get(this.hB0) : null;
        if (sel != null) {
            lpt6__0.v90(sel);
            if (this.HM != null) {
                this.HM.Rn(sel);
            }
        }
    }

    @Override
    public final boolean nd0(i70_0 v1) {
        if (E00.ZU(v1.zu) && v1.iT()) {
            int keyCode = v1.finally$;
            if (rp_0.kC0 != null && rp_0.kC0.Ov(keyCode)) {
                this.hB0--;
                if (this.hB0 >= this.nF0.size()) {
                    this.hB0 = this.nF0.size() - 1;
                }
                if (this.hB0 < 0) {
                    this.hB0 = 0;
                }
                xe_1 btn = this.hB0 < this.nF0.size() ? (xe_1) this.nF0.get(this.hB0) : null;
                if (btn != null) {
                    lpt6__0.v90(btn);
                    if (this.HM != null) {
                        this.HM.Rn(btn);
                    }
                }
                return true;
            }
            if (rp_0.synchronized$ != null && rp_0.synchronized$.Ov(keyCode)) {
                this.hB0++;
                if (this.hB0 >= this.nF0.size()) {
                    this.hB0 = this.nF0.size() - 1;
                }
                if (this.hB0 < 0) {
                    this.hB0 = 0;
                }
                xe_1 btn = this.hB0 < this.nF0.size() ? (xe_1) this.nF0.get(this.hB0) : null;
                if (btn != null) {
                    lpt6__0.v90(btn);
                    if (this.HM != null) {
                        this.HM.Rn(btn);
                    }
                }
                return true;
            }
            if (rp_0.sJ0 != null && rp_0.sJ0.Ov(keyCode)) {
                if (this.hB0 >= this.nF0.size()) {
                    this.hB0 = this.nF0.size() - 1;
                }
                if (this.hB0 < 0) {
                    this.hB0 = 0;
                }
                xe_1 btn = this.hB0 < this.nF0.size() ? (xe_1) this.nF0.get(this.hB0) : null;
                if (btn != null && btn.ER != null) {
                    a7_0.bH(btn.ER.Fc0);
                }
                return true;
            }
            if (rp_0.nK0 != null && rp_0.nK0.Ov(keyCode)) {
                try {
                    xe_1 btn = (xe_1) this.nF0.get(this.nF0.size() - 1);
                    a7_0.bH(btn.ER.Fc0);
                } catch (Exception ignored) {
                }
                return true;
            }
        }
        return super.nd0(v1);
    }
}
