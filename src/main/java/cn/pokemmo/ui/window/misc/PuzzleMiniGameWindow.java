package cn.pokemmo.ui.window.misc;

import f.*;

import com.badlogic.gdx.graphics.Texture;

/**
 * 遗迹石板拼图小游戏窗口
 *
 * 原混淆类: f.sr_0
 */
public class PuzzleMiniGameWindow extends cx_0 implements tr_1  {
    public final sr_0 asBridge() {
        return (sr_0) (Object) this;
    }

    public final byte xC;
    public final int tS;
    public int ik;
    public int xg0;
    public final Texture l;
    public final Texture ZM;
    public final S70 Ks;
    public final S70 aw;
    public int oJ0;
    public int Hs;
    public final qj_2 SU;
    public rc0_0 Rm0;
    public final rc0_0[] X2;
    public float bx0;
    public final gn_0 Fj0;
    public float eW;
    public rc0_0 jt0;

    public PuzzleMiniGameWindow(byte b, short s) {
        super(tw0_0.kz0());
        this.xg0 = 0;
        this.Rm0 = null;
        this.X2 = new rc0_0[16];
        this.bx0 = 0.0f;
        this.Fj0 = new gn_0(0);
        this.eW = 0.0f;
        uf("base-frame-padded");
        Hy("");
        ff0(1);
        bD(false);
        Pb0(this::Og);
        this.xC = b;
        this.tS = s;

        FJ fj = new FJ(tw0_0.Ll0.t1.nuL().COM7("/a/1/7/2"));
        Tt0 tt0_1 = new Tt0(fj.EG(10));
        Gt0 gt0_1 = new Gt0(fj.EG(11));
        i4_0 i4_0_1 = new IA0(fj.EG(12)).dB(tt0_1, gt0_1);
        Texture tex1 = new Texture(i4_0_1);
        this.l = tex1;

        S70 s70_1 = new S70();
        this.Ks = s70_1;
        s70_1.fn0();
        s70_1.JH().LX(new Texture[]{tex1});
        SL(s70_1);
        i4_0_1.dispose();

        i4_0 i4_0_2 = new IA0(fj.EG(13)).dB(tt0_1, gt0_1);
        Texture tex2 = new Texture(i4_0_2);
        this.ZM = tex2;

        S70 s70_2 = new S70();
        this.aw = s70_2;
        s70_2.fn0();
        s70_2.JH().r8(new LPT6_[]{
                new LPT6_(tex2, 32, 32),
                new LPT6_(tex2, 32, 0, 32, 32)
        });
        i4_0_2.dispose();

        Tt0 tt0_2 = new Tt0(fj.EG(0));
        Gt0 gt0_2 = new Gt0(fj.EG(s + 4));
        Rk0 rk0 = new Rk0(fj.EG(8));
        Tt0 tt0_3 = new Tt0(fj.EG(0));
        tt0_3.IK()[2][12] = new LPT4_(255, 255, 255, 255);

        for (int i = 0; i < 16; i++) {
            i4_0 v6 = rk0.Nz0(gt0_2, tt0_2, i);
            i4_0 v7 = rk0.Nz0(gt0_2, tt0_3, i);
            rc0_0 rc = new rc0_0(asBridge(), i, v6, v7);
            this.X2[i] = rc;
            v6.dispose();
            v7.dispose();
        }

        SL(this.aw);
        qj_2 qj = new qj_2();
        this.SU = qj;
        if (!tw0_0.kz0()) {
            qj.Ll(false);
        }
        qj.RR(this::zU);
        qj.sl().r8(new LPT6_[]{fn_0.qz0().ll0()});
        SL(qj);
        sE0();
    }

    public static boolean Iu0(int i0, int i1) {
        if (i0 < 1 || i0 > 6) {
            return false;
        }
        if (i0 == 1 && i1 == 0) {
            return false;
        }
        if (i0 == 6 && i1 == 0) {
            return false;
        }
        if (i0 == 1 && i1 == 5) {
            return false;
        }
        if (i0 == 6 && i1 == 5) {
            return false;
        }
        return true;
    }

    public final void Og() {
        BU.T50.u3(this);
        tw0_0.rl.ze0(this.xC, (byte) 0);
    }

    @Override
    public final void C(zk0_1 zk) {
        super.C(zk);
        lpt6__0.v90(this);
        sE0();
        le0_2 k20 = this.K20;
        int x = kq_0.lpT2(k20.a3(), this.Mx, 2, k20.A20 + k20.e80);
        le0_2 k20_2 = this.K20;
        int y = kq_0.lpT2(k20_2.k5(), this.OB, 4, k20_2.SB0 + k20_2.y9);
        E40(x, y);
    }

