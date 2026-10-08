package cn.pokemmo.graphics.gdx.particle;

import f.*;


import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Matrix4;
import java.util.Arrays;

public class GdxParticleControllerComponent extends mg_0 {
    public final bi0_1 sU;
    public com3__3 Mz;
    public final com3__3[][] Ka0;
    public boolean H10;
    public long Z30;

    public GdxParticleControllerComponent(bi0_1 v1) {
        super(v1);
        this.Ka0 = new com3__3[9][q10_0.Pn0.length + 1];
        this.H10 = false;
        this.Z30 = 0L;
        this.sU = v1;
    }

    @Override
    public final boolean N30(hl0_1 v1, int i2, boolean i3) {
        boolean z = wJ0();
        if (!z) {
            wH0(255, v1);
        }
        int x = (int) this.VH.x;
        int y = (int) this.VH.y;
        _native pv = tw0_0.pv;
        bi0_1 su = this.sU;
        byte dir = (byte) i2;
        pv.getClass();
        float posX = (float) x - 13.5f;
        float posY = (float) y - 18.0f;
        q10_0 qh0 = q10_0.Qh0;
        short s_qh0 = su.Gi().Nul(qh0);
        if (su.oI0() && !su.LH0() && !su.Ze()) {
            if (s_qh0 == 28 || s_qh0 == 30 || s_qh0 == 52) {
                posY -= 8.0f;
                X90 x90 = (X90) qh0.Fk.f5(s_qh0);
                if (x90 != null && s_qh0 != 52) {
                    float c4 = pv.C4;
                    k2 k2_item = x90.yh0[0];
                    p_0 nv = (k2_item != null) ? k2_item.nv : null;
                    int b_val = 0;
                    if (nv != null) {
                        b_val = ((Byte) nv.Jy(c4, true)).byteValue();
                    }
                    if (b_val == 1 || b_val == 2 || b_val == 4) {
                        posY -= 1.0f;
                    }
                }
            }
        }
        nk_0 mv = su.il0.mV;
        if (mv != nk_0.J9 && mv != nk_0.Qi0) {
            if (su.LH0() || su.Ze()) {
                dir = (byte) (dir + 27);
            } else if (su.oI0()) {
                dir = (byte) (dir + 18);
            }
        } else {
            byte y30 = su.ba0.Y30;
            if (y30 == 3) {
                posX += 2.0f;
            } else if (y30 == 2) {
                posX -= 2.0f;
            }
            if (!su.LH0() && su.oI0()) {
                posX += 8.0f;
            }
        }
        q10_0 ci = q10_0.Ci;
        short s_ci = su.Gi().Nul(ci);
        short s_qh0_2 = su.Gi().Nul(qh0);
        boolean b_ci = (su.ba0.Y30 == 1 && ci.Wo(s_ci));
        boolean b_qh0 = (su.ba0.Y30 == 1 && qh0.Wo(s_qh0_2)) || (s_qh0_2 == 28 || s_qh0_2 == 30);
        short tn0 = 0;
        if (su.oI0() && !su.LH0() && !su.Ze()) {
            tn0 = _native.Tn0;
        }
        Ot0 sf0 = Ot0.SF0;
        float[][] yk0 = sf0.yk0(tn0);
        int i17 = 0;
        int i18 = 0;
        int i8 = dir;
        if (su.oI0() && !su.LH0() && !su.Ze()) {
            if (Ss0.C90(s_qh0_2) || tn0 > 0) {
                int i19;
                switch (dir) {
                    case 18:
                    case 21:
                    case 22:
                        i17 = 0;
                        i19 = 2;
                        i18 = 18;
                        int tmp = i18;
                        i18 = i17;
                        i17 = tmp;
                        break;
                    case 19:
                    case 23:
                    case 24:
                        i17 = 1;
                        i19 = 0;
                        i18 = 19;
                        int tmp2 = i18;
                        i18 = i17;
                        i17 = tmp2;
                        break;
                    default:
                        i17 = 20;
                        if (i3) {
                            i18 = 3;
                            i19 = 6;
                        } else {
                            i18 = 2;
                            i19 = 4;
                        }
                        break;
                }
                if (s_qh0_2 == 17 || s_qh0_2 == 40) {
                    dir = (byte) i17;
                }
                if (Ss0.lPt2(s_qh0_2) && !z) {
                    pv.MB0(v1, su, qh0, s_qh0_2, dir, posX, posY, i3, false);
                }
                int idx8 = (int) ((hk0_1.KG % 444L) / 222) + i19;
                Wr wr = sf0.Lq(idx8, 0, tn0);
                if (wr != null) {
                    Texture tex = wr.H8();
                    float offX = yk0[i18][0] + posX;
                    float offY = yk0[i18][1] + posY;
                    v1.vv0(tex, offX, offY, 24.0f, 24.0f);
                }
                int oldDir = dir;
                dir = (byte) i17;
                i17 = i18;
                i18 = idx8;
                i8 = oldDir;
            } else if (s_qh0_2 == 52) {
                long j19 = hk0_1.KG - su.il0.YT;
                if (hk0_1.KG - su.il0.gd < 400L) {
                    int frame = (int) (((j19 - 200L) / 200L) % 4L);
                    if (frame == 2) {
                        posY -= 1.0f;
                    } else if (frame == 3) {
                        posY -= 2.0f;
                    }
                }
                switch (dir) {
                    case 18:
                    case 21:
                    case 22:
                        dir = 27;
                        i8 = 18;
                        break;
                    case 19:
                    case 23:
                    case 24:
                        dir = 28;
                        i8 = 19;
                        break;
                    default:
                        dir = 29;
                        i8 = 20;
                        break;
                }
            }
        }
        if (s_ci == 68 || s_ci == 73) {
            pv.c4(v1, su, ci, s_ci, dir, posX, posY, i3, false);
        }
        int maxLayers = z ? 1 : 3;
        for (int layer = 0; layer < maxLayers; layer++) {
            if (layer == 1 || maxLayers == 1) {
                ew0_0 ew = ew0_0.C1;
                byte rh = z ? 0 : su.Gi().rh.Fw;
                LPT6_ lpt6 = pv.fr(ew, rh, dir);
                if (lpt6 != null) {
                    if (z) {
                        float oldAlpha = v1.og;
                        v1.TJ0(0.0f, 0.0f, 0.0f, 0.25f);
                        float off = i3 ? (lpt6.bz * 0.75f) : 0.0f;
                        float w = (float) (lpt6.bz * (i3 ? -1 : 1));
                        v1.u2(lpt6, posX + off, posY, 0.0f, 0.0f, w, (float) lpt6.xZ, 0.75f, 0.75f, 0.0f);
                        Color.abgr8888ToColor(v1.oH, oldAlpha);
                        v1.og = oldAlpha;
                        return true;
                    }
                    float off = i3 ? (lpt6.bz * 0.75f) : 0.0f;
                    float w = (float) (lpt6.bz * (i3 ? -1 : 1));
                    v1.u2(lpt6, posX + off, posY, 0.0f, 0.0f, w, (float) lpt6.xZ, 0.75f, 0.75f, 0.0f);
                }
            }
            pv.r1(v1, su, q10_0.Cw0, dir, posX, posY, i3, layer);
            if (!b_qh0 && s_qh0_2 != 12 && s_qh0_2 != 51 && s_qh0_2 != 17 && s_qh0_2 != 40 && tn0 < 1) {
                pv.r1(v1, su, qh0, (byte) i8, posX, posY, i3, layer);
            }
            q10_0 bb = q10_0.bb;
            if (bb.cOm4(su.Gi().Nul(bb))) {
                pv.r1(v1, su, q10_0.pv, dir, posX, posY, i3, layer);
            }
            if (bb.QI(su.Gi().Nul(bb))) {
                pv.r1(v1, su, q10_0.l3, dir, posX, posY, i3, layer);
            }
            q10_0 xl = q10_0.Xl;
            boolean b_xl = (su.Gi().Nul(xl) == 1 || su.ba0.Y30 == 1);
            if (b_xl) {
                pv.r1(v1, su, xl, dir, posX, posY, i3, layer);
            }
            if (!b_ci) {
                pv.r1(v1, su, bb, dir, posX, posY, i3, layer);
                pv.r1(v1, su, ci, dir, posX, posY, i3, layer);
            } else {
                pv.r1(v1, su, bb, dir, posX, posY, i3, layer);
            }
            pv.r1(v1, su, q10_0.rg0, dir, posX, posY, i3, layer);
            pv.r1(v1, su, q10_0.uz, dir, posX, posY, i3, layer);

            q10_0 vi = q10_0.VI;
            if (vi.Pd0(su.Gi().Nul(vi)) && layer != 2 && su.Gi().Nul(q10_0.Bj0) != -1) {
                short s_vi = su.Gi().Nul(vi);
                short s_bj0 = su.Gi().Nul(q10_0.Bj0);
                EE ee = su.Gi().auX[q10_0.Bj0.iL];
                Arrays.fill(_native.HQ, null);
                byte[] uq = _native.UQ[layer];
                for (int i24 = 0; i24 < _native.KE0.length; i24++) {
                    q10_0 ke = _native.KE0[i24];
                    for (int i26 = 0; i26 < uq.length; i26++) {
                        byte b_uq = uq[i26];
                        if (_native.HQ[i26] == null) {
                            _native.HQ[i26] = pv.MQ(ew0_0.C1, s_vi, s_bj0, dir, b_uq, false, ee);
                        }
                        LPT6_[] hqArr = _native.HQ[i26];
                        if (hqArr != null) {
                            LPT6_ lpt6_part = hqArr[i24];
                            if (lpt6_part != null) {
                                short s_id = (ke == vi) ? s_vi : s_bj0;
                                yb_1 yb = qx_1.Con(b_uq) ? null : su.Gi().Ry0(ke);
                                boolean b_flag = !(b_uq == 4 || b_uq == 1 || b_uq == 7);
                                _native.eI(v1, lpt6_part, ke, s_id, yb, posX, posY, i3, b_flag, 1.0f);
                            }
                        }
                    }
                }
            } else {
                pv.r1(v1, su, vi, dir, posX, posY, i3, layer);
            }
            if (!b_xl) {
                pv.r1(v1, su, xl, dir, posX, posY, i3, layer);
            }
            if (b_ci) {
                pv.r1(v1, su, ci, dir, posX, posY, i3, layer);
            }
            if (tn0 > 0) {
                Wr wr2 = sf0.Lq(i18, 1, tn0);
                if (wr2 != null) {
                    Texture tex2 = wr2.H8();
                    float offX2 = yk0[i17][0] + posX;
                    float offY2 = yk0[i17][1] + posY;
                    v1.vv0(tex2, offX2, offY2, 24.0f, 24.0f);
                }
            } else if (Ss0.lPt2(s_qh0_2)) {
                pv.MB0(v1, su, qh0, s_qh0_2, (byte) i8, posX, posY, i3, true);
            } else if (b_qh0) {
                pv.r1(v1, su, qh0, (byte) i8, posX, posY, i3, layer);
            }
        }
        if (s_ci == 68 || s_ci == 73) {
            pv.c4(v1, su, ci, s_ci, dir, posX, posY, i3, true);
        }
        return true;
    }

    @Override
    public final boolean jq0(BJ0 v1, ER v2, U5 v3, int i4, boolean i5) {
        boolean z = wJ0();
        if (!z && this.Cs == null) {
            xD(v1, v2, v3, false, false);
        }
        Matrix4 cs = this.Cs;
        if (cs != null) {
            this.Mz = tw0_0.pv.lPt2(v2, v3, this.sU, this.Mz, this.Ka0, (byte) i4, cs, i5, z);
        } else {
            this.Mz = tw0_0.pv.hF(v2, v3, this.sU, this.Mz, this.Ka0, (byte) i4, this.VH, this.n80, this.qv0.St0, i5, z);
        }
        return true;
    }

    @Override
    public final int ji() {
        return 16;
    }

    @Override
    public final int CoM5() {
        return 32;
    }

    @Override
    public final void Oq(boolean i1, boolean i2) {
        this.H10 = i1;
        if (!i1 && i2) {
            this.Z30 = hk0_1.KG + 2500L;
        } else if (!i2) {
            this.Z30 = 0L;
        }
    }

    @Override
    public final boolean wJ0() {
        return this.H10 && hk0_1.KG > this.Z30;
    }
}
