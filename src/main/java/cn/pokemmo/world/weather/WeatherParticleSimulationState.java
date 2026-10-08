package cn.pokemmo.world.weather;

import f.*;

import java.util.ArrayList;

public abstract class WeatherParticleSimulationState {
    public static final dl_1 fC;
    public static final S70[] x3;
    public static final cn_0[] Ft;

    public static boolean hA(le0_2 v0, Class<?> v1) {
        if (v0 != null) {
            KU ku = v0.t30;
            le0_2[] arr = (le0_2[]) ku.pa();
            int i3 = 0;
            try {
                int len = ku.KB;
                while (i3 < len) {
                    if (v1.isInstance(arr[i3])) {
                        return true;
                    }
                    i3++;
                }
            } finally {
                ku.Gj0();
            }
        }
        return false;
    }

    public static le0_2 tK0(le0_2 v0, Class<?> v1) {
        if (v0 != null) {
            KU ku = v0.t30;
            le0_2[] arr = (le0_2[]) ku.pa();
            int i3 = 0;
            try {
                int len = ku.KB;
                while (i3 < len) {
                    le0_2 child = arr[i3];
                    if (v1.isInstance(child)) {
                        return child;
                    }
                    i3++;
                }
            } finally {
                ku.Gj0();
            }
        }
        return null;
    }