    @Override
    public final boolean nd0(i70_0 v1) {
        if (v1.Li()) {
            if (v1.zu == 3) {
                ly(v1.f8, v1.AN);
            }
            if (v1.VP) {
                if (this.jt0 == null) {
                    rc0_0 r = rO(null);
                    this.jt0 = r;
                    if (r != null && !r.nk0) {
                        r.T1.iy0 = false;
                        r.interface$.iy0 = false;
                    } else {
                        this.jt0 = null;
                    }
                } else {
                    ly(v1.f8, v1.AN);
                }
            }
            if (v1.LI0()) {
                if (this.jt0 != null) {
                    if (rO(this.jt0) == null && Iu0(this.oJ0, this.Hs)) {
                        this.jt0.zR = this.oJ0;
                        this.jt0.pq = this.Hs;
                        this.jt0.update();
                    } else {
                        this.oJ0 = this.jt0.zR;
                        this.Hs = this.jt0.pq;
                    }
                    this.jt0.T1.iy0 = true;
                    this.jt0.interface$.iy0 = true;
                    this.jt0 = null;
                }
            }
            return true;
        }
        if (E00.ZU(v1.zu) && v1.iT() && this.xg0 == 0) {
            int keyCode = v1.finally$;
            if (rp_0.nK0 != null && rp_0.nK0.Ov(keyCode)) {
                if (this.Rm0 == null) {
                    Qy0.yI0.sr0(new lpt3__4("Do you want to close the puzzle?", this::Og, asBridge()));
                } else {
                    if (rO(null) == null && Iu0(this.oJ0, this.Hs)) {
                        this.Rm0.zR = this.oJ0;
                        this.Rm0.pq = this.Hs;
                    }
                    this.Rm0 = null;
                }
                return true;
            }
            if ((rp_0.cB != null && rp_0.cB.Ov(keyCode)) || (rp_0.Aq0 != null && rp_0.Aq0.Ov(keyCode))) {
                rc0_0 r = this.Rm0;
                if (r == null) {
                    r = rO(null);
                    if (r == null) {
                        return true;
                    }
                }
                boolean b = rp_0.Aq0 != null && rp_0.Aq0.Ov(keyCode);
                rc0_0.yl(r, b);
            }
            if (rp_0.sJ0 != null && rp_0.sJ0.Ov(keyCode)) {
                rc0_0 r = this.Rm0;
                if (r == null) {
                    r = rO(null);
                    if (r != null && !r.nk0) {
                        this.Rm0 = r;
                        int i2 = Dp(r.T1);
                        if (i2 >= 0 && i2 < fU() - 1) {
                            ND0(i2, fU() - 1);
                        }
                        int i1 = Dp(r.interface$);
                        if (i1 >= 0 && i1 < fU() - 1) {
                            ND0(i1, fU() - 1);
                        }
                        int i3 = Dp(this.aw);
                        if (i3 >= 0 && i3 < fU() - 1) {
                            ND0(i3, fU() - 1);
                        }
                    }
                } else {
                    rc0_0.yl(r, true);
                }
                return true;
            }
            if (rp_0.kC0 != null && rp_0.kC0.Ov(keyCode)) {
                if (this.Hs > 0) {
                    this.Hs--;
                }
                return true;
            }
            if (rp_0.synchronized$ != null && rp_0.synchronized$.Ov(keyCode)) {
                if (this.Hs < 5) {
                    this.Hs++;
                }
                return true;
            }
            if (rp_0.I90 != null && rp_0.I90.Ov(keyCode)) {
                if (this.oJ0 > 0) {
                    this.oJ0--;
                }
                return true;
            }
            if (rp_0.Ni != null && rp_0.Ni.Ov(keyCode)) {
                if (this.oJ0 < 7) {
                    this.oJ0++;
                }
                return true;
            }
        }
        return true;
    }

    @Override
    public final void Kp0(zk0_1 v1, int i2, int i3, int i4) {
        rc0_0 r = this.jt0;
        if (r != null) {
            r.T1.og.mt0(i2, i3);
            this.jt0.interface$.og.mt0(i2, i3);
        }
    }

