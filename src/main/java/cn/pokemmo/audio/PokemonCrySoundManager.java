package cn.pokemmo.audio;

import f.CS;
import f.GQ;
import f.Gd;
import f.LPt1_;
import f.VB0;
import f.af_0;
import f.bu_0;
import f.ff0_0;
import f.fl0_0;
import f.hb0_2;
import f.hx_2;
import f.lg_0;
import f.qe0_0;
import f.rt0_0;
import f.tw0_0;
import f.w7_0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/**
 * 宝可梦叫声播放与音频管理 (Pokemon Cry Sound & Audio Manager)
 * <p>
 * 原始混淆类: {@code f.di0_0}
 */
public abstract class PokemonCrySoundManager {
    public static final w7_0 D60 = new w7_0();

    public static void xE0(short i0) {
        Hv0(i0, (byte) 0, 1.0F, 0.0F, false);
    }

    public static void Hv0(short i0, byte i1, float f2, float f3, boolean i4) {
        lg_0.k.lPT5(() -> Tw(i0, i1, f2, f3, i4));
    }

    public static int Ks(short i0) {
        hx_2 hx = tw0_0.Ll0.Qz0.RP();
        if (i0 < 0 || i0 >= hx.y60.Pp[3].Tl) {
            i0 = 1;
        }
        short hF0 = ((fl0_0) hx.y60.Pp[3].mR[i0]).hF0;
        qe0_0[] ca0 = hx.ZO.ca0;
        if (hF0 >= ca0.length) {
            return 0;
        }
        CS cs = new rt0_0(ca0[hF0]).e10();
        if (cs == null) {
            return 0;
        }
        return (cs.Lz0 * 1000) / (cs.prn * (cs.C50 / 8));
    }

    public static byte[] ts(short i0) {
        if (D60.bL0(i0)) {
            LPt1_ lpt1 = (LPt1_) D60.f5(i0);
            byte[] bytes = lpt1.I40.kI0();
            if (bytes != null && bytes.length >= 5
                    && bytes[0] == 82 && bytes[1] == 73 && bytes[2] == 70 && bytes[3] == 70) {
                return bytes;
            }
        }
        hx_2 hx = tw0_0.Ll0.Qz0.RP();
        if (i0 < 0 || i0 >= hx.y60.Pp[3].Tl) {
            i0 = 1;
        }
        short hF0 = ((fl0_0) hx.y60.Pp[3].mR[i0]).hF0;
        qe0_0[] ca0 = (hx.ZO != null) ? hx.ZO.ca0 : null;
        if (ca0 == null || hF0 < 0 || hF0 >= ca0.length || ca0[hF0] == null) {
            return null;
        }
        CS cs = new rt0_0(ca0[hF0]).e10();
        if (cs == null) {
            return null;
        }
        int c50 = cs.C50;
        int lz0 = cs.Lz0;
        if (cs.NP == 0) {
            c50 = 16;
            lz0 = lz0 * 2;
        }
        ByteBuffer buffer = ByteBuffer.allocate(lz0 + 44).order(ByteOrder.LITTLE_ENDIAN);
        buffer.putInt(1179011410);
        buffer.putInt(lz0 + 36);
        buffer.putInt(1163280727);
        buffer.putInt(544501094);
        buffer.putInt(16);
        buffer.putShort((short) 1);
        buffer.putShort((short) 1);
        buffer.putInt(cs.prn);
        int blockAlign = c50 / 8;
        buffer.putInt(cs.prn * blockAlign);
        buffer.putShort((short) blockAlign);
        buffer.putShort((short) c50);
        buffer.putInt(1635017060);
        buffer.putInt(lz0);

        if (cs.NP == 1) {
            cs.EB.position(0);
            int limit = cs.EB.limit() / 2;
            for (int i = 0; i < limit; i++) {
                buffer.putShort(cs.EB.getShort());
            }
        } else if (cs.NP == 2) {
            buffer.putShort((short) cs.lK);
            cs.EB.position(0);
            int limit = cs.EB.limit();
            Gd gd = new Gd();
            gd.O10 = cs.lK;
            gd.GG0 = cs.LPt1;
            for (int i = 0; i < limit; i++) {
                byte b = cs.EB.get();
                CS.iE(b, gd);
                buffer.putShort((short) gd.O10);
                CS.iE((byte) ((b & 240) >> 4), gd);
                buffer.putShort((short) gd.O10);
            }
        } else if (cs.NP == 0) {
            cs.EB.position(0);
            int limit = cs.EB.limit();
            for (int i = 0; i < limit; i++) {
                buffer.putShort((short) (cs.EB.get() << 8));
            }
        }
        return buffer.array();
    }

