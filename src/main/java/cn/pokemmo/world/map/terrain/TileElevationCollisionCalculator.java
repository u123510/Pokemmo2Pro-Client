package cn.pokemmo.world.map.terrain;

import f.*;

public class TileElevationCollisionCalculator {
    public static final byte[] ve0;
    public static final byte[] ML0;
    public static final nt_1 pF;
    public static final TileElevationCollisionCalculator hO;
    public final nt_1[][] fy0;

    static {
        Cq0.E1(TileElevationCollisionCalculator.class);
        ve0 = new byte[] {0, 1};
        ML0 = new byte[] {3, 4};
        pF = new nt_1();
        hO = new TileElevationCollisionCalculator();
    }

    public TileElevationCollisionCalculator() {
        this.fy0 = new nt_1[11][256];
        WE((byte) 0, 2, new bv_2((byte) 0, 156));
        WE((byte) 1, 2, new bv_2((byte) 1, 250));
        WE((byte) 1, 3, new sl_2());
        WE((byte) 1, 10, new I00());
        WE((byte) 1, 14, new v3_0(false));
        WE((byte) 1, 15, new v3_0(false));
        byte[] bArr = ve0;
        pe0(bArr, 19, new Ir0());
        fm_0 fm_0Var = new fm_0();
        pe0(bArr, 23, fm_0Var);
        WE((byte) 1, 27, new az0_0(fm_0Var));
        pe0(bArr, 28, new HP(fm_0Var));
        WE((byte) 1, 32, new _transient());
        pe0(bArr, 33, new VQ());
        pe0(bArr, 35, new _transient());
        WE((byte) 0, 43, new VQ());
        pe0(bArr, 41, new v3_0(false));
        WE((byte) 1, 36, new e50_0());
        pe0(bArr, 48, new up0_0(new byte[] {3}));
        pe0(bArr, 49, new up0_0(new byte[] {2}));
        pe0(bArr, 50, new up0_0(new byte[] {1}));
        pe0(bArr, 51, new up0_0(new byte[] {0}));
        pe0(bArr, 52, new up0_0(new byte[] {1, 3}));
        pe0(bArr, 53, new up0_0(new byte[] {1, 2}));
        pe0(bArr, 54, new up0_0(new byte[] {0, 3}));
        pe0(bArr, 55, new up0_0(new byte[] {0, 3}));
        pe0(bArr, 56, new Q4((byte) 3));
        pe0(bArr, 57, new Q4((byte) 2));
        pe0(bArr, 59, new Q4((byte) 0));
        WE((byte) 1, 71, new _transient(0));
        hI hIVar = hI.To;
        WE((byte) 1, 80, hIVar);
        WE((byte) 1, 81, hIVar);
        WE((byte) 1, 82, hIVar);
        WE((byte) 1, 83, hIVar);
        pe0(bArr, 84, hIVar);
        pe0(bArr, 85, hIVar);
        pe0(bArr, 86, hIVar);
        pe0(bArr, 87, hIVar);
        nk_0 nk_0Var = nk_0.t20;
        pe0(bArr, 96, new v3_0(false, true, nk_0Var));
        pe0(bArr, 97, new v3_0(false));
        pe0(bArr, 98, new pf_2((byte) 3));
        pe0(bArr, 99, new pf_2((byte) 2));
        pe0(bArr, 100, new pf_2((byte) 1));
        pe0(bArr, 101, new pf_2((byte) 0));
        pe0(bArr, 102, new v3_0(false));
        pe0(bArr, 103, new v3_0(false));
        pe0(bArr, 104, new v3_0(false));
        pe0(bArr, 105, new v3_0(true, true, nk_0Var));
        pe0(bArr, 106, new mj0_2());
        pe0(bArr, 107, new gj0_1());
        WE((byte) 0, 108, new pf_2((byte) 3));
        WE((byte) 1, 108, new v3_0(false));
        WE((byte) 0, 109, new pf_2((byte) 2));
        WE((byte) 1, 109, new pf_2((byte) 0));
        WE((byte) 0, 110, new pf_2((byte) 3));
        nk_0 nk_0Var2 = nk_0.cOM9;
        WE((byte) 1, 110, new v3_0(false, false, nk_0Var2));
        pe0(bArr, 111, new pf_2((byte) 2));
        WE((byte) 1, 120, new Q1());
        pe0(bArr, 128, new WK());
        WE((byte) 1, 151, new WL0());
        WE((byte) 1, 157, new WL0());
        WE((byte) 1, 145, new WL0());
        WE((byte) 1, 147, new WL0());
        WE((byte) 1, 149, new WL0());
        WE((byte) 1, 155, new WL0());
        WE((byte) 1, 153, new WL0());
        WE((byte) 1, 184, new J9());
        WE((byte) 1, 185, new up0_0(new byte[] {1, 0, 3, 2}));
        WE((byte) 1, 187, new U00());
        WE((byte) 1, 189, new PR());
        WE((byte) 1, 190, new B10());
        WE((byte) 1, 193, new up0_0(new byte[] {2, 3}));
        WE((byte) 1, 208, new F4());
        WE((byte) 0, 209, new bv_2((byte) 0, 156));
        WE((byte) 1, 209, new Bu0());
        WE((byte) 1, 210, new ed_1());
        WE((byte) 1, 211, new kk_0(false));
        WE((byte) 1, 212, new kk_0(true));
        WE((byte) 1, 213, new kk_0(false));
        WE((byte) 1, 214, new kk_0(true));
        WE((byte) 0, 142, new qc_1());
        WE((byte) 1, 231, new qc_1());
        WE((byte) 2, 81, new up0_0(new byte[] {3}));
        WE((byte) 2, 82, new up0_0(new byte[] {2}));
        WE((byte) 2, 83, new up0_0(new byte[] {1}));
        WE((byte) 2, 84, new up0_0(new byte[] {0}));
        WE((byte) 2, 114, new Q4((byte) 3));
        WE((byte) 2, 115, new Q4((byte) 2));
        WE((byte) 2, 116, new Q4((byte) 1));
        WE((byte) 2, 117, new Q4((byte) 0));
        WE((byte) 2, 163, new fh_0());
        WE((byte) 2, 212, new WK());
        WE((byte) 2, 4, new e3_0((byte) 2, 1, false));
        WE((byte) 2, 5, new e3_0((byte) 2, 1, true));
        WE((byte) 2, 6, new e3_0((byte) 2, 6, false));
        WE((byte) 2, 7, new e3_0((byte) 2, 6, true));
        WE((byte) 2, 8, new ua_2((byte) 2, 11));
        WE((byte) 2, 9, new ua_2((byte) 2, 15));
        WE((byte) 2, 16, new _transient());
        WE((byte) 2, 20, new eh_1());
        WE((byte) 2, 23, new au_0());
        WE((byte) 2, 24, new _transient());
        WE((byte) 2, 33, new e3_0((byte) 2, 1, false, false));
        WE((byte) 2, 34, new e3_0((byte) 2, 6, false, false));
        cy0_0 cy0_0Var = cy0_0.Mm;
        WE((byte) 2, 25, new dt_2(cy0_0Var));
        WE((byte) 2, 11, new dt_2(cy0_0Var));
        WE((byte) 2, 35, new dt_2(cy0_0Var));
        WE((byte) 2, 12, new dt_2(cy0_0.Vr0));
        cy0_0 cy0_0Var2 = cy0_0.Kt0;
        WE((byte) 2, 14, new dt_2(cy0_0Var2));
        WE((byte) 2, 2, new dt_2());
        WE((byte) 2, 64, new xm_2());
        WE((byte) 2, 65, new BE0());
        WE((byte) 2, 68, new BE0());
        WE((byte) 2, 28, new eh_1());
        WE((byte) 2, 124, new ih0_1());
        WE((byte) 2, 148, hIVar);
        WE((byte) 2, 149, hIVar);
        WE((byte) 2, 150, hIVar);
        WE((byte) 2, 151, hIVar);
        WE((byte) 2, 160, new G());
        WE((byte) 2, 161, new G());
        WE((byte) 2, 164, new _transient());
        WE((byte) 2, 165, new _transient());
        WE((byte) 2, 166, new _transient());
        WE((byte) 2, 167, new _transient());
        WE((byte) 2, 168, new _transient());
        WE((byte) 2, 190, new ta_1());
        WE((byte) 2, 191, new I00());
        WE((byte) 3, 2, new e3_0((byte) 3, 0, false));
        WE((byte) 3, 3, new ua_2((byte) 3, 8));
        WE((byte) 4, 2, new e3_0((byte) 4, 25, false));
        WE((byte) 4, 3, new ua_2((byte) 4, 21));
        byte[] bArr2 = ML0;
        pe0(bArr2, 48, new up0_0(new byte[] {3}));
        pe0(bArr2, 49, new up0_0(new byte[] {2}));
        pe0(bArr2, 22, new eh_1());
        pe0(bArr2, 23, new au_0());
        pe0(bArr2, 29, new eh_1());
        pe0(bArr2, 32, new _transient());
        pe0(bArr2, 33, new dt_2(cy0_0Var));
        pe0(bArr2, 75, new t80_0());
        pe0(bArr2, 76, new t80_0());
        pe0(bArr2, 56, new Q4((byte) 3));
        pe0(bArr2, 57, new Q4((byte) 2));
        pe0(bArr2, 59, new Q4((byte) 0));
        WE((byte) 4, 60, new ut0_0((byte) 1, (byte) 1, new nk_0[0]).an0(nk_0Var));
        WE((byte) 4, 61, new ut0_0((byte) 0, (byte) 0, new nk_0[0]));
        WE((byte) 4, 62, new ut0_0((byte) 1, (byte) -1, new nk_0[0]).an0(nk_0Var));
        pe0(bArr2, 64, hIVar);
        pe0(bArr2, 65, hIVar);
        pe0(bArr2, 66, hIVar);
        pe0(bArr2, 67, hIVar);
        pe0(bArr2, 73, new up0_0(new byte[] {1, 0}));
        pe0(bArr2, 74, new up0_0(new byte[] {3, 2}));
        pe0(bArr2, 90, new K20((byte) 1));
        pe0(bArr2, 91, new K20((byte) 1));
        pe0(bArr2, 92, new K20((byte) 3));
        pe0(bArr2, 93, new K20((byte) 3));
        pe0(bArr2, 94, new ut0_0((byte) 0, (byte) 3, new nk_0[] {nk_0.lpT8, nk_0.lpT8}));
        pe0(bArr2, 95, new ut0_0((byte) 0, (byte) 2, new nk_0[] {nk_0.pM, nk_0.pM}));
        pe0(bArr2, 98, new ut0_0((byte) 0, (byte) 3, new nk_0[0]));
        pe0(bArr2, 99, new ut0_0((byte) 0, (byte) 2, new nk_0[0]));
        pe0(bArr2, 101, new ut0_0((byte) 0, (byte) 0, new nk_0[0]));
        pe0(bArr2, 103, new rw_0());
        pe0(bArr2, 105, new ut0_0((byte) 1, (byte) 1, new nk_0[] {nk_0Var2}).Con().an0(nk_0Var));
        pe0(bArr2, 106, new f60_0().fv0(nk_0Var));
        pe0(bArr2, 107, new f60_0());
        pe0(bArr2, 108, new ut0_0((byte) 0, (byte) 3, new nk_0[0]));
        pe0(bArr2, 109, new ut0_0((byte) 0, (byte) 2, new nk_0[0]));
        pe0(bArr2, 110, new ut0_0((byte) 1, (byte) 1, new nk_0[] {nk_0Var2}).an0(nk_0Var));
        pe0(bArr2, 111, new ut0_0((byte) 0, (byte) 0, new nk_0[0]));
        pe0(bArr2, 118, new DJ());
        pe0(bArr2, 122, new DJ());
        pe0(bArr2, 128, new WK());
        pe0(bArr2, 161, new ei0_2(250, 0.16f));
        pe0(bArr2, 162, new ei0_2(500, 0.18f));
        pe0(bArr2, 163, new ei0_2(750, 0.22f));
        WE((byte) 3, 164, new com3__1(false, 0.16f, false));
        WE((byte) 4, 164, new HL0());
        pe0(bArr2, 165, new com3__1(true, 0.18f, false));
        pe0(bArr2, 166, new com3__1(false, 0.16f, true));
        pe0(bArr2, 167, new com3__1(true, 0.18f, true));
        pe0(bArr2, 168, new dt_2(cy0_0Var2));
        pe0(bArr2, 169, new dt_2(cy0_0Var2));
        pe0(bArr2, 215, new com5__0((byte) 3));
        pe0(bArr2, 216, new com5__0((byte) 2));
        pe0(bArr2, 217, hIVar);
        pe0(bArr2, 218, hIVar);
    }

    public final void pe0(byte[] bArr, int i, nt_1 nt_1Var) {
        for (byte b : bArr) {
            WE(b, i, nt_1Var);
        }
    }

    public final void WE(byte b, int i, nt_1 nt_1Var) {
        if (b == 2) {
            WE((byte) 10, i, nt_1Var);
        }
        if (this.fy0[b][i] == null) {
            this.fy0[b][i] = nt_1Var;
            return;
        }
        StringBuilder go = CO.go("Overwriting behavior ", b, " ");
        String upperCase = Integer.toHexString((byte) i).toUpperCase();
        if (upperCase.length() == 8 && upperCase.startsWith("FFFFFF")) {
            upperCase = upperCase.substring(6);
        }
        while (upperCase.length() < 2) {
            upperCase = "0".concat(upperCase);
        }
        throw new RuntimeException(go.append("0x".concat(upperCase)).toString());
    }
}
