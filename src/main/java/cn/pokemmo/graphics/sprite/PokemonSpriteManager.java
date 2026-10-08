package cn.pokemmo.graphics.sprite;

import f.*;


import com.badlogic.gdx.graphics.Color;

public class PokemonSpriteManager {
    public static final C8 Hz0 = new C8(0.0f, 0.0f, 0.0f);
    public static final AG0[] uC0;
    public static final Color so0 = Color.valueOf("#c2141d");
    // public static final yh_0 Xm0;
    public static final es_1 HG0;
    public static short BE = 0;

    public final SQ BN;
    public final SQ il0;
    public final SQ Y80;
    public SQ K90;
    public Wr dI0;
    public AG0[] hm0;
    public final pe0_0[] e80;
    public FJ iD0;

    public PokemonSpriteManager() {
        this.BN = new SQ();
        this.il0 = new SQ();
        this.Y80 = new SQ();
        this.K90 = null;
        this.dI0 = null;
        this.hm0 = null;
        this.e80 = new pe0_0[3];
    }

    public static void y60(i4_0 i4_0Var, Color color) {
        ld_0 ld_0Var = new ld_0();
        i4_0Var.getClass();
        i4_0Var.Je0 = Color.rgba8888(color.r, color.g, color.b, color.a);
        for (int i = 0; i < i4_0Var.XF.mB0; i++) {
            for (int i2 = 0; i2 < i4_0Var.XF.SH; i2++) {
                if ((i4_0Var.XF.iH0(i2, i) & 255) == 0) {
                    for (int i3 = -1; i3 < 2; i3++) {
                        for (int i4 = -1; i4 < 2; i4++) {
                            if ((i4_0Var.XF.iH0(i2 + i4, i + i3) & 255) != 0) {
                                ld_0Var.Vn(i2 | (i << 16));
                            }
                        }
                    }
                }
            }
        }
        zt_1 zt_1Var = i5 -> Bh0(i4_0Var, i5);
        byte[] bArr = ld_0Var.Ut;
        int[] iArr = ld_0Var.dH;
        int length = iArr.length;
        while (length-- > 0) {
            if (bArr[length] == 1 && !zt_1Var.g5(iArr[length])) {
                return;
            }
        }
    }

    public static yh_0 Dl0() {
        return yh_0.Xm0;
    }

    public static int tp(short s, boolean z, boolean z2, byte b, boolean z3, boolean z4) {
        if (z2 && s > 800 && s < 817) {
            s = 493;
        }
        int i = z ? 65536 : 0;
        int i2 = s + i;
        int i3 = z2 ? 131072 : 0;
        int i4 = i2 + i3;
        int i5 = b == 1 ? 262144 : 0;
        int i6 = i4 + i5;
        int i7 = z3 ? 524288 : 0;
        int i8 = i6 + i7;
        int i9 = z4 ? 1048576 : 0;
        return i8 + i9;
    }

    public static short ls() {
        return BE;
    }

    public static boolean Bh0(i4_0 i4_0Var, int i) {
        int i2 = i & 65535;
        int i3 = (i >> 16) & 65535;
        i4_0Var.XF.XS(i2, i3, i4_0Var.Je0);
        return true;
    }

    static {
        AG0 ag0 = AG0.HH0;
        uC0 = new AG0[]{ag0, ag0, ag0};
        Cq0.E1(PokemonSpriteManager.class);
        // Xm0 initialized in f.yh_0
        HG0 = new es_1();
        BE = 0;
    }

    public static short Ed(byte b, short s) {
        if (s == 1023) {
            return 697;
        }
        if (b < 1) {
            return s;
        }
        switch (s) {
            case 201:
                return (short) (b + 651);
            case 351:
                return (short) (b + 678);
            case 386:
                return (short) (b + 681);
            case 412:
                return (short) (b + 684);
            case 413:
                return (short) (b + 686);
            case 421:
                return 689;
            case 422:
                return 690;
            case 423:
                return 691;
            case 479:
                return (short) (b + 691);
            case 487:
                return 697;
            case 492:
                return 698;
            case 493:
                return (short) (b + 800);
            case 550:
                return 699;
            case 555:
                return 700;
            case 585:
                return (short) (b + 700);
            case 586:
                return (short) (b + 703);
            case 648:
                return 707;
            case 649:
                return (short) (b + 707);
            default:
                return s;
        }
    }

    public static int Ps0(short s, boolean z, byte b, boolean z2) {
        return tp(s, z, false, b, z2, false);
    }

    public final AG0[] Vo(short s, byte b, boolean z) {
        int tp = tp(s, false, false, b, z, false);
        ty0 ty0Var = (ty0) this.Y80.get(tp);
        if (s > 1000 && ty0Var == null) {
            ty0Var = (ty0) this.Y80.get(0);
        }
        if (ty0Var != null) {
            AG0[] sj = ty0Var.sj();
            if (sj != null) {
                for (AG0 ag0 : sj) {
                    ag0.f60.zz = true;
                }
                return sj;
            }
        }
        AG0[] res = (AG0[]) this.BN.get(tp);
        return res != null ? res : uC0;
    }

