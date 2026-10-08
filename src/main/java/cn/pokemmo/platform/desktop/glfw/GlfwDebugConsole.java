package cn.pokemmo.platform.desktop.glfw;

import f.*;


import com.badlogic.gdx.graphics.Texture;
import org.lwjgl.Version;

public class GlfwDebugConsole extends jn_0 {
    public static final dl_1 qn;
    public Z30 Vp;

    static {
        qn = Cq0.E1(GlfwDebugConsole.class);
    }

    public GlfwDebugConsole() {
        super();
        this.Vp = null;
    }

    public static void AUx(ga0_0 v0) {
        if (!v0.Rg0) {
            return;
        }
        Qy0 v1 = v0.d6;
        BR v2 = tw0_0.rl;
        if (v1 != null && v2 != null && v2.Qw && !v2.N3) {
            v2.N3 = true;
            while (tw0_0.FL.gi0()) {
                Fo0 sl = tw0_0.FL.sl;
                if (sl != null) {
                    tw0_0.FL.u3(sl);
                    tw0_0.FL.sl = null;
                }
                tw0_0.FL.iE.clear();
                tw0_0.FL.lpT1.clear();
                tw0_0.FL.em();
            }
            Qy0 d6 = v0.d6;
            fc0_0 dv0 = tw0_0.rl.Dv0;
            if (d6.Sk != null) {
                d6.Sk.xe0();
            }
            K6 k6 = new K6(d6, dv0);
            d6.Sk = k6;
            d6.F9(d6.fU(), k6);
            d6.Qw0(d6.Sk);
            return;
        }

        if (tw0_0.e60 == null || v1 == null || v1.zK0 == null) {
            return;
        }
        v0.sy.Ef();
        E90 jB0 = tw0_0.e60.jB0;
        BR rl = tw0_0.rl;
        if (rl == null || rl.nz() || rl.fw) {
            return;
        }
        vo_2 sc = v0.Sc;
        if (sc == null || !sc.fX || sc.VK()) {
            return;
        }
        if (Qy0.af(v0.d6) || v0.d6.ez0 != null) {
            return;
        }
        if (jB0 == null || !jB0.il0.BH0.isEmpty() || tw0_0.PK0 != null || tw0_0.FL.gi0()) {
            return;
        }
        BU bu = v0.d6.zK0;
        if (bu.iB0.Of() || bu.W10 != null || Ge0.Vv0 != 0 || bu.OB0 != null || bu.fE != null
                || bu.Mc0 != null || bu.vj0 != null || bu.q3 != null || bu.cz0.Of() || bu.BK.Na0.Of()) {
            return;
        }
        if (v0.AD0 != null && !v0.AD0.gL0()) {
            return;
        }
        _else map = tw0_0.e60.N60();
        boolean i2 = (tw0_0.Ht0.y0 || tw0_0.iE.dH0(rp_0.nK0)) && (map != null && map.Wp());
        if (jB0.iz0((byte) 4) && !jB0.iz0((byte) 17) && tw0_0.iE.dH0(rp_0.nK0)) {
            if (v0.Ts == 0L) {
                v0.Ts = System.currentTimeMillis();
            }
            if (System.currentTimeMillis() - v0.Ts > 1000L) {
                v0.fM0 = true;
            }
        } else {
            v0.Ts = 0L;
            v0.fM0 = false;
        }

        boolean i3 = tw0_0.iE.dH0(rp_0.kC0);
        boolean i4 = tw0_0.iE.dH0(rp_0.synchronized$);
        boolean i5 = tw0_0.iE.dH0(rp_0.I90);
        boolean i6 = tw0_0.iE.dH0(rp_0.Ni);

        if (!i3 && !i4 && !i5 && !i6) {
            if (v0.fM0) {
                tw0_0.rl.uh0((byte) -1, i2, v0.fM0);
            }
            if (System.currentTimeMillis() - tw0_0.FL.KH > 200L) {
                if (!v0.vm0 && tw0_0.iE.dH0(rp_0.sJ0) && jB0.il0.D() && tw0_0.rl.NF0.TY.ty0()) {
                    v0.vm0 = true;
                    BR br = tw0_0.rl;
                    if (br.xm != null) {
                        if (br.xm.g00()) {
                            return;
                        }
                        br.xm = null;
                    }
                    yt_1 cj0 = br.cJ0;
                    if (cj0.jB0 == null) {
                        return;
                    }
                    zv_2 ba0 = cj0.jB0.ba0;
                    byte uS = ba0.uS;
                    byte o0 = ba0.o0;
                    byte ID0 = ba0.ID0;
                    _else elseMap = (_else) cj0.E6.get(J4.iA0(uS, o0, ID0));
                    if (elseMap == null) {
                        return;
                    }
                    LT curTile = ba0.LPt1();
                    if (curTile == null) {
                        return;
                    }
                    LT frontTile = elseMap.gv(curTile, ba0.Y30, 1);
                    boolean i6_flag = false;
                    while (true) {
                        if (!i6_flag) {
                            if (frontTile != null) {
                                nt_1 u40 = frontTile.u40();
                                u40.getClass();
                                if (u40 instanceof WK) {
                                    // fall through to DK
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        if (i6_flag && frontTile != null) {
                            nt_1 u40 = frontTile.u40();
                            u40.getClass();
                            if (u40 instanceof WK) {
                                frontTile = elseMap.gv(frontTile, jB0.ba0.Y30, 1);
                            }
                        }
                        i6_flag = true;
                        if (frontTile == null || frontTile.u40().switch$()) {
                            continue;
                        }
                        for (Object o : br.cJ0.pn0.values()) {
                            bi0_1 entity = (bi0_1) o;
                            if (entity == null || !entity.a1(frontTile.Es(), frontTile)) {
                                continue;
                            }
                            byte dw = elseMap.dw;
                            if (dw != 0 && dw != 1) {
                                byte jt = entity.ba0.JT;
                                if (frontTile.Es() != jt) {
                                    if (jt >= 0 || frontTile.Es() == 0) {
                                        continue;
                                    }
                                }
                                if (Math.abs(curTile.S80() - frontTile.S80()) > 1.27f) {
                                    continue;
                                }
                            } else {
                                byte jt = entity.ba0.JT;
                                byte selfJt = jB0.ba0.JT;
                                if (jt >= 0 && selfJt >= 0 && (selfJt / 3 != jt / 3)) {
                                    if (selfJt != 0 || jt != 2) {
                                        if (curTile.Es() != -1) {
                                            continue;
                                        }
                                    }
                                }
                            }
                            if (entity instanceof MO) {
                                MO mo = (MO) entity;
                                if (!mo.DT) {
                                    continue;
                                }
                                if (mo.d40 < System.currentTimeMillis() + 500L) {
                                    mo.d40 = System.currentTimeMillis() + 500L;
                                }
                                entity.PC0(RL0.S60);
                                mo.py = System.currentTimeMillis() + 500L;
                                br.fk0.uQ(new cb_1(entity.pu));
                                return;
                            }
                        }
                        break;
                    }
                    if (jB0.rd.vx0() && jB0.rd.ba0.LPt1() == frontTile && jB0.rd.Ix0.ty0()) {
                        short mi0 = jB0.mI0();
                        if (mi0 > 0) {
                            di0_0.Hv0(mi0, (byte) (jB0.QL() & 31), 1.0f, 0.0f, false);
                        }
                        if (jB0.rd.ba0.Y30 != tx_1.Qf0(jB0.ba0.Y30)) {
                            jB0.rd.il0.qc0(tx_1.Qf0(jB0.ba0.Y30));
                        }
                    }
                    br.fk0.uQ(new lpt1__0());
                    return;
                } else if (!tw0_0.iE.dH0(rp_0.sJ0)) {
                    v0.vm0 = false;
                }
            }
            if (!v0.vb0 && !v0.Kj0 && !v0.Sf0 && !v0.VE0) {
                return;
            }
            v0.ra.DK0 = new byte[10];
            v0.ra.j5 = 0;
            v0.vb0 = false;
            v0.Kj0 = false;
            v0.Sf0 = false;
            v0.VE0 = false;
            return;
        }

        if (i3 && !v0.vb0) {
            v0.ra.nf0((byte) 1);
            v0.vb0 = true;
        } else if (!i3 && v0.vb0) {
            v0.ra.cON((byte) 1);
            v0.vb0 = false;
        }

        if (i4 && !v0.Kj0) {
            v0.ra.nf0((byte) 0);
            v0.Kj0 = true;
        } else if (!i4 && v0.Kj0) {
            v0.ra.cON((byte) 0);
            v0.Kj0 = false;
        }

        if (i5 && !v0.Sf0) {
            v0.ra.nf0((byte) 2);
            v0.Sf0 = true;
        } else if (!i5 && v0.Sf0) {
            v0.ra.cON((byte) 2);
            v0.Sf0 = false;
        }

        if (i6 && !v0.VE0) {
            v0.ra.nf0((byte) 3);
            v0.VE0 = true;
        } else if (!i6 && v0.VE0) {
            v0.ra.cON((byte) 3);
            v0.VE0 = false;
        }

        boolean i1;
        if (tw0_0.Eu(1)) {
            i1 = tw0_0.iE.KK0(59) && tw0_0.iE.KK0(129) && v0.Sq0.fy();
        } else {
            i1 = false;
        }

        if (!v0.fM0) {
            v0.Ts = 0L;
        }

        fa_0 ra = v0.ra;
        int i4_len = ra.j5;
        int i5_idx = i4_len - 1;
        if (i5_idx >= i4_len) {
            throw new ArrayIndexOutOfBoundsException(i5_idx);
        }
        byte b = ra.DK0[i5_idx];
        switch (b) {
            case 0:
                if (i1) {
                    tw0_0.rl.Cp(zo_0.Pk, "//moveclose 0 1", "", true);
                } else {
                    tw0_0.rl.uh0((byte) 0, i2, v0.fM0);
                }
                break;
            case 1:
                if (i1) {
                    tw0_0.rl.Cp(zo_0.Pk, "//moveclose 0 -1", "", true);
                } else {
                    tw0_0.rl.uh0((byte) 1, i2, v0.fM0);
                }
                break;
            case 2:
                if (i1) {
                    tw0_0.rl.Cp(zo_0.Pk, "//moveclose -1 0", "", true);
                } else {
                    tw0_0.rl.uh0((byte) 2, i2, v0.fM0);
                }
                break;
            case 3:
                if (i1) {
                    tw0_0.rl.Cp(zo_0.Pk, "//moveclose 1 0", "", true);
                } else {
                    tw0_0.rl.uh0((byte) 3, i2, v0.fM0);
                }
                break;
        }
    }

    public static zk0_1 Ke0(ga0_0 v0) {
        return v0.u10;
    }

    @Override
    public final void YK0() {
        if (J60.V10) {
            Yc yc = new Yc(lg_0.OH0);
            lg_0.OH0 = yc;
            lg_0.Sf0 = yc;
            lg_0.S4.Z7 = yc;
        }
        super.YK0();
        Bw0.bL0("lwjgl_version", Version.getVersion(), "LWJGL version", false);
        Texture tex = fn_0.qz0().o9;
        if (tex == null) {
            this.Vp = null;
        } else {
            this.Vp = new Z30(tw0_0.LD0.wx0, tex, tex.getWidth(), tex.getHeight(), tex.getWidth(), tex.getHeight(), gn_0.WHITE);
        }
    }

    @Override
    public final void wy0() {
        Yo0 iE = tw0_0.iE;
        iE.getClass();
        if (qt_1.zm0 == qt_1.qV) {
            iE.GD = true;
        }
        this.Rg0 = false;
        if (dw_2.Sj && tw0_0.RE0 != null && tw0_0.RE0.e00 != null) {
            tw0_0.RE0.e00.aw(0.0f);
            tw0_0.RE0.Xs0();
        }
        if (dw_2.Va) {
            dw_2.CY();
        }
        if (lpt2__0.s5) {
            lpt2__0.QE();
        }
    }
}
