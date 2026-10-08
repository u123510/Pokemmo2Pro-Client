package cn.pokemmo.battle.action;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import java.util.Arrays;
import java.util.Objects;

public class StatActionNeg017Packet extends Nt implements eb0_0 {
    public final byte V3;
    public final byte GQ;
    public final gc_2[] I40;
    public final CH0 U7;

    public StatActionNeg017Packet(byte b1, byte b2, CH0 ch) {
        if (b1 == 33) {
            throw new IllegalArgumentException(yr_1.pG("Illegal constructor for info ", b1));
        }
        this.GQ = b2;
        this.V3 = b1;
        this.U7 = ch;
        this.I40 = null;
    }

    public StatActionNeg017Packet(byte b1, byte b2, CH0 ch, gc_2[] gcArr) {
        if (b1 != 33) {
            throw new IllegalArgumentException(yr_1.pG("Illegal constructor for info ", b1));
        }
        this.GQ = b2;
        this.V3 = b1;
        this.U7 = ch;
        this.I40 = gcArr;
    }

    public static PF[] s50(int i) {
        return new PF[i];
    }

    public static String[] V40(int i) {
        return new String[i];
    }

    public static PF[] KY(int i) {
        return new PF[i];
    }

    public final byte BL0() {
        return (byte) -17;
    }

    public final void IE0(PF v1_p, PF v2, boolean i3, boolean i4_p, short i5_p, boolean i6_p, ML0 v7, qn_1 v8) {
        a10_0 pk0 = tw0_0.PK0;
        if (pk0 == null) {
            return;
        }
        byte v3_code = this.V3;
        se_0 v3 = null;
        if (v3_code != 5 && (v3_code < 49 || v3_code > 54)) {
            tb0_1 tb = pk0.yD0(this.U7);
            if (tb == null) {
                return;
            }
            v3 = tb.B3;
        }
        ek_0 v1 = pk0.mn(this.GQ).zI;
        Oz0 v4 = tw0_0.LD0.he0;
        switch (this.V3) {
            case 0:
                v7.wJ(sm0_0.wa0(16807004, v3.Ky0()), "", null);
                // fall through to case 1
            case 1: {
                lpt6__2 q80 = lpt6__2.Q80;
                int i3_code = 15;
                a10_0 v5_a10 = v7.yd0;
                int i6_val = (this.V3 == 0) ? 168 : 170;
                int i0_val = v5_a10.Vs0(this.GQ, i6_val);
                v7.wJ(sm0_0.Bw((byte) 2, q80, i3_code, i0_val, sm0_0.zb0), "", null);
                v1.Wn0 = 127;
                v4.Z8(this.GQ, (short) 519);
                break;
            }
            case 2: {
                PF pfTarget = v7.yd0.nd0(v3.Bn.YD0);
                v7.I1(sm0_0.wa0(16807005, pfTarget.A60()), "", null);
                byte i1_c = a10_0.Vp0(pfTarget.cD0);
                PF[] pfArr = Arrays.stream(v7.yd0.wI0[i1_c])
                    .filter(Objects::nonNull)
                    .toArray(StatActionNeg017Packet::KY);
                if (pfArr.length > 0) {
                    v7.lZ.add(new kw_0(new m90_0(pfTarget, pfArr)));
                }
                break;
            }
            case 3:
                v7.wJ(sm0_0.c0(16807006), "", null);
                v1.kI0 = 127;
                v4.Z8(this.GQ, (short) -543);
                break;
            case 4:
                v1.kI0 = 0;
                v4.Z8(this.GQ, (short) -543);
                break;
            case 5:
                tu0_0.mk(v2, 16807009, v7, "", null);
                break;
            case 16:
                v7.wJ(sm0_0.wa0(16807002, v3.Ky0()), "", null);
                break;
            case 17:
                v7.wJ(sm0_0.wa0(16807003, v3.Ky0()), "", null);
                break;
            case 18:
                v7.wJ(sm0_0.wa0(16807001, v3.Ky0()), "", null);
                break;
            case 32:
            case 33: {
                String str;
                if (this.I40.length > 1) {
                    String[] strArr = Arrays.stream(this.I40)
                        .map(gc_2::toString)
                        .toArray(StatActionNeg017Packet::V40);
                    str = sm0_0.Bx(200456 + this.I40.length, strArr);
                } else {
                    str = this.I40[0].toString();
                }
                v7.wJ(sm0_0.Bx(16807007, new String[]{v3.Ky0(), str}), "", null);
                break;
            }
            case 34:
                v7.wJ(sm0_0.wa0(16807010, v3.Ky0()), "", null);
                v7.lZ.add(new kw_0(new lpt2__3(null, 1.5f, null)));
                break;
            case 49:
                v7.wJ(sm0_0.c0(200492), "", null);
                v7.lZ.add(new kw_0(new lpt2__3(null, 1.5f, null)));
                v7.wJ(sm0_0.c0(200493), "", null);
                v7.lZ.add(new kw_0(new lpt2__3(null, 1.5f, null)));
                break;
            case 50:
                v7.wJ(sm0_0.c0(200494), "", null);
                break;
            case 51: {
                v7.wJ(sm0_0.c0(200495), "", null);
                PF[] team = tw0_0.PK0.wI0[this.GQ];
                for (int i = 0; i < team.length; i++) {
                    PF member = team[i];
                    if (member != null && !member.zi0.hf0()) {
                        member.kc = true;
                        member.ll0();
                        member.RZ();
                    }
                }
                break;
            }
            case 52:
                v7.I1(sm0_0.c0(200496), "", null);
                v7.lZ.add(new kw_0(new ea_1(
                    Arrays.stream(tw0_0.PK0.wI0[this.GQ])
                        .filter(Objects::nonNull)
                        .toArray(StatActionNeg017Packet::s50)
                )));
                break;
            case 53: {
                v7.I1(sm0_0.c0(200497), "", null);
                PF pfLeader = tw0_0.PK0.Ce(this.GQ, (byte) 1);
                if (pfLeader != null) {
                    ML0 ml0 = tw0_0.LD0.he0.N10;
                    ml0.lZ.add(new kw_0((byte) 0, qk_2.cR.import$(pfLeader, (short) 113)));
                    ml0.lZ.add(new kw_0((byte) 0, qk_2.cR.import$(pfLeader, (short) 115)));
                    ml0.lZ.add(new kw_0((byte) 0, qk_2.cR.import$(pfLeader, (short) 219)));
                }
                break;
            }
            default:
                break;
        }
    }

    public final boolean Hm() {
        return this.V3 == 5;
    }
}