    public final AG0[] qC0(short s, byte b, boolean z) {
        int tp = tp(s, false, true, b, false, z);
        ty0 ty0Var = (ty0) this.Y80.get(tp(s, false, true, b, false, false));
        if (ty0Var != null) {
            AG0[] ag0Arr = (AG0[]) this.il0.get(tp);
            if (ag0Arr != null) {
                return ag0Arr;
            }
            Wr[] wrArr = new Wr[2];
            AG0[] ag0Arr2 = new AG0[2];
            for (int i = 0; i < 2; i++) {
                wrArr[i] = new Wr(new NK0(ty0Var, i, z));
                ag0Arr2[i] = new AG0(wrArr[i], 0, 0, -1, -1);
            }
            this.il0.j10(this.il0.yw0(tp), ag0Arr2);
            return ag0Arr2;
        }
        AG0[] ag0Arr3 = (AG0[]) this.BN.get(tp);
        if (ag0Arr3 != null) {
            return ag0Arr3;
        }
        return uC0;
    }

    public final C8 L4(short s, boolean z) {
        int tp = tp(s, false, false, (byte) 0, z, false);
        if (this.K90 != null && this.K90.l90(tp)) {
            return (C8) this.K90.get(tp);
        }
        return Hz0;
    }

    public final xt_0 P90(byte b, short s, boolean z, boolean z2) {
        int i = si0_0.Fz(s, 20, 18, z2 ? 1 : 0);
        if (s > 800 && s < 817) {
            i = ((s - 800) * 2) + 14251 + (z2 ? 1 : 0);
            s = 493;
        }
        if (this.iD0 == null || i < 0 || i >= this.iD0.size()) {
            return null;
        }
        try {
            Ae entry = this.iD0.GJ(i);
            if (entry == null || entry.Vh0 == 0) {
                return null;
            }
            Tt0 tt0 = new Tt0(entry);
            int i2 = s * 20;
            int i3 = i2 + (z ? 11 : 2);
            Ae GJ = this.iD0.GJ(i3 + (b == 1 ? 1 : 0));
            if (GJ == null || GJ.Vh0 == 0) {
                GJ = this.iD0.GJ(i2 + (z ? 11 : 2));
            }
            return new xt_0(
                tt0,
                new Gt0(GJ, true),
                new Rk0(this.iD0.GJ(i2 + (z ? 13 : 4)), false),
                new mm_1(this.iD0.GJ(i2 + (z ? 14 : 5)), true),
                new E3(this.iD0.GJ(i2 + (z ? 15 : 6))),
                new mm_1(this.iD0.GJ(i2 + (z ? 16 : 7)), false)
            );
        } catch (Exception e) {
            return null;
        }
    }

    public final boolean kJ(byte b, short s, boolean z, boolean z2) {
        int tp = tp(s, z, false, b, z2, false);
        ty0 ty0Var = (ty0) this.Y80.get(tp);
        if (ty0Var != null) {
            return ty0Var.tS();
        }
        return false;
    }

    public final int[] R6(byte b, short s, boolean z, boolean z2) {
        int tp = tp(s, z, false, b, z2, false);
        ty0 ty0Var = (ty0) this.Y80.get(tp);
        if (ty0Var != null) {
            return ty0Var.ag0();
        }
        return new int[1];
    }

    public final boolean ak0(byte b, short s, boolean z, boolean z2) {
        if (s >= 1000) {
            return true;
        }
        if (this.Y80.l90(tp(s, z, false, b, z2, false))) {
            return true;
        }
        int i = si0_0.Fz(s, 20, 18, z2 ? 1 : 0);
        if (s > 800 && s < 817) {
            i = ((s - 800) * 2) + 14251 + (z2 ? 1 : 0);
        }
        return this.iD0 == null || i < 0 || i >= this.iD0.size();
    }

    public final AG0[] Kr0(byte b, short s, boolean z, boolean z2) {
        if (z) {
            int tp = tp(s, true, false, b, z2, false);
            ty0 ty0Var = (ty0) this.Y80.get(tp);
            if (s > 1000 && ty0Var == null) {
                ty0Var = (ty0) this.Y80.get(0);
            }
            if (ty0Var != null) {
                AG0[] sj = ty0Var.sj();
                if (sj != null) {
                    for (AG0 ag0 : sj) {
                        ag0.f60.zz = true;
                    }
                    return sj;
                }
            }
            AG0[] res = (AG0[]) this.BN.get(tp);
            return res != null ? res : uC0;
        }
        return Vo(s, b, z2);
    }

    public final float hS(byte b, short s) {
        pe0_0 pe0_0Var = this.e80[b];
        if (pe0_0Var == null) {
            return 0.0f;
        }
        return pe0_0Var.EW(s);
    }

    public final void aux(short s, boolean z, boolean z2, byte b, ty0 ty0Var) {
        if (b >= 0 && b <= 1) {
            this.Y80.j10(this.Y80.yw0(tp(s, z, false, b, z2, false)), ty0Var);
        } else {
            this.Y80.j10(this.Y80.yw0(tp(s, z, false, (byte) 0, z2, false)), ty0Var);
            this.Y80.j10(this.Y80.yw0(tp(s, z, false, (byte) 1, z2, false)), ty0Var);
        }
    }

    public final void Qn(short s, byte b, ro_1 ro_1Var) {
        VU(s, b, (byte) 0, ro_1Var);
        VU(s, b, (byte) 1, ro_1Var);
    }

    public final void VU(short s, byte b, byte b2, ro_1 ro_1Var) {
        if (b >= 0 && b <= 1) {
            int tp = tp(s, false, true, b2, false, false);
            ty0 ty0Var = (ty0) this.Y80.get(tp);
            if (ty0Var == null) {
                ty0Var = new vm_1(ro_1Var);
                this.Y80.j10(this.Y80.yw0(tp), ty0Var);
            }
            vm_1 vm_1Var = (vm_1) ty0Var;
            if (b >= 0 && b < vm_1Var.UK0.length) {
                vm_1Var.UK0[b] = ro_1Var;
            }
        }
    }
}
