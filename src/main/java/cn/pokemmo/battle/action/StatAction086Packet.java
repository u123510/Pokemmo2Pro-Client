package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class StatAction086Packet extends Nt implements eb0_0 {
    public final byte pp0;
    public final gc_2 Eb;
    public final short Pg;

    public StatAction086Packet(byte b) {
        if (LPt8(b) || Lm(b)) {
            throw new IllegalArgumentException();
        }
        this.pp0 = b;
        this.Eb = null;
        this.Pg = 0;
    }

    public StatAction086Packet(gc_2 gc, byte b) {
        if (!LPt8(b)) {
            throw new IllegalArgumentException();
        }
        this.pp0 = b;
        this.Eb = gc;
        this.Pg = 0;
    }

    public StatAction086Packet(byte b, short s) {
        if (!Lm(b)) {
            throw new IllegalArgumentException();
        }
        this.pp0 = b;
        this.Eb = null;
        this.Pg = s;
    }

    public static boolean LPt8(byte b) {
        return b == 19 || b == 21;
    }

    public static boolean Lm(byte b) {
        return b == 20 || b == 4 || b == 6;
    }

    public static void bX(ML0 ml0, PF pf) {
        ml0.lZ.add(new kw_0(new or_2(pf).us()));
    }

    public static void lPt9(ML0 ml0, PF pf) {
        ml0.lZ.add(new kw_0(new ck0_0(pf).us()));
    }

    public static void F9(PF pf, ML0 ml0, PF pf2) {
        if (pf.y3(i40_0.z2)) {
            ml0.lZ.add(new kw_0(new qs0_0(pf2).vv(pf).us()));
        } else {
            ml0.lZ.add(new kw_0(new Cm0(pf2).vv(pf).us()));
        }
    }

    public static void Ws(ML0 ml0, PF pf) {
        ml0.lZ.add(new kw_0(new QP(pf).us()));
    }

    public static void qj(ML0 ml0, PF pf) {
        ml0.lZ.add(new kw_0(new QP(pf).us()));
    }

    public static void Pw(PF pf) {
        gc_2[] gcArr = gc_2.mi;
        int length = gcArr.length;
        for (int i = 0; i < length; i++) {
            gc_2 gc = gcArr[i];
            byte b = pf.sL0[gc.v10];
            if (b < 0) {
                pf.Mt(gc, (byte) (b * -1));
            }
        }
        pf.r10.Wb();
        tw0_0.LD0.he0.N10.lZ.add(new kw_0(new km_0(pf, true)));
    }

    public static void Pr0(ML0 ml0, PF pf) {
        ml0.lZ.add(new kw_0(new bq_2(pf).us()));
    }

    public final byte BL0() {
        return 86;
    }

    public final void IE0(PF v1, PF v2, boolean i3, boolean i4, short i5, boolean i6, ML0 v7, qn_1 v8) {
        switch (this.pp0) {
            case 0:
                v7.wJ(sm0_0.fg0((byte) 2, lpt6__2.Q80, 14, v7.yd0.QX(24, v2), new String[]{v2.A60()}), "", null);
                break;
            case 1:
                v7.wJ(sm0_0.fg0((byte) 2, lpt6__2.Q80, 14, v7.yd0.QX(15, v2), new String[]{v2.A60()}), "", null);
                break;
            case 2:
                v7.wJ(sm0_0.wa0(200416, v2.A60()), "", null);
                break;
            case 3:
                v7.I1(sm0_0.wa0(200489, v2.A60()), "", null);
                v7.lZ.add(new kw_0(new ZA(v2).us()));
                break;
            case 4:
                v7.wJ(sm0_0.Bx(200587, new String[]{v2.A60(), sm0_0.c0(210000 + this.Pg)}), "", null);
                break;
            case 5:
                v7.wJ(sm0_0.wa0(200489, v2.A60()), "", null);
                break;
            case 6:
                v7.wJ(sm0_0.Bx(200587, new String[]{v2.A60(), sm0_0.c0(110000 + this.Pg)}), "", null);
                break;
            case 7:
                v7.wJ(sm0_0.wa0(200499, v2.A60()), "", null);
                break;
            case 8:
                v7.wJ(sm0_0.fg0((byte) 2, lpt6__2.Q80, 14, v7.yd0.eH0(651, v1, v2), new String[]{v1.A60(), v2.A60()}), "", () -> Pr0(v7, v2));
                break;
            case 9:
                v7.wJ(sm0_0.wa0(16807032, v2.A60()), "", () -> Pw(v2));
                break;
            case 10:
                v7.wJ(sm0_0.wa0(16807033, v2.A60()), "", () -> qj(v7, v2));
                break;
            case 11:
                v7.wJ(sm0_0.wa0(16807034, v2.A60()), "", () -> Ws(v7, v2));
                break;
            case 12:
                v7.wJ(sm0_0.wa0(16807035, v2.A60()), "", null);
                break;
            case 13:
                v7.wJ(sm0_0.fg0((byte) 2, lpt6__2.Q80, 14, v7.yd0.QX(369, v2), new String[]{v2.A60()}), "", () -> F9(v2, v7, v1));
                break;
            case 14:
                v7.wJ(sm0_0.wa0(16807040, v1.A60()), "", null);
                break;
            case 15:
                v7.wJ(sm0_0.wa0(16807041, v2.A60()), "", () -> lPt9(v7, v2));
                break;
            case 16:
                v7.wJ(sm0_0.wa0(16807042, v1.A60()), "", null);
                break;
            case 17:
                v7.wJ(sm0_0.wa0(16807043, v2.A60()), "", () -> bX(v7, v2));
                break;
            case 18:
                v7.wJ(sm0_0.wa0(200513, v2.A60()), "", null);
                break;
            case 19:
                v7.wJ(sm0_0.Bx(200524, new String[]{v2.A60(), this.Eb.toString()}), "", null);
                break;
            case 20:
                v7.wJ(sm0_0.Bx(16807044, new String[]{v2.A60(), sm0_0.c0(gu0.l2.lPT6(this.Pg).Nl)}), "", null);
                break;
            case 21:
                v7.wJ(sm0_0.Bx(200526, new String[]{v2.A60(), this.Eb.toString()}), "", null);
                break;
            case 22:
                v7.lZ.add(new kw_0(new gm_2(v2).us()));
                break;
            case 23:
                a10_0 a10 = v7.yd0;
                a10.eG[a10.Ez0()].L40(a10.AD).zI.HT = true;
                tw0_0.LD0.he0.Z8(v7.yd0.Ez0(), (short) 1061);
                break;
            case 24:
                v7.wJ(sm0_0.Bx(200575, new String[]{sm0_0.c0(((mc0_1) gu0.l2.iz.BM(v2.rp0())).Nl), v2.A60()}), "", null);
                break;
            case 25:
                v7.wJ(sm0_0.wa0(200576, v2.A60()), "", null);
                break;
            case 32:
                v7.wJ(sm0_0.wa0(200577, v2.A60()), "", null);
                break;
            case 33:
                v7.wJ(sm0_0.wa0(200578, v2.A60()), "", null);
                break;
            case 34:
                v7.wJ(sm0_0.wa0(200612, v2.A60()), "", null);
                break;
            default:
                break;
        }
    }

    public final boolean Hm() {
        return this.pp0 != 2 && this.pp0 != 23;
    }
}