    public static S70[] dq0(mc0_1 v0) {
        int i1;
        int i2;
        if (tw0_0.kz0()) {
            i1 = 32;
            i2 = 32;
        } else {
            i1 = 16;
            i2 = 16;
        }
        X90 v3 = v0.Iq;
        ArrayList<S70> v4 = new ArrayList<>();
        NA0 v5 = v0.wX;

        if (v5 == NA0.X10) {
            S70 v6 = (S70) new S70(i1, i2, 0).og.r8(new LPT6_[]{fn_0.qz0().zH[3]});
            v6.yj0 = sm0_0.c0(19953);
            v6.yB0();
            v6.GH0 = 250;
            if (tw0_0.kz0()) {
                v6.og.EJ0 = 2.0f;
                v6.og.gY = 0;
                v6.og.a4 = -10;
            } else {
                v6.og.gY = 0;
                v6.og.a4 = -2;
            }
            v4.add(v6);
        }

        if (v5 == NA0.rD0) {
            S70 v6 = (S70) new S70(i1, i2, 0).og.r8(new LPT6_[]{fn_0.qz0().zH[4]});
            v6.yj0 = sm0_0.c0(19958);
            v6.yB0();
            v6.GH0 = 250;
            if (tw0_0.kz0()) {
                v6.og.EJ0 = 2.0f;
                v6.og.gY = 0;
                v6.og.a4 = -10;
            } else {
                v6.og.gY = 0;
                v6.og.a4 = -2;
            }
            v4.add(v6);
        }

        if (v5.Zq0 || v5 == NA0.om0 || v5 == NA0.n90) {
            S70 v6 = (S70) new S70(i1, i2, 0).og.r8(new LPT6_[]{fn_0.qz0().zH[5]});
            v6.yj0 = sm0_0.c0(19955);
            v6.yB0();
            v6.GH0 = 250;
            if (tw0_0.kz0()) {
                v6.og.EJ0 = 2.0f;
                v6.og.gY = 0;
                v6.og.a4 = -10;
            } else {
                v6.og.gY = 0;
                v6.og.a4 = -2;
            }
            v4.add(v6);
        }

        switch (VG0.DE0[v5.g20]) {
            case 1:
            case 2:
            case 3:
            case 4:
                S70 v6 = (S70) new S70(i1, i2, 0).og.r8(new LPT6_[]{fn_0.qz0().zH[6]});
                v6.yj0 = sm0_0.c0(19956);
                v6.yB0();
                v6.GH0 = 250;
                if (tw0_0.kz0()) {
                    v6.og.EJ0 = 2.0f;
                    v6.og.gY = 0;
                    v6.og.a4 = -10;
                } else {
                    v6.og.gY = 0;
                    v6.og.a4 = -2;
                }
                v4.add(v6);
                break;
        }

        if (v5 == NA0.oH || v5 == NA0.P5) {
            S70 v5_s70 = (S70) new S70(i1, i2, 0).og.r8(new LPT6_[]{fn_0.qz0().zH[4]});
            tu_0 v6_tu = v0.vJ0;
            if (v6_tu != null) {
                v5_s70.yj0 = sm0_0.wa0(19964, v6_tu.toString());
                v5_s70.yB0();
            } else {
                v5_s70.yj0 = sm0_0.c0(19954);
            }
            v5_s70.GH0 = 250;
            if (tw0_0.kz0()) {
                v5_s70.og.EJ0 = 2.0f;
                v5_s70.og.gY = 0;
                v5_s70.og.a4 = -10;
            } else {
                v5_s70.og.gY = 0;
                v5_s70.og.a4 = -2;
            }
            v4.add(v5_s70);
        }

        if (v3 == null) {
            fC.error("Undefined addon for item template {} {}", new Object[]{sm0_0.c0(v0.Nl), Short.valueOf(v0.Z8), new RuntimeException()});
            return x3;
        }

        if (v3.yt()) {
            S70 v0_s = (S70) new S70(i1, i2, 0).og.r8(new LPT6_[]{fn_0.qz0().zH[0]});
            v0_s.yj0 = sm0_0.c0(19950);
            v0_s.yB0();
            v0_s.GH0 = 250;
            if (tw0_0.kz0()) {
                v0_s.og.EJ0 = 2.0f;
                v0_s.og.gY = 0;
                v0_s.og.a4 = -10;
            } else {
                v0_s.og.gY = 0;
                v0_s.og.a4 = -2;
            }
            v4.add(v0_s);
        }

        if (v3.wk(512)) {
            S70 v0_s = (S70) new S70(i1, i2, 0).og.r8(new LPT6_[]{fn_0.qz0().zH[1]});
            v0_s.yj0 = sm0_0.c0(19951);
            v0_s.yB0();
            v0_s.GH0 = 250;
            if (tw0_0.kz0()) {
                v0_s.og.EJ0 = 2.0f;
                v0_s.og.gY = 0;
                v0_s.og.a4 = -10;
            } else {
                v0_s.og.gY = 0;
                v0_s.og.a4 = -2;
            }
            v4.add(v0_s);
        }

        if (v3.wk(8)) {
            S70 v0_s = (S70) new S70(i1, i2, 0).og.r8(new LPT6_[]{fn_0.qz0().zH[2]});
            v0_s.yj0 = sm0_0.c0(19952);
            v0_s.yB0();
            v0_s.GH0 = 250;
            if (tw0_0.kz0()) {
                v0_s.og.EJ0 = 2.0f;
                v0_s.og.gY = 0;
                v0_s.og.a4 = -10;
            } else {
                v0_s.og.gY = 0;
                v0_s.og.a4 = -2;
            }
            v4.add(v0_s);
        }

        if (v3.wk(16384)) {
            S70 v0_s = (S70) new S70(i1, i2, 0).og.r8(new LPT6_[]{fn_0.qz0().zH[7]});
            v0_s.yj0 = sm0_0.c0(19957);
            v0_s.yB0();
            v0_s.GH0 = 250;
            if (tw0_0.kz0()) {
                v0_s.og.EJ0 = 2.0f;
                v0_s.og.gY = 0;
                v0_s.og.a4 = -10;
            } else {
                v0_s.og.gY = 0;
                v0_s.og.a4 = -2;
            }
            v4.add(v0_s);
        }

        if (v3.wk(32768)) {
            S70 v0_s = (S70) new S70(i1, i2, 0).og.r8(new LPT6_[]{fn_0.qz0().zH[8]});
            v0_s.yj0 = sm0_0.c0(19966);
            v0_s.yB0();
            v0_s.GH0 = 250;
            if (tw0_0.kz0()) {
                v0_s.og.EJ0 = 2.0f;
                v0_s.og.gY = 0;
                v0_s.og.a4 = -10;
            } else {
                v0_s.og.gY = 0;
                v0_s.og.a4 = -2;
            }
            v4.add(v0_s);
        }

        if (v4.isEmpty()) {
            return x3;
        }
        return v4.toArray(new S70[0]);
    }