    @Override
    public final void HP(zk0_1 v1) {
        super.HP(v1);
        if (!Of()) {
            lpt6__0.v90(this);
        }
        boolean allSolved = true;
        for (rc0_0 rc : this.X2) {
            rc.update();
            if (rc.zR != rc.Tw0 || rc.pq != rc.cK || rc.CoM2 != 0.0f) {
                allSolved = false;
            }
        }
        switch (this.xg0) {
            case 0:
                if (allSolved) {
                    this.xg0 = 1;
                    u3(this.aw);
                }
                break;
            case 1:
                this.bx0 += lg_0.S4.uL;
                if (this.bx0 > 1.0f) {
                    this.bx0 = 1.0f;
                    this.xg0 = 2;
                }
                this.Fj0.cv = (byte) -1;
                this.Fj0.x8 = (byte) -1;
                this.Fj0.sh = (byte) -1;
                this.Fj0.FY = (byte) ((int) (this.bx0 * 255.0f));
                break;
            case 2:
                this.bx0 -= lg_0.S4.uL;
                if (this.bx0 < 0.0f) {
                    this.bx0 = 0.0f;
                    this.xg0 = 3;
                }
                this.Fj0.cv = (byte) -1;
                this.Fj0.x8 = (byte) -1;
                this.Fj0.sh = (byte) -1;
                this.Fj0.FY = (byte) ((int) (this.bx0 * 255.0f));
                break;
            case 3:
                this.eW += lg_0.S4.uL;
                if ((double) this.eW > 0.25) {
                    this.xg0 = 4;
                }
                break;
            case 4:
                lg_0.k.lPT5(this::Bq);
                break;
        }
        int ag0 = Ag0();
        int x = si0_0.Fz(this.oJ0 * 32, this.ik, this.A20 + this.e80, ag0);
        int y = (this.SB0 + this.y9) + this.Hs * 32 * this.ik;
        this.aw.E40(x, y);
        this.aw.og.EJ0 = (float) this.ik;
        this.Ks.E40(this.A20 + this.e80 + ag0, this.SB0 + this.y9);
        this.Ks.og.EJ0 = (float) this.ik;
        int suX = this.ik * 256 + (this.A20 + this.e80) + 10 + ag0;
        int suY = this.SB0 + this.y9 + 10;
        this.SU.E40(suX, suY);
        this.SU.g2(this.ik * 32, this.ik * 32);
        this.SU.oY(this.ik * 32, this.ik * 32);
        this.SU.tp0.sj = 1;
        this.SU.tp0.EJ0 = (float) ((double) this.ik * 0.75);
    }

    public final void sE0() {
        int w = tw0_0.LD0.ew0();
        int h = tw0_0.LD0.Hv0();
        if (!tw0_0.kz0()) {
            w = (int) ((double) w * 0.75);
            h = (int) ((double) h * 0.75);
        }
        this.ik = Math.min(w / 256, h / 192);
        if (this.ik < 1) {
            this.ik = 1;
        }
        if (!tw0_0.kz0()) {
            RY(this.ik * 256 + 3, this.ik * 192 + 2);
            oY(this.ik * 256 + 3, this.ik * 192 + 2);
        }
    }

    @Override
    public final void K8() {
        sE0();
        if (tw0_0.kz0() && this.Em0 != null) {
            kh0();
        }
        super.K8();
    }

    @Override
    public final void t5() {
        super.t5();
        this.l.dispose();
        this.ZM.dispose();
        for (rc0_0 rc : this.X2) {
            rc.BV.dispose();
            rc.ct.dispose();
        }
    }

    public final int Ag0() {
        if (tw0_0.kz0()) {
            return tw0_0.LD0.ew0() / 2 - this.Ks.og.De0() / 2;
        }
        return 0;
    }

    public final void ly(int i1, int i2) {
        if (i1 - (this.A20 + this.e80) - Ag0() < 0) {
            return;
        }
        if (i2 - (this.SB0 + this.y9) < 0) {
            return;
        }
        int i3 = (i1 - (this.A20 + this.e80) - Ag0()) / this.ik / 32;
        int v2 = (i2 - (this.SB0 + this.y9)) / this.ik / 32;
        if (i3 <= 7 && v2 <= 5) {
            this.oJ0 = i3;
            this.Hs = v2;
        }
    }

    public final rc0_0 rO(rc0_0 v1) {
        for (rc0_0 rc : this.X2) {
            if (rc != v1 && rc.zR == this.oJ0 && rc.pq == this.Hs) {
                return rc;
            }
        }
        return null;
    }

    public final void Bq() {
        BU.T50.u3(this);
        tw0_0.rl.ze0(this.xC, (byte) 2);
    }

    public final /* synthetic */ void zU() {
        rc0_0 r = this.Rm0;
        if (r == null) {
            r = rO(null);
        }
        if (r != null && !r.nk0) {
            rc0_0.yl(r, true);
        }
    }
}
