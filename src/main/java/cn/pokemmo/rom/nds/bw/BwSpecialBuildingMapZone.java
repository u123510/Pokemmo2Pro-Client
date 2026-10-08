package cn.pokemmo.rom.nds.bw;

import f.*;
import java.util.ArrayList;
import java.util.List;

public class BwSpecialBuildingMapZone extends XF0 {
    public final nj0_0 yj0;
    public final ArrayList wh0;
    public Zz[] tv;
    public wg_0 th;

    public BwSpecialBuildingMapZone(nj0_0 v1, short s, byte b, short s2, TE te) {
        super(v1, s, b, s2, te);
        this.wh0 = new ArrayList();
        this.tv = new Zz[0];
        this.th = null;
        this.yj0 = v1;
        V90();
        gA();
    }

    public final boolean Wp() {
        if (this.jE != null) {
            return true;
        }
        if (!tw0_0.rl.yh0.Ny(this.dw, (short) 2403)) {
            return false;
        }
        return true;
    }

    @Override
    public final void jc0(Z50 v1) {
        super.jc0(v1);
        V90();
    }

    @Override
    public final void gA() {
        super.gA();
        for (short i1 = 0; i1 < this.i80.It0; i1++) {
            for (short i2 = 0; i2 < this.i80.WH; i2++) {
                if (this.o6) {
                    int i3 = this.i80.l1[i1][i2];
                    if (i3 >= 0) {
                        this.uJ[i1][i2] = this.xk0.Sc0(i3);
                        Z50 v3 = this.uJ[i1][i2];
                        if (v3 != null) {
                            v3.KJ();
                        }
                    }
                }
                int i3 = this.i80.M70[i1][i2];
                if (i3 >= 0) {
                    short s3 = (short) i3;
                    if (this.sp0.bL0(s3)) {
                        s3 = this.sp0.f5(s3);
                    }
                    w6 v3 = (w6) this.yj0.FA(s3);
                    if (this.yd == 0 && this.ie == 0) {
                        this.yd = v3.qB0;
                        this.ie = v3.N70;
                    }
                    if (this.yd == v3.qB0 && this.ie == v3.N70) {
                        short[][][][] r4 = v3.r4;
                        if (r4.length > this.Sm0) {
                            this.Sm0 = r4.length;
                        }
                    } else {
                        throw new RuntimeException("Matrix has mismatching footer sizes");
                    }
                }
            }
        }
    }

    @Override
    public final void hl(short i1, short i2) {
        int i3 = this.i80.M70[i1][i2];
        if (i3 >= 0) {
            short s3 = (short) i3;
            if (this.sp0.bL0(s3)) {
                s3 = this.sp0.f5(s3);
            }
            w6 v3 = (w6) this.yj0.FA(s3);
            this.Qm[i1][i2] = new zb_0(i1, i2, this, v3);
        }
    }

    public final ug_0 Uc0(int i1, int i2) {
        return (ug_0) super.W4(i1, i2);
    }

    public final nC0 R50(byte i1, short i2, short i3) {
        if (i1 < 0 || i1 >= this.tv.length) {
            return null;
        }
        Zz zz = this.tv[i1];
        short yOffset = (short) (i3 - zz.Wj0);
        if (yOffset < 0) {
            return null;
        }
        nC0[][] wg = zz.WG;
        if (i2 < 0 || i2 >= wg.length) {
            return null;
        }
        if (yOffset >= wg[i2].length) {
            return null;
        }
        return wg[i2][yOffset];
    }

    @Override
    public final LT pR(float f1, float f2, float f3) {
        float minDst = Float.MAX_VALUE;
        nC0 closest = null;
        for (Object obj : this.wh0) {
            nC0 nc = (nC0) obj;
            float dst = nc.JA0.Ir(f1, f3, f2);
            if (dst < minDst) {
                minDst = dst;
                closest = nc;
            }
        }
        return closest;
    }

