package cn.pokemmo.graphics.camera;

import f.*;
import f.org.json.*;

public class Nds3DCameraProjection {
    public static final up_1 Ak;
    public final bm0_1[] jN;

    static {
        Ak = new up_1();
    }

    public static up_1 vC0() {
        return Ak;
    }

    public Nds3DCameraProjection() {
        this.jN = new bm0_1[5];
        for (byte b = 0; b < this.jN.length; b++) {
            this.jN[b] = new bm0_1();
            for (int i2 = -128; i2 < 128; i2++) {
                byte b2 = (byte) i2;
                dd_1 dd_1Var = new dd_1(b2);
                dd_1Var.qC0(N50.Aa(b));
                this.jN[b].gE0(b2, dd_1Var);
            }
        }
        Zi0(new Sd0((byte) 1, (byte) 0, new nk_0[] { nk_0.uv0, nk_0.SJ, nk_0.MZ, nk_0.oY }));
        Zi0(new xe_2());
        Zi0(new Sd0((byte) 3, (byte) 0, new nk_0[] { nk_0.cOM9, nk_0.t20, null }));
        Zi0(new Sd0((byte) 4, (byte) 0, new nk_0[] { nk_0.cOM9, nk_0.t20, null }));
        Zi0(new Sd0((byte) 5, (byte) 2, new nk_0[] { nk_0.pM, nk_0.lpT8, null }));
        Zi0(new Sd0((byte) 6, (byte) 2, new nk_0[] { nk_0.pM, nk_0.lpT8, null }));
        Zi0(new Sd0((byte) 13, (byte) 1, new nk_0[] { nk_0.oY, nk_0.uv0 }));
        Zi0(new Sd0((byte) 14, (byte) 2, new nk_0[] { nk_0.SJ, nk_0.MZ }));
        Zi0(new Sd0((byte) 15, (byte) 1, new nk_0[] { nk_0.oY, nk_0.SJ }));
        Zi0(new Sd0((byte) 16, (byte) 1, new nk_0[] { nk_0.oY, nk_0.MZ }));
        Zi0(new Sd0((byte) 17, (byte) 0, new nk_0[] { nk_0.uv0, nk_0.SJ }));
        Zi0(new Sd0((byte) 18, (byte) 0, new nk_0[] { nk_0.uv0, nk_0.MZ }));
        Zi0(new Sd0((byte) 19, (byte) 1, new nk_0[] { nk_0.oY, nk_0.uv0, nk_0.SJ }));
        Zi0(new Sd0((byte) 20, (byte) 1, new nk_0[] { nk_0.oY, nk_0.uv0, nk_0.MZ }));
        Zi0(new Sd0((byte) 21, (byte) 1, new nk_0[] { nk_0.oY, nk_0.SJ, nk_0.MZ }));
        Zi0(new Sd0((byte) 22, (byte) 0, new nk_0[] { nk_0.uv0, nk_0.SJ, nk_0.MZ }));
        Zi0(new FP((byte) 23, (byte) 0, new nk_0[] { nk_0.uv0, nk_0.MZ, nk_0.oY, nk_0.SJ }));
        Zi0(new FP((byte) 24, (byte) 0, new nk_0[] { nk_0.uv0, nk_0.SJ, nk_0.oY, nk_0.MZ }));
        Zi0(new lj0_0((byte) 25, (byte) 1, nk_0.cOM9, nk_0.t20));
        Zi0(new lj0_0((byte) 26, (byte) 0, nk_0.t20, nk_0.cOM9));
        Zi0(new lj0_0((byte) 27, (byte) 2, nk_0.pM, nk_0.lpT8));
        Zi0(new lj0_0((byte) 28, (byte) 3, nk_0.lpT8, nk_0.pM));
        Zi0(new bo_2((byte) 29, new byte[] { 1, 3 }));
        Zi0(new bo_2((byte) 32, new byte[] { 2, 1 }));
        Zi0(new bo_2((byte) 33, new byte[] { 1, 2 }));
        Zi0(new bo_2((byte) 36, new byte[] { 3, 0 }));
        Zi0(new bo_2((byte) 37, new byte[] { 2, 1 }));
        Zi0(new bo_2((byte) 40, new byte[] { 0, 3 }));
        Zi0(new bo_2((byte) 41, new byte[] { 3, 1 }));
        Zi0(new bo_2((byte) 44, new byte[] { 0, 2 }));
        Zi0(new wm_0((byte) 45, new byte[] { 1, 2, 0, 3 }));
        Zi0(new wm_0((byte) 46, new byte[] { 0, 3, 1, 2 }));
        Zi0(new wm_0((byte) 47, new byte[] { 2, 0, 3, 1 }));
        Zi0(new wm_0((byte) 48, new byte[] { 3, 1, 2, 0 }));
        Zi0(new wm_0((byte) 49, new byte[] { 1, 3, 0, 2 }));
        Zi0(new wm_0((byte) 50, new byte[] { 0, 2, 1, 3 }));
        Zi0(new wm_0((byte) 51, new byte[] { 2, 1, 3, 0 }));
        Zi0(new wm_0((byte) 52, new byte[] { 3, 0, 2, 1 }));
        Zi0(new uf_1((byte) 68, nk_0.ph0));
        Zi0(new uf_1((byte) 69, nk_0.IF));
        Zi0(new uf_1((byte) 70, nk_0.w));
        Zi0(new uf_1((byte) 71, nk_0.Jo0));
        Zi0(new uf_1((byte) 77, nk_0.Ly));
        Zi0(new uf_1((byte) 78, nk_0.gI));
        Zi0(new uf_1((byte) 79, nk_0.Tc));
        Zi0(new uf_1((byte) 80, nk_0.p6));
        Zi0(new RG0(new nk_0[] { nk_0.uv0, nk_0.oY, nk_0.uv0, nk_0.SJ }));
        Zi0(new qy_2(new nk_0[] { nk_0.uv0, nk_0.oY, nk_0.SJ }));
        Zi0(new vw0_0(new nk_0[] { nk_0.h50 }));
        Zi0(new O60(new nk_0[] { nk_0.CV }));
        Zi0(new de_0(new nk_0[] { nk_0.NL0 }));
        TS(new Sd0((byte) 2, (byte) 0, new nk_0[] { nk_0.kL0, nk_0.uG0, nk_0.ZC, nk_0.G3 }));
        TS(new Sd0((byte) 3, (byte) 0, new nk_0[] { nk_0.uU, nk_0.Vb, nk_0.A70, nk_0.TN, null }));
        TS(new Sd0((byte) 4, (byte) 0, new nk_0[] { nk_0.Vb, nk_0.TN, null }));
        TS(new Sd0((byte) 5, (byte) 2, new nk_0[] { nk_0.uU, nk_0.A70, null }));
        TS(new Sd0((byte) 6, (byte) 1, new nk_0[] { nk_0.G3, nk_0.uG0, null }));
        TS(new Sd0((byte) 7, (byte) 1, new nk_0[] { nk_0.G3, nk_0.ZC, null }));
        TS(new Sd0((byte) 8, (byte) 0, new nk_0[] { nk_0.kL0, nk_0.uG0, null }));
        TS(new Sd0((byte) 9, (byte) 0, new nk_0[] { nk_0.kL0, nk_0.ZC, null }));
        TS(new Sd0((byte) 10, (byte) 1, new nk_0[] { nk_0.G3, nk_0.kL0, nk_0.uG0, null }));
        TS(new Sd0((byte) 11, (byte) 1, new nk_0[] { nk_0.G3, nk_0.kL0, nk_0.ZC, null }));
        TS(new Sd0((byte) 12, (byte) 1, new nk_0[] { nk_0.G3, nk_0.uG0, nk_0.ZC, null }));
        TS(new Sd0((byte) 13, (byte) 0, new nk_0[] { nk_0.kL0, nk_0.uG0, nk_0.ZC, null }));
        TS(new FP((byte) 18, (byte) 1, new nk_0[] { nk_0.G3, nk_0.uG0, nk_0.kL0, nk_0.ZC }));
        TS(new FP((byte) 19, (byte) 1, new nk_0[] { nk_0.G3, nk_0.ZC, nk_0.kL0, nk_0.uG0 }));
        TS(new pd_1((byte) 20, new dd_1[] { new lj0_0((byte) 20, (byte) 0, nk_0.Vb, nk_0.TN), new lj0_0((byte) 20, (byte) 1, nk_0.TN, nk_0.Vb), new lj0_0((byte) 20, (byte) 3, nk_0.uU, nk_0.A70), new lj0_0((byte) 20, (byte) 2, nk_0.A70, nk_0.uU) }));
        TS(new bo_2((byte) 21, new byte[] { 1, 3 }));
        TS(new bo_2((byte) 24, new byte[] { 2, 0 }));
        TS(new bo_2((byte) 28, new byte[] { 3, 0 }));
        TS(new bo_2((byte) 29, new byte[] { 2, 1 }));
        TS(new bo_2((byte) 32, new byte[] { 0, 2 }));
        TS(new bo_2((byte) 33, new byte[] { 3, 1 }));
        TS(new bo_2((byte) 36, new byte[] { 0, 2 }));
        TS(new wm_0((byte) 37, new byte[] { 1, 2, 0, 3 }));
        TS(new wm_0((byte) 38, new byte[] { 0, 3, 1, 2 }));
        TS(new wm_0((byte) 39, new byte[] { 2, 0, 3, 1 }));
        TS(new wm_0((byte) 40, new byte[] { 3, 1, 2, 0 }));
        TS(new wm_0((byte) 41, new byte[] { 1, 3, 0, 2 }));
        TS(new wm_0((byte) 42, new byte[] { 0, 2, 1, 3 }));
        TS(new wm_0((byte) 43, new byte[] { 2, 1, 3, 0 }));
        TS(new wm_0((byte) 44, new byte[] { 3, 0, 2, 1 }));
        TS(new Sd0((byte) 45, (byte) 1, new nk_0[] { nk_0.G3, nk_0.kL0, null }));
        TS(new Sd0((byte) 45, (byte) 2, new nk_0[] { nk_0.uG0, nk_0.ZC, null }));
        for (byte b = 63; b <= 66; b++) {
            TS(new pd_1(b, new dd_1[] {
                new FP(b, (byte) 0, new nk_0[] { nk_0.ev }),
                new FP(b, (byte) 1, new nk_0[] { nk_0.LPt9 }),
                new FP(b, (byte) 3, new nk_0[] { nk_0.yD }),
                new FP(b, (byte) 2, new nk_0[] { nk_0.aA })
            }));
        }
        TS(new vt0_0(new nk_0[] { nk_0.yp0 }));
        TS(new KB0(new nk_0[] { nk_0.NL0 }));
        TS(new ue0_0(new nk_0[] { nk_0.uv0, nk_0.SJ, nk_0.oY, nk_0.MZ }));
        TS(new ci0_1(new nk_0[] { nk_0.CV }));
        TS(new m8(new nk_0[] { nk_0.uv0, nk_0.oY, nk_0.uv0, nk_0.SJ }));
        TS(new py_0(new nk_0[] { nk_0.uv0, nk_0.oY }));
        TS(new pt_0(new nk_0[] { nk_0.uv0, nk_0.oY, nk_0.SJ }));
        TS(new jl_1(new nk_0[] { nk_0.h50 }));
        for (byte b = 0; b <= 1; b++) {
            com8(b, (byte) 7).My0((byte) 1);
            com8(b, (byte) 8).My0((byte) 0);
            com8(b, (byte) 9).My0((byte) 2);
            com8(b, (byte) 10).My0((byte) 3);
            com8(b, (byte) 11).My0((byte) 0);
            com8(b, (byte) 53).My0((byte) 0);
            com8(b, (byte) 54).My0((byte) 0);
            com8(b, (byte) 55).My0((byte) 0);
            com8(b, (byte) 56).My0((byte) 0);
            com8(b, (byte) 57).My0((byte) 0);
            com8(b, (byte) 58).My0((byte) 0);
            com8(b, (byte) 59).My0((byte) 0);
            com8(b, (byte) 60).My0((byte) 0);
            com8(b, (byte) 61).My0((byte) 0);
            com8(b, (byte) 62).My0((byte) 0);
            com8(b, (byte) 64).My0((byte) 0);
            com8(b, (byte) 65).My0((byte) 1);
            com8(b, (byte) 66).My0((byte) 2);
            com8(b, (byte) 67).My0((byte) 3);
            com8(b, (byte) 68).My0((byte) 0);
            com8(b, (byte) 69).My0((byte) 1);
            com8(b, (byte) 70).My0((byte) 2);
            com8(b, (byte) 71).My0((byte) 3);
            com8(b, (byte) 72).My0((byte) 0);
            com8(b, (byte) 73).My0((byte) 1);
            com8(b, (byte) 74).My0((byte) 2);
            com8(b, (byte) 75).My0((byte) 3);
            com8(b, (byte) 77).My0((byte) 0);
            com8(b, (byte) 78).My0((byte) 1);
            com8(b, (byte) 79).My0((byte) 2);
            com8(b, (byte) 80).My0((byte) 3);
            com8(b, (byte) 12).oQ();
            com8(b, (byte) 63).oQ();
            com8(b, (byte) 76).oQ();
        }
        rA((byte) -1, new byte[] { 1, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24 });
        rA((byte) -2, new byte[] { 2, 6, 7, 8, 9, 10, 11, 12, 13, 18, 19, 45, 46 });
    }

    public final dd_1 vE0(byte i1, byte i2, byte i3) {
        return ((dd_1) this.jN[i1].BM(i2)).Qr(i3);
    }

    public final void rA(byte i1, byte... v2) {
        if (i1 == -1) {
            rA((byte) 0, v2);
            rA((byte) 1, v2);
            return;
        }
        if (i1 == -2) {
            rA((byte) 2, v2);
            rA((byte) 3, v2);
            rA((byte) 4, v2);
            return;
        }
        for (byte b : v2) {
            dd_1 dd = (dd_1) this.jN[i1].BM(b);
            if (dd != null) {
                dd.zA = true;
            }
        }
    }

    public final void Zi0(dd_1 v1) {
        this.jN[0].gE0(v1.eA, v1);
        this.jN[1].gE0(v1.eA, v1);
        v1.fX = true;
    }

    public final void TS(dd_1 v1) {
        this.jN[3].gE0(v1.eA, v1);
        this.jN[2].gE0(v1.eA, v1);
        this.jN[4].gE0(v1.eA, v1);
    }

    public final dd_1 com8(byte i1, byte i2) {
        return (dd_1) this.jN[i1].BM(i2);
    }
}
