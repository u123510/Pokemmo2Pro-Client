package cn.pokemmo.audio.midi;

import f.*;

import java.text.NumberFormat;
import java.util.HashMap;
import java.util.function.BiFunction;

public class MidiTrackChannelSequencer {
    public static BiFunction<_volatile, Byte, String> va;
    public static final short[] sJ0 = new short[0];
    public final byte Yi0;
    public final byte Ic0;
    public byte cOm5 = -1;
    public final short[] dm;
    public final int bm0;
    public final long gN;
    public final String SG;

    static {
        va = MidiTrackChannelSequencer::Xx;
    }

    public MidiTrackChannelSequencer(byte b1, byte b2) {
        this.Yi0 = b1;
        this.Ic0 = b2;
        this.dm = sJ0;
        this.bm0 = 0;
        this.gN = 0L;
        this.SG = "";
    }

    public MidiTrackChannelSequencer(byte b1, byte b2, int i) {
        this.Yi0 = b1;
        this.Ic0 = b2;
        this.dm = new short[]{(short) i};
        this.bm0 = i;
        this.gN = 0L;
        this.SG = "";
    }

    public MidiTrackChannelSequencer(byte b1, byte b2, String str) {
        this.Yi0 = b1;
        this.Ic0 = b2;
        this.dm = sJ0;
        this.bm0 = 0;
        this.gN = 0L;
        this.SG = str;
    }

    public MidiTrackChannelSequencer(byte b1, byte b2, short... sArr) {
        if (sArr.length < 1) {
            throw new RuntimeException();
        }
        this.Yi0 = b1;
        this.Ic0 = b2;
        this.dm = sArr;
        this.bm0 = 0;
        this.gN = 0L;
        this.SG = "";
    }

    public MidiTrackChannelSequencer(byte b1, long j) {
        this.Yi0 = b1;
        this.Ic0 = 30;
        this.dm = sJ0;
        this.bm0 = 0;
        this.gN = j;
        this.SG = "";
    }

    public static String Xx(_volatile v0, Byte v1) {
        if (v0 == _volatile.Kb) {
            return sm0_0.c0(2365);
        }
        return sm0_0.wa0(1119, (v1.byteValue() + 1) + "");
    }

    public final short gd(int i) {
        short[] sArr = this.dm;
        if (sArr.length < 1) {
            return 0;
        }
        if (i < 0 || i >= sArr.length) {
            i = 0;
        }
        return sArr[i];
    }

    public final String vj0() {
        switch (this.Ic0) {
            case 0:
                return sm0_0.c0(gu0.l2.lPT6(gd(0)).Nl);
            case 1:
                cq_0 cq = (cq_0) mp_1.vf0().k2.get(Short.valueOf(gd(0)));
                if (cq == null) {
                    return "???";
                }
                return cq.Ay(false);
            case 2:
                return sm0_0.c0(((vk0_1) ec0_2.Sx().f4.f5(gd(0))).bt);
            case 3:
                return gd(0) + "";
            case 4:
                switch (gd(0)) {
                    case 1:
                        return sm0_0.c0(300015);
                    case 2:
                        return sm0_0.c0(300016);
                    case 3:
                        return sm0_0.c0(300017);
                    case 4:
                        return sm0_0.c0(300018);
                    case 5:
                        return sm0_0.c0(300019);
                    case 6:
                        return sm0_0.c0(300020);
                    case 7:
                        return sm0_0.c0(300021);
                    case 8:
                        return sm0_0.c0(300022);
                    default:
                        return "Badge #" + gd(0);
                }
            case 5:
                return this.SG;
            case 6:
                if (N50.Aa(this.cOm5)) {
                    ZT zt = Z0.rb.or(gd(0));
                    if (zt != null) {
                        return zt.Nw0();
                    }
                }
                if (N50.Fc(this.cOm5)) {
                    Z0 z0 = Z0.rb;
                    byte b = this.cOm5;
                    short s = gd(0);
                    Z50 z50 = null;
                    if (s < 0) {
                        z0.getClass();
                    } else {
                        S80[] s80Arr = z0.h4;
                        if (b < s80Arr.length && s80Arr[b] != null) {
                            z50 = s80Arr[b].Sx0[s];
                        }
                    }
                    if (z50 != null) {
                        return z50.getName();
                    }
                }
                return "???";
            case 7:
                return i40_0.MG0((byte) gd(0)).toString();
            case 8:
                zo_0 zo = (zo_0) zo_0.N00.BM((byte) gd(0));
                if (zo == null) {
                    return "ERROR";
                }
                return sm0_0.c0(zo.Yf);
            case 9:
                return sm0_0.c0(this.bm0);
            case 10:
                return tx_1.HU(this.bm0, 2);
            case 11:
                return sm0_0.c0(210000 + gd(0));
            case 12:
                yj_2 yj = QO.NX.xW(gd(0));
                if (yj == null) {
                    return "";
                }
                return yj.FL0();
            case 13:
                return sm0_0.c0(100100 + gd(0));
            case 14:
                return sm0_0.c0(270600 + gd(0));
            case 15:
                return sm0_0.c0(190000 + this.cOm5 * 120 + gd(0));
            case 16:
                gn_2 gn = wn_1.pn.vi(this.cOm5, gd(0));
                if (gn == null) {
                    return "ERROR";
                }
                return gn.gK0();
            case 17:
                return NumberFormat.getInstance().format((long) this.bm0) + "";
            case 18:
                return sm0_0.dd(this.SG);
            case 19:
                return _case.P0.tG(this.cOm5, (byte) gd(0), gd(1));
            case 20:
                e_0 e = (e_0) l4_0.Py0.w8.BM((byte) gd(0));
                if (e == null) {
                    return "ERROR";
                }
                if (gd(1) > 0) {
                    return e.zX;
                }
                return e.JA0;
            case 21:
                return i40_0.COm3((byte) gd(0)).toString();
            case 22:
                mc0_1 mc = gu0.l2.lPT6(gd(0));
                if (mc.wb0 > 0) {
                    vk0_1 vk = (vk0_1) ec0_2.Sx().f4.f5(mc.wb0);
                    if (vk != null) {
                        return sm0_0.c0(vk.bt);
                    }
                }
                return "--";
            case 23:
                return "1x " + sm0_0.c0(gu0.l2.lPT6(gd(0)).Nl);
            case 24:
                return NumberFormat.getInstance().format((long) gd(1)) + "x " + sm0_0.c0(gu0.l2.lPT6(gd(0)).Nl);
            case 25:
                return sm0_0.c0(gu0.l2.lPT6(gd(0)).Yt0.ni);
            case 26:
                xm_0 xm = sm0_0.jP(this.cOm5, (lpt6__2) lpt6__2.If.BM((byte) this.dm[0]));
                if (xm == null) {
                    return "";
                }
                return xm.ra0(this.dm[1], 0, this.dm[2]);
            case 27:
                return sm0_0.c0(l5_0.Hv0(gd(0)).ni);
            case 28:
                return sm0_0.CY(this.cOm5);
            case 29:
                return (String) va.apply(_volatile.Bf0, Byte.valueOf((byte) gd(0)));
            case 30:
                return NumberFormat.getInstance().format(this.gN) + "";
            case 31:
                return lq0.JS(GV.Zd((byte) this.dm[0]), (byte) this.dm[1]).R3();
            default:
                return "";
        }
    }
}