    public static cn_0[] eV(mc0_1 v0) {
        X90 v1 = v0.Iq;
        NA0 v2 = v0.wX;
        ArrayList<cn_0> v3 = new ArrayList<>();

        if (v2 == NA0.X10) {
            cn_0 v4 = new cn_0(null, 0);
            v4.Sk(sm0_0.c0(19953));
            v3.add(v4);
        }

        if (v2 == NA0.rD0) {
            cn_0 v4 = new cn_0(null, 0);
            v4.Sk(sm0_0.c0(19958));
            v3.add(v4);
        }

        if (v2.Zq0) {
            cn_0 v4 = new cn_0(null, 0);
            v4.Sk(sm0_0.c0(19955));
            v3.add(v4);
        }

        switch (VG0.DE0[v2.g20]) {
            case 1:
            case 2:
            case 3:
            case 4:
                cn_0 v4 = new cn_0(null, 0);
                v4.Sk(sm0_0.c0(19956));
                v3.add(v4);
                break;
        }

        if (v2 == NA0.om0 || v2 == NA0.n90) {
            String v4 = "";
            short i5 = v0.Z8;
            if (i5 == 4675) {
                v4 = sm0_0.c0(19986);
            } else {
                switch (i5) {
                    case 3373:
                    case 3374:
                        v4 = sm0_0.c0(19989);
                        break;
                    case 3375:
                        v4 = sm0_0.c0(7950);
                        break;
                }
            }
            cn_0 v5 = new cn_0(null, 0);
            v5.Sk(sm0_0.wa0(19959, v4));
            v3.add(v5);
        }

        if (v2 == NA0.oH || v2 == NA0.P5) {
            cn_0 v2_cn;
            if (v0.vJ0 != null) {
                v2_cn = new cn_0(null, 0);
                v2_cn.Sk(sm0_0.wa0(19964, v0.vJ0.toString()));
            } else {
                v2_cn = new cn_0(null, 0);
                v2_cn.Sk(sm0_0.c0(19954));
            }
            v3.add(v2_cn);
        }

        if (v1.yt()) {
            cn_0 v0_cn = new cn_0(null, 0);
            v0_cn.Sk(sm0_0.c0(19950));
            v3.add(v0_cn);
        }

        if (v1.wk(512)) {
            cn_0 v0_cn = new cn_0(null, 0);
            v0_cn.Sk(sm0_0.c0(19951));
            v3.add(v0_cn);
        }

        if (v1.wk(8)) {
            cn_0 v0_cn = new cn_0(null, 0);
            v0_cn.Sk(sm0_0.c0(19952));
            v3.add(v0_cn);
        }

        if (v1.wk(16384)) {
            cn_0 v0_cn = new cn_0(null, 0);
            v0_cn.Sk(sm0_0.c0(19957));
            v3.add(v0_cn);
        }

        if (v1.wk(32768)) {
            cn_0 v0_cn = new cn_0(null, 0);
            v0_cn.Sk(sm0_0.c0(19966));
            v3.add(v0_cn);
        }

        if (v3.isEmpty()) {
            return Ft;
        }
        return v3.toArray(new cn_0[0]);
    }

    public static Exception Tq() {
        jn_0 v0 = tw0_0.LD0;
        if (v0 == null) {
            return null;
        }
        try {
            v0.ba0(dw_2.tG(dw_2.zs));
            Qy0.yI0.dk(-1, "Theme reloaded.");
            return null;
        } catch (Exception v0_ex) {
            v0_ex.printStackTrace();
            Qy0 v1 = Qy0.yI0;
            StringBuilder v2 = new StringBuilder("Error reloading the theme.\nCaused by: ");
            String v3 = (v0_ex.getCause() != null) ? v0_ex.getCause().getMessage() : v0_ex.getMessage();
            v2.append(v3);
            v1.dk(-1, v2.toString());
            return v0_ex;
        }
    }

    static {
        fC = Cq0.E1(WeatherParticleSimulationState.class);
        x3 = new S70[0];
        Ft = new cn_0[0];
    }
}