    public final void V90() {
        short s = wg_0.Hm0(this.dw, this.Ro0.O60);
        if (s < 0) {
            this.th = null;
            this.tv = new Zz[0];
            this.wh0.clear();
            return;
        }
        this.th = this.yj0.qg[s];
        this.tv = new Zz[this.th.lE0.length];
        this.wh0.clear();
        com4__4 v2 = null;
        if (s < this.yj0.PY.length) {
            v2 = this.yj0.PY[s];
        }
        int i4 = this.th.lE0.length;
        for (int i5 = 0; i5 < i4; i5++) {
            _package v6 = this.th.lE0[i5];
            boolean i7_flag = false;
            if (s == 2) {
                byte dl0 = v6.DL0;
                if (dl0 == 8 || dl0 == 19) {
                    i7_flag = true;
                }
            }
            Q90 v9 = this.th.yz[v6.Fq];
            Q90 v10 = this.th.yz[v6.FP];
            YF0 v8 = this.th.YU[v6.jm];
            byte i11 = v6.DL0;
            Pq0 v12 = v2.h80[i11];
            int i13 = v12.Sg0;
            short i14 = (short) (-i13 / 2);
            int i15 = v12.Mr0;
            this.tv[i11] = new Zz(v6, i15, i13, i14);

            C8 v16 = T3.hf(v9.Kh, v9.Kh).Vy(v9.Kh.x, v9.Kh.y, v9.Kh.z);
            C8 v17 = T3.hf(v9.Kh, v9.Kh);
            C8 v18 = T3.hf(v16, v9.Kh);
            v17.y = 0.0f;
            v18.y = 0.0f;
            C8 v19 = new C8(v8.KI0, 0.0f, v8.Y70);
            float angle = (float) Math.atan2((double) v19.x, (double) v16.z) * 57.2957763672f;
            if (angle < 0.0f) {
                angle += 360.0f;
            }

            for (short i20 = 0; i20 < i13; i20++) {
                short i21 = (short) (i14 + i20);
                for (short i22 = 0; i22 < i15; i22++) {
                    short i23 = v12.UH[0][i22][i20];
                    short i24 = v12.UH[1][i22][i20];
                    nC0 v25 = new nC0(this, i22, i21, i11, i23, i24);
                    v25.Or0 = v6;
                    this.tv[i11].WG[i22][i20] = v25;
                    this.wh0.add(v25);
                    C8 v23_ja0 = v25.JA0;
                    int kt = v8.kt;
                    if (kt != 0 && !i7_flag && (kt == 1 || kt == 2)) {
                        float f24 = v17.Ir(v8.KI0, 0.0f, v8.Y70);
                        float f26 = v18.Ir(v8.KI0, 0.0f, v8.Y70);
                        C8 v27_1 = new C8(v19);
                        v27_1.Vy(v17.x, v17.y, v17.z);
                        float a1 = (float) Math.atan2((double) v17.z, (double) v27_1.x) * 57.2957763672f;
                        C8 v27_2 = new C8(v19);
                        v27_2.Vy(v18.x, v18.y, v18.z);
                        float a2 = (float) Math.atan2((double) v18.z, (double) v27_2.x) * 57.2957763672f;
                        float f28 = a1 - 90.0f;
                        float f27 = a2 - 90.0f;
                        if (f28 < 0.0f) f28 += 360.0f;
                        if (f27 < 0.0f) f27 += 360.0f;
                        if (f28 - f27 > 180.0f) f27 += 360.0f;
                        if (f27 - f28 > 180.0f) f28 += 360.0f;
                        boolean i29 = false;
                        if (f27 > f28) {
                            float diff = (float) (i20 - (i13 / 2));
                            f24 += diff;
                            f26 += diff;
                            i29 = true;
                        } else {
                            float diff = (float) (i20 - (i13 / 2));
                            f24 -= diff;
                            f26 -= diff;
                        }
                        float t = (float) i22 / (float) i15;
                        f24 = fe_2.Ga0(f26, f24, t, f24);
                        f27 = fe_2.Ga0(f27, f28, t, f28);
                        double d23 = (double) f24;
                        double d27 = (double) ((f27 + 270.0f) * 0.0174532924f);
                        v23_ja0.x = (float) (Math.cos(d27) * d23 + (double) v19.x);
                        v23_ja0.y = fe_2.Ga0(v10.Kh.y, v9.Kh.y, t, v9.Kh.y);
                        v23_ja0.z = (float) (Math.sin(d27) * d23 + (double) v19.z);
                        float xs0 = -f27;
                        v25.xs0 = xs0;
                        if (i29) {
                            v25.xs0 = xs0 + 180.0f;
                        }
                        int l2 = v6.L2;
                        if (l2 == 1) {
                            v25.xs0 += -90.0f;
                        } else if (l2 == 3) {
                            v25.xs0 += -270.0f;
                        } else if (l2 == 4) {
                            v25.xs0 += -180.0f;
                        }
                    } else {
                        v23_ja0.x = 0.0f;
                        v23_ja0.y = 0.0f;
                        v23_ja0.z = (float) i21;
                        v23_ja0.YO(C8.Y, angle + 270.0f);
                        float f24 = (float) i22 / (float) i15;
                        v23_ja0.x = (v10.Kh.x - v9.Kh.x) * f24 + v9.Kh.x + v23_ja0.x;
                        float f26_y = (v10.Kh.y - v9.Kh.y) * f24 + v9.Kh.y + v23_ja0.y;
                        v23_ja0.y = f26_y;
                        v23_ja0.z = (v10.Kh.z - v9.Kh.z) * f24 + v9.Kh.z + v23_ja0.z;
                        float f24_angle = angle - 90.0f;
                        v25.xs0 = f24_angle;
                        int l2 = v6.L2;
                        if (l2 == 1) {
                            v25.xs0 = f24_angle + -90.0f;
                        } else if (l2 == 3) {
                            v25.xs0 = f24_angle + -270.0f;
                        } else if (l2 == 4) {
                            v25.xs0 = f24_angle + -180.0f;
                        }
                        if (i7_flag) {
                            float f24_add = 0.0f;
                            switch (i22) {
                                case 1:
                                case 6:
                                    f24_add = 0.5f;
                                    break;
                                case 2:
                                case 5:
                                    f24_add = 1.0f;
                                    break;
                                case 3:
                                case 4:
                                    f24_add = 1.5f;
                                    break;
                            }
                            v23_ja0.y = f26_y + f24_add;
                        }
                    }
                }
            }

            for (short i7 = 0; i7 < i13; i7++) {
                short i9 = (short) (i14 + i7);
                for (short i8 = 0; i8 < i15; i8++) {
                    nC0 v10_node = R50(i11, i8, i9);
                    int l2 = v6.L2;
                    if (l2 == 1) {
                        v10_node.Nn0((byte) 0, R50(i11, (short) (i8 - 1), i9));
                        v10_node.Nn0((byte) 1, R50(i11, (short) (i8 + 1), i9));
                        v10_node.Nn0((byte) 3, R50(i11, i8, (short) (i9 + 1)));
                        v10_node.Nn0((byte) 2, R50(i11, i8, (short) (i9 - 1)));
                    } else if (l2 == 3) {
                        v10_node.Nn0((byte) 0, R50(i11, (short) (i8 + 1), i9));
                        v10_node.Nn0((byte) 1, R50(i11, (short) (i8 - 1), i9));
                        v10_node.Nn0((byte) 3, R50(i11, i8, (short) (i9 - 1)));
                        v10_node.Nn0((byte) 2, R50(i11, i8, (short) (i9 + 1)));
                    } else if (l2 == 4) {
                        v10_node.Nn0((byte) 0, R50(i11, i8, (short) (i9 - 1)));
                        v10_node.Nn0((byte) 1, R50(i11, i8, (short) (i9 + 1)));
                        v10_node.Nn0((byte) 3, R50(i11, (short) (i8 - 1), i9));
                        v10_node.Nn0((byte) 2, R50(i11, (short) (i8 + 1), i9));
                    } else {
                        v10_node.Nn0((byte) 0, R50(i11, i8, (short) (i9 + 1)));
                        v10_node.Nn0((byte) 1, R50(i11, i8, (short) (i9 - 1)));
                        v10_node.Nn0((byte) 3, R50(i11, (short) (i8 + 1), i9));
                        v10_node.Nn0((byte) 2, R50(i11, (short) (i8 - 1), i9));
                    }
                }
            }
        }

        int yz_len = this.th.yz.length;
        for (int i3 = 0; i3 < yz_len; i3++) {
            Q90 v4 = this.th.yz[i3];
            SQ v5 = new SQ();
            for (int i6 = 0; i6 < 2; i6++) {
                for (int i7 = 0; i7 < 4; i7++) {
                    byte i8 = v4.AV[i7];
                    int i9 = v4.ev0[i7];
                    if (i8 < 0 || i9 == 0) {
                        continue;
                    }
                    Zz v10_zz = this.tv[i8];
                    boolean i11_rev = (v10_zz.DN.Fq == v4.pN);
                    int i10 = v10_zz.ze;
                    int i12 = v10_zz.COm3;
                    for (short i13 = 0; i13 < i10; i13++) {
                        for (short i14 = 0; i14 < i12; i14++) {
                            short i15 = (short) (i14 + this.tv[i8].Wj0);
                            nC0 v16 = R50(i8, i13, i15);
                            if (v16 == null) {
                                continue;
                            }
                            short i17 = i11_rev ? i13 : (short) (i10 - i13);
                            if (i9 == 1 || i9 == 4) {
                                i17 = (short) (-i17);
                            }
                            if (!i11_rev && i9 == 2) {
                                i15 = (short) (-i15);
                            }
                            if (i11_rev && i9 == 4) {
                                i15 = (short) (-i15);
                            }
                            if (!i11_rev && i9 == 1) {
                                i15 = (short) (-i15);
                            }
                            if (i11_rev && i9 == 3) {
                                i15 = (short) (-i15);
                            }
                            if (i9 == 1 || i9 == 3) {
                                short tmp = i15;
                                i15 = i17;
                                i17 = tmp;
                            }
                            if (i6 == 0) {
                                int i18 = (i17 & 0xFFFF) | ((i15 & 0xFFFF) << 16);
                                List v19 = (List) v5.get(i18);
                                if (v19 == null) {
                                    v19 = new ArrayList();
                                    v5.yw0(i18);
                                    v5.j10(i18, v19);
                                }
                                v19.add(v16);
                                v16.FS = v16.FS + "\nPOINT " + v4.pN + ": " + i17 + " " + i15;
                            } else {
                                switch (i9) {
                                    case 1:
                                        i15 = (short) (i15 + 1);
                                        break;
                                    case 2:
                                        i17 = (short) (i17 - 1);
                                        break;
                                    case 3:
                                        i15 = (short) (i15 - 1);
                                        break;
                                    case 4:
                                        i17 = (short) (i17 + 1);
                                        break;
                                }
                                int key = (i17 & 0xFFFF) | ((i15 & 0xFFFF) << 16);
                                List list = (List) v5.get(key);
                                if (list != null) {
                                    for (Object o : list) {
                                        nC0 v17_neighbor = (nC0) o;
                                        if (v17_neighbor != null && v17_neighbor.Sm != v16.Sm) {
                                            byte i18_dir;
                                            switch (i9) {
                                                case 1:
                                                    i18_dir = 1;
                                                    break;
                                                case 2:
                                                    i18_dir = 3;
                                                    break;
                                                case 3:
                                                    i18_dir = 0;
                                                    break;
                                                case 4:
                                                    i18_dir = 2;
                                                    break;
                                                default:
                                                    i18_dir = 0;
                                                    break;
                                            }
                                            v16.Nn0(i18_dir, v17_neighbor);
                                            v17_neighbor.Nn0(tx_1.Qf0(i18_dir), v16);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Override
    public final Z50 W4(int i1, int i2) {
        return (ug_0) super.W4(i1, i2);
    }

    @Override
    public final LT Jk0(byte b, short s, short s2) {
        return R50(b, s, s2);
    }
}