    public static void ah(short i0, LPt1_ v1) {
        D60.coM4(i0, v1);
    }

    public static void Tw(short i0, byte i1, float f2, float f3, boolean i4) {
        float f5 = 1.0F;
        ff0_0 ff0 = ff0_0.TJ0;
        if (ff0.wg() <= bu_0.COm9) {
            return;
        }
        boolean isGen4 = true;
        float f7 = ff0.wg() * f5;
        if (i0 == 492) {
            if (i1 == 1) {
                i0 = 650;
            }
        } else if (i0 == 1051) {
            tw0_0.RE0.IE((byte) 2, (short) 1489, (short) -1, true, f3, 1.0F, f5, 0);
            tw0_0.RE0.IE((byte) 2, (short) 1436, (short) -1, true, f3, 1.0F, f5, 400);
            return;
        } else {
            switch (i0) {
                case 1000:
                    i0 = 357;
                    break;
                case 1001:
                    i0 = 93;
                    break;
                case 1002:
                    i0 = 646;
                    break;
                case 1019:
                    tw0_0.RE0.IE((byte) 2, (short) 1813, (short) -1, true, f3, 0.6F, f5, 0);
                    return;
                case 1020:
                    tw0_0.RE0.IE((byte) 2, (short) 1802, (short) -1, true, f3, 0.6F, f5, 0);
                    return;
                case 1021:
                    tw0_0.RE0.IE((byte) 2, (short) 1, (short) 456, true, f3, 0.6F, f5, 0);
                    return;
                case 1022:
                    i0 = 622;
                    break;
                case 1023:
                    i0 = 487;
                    break;
                case 1024:
                    tw0_0.RE0.d00(true, (byte) 2, (short) 2047, f3);
                    return;
                case 1025:
                    i0 = 151;
                    break;
                case 1047:
                    tw0_0.RE0.IE((byte) 2, (short) 1, (short) 374, true, f3, 0.6F, f5, 0);
                    return;
                case 1048:
                    tw0_0.RE0.IE((byte) 2, (short) 1, (short) 231, true, f3, 0.6F, f5, 0);
                    return;
                case 1049:
                    tw0_0.RE0.IE((byte) 2, (short) 1864, (short) -1, true, f3, 0.7F, f5, 0);
                    return;
                default:
                    break;
            }
        }

        hb0_2 hb0 = hb0_2.BN;
        if (hb0 != hb0_2.cw && hb0 != hb0_2.XU) {
            byte[] bytes = ts(i0);
            if (bytes == null) {
                return;
            }
            String name = GQ.ti("cry-", i0, ".wav");
            af_0 af0 = new af_0(name, bytes, bytes.length);
            VB0 vb0 = new VB0(af0, tw0_0.RE0.z6.BE0);
            vb0.mK = f7;
            if (f3 != 1.0F && !vb0.mD) {
                vb0.ht0 = f3;
            }
            if (f2 != 1.0F && !vb0.mD) {
                vb0.Mz = f2;
            }
            VB0 vb0_echo = null;
            if (i4) {
                vb0_echo = new VB0(af0, tw0_0.RE0.z6.BE0);
                vb0_echo.mK = f7 * 0.5F;
                float echoPan = f2 * 0.5F;
                if (!vb0_echo.mD) {
                    vb0_echo.Mz = echoPan;
                }
                if (f3 != 1.0F && !vb0_echo.mD) {
                    vb0_echo.ht0 = f3;
                }
            }
            vb0.FB0();
            if (vb0_echo != null) {
                vb0_echo.FB0();
            }
        } else {
            tw0_0.RE0.IE((byte) 2, (short) (isGen4 ? 1 : 0), i0, true, f3, f2, f5, 0);
            if (i4) {
                tw0_0.RE0.IE((byte) 2, (short) (isGen4 ? 1 : 0), i0, true, f3, f2 * 0.5F, 0.5F, 0);
            }
        }
    }
}
