package cn.pokemmo.ui.widget.menu;

import f.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class ItemSlotContextMenuBuilder {
    public static final yo_0 zy0;
    public static final yo_0 uR;
    public static final yo_0 lU;
    public static final yo_0 k0;

    static {
        zy0 = (o) -> Jj((K5) o);
        uR = (o) -> px0((K5) o);
        yo_0 unused = (o) -> nx0((K5) o);
        lU = (o) -> nM((K5) o);
        k0 = (o) -> d80((K5) o);
    }

    public static Vt0 yx0(cg_0 v0) {
        Vt0 v1 = new Vt0();
        for (Object obj : tw0_0.rl.q50.lx.values()) {
            GR v3 = (GR) obj;
            cd0_2 qb0 = v3.QB0;
            v1.hx.add(new sw_1(qb0.DR, qb0, () -> r60(v0, v3)));
        }
        pk_0 pk = tw0_0.rl.xI0;
        if (pk != null) {
            for (ce0_0 v5 : pk.UH()) {
                if (!tw0_0.rl.q50.lx.containsKey(v5.YX)) {
                    cd0_2 gg0 = v5.GG0;
                    v1.hx.add(new sw_1(gg0.DR, gg0, () -> tm(v0, v5)));
                }
            }
        }
        if (v1.hx.size() == 0) {
            v1.hx.add(new at_0("--"));
        }
        return v1;
    }

    public static Vt0 S20(lpt4__1 v0, yo_0 v1, boolean z) {
        v0.getClass();
        return De0((o) -> v0.UR((K5) o), v1, z);
    }

    public static Vt0 De0(k_0 v0, yo_0 v1, boolean z) {
        Vt0 v3 = new Vt0(sm0_0.c0(l5_0.B9.ni));
        for (l5_0 v7 : l5_0.Oy) {
            int i8;
            switch (v7.ordinal()) {
                case 0:
                    i8 = 5436;
                    break;
                case 1:
                    i8 = 5476;
                    break;
                case 2:
                    i8 = 5004;
                    break;
                case 3:
                    i8 = 5252;
                    break;
                case 4:
                    i8 = 5155;
                    break;
                case 5:
                default:
                    i8 = 5459;
                    break;
                case 6:
                    i8 = 5017;
                    break;
                case 7:
                    i8 = 5057;
                    break;
            }
            Wr v8 = gh_1.aH0.Jg((short) i8, false);
            r7 v9 = new r7(sm0_0.c0(v7.ni), v8);
            byte b8 = tw0_0.e60.Com4;
            ArrayList<K5> v10 = new ArrayList<>();
            for (K5 v14 : tw0_0.rl.Bb(tw0_0.rl.u40).KL()) {
                if (v1 != null && !v1.mF0(v14)) {
                    continue;
                }
                if (v14.cL.Yt0 == v7) {
                    byte ps = v14.nn.Ps;
                    if (ps == b8 || ps == -1) {
                        v10.add(v14);
                    }
                }
            }
            if (!v10.isEmpty()) {
                v3.hx.add(v9);
                Collections.sort(v10, pv0_0::Ck0);
                for (K5 v8_2 : v10) {
                    String str = v8_2.nn.PA0 + "x " + v8_2.Ua();
                    Wr icon = gh_1.aH0.F10(v8_2.cL, false);
                    v9.hx.add(new kf0_1(str, icon, 3, 3, 24, 24, () -> YA0(v0, v8_2), false));
                }
            }
        }
        if (v3.hx.size() < 1) {
            v3.mA0(sm0_0.c0(6007), null);
        }
        if (v3.hx.size() > 0 && z) {
            v3.hx.add(new at_0(sm0_0.c0(1656), () -> vm(v0)));
        }
        return v3;
    }

    public static Vt0 A80(sg_2 v0, Mj v1) {
        k_0 cb = (o) -> zc0(v0, v1, (VU) o);
        ArrayList<VU> list = new ArrayList<>();
        for (short i4 = 0; i4 < v1.V2(); i4++) {
            VU vu = v1.Ry0(i4);
            if (vu != null) {
                list.add(vu);
            }
        }
        return ce(cb, list, false);
    }

    public static Vt0 instanceof$(sg_2 v0, List list, boolean z) {
        return ce((o) -> e70(v0, (VU) o), list, z);
    }

    public static Vt0 ce(k_0 v0, List list, boolean z) {
        Vt0 v1 = new Vt0(sm0_0.c0(0));
        for (Object obj : list) {
            VU v4 = (VU) obj;
            String name = v4.na0();
            AG0 ag0 = yh_0.Xm0.qC0(v4.I8.Kr(), v4.Dg0(), v4.I8.aR())[0];
            v1.hx.add(new kf0_1(name, ag0, -6, 0, 0, () -> I8(v0, v4)));
        }
        if (v1.hx.size() < 1) {
            v1.mA0(sm0_0.c0(6007), null);
        }
        if (v1.hx.size() > 0 && z) {
            v1.hx.add(new at_0(sm0_0.c0(1656), () -> uc(v0)));
        }
        return v1;
    }

    public static /* synthetic */ void uc(k_0 v0) {
        v0.PP(null);
    }

    public static /* synthetic */ void I8(k_0 v0, VU v1) {
        v0.PP(v1);
    }

    public static void e70(sg_2 v0, VU v1) {
        Mj v2 = v1 != null ? tw0_0.rl.r1(v1.I8.JF) : null;
        if (v2 != null && v2.Jn0 == _volatile.Ic) {
            throw new IllegalArgumentException();
        }
        sg_2 v3;
        if (v2 != null) {
            v3 = new jb0_0(v2, v1.I8.ou0);
        } else {
            v3 = new mi_0(v1);
        }
        v0.G9(v3);
    }

    public static void zc0(sg_2 v0, Mj v1, VU v2) {
        if (v1 != null && v1.Jn0 == _volatile.Ic) {
            throw new IllegalArgumentException();
        }
        sg_2 v3;
        if (v1 != null) {
            v3 = new jb0_0(v1, v2.I8.ou0);
        } else {
            v3 = new mi_0(v2);
        }
        v0.G9(v3);
    }

    public static /* synthetic */ void vm(k_0 v0) {
        v0.PP(null);
    }

    public static /* synthetic */ void YA0(k_0 v0, K5 v1) {
        v0.PP(v1);
    }

    public static /* synthetic */ int Ck0(K5 v0, K5 v1) {
        int i2 = String.CASE_INSENSITIVE_ORDER.compare(v0.Fh0(), v1.Fh0());
        if (i2 == 0) {
            i2 = v0.Fh0().compareTo(v1.Fh0());
        }
        return i2;
    }

    public static void tm(cg_0 v0, ce0_0 v1) {
        v0.mm(v1.oV().DR);
    }

    public static void r60(cg_0 v0, GR v1) {
        v0.mm(v1.oV().DR);
    }

    public static boolean d80(K5 v0) {
        if (!v0.cL.TL()) {
            return false;
        }
        return lU.mF0(v0);
    }

    public static boolean nM(K5 v0) {
        mc0_1 cL = v0.cL;
        l5_0 yt0 = cL.Yt0;
        if (yt0 == l5_0.Jy || yt0 == l5_0.Hj) {
            return false;
        }
        if (cL.nI()) {
            return false;
        }
        short wQ = v0.nn.wQ;
        if (wQ == 1 || wQ == 5001 || wQ == 1132) {
            return false;
        }
        return v0.cL.ii0;
    }

    public static boolean nx0(K5 v0) {
        return n70_0.xg.bL0(X4.gA0(v0.nn.wQ));
    }

    public static boolean px0(K5 v0) {
        return v0.cL.TL();
    }

    public static boolean Jj(K5 v0) {
        mc0_1 cL = v0.cL;
        return cL.TL() && !cL.M80;
    }
}
