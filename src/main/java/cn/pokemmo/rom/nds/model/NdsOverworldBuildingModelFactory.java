package cn.pokemmo.rom.nds.model;

import f.*;
import com.badlogic.gdx.graphics.Color;

public abstract class NdsOverworldBuildingModelFactory {
    public static final cf_2 Ou = new cf_2();
    public static final es_1 jS = new es_1(false, 16);

    public static Ou0 gm(C8 c8, float f, int i) {
        int i3 = (i & 1023) | 196608;
        Ou0 ou0 = (Ou0) Ou.vC(i3, null);
        iy_0 iy_02 = tw0_0.Ll0.nC0.be.YW(i);
        if (ou0 == null) {
            ku_0 ku_02;
            if ((ku_02 = tw0_0.Ll0.nC0.be.Vk0(i)) == null) {
                return null;
            }
            pc_1 pc_12;
            if (i == 221) {
                pc_12 = new LG();
            } else {
                pc_12 = new pc_1();
            }
            pc_12.kh = i + 1000;
            pc_12.AUX = 3;
            jS.Ue0(pc_12);
            vt_0 vt_02 = ku_02.KV[0];
            pc_12.Od0(vt_02, ku_02.QB);
            if (dw_2.bn) {
                gf0_0 gf0_02;
                if ((gf0_02 = tw0_0.KW.bG0[3]) != null) {
                    Ou0 ou0_2;
                    if ((ou0_2 = gf0_02.L0(i, pc_12)) != null) {
                        ou0 = ou0_2;
                        if (iy_02.Pv.KB > 0) {
                            v80_0.Cb0();
                            v80_0.D7(ou0, ku_02.QB, pc_12, iy_02.Pv);
                        }
                    }
                }
            }
            if (ou0 == null || !dw_2.bn) {
                v80_0.fo0(ku_02.KV[0], ku_02.QB);
                v80_0.Cb0();
                vt_0 vt_03 = ku_02.KV[0];
                ou0 = v80_0.a40(vt_03, pc_12, ku_02.QB, iy_02.Pv, f / vt_03.Iu0, true, false);
            }
            ou0.FC0 = pc_12;
            ou0.AD = i;
            ou0.Mm0 = iy_02;
            if (i == 22 || i == 23 || i == 236) {
                ((Xz0) ((Xz0) ((Xz0) ou0.ZE0.get(0)).yn.get(0)).yn.get(0)).X50();
            } else if (i == 228) {
                ((BM) ou0.Y3.KI()).fR(PRN_.xE);
            } else if (i == 586) {
                ((BM) ou0.Y3.get(4)).LPT8(new xd_2(xd_2.DK0, 6));
            }
            Ou.n3(i3, ou0);
        }
        Ou0 ou03 = ou0.Ma0();
        C8 c82 = c8.Fg0(0.25f);
        if (ou03.Kv.KB > 0 && iy_02.aM0 && iy_02.YD0 == 0) {
            ou03.sC0(0, true, null);
        }
        ou03.ho.el0(c82.x, c82.y, c82.z);
        return ou03;
    }

