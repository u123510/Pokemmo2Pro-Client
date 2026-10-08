package cn.pokemmo.rom.gba.sprite;

import f.*;

import com.badlogic.gdx.graphics.g2d.Gdx2DPixmap;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public abstract class GbaSpriteTileRenderer {
    public static i4_0 F9(qa0_1 qa0_1, Q20 q20, int i, int i2, int i3, int i4) {
        return bB(qa0_1, q20, i, i2, i3, i4, XG0.hi0, null);
    }

    public static i4_0 bB(qa0_1 qa0_1, Q20 q20, int i, int i2, int i3, int i4, XG0 xg0, i8_0 i8_0) {
        ByteBuffer order = qa0_1.VL0.slice().order(ByteOrder.LITTLE_ENDIAN);
        i4_0 i4_0 = new i4_0(i3, i4, ix0_0.Vw);
        i8_0 i8_02 = i8_0;
        if (i8_02 == null) {
            da_0 da0 = da_0.Ic;
            da0.getClass();
            i8_02 = da0.tv(xg0, i2, qa0_1.VL0.slice().order(ByteOrder.LITTLE_ENDIAN), qa0_1.rt0());
        }
        SQ sq = null;
        boolean z = i8_02.ax.length > xg0.co0;
        order.position(i);
        boolean z2 = tx_1.T30(order, kd_2.Gu0) > 0;
        if (z2) {
            order = ByteBuffer.wrap(tx_1.Gi(i, order)).order(ByteOrder.LITTLE_ENDIAN);
        }
        int curX = 0;
        int curY = 0;
        i8_0 curPal = i8_02;
        while (order.remaining() > 1) {
            short s;
            if (xg0 == XG0.fP) {
                s = (short) (order.get() & 255);
            } else {
                s = order.getShort();
            }
            if (!z2 && s == 0) {
                break;
            }
            int tileIndex = s & 1023;
            boolean flipX = (s & 1024) != 0;
            boolean flipY = (s & 2048) != 0;
            int palIndex = (s >> 12) & 15;
            if (!z && i8_0 == null) {
                if (palIndex == 0) {
                    curPal = i8_02;
                } else {
                    if (sq == null) {
                        sq = new SQ();
                    }
                    curPal = (i8_0) sq.get(palIndex);
                    if (curPal == null) {
                        int offset = (xg0 == XG0.hi0 ? 32 : 2048) * palIndex;
                        da_0 da_02 = da_0.Ic;
                        da_02.getClass();
                        curPal = da_02.tv(xg0, offset + i2, qa0_1.VL0.slice().order(ByteOrder.LITTLE_ENDIAN), qa0_1.rt0());
                        sq.j10(palIndex, curPal);
                    }
                }
                palIndex = 0;
            } else {
                int palOffset = palIndex * xg0.co0;
                if (curPal.ax.length <= palOffset) {
                    palIndex = 0;
                } else {
                    palIndex = palOffset;
                }
            }
            q20.xx0(i4_0, curX, curY, tileIndex, curPal, palIndex, flipX, flipY);
            curX += 8;
            if (curX >= i3) {
                curX = 0;
                curY += 8;
                if (curY >= i4) {
                    break;
                }
            }
        }
        return i4_0;
    }

    public static i4_0 AF(i4_0 i4_0) {
        Gdx2DPixmap gdx2DPixmap = i4_0.XF;
        int w = gdx2DPixmap.SH;
        int h = gdx2DPixmap.mB0;
        i4_0 i4_02 = new i4_0(h, w, i4_0.rH0());
        for (int y = 0; y < h; y++) {
            for (int x = 0; x < w; x++) {
                i4_02.XF.XS(y, x, i4_0.XF.iH0(x, y));
            }
        }
        return i4_02;
    }

    public static i4_0 La(i4_0 i4_0, boolean z, boolean z2) {
        int h = i4_0.XF.mB0;
        int w = i4_0.XF.SH;
        if (z && z2) {
            i4_0 i4_02 = new i4_0(w, h, i4_0.rH0());
            i4_02.Pa0(DF0.Ha0);
            for (int y = 0; y < h; y++) {
                for (int x = 0; x < w; x++) {
                    i4_02.XF.XS(x, y, i4_0.XF.iH0(w - 1 - x, h - 1 - y));
                }
            }
            return i4_02;
        } else if (z) {
            i4_0 i4_03 = new i4_0(w, h, i4_0.rH0());
            i4_03.Pa0(DF0.Ha0);
            for (int y = 0; y < h; y++) {
                for (int x = 0; x < w; x++) {
                    i4_03.XF.XS(x, y, i4_0.XF.iH0(w - 1 - x, y));
                }
            }
            return i4_03;
        } else if (z2) {
            i4_0 i4_04 = new i4_0(w, h, i4_0.rH0());
            i4_04.Pa0(DF0.Ha0);
            for (int y = 0; y < h; y++) {
                for (int x = 0; x < w; x++) {
                    i4_04.XF.XS(x, y, i4_0.XF.iH0(x, h - 1 - y));
                }
            }
            return i4_04;
        } else {
            return i4_0;
        }
    }

    public static void A90(i4_0 i4_0, i4_0 i4_02, int i, int i2, boolean z, boolean z2) {
        int h = i4_0.XF.mB0;
        int w = i4_0.XF.SH;
        if (z && z2) {
            for (int y = 0; y < h; y++) {
                for (int x = 0; x < w; x++) {
                    i4_02.XF.XS(i + x, i2 + y, i4_0.XF.iH0(w - 1 - x, h - 1 - y));
                }
            }
        } else if (z) {
            for (int y = 0; y < h; y++) {
                for (int x = 0; x < w; x++) {
                    i4_02.XF.XS(i + x, i2 + y, i4_0.XF.iH0(w - 1 - x, y));
                }
            }
        } else if (z2) {
            for (int y = 0; y < h; y++) {
                for (int x = 0; x < w; x++) {
                    i4_02.XF.XS(i + x, i2 + y, i4_0.XF.iH0(x, h - 1 - y));
                }
            }
        }
    }

    public static i4_0 Qx(i4_0 i4_0, boolean z, boolean z2) {
        int h = i4_0.XF.mB0;
        int w = i4_0.XF.SH;
        if (z && z2) {
            i4_0 i4_02 = new i4_0(w, h, i4_0.rH0());
            i4_02.Pa0(DF0.Ha0);
            for (int y = 0; y < h; y++) {
                for (int x = 0; x < w; x++) {
                    i4_02.XF.XS(x, y, i4_0.XF.iH0(w - 1 - x, h - 1 - y));
                }
            }
            return i4_02;
        } else if (z) {
            i4_0 i4_03 = new i4_0(w, h, i4_0.rH0());
            i4_03.Pa0(DF0.Ha0);
            for (int y = 0; y < h; y++) {
                for (int x = 0; x < w; x++) {
                    i4_03.XF.XS(x, y, i4_0.XF.iH0(w - 1 - x, y));
                }
            }
            return i4_03;
        } else if (z2) {
            i4_0 i4_04 = new i4_0(w, h, i4_0.rH0());
            i4_04.Pa0(DF0.Ha0);
            for (int y = 0; y < h; y++) {
                for (int x = 0; x < w; x++) {
                    i4_04.XF.XS(x, y, i4_0.XF.iH0(x, h - 1 - y));
                }
            }
            return i4_04;
        } else {
            return i4_0;
        }
    }
}