    public static Ou0 coM9(C8 c8, float f, int i, boolean z) {
        int i4 = ((z ? 1 : 0) << 24) | 262144 | (i & 1023);
        Ou0 ou0 = (Ou0) Ou.vC(i4, null);
        UY uy = tw0_0.Ll0.t1;
        kx_1 kx_12 = z ? uy.BJ0 : uy.ny;
        iy_0 iy_02 = kx_12.YW(i);
        if (ou0 == null) {
            UY uy2 = tw0_0.Ll0.t1;
            kx_1 kx_13 = z ? uy2.BJ0 : uy2.ny;
            ku_0 ku_02;
            if ((ku_02 = kx_13.Vk0(i)) == null) {
                return null;
            }
            pc_1 pc_12 = new pc_1();
            pc_12.kh = i + 1000;
            pc_12.AUX = 4;
            jS.Ue0(pc_12);
            vt_0 vt_02 = ku_02.KV[0];
            pc_12.Od0(vt_02, ku_02.QB);
            if (dw_2.bn) {
                gf0_0 gf0_02;
                if ((gf0_02 = tw0_0.KW.bG0[4]) != null) {
                    MG0 mg0 = z ? MG0.rm : MG0.Wk0;
                    Ou0 ou0_2;
                    if ((ou0_2 = gf0_02.aj(mg0, i, pc_12)) != null) {
                        ou0 = ou0_2;
                        if (iy_02.Pv.KB > 0) {
                            v80_0.Cb0();
                            v80_0.D7(ou0, ku_02.QB, pc_12, iy_02.Pv);
                        }
                    }
                }
            }
            if (ou0 == null || !dw_2.bn) {
                boolean z2 = false;
                if (!z && (i == 146 || i == 147 || i == 173 || i == 174)) {
                    z2 = true;
                }
                boolean z3 = !z;
                if (z && (i == 117 || i == 169 || i == 186 || (i >= 64 && i <= 70))) {
                    z3 = true;
                }
                v80_0.fo0(ku_02.KV[0], ku_02.QB);
                v80_0.Cb0();
                vt_0 vt_03 = ku_02.KV[0];
                ou0 = v80_0.a40(vt_03, pc_12, ku_02.QB, iy_02.Pv, f / vt_03.Iu0, z3, z2);
            }
            ou0.FC0 = pc_12;
            ou0.AD = i;
            ou0.ST = z;
            ou0.Mm0 = iy_02;
            Ou.n3(i4, ou0);
        }
        Ou0 ou03 = ou0.Ma0();
        C8 c82 = c8.Fg0(0.25f);
        if (z) {
            if (i == 12) {
                Xz0 xz0;
                if ((xz0 = ou03.Ve0("polygon3_h_kage", true)) != null) {
                    xz0.BI0.y -= 0.01f;
                    xz0.Z90();
                    ((I20) xz0.sJ0.get(0)).jK0.LPT8(new xd_2(xd_2.DK0, 6));
                }
            } else if (i == 31) {
                c82.y -= 0.01f;
                BM bm;
                if ((bm = ou03.ff0("h_kage")) != null) {
                    bm.LPT8(new xd_2(xd_2.DK0, 6));
                }
            } else if (i == 55) {
                ou03.PE0 = 0.25f;
            } else if (i == 88 || i == 75) {
                c82.y -= 0.005f;
                BM bm;
                if ((bm = ou03.ff0("h_kage")) != null) {
                    bm.LPT8(new xd_2(xd_2.DK0, 6));
                }
            } else if (i == 95) {
                c82.y -= 0.005f;
            } else if (i == 121) {
                BM bm;
                if ((bm = ou03.ff0("lambert5")) != null) {
                    bm.LPT8(new PRN_(PRN_.Ly, new Color(-842150449)));
                }
            } else if (i == 52) {
                c82.y -= 0.01f;
                BM bm;
                if ((bm = ou03.ff0("h_kage")) != null) {
                    bm.LPT8(new xd_2(xd_2.DK0, 6));
                }
            }
        } else if (i == 78) {
            c82.y += 0.005f;
        }
        if (ou03.Kv.KB > 0 && iy_02.aM0) {
            byte YD0 = iy_02.YD0;
            if (YD0 == 0) {
                ou03.sC0(0, true, null);
            } else if (YD0 == 8) {
                switch (Qo0.co0[c8_0.JD0.NA().om]) {
                    case 1:
                        ou03.sC0(0, true, null);
                        break;
                    case 2:
                        ou03.sC0(1, true, null);
                        break;
                    case 3:
                        ou03.sC0(2, true, null);
                        break;
                    case 4:
                    case 5:
                        ou03.sC0(3, true, null);
                        break;
                }
            }
        }
        ou03.ho.el0(c82.x, c82.y, c82.z);
        return ou03;
    }

    public static void CoM5() {
        com7__4 it = Ou.K00();
        while (it.hasNext()) {
            ((Ou0) it.next()).O4();
        }
        I2 i2 = jS.ZD();
        while (i2.hasNext()) {
            ((pc_1) i2.next()).dispose();
        }
        jS.clear();
        Ou.clear();
    }
}
