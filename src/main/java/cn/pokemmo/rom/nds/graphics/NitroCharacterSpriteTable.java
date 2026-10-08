package cn.pokemmo.rom.nds.graphics;

import f.*;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class NitroCharacterSpriteTable {
    public FE[] Ta;

    public NitroCharacterSpriteTable() {
    }

    public static NitroCharacterSpriteTable vE0(Ae ae) {
        NitroCharacterSpriteTable jg = new NitroCharacterSpriteTable();
        ByteBuffer buf = ae.MH(false);
        if (buf.getInt(buf.position()) != 1397768480) {
            return null;
        }
        buf.getInt();
        buf.getInt();
        buf.getShort();
        short count = buf.getShort();
        buf.getInt();
        buf.getInt();
        buf.getInt();
        int offset = buf.getInt();
        buf.getInt();
        buf.position(offset);
        jg.Ta = new FE[count];
        for (int i = 0; i < count; i++) {
            FE fe = new FE();
            buf.getInt();
            short flags = buf.getShort();
            fe.Je0 = (byte) (flags & 7);
            byte w = (byte) ((flags >> 4) & 7);
            byte h = (byte) ((flags >> 8) & 7);
            fe.BU = 8 << w;
            fe.YE0 = 8 << h;
            buf.get();
            buf.get();
            int pixelLen = buf.getInt();
            buf.getInt();
            short paletteLen = buf.getShort();
            buf.getShort();
            buf.getInt();
            buf.getShort();
            buf.getShort();
            buf.getInt();
            fe.Xo0 = new byte[pixelLen];
            fe.Oz0 = new byte[paletteLen];
            buf.get(fe.Xo0);
            buf.get(fe.Oz0);
            jg.Ta[i] = fe;
        }
        return jg;
    }

    public final i4_0 RB0(int i1) {
        if (this.Ta == null || i1 >= this.Ta.length || i1 < 0) {
            return null;
        }
        FE fe = this.Ta[i1];
        byte[] palBytes = fe.Oz0;
        ByteBuffer palBuf = ByteBuffer.wrap(palBytes).order(ByteOrder.LITTLE_ENDIAN);
        int palCount = palBytes.length / 2;
        int[] palColors = new int[palCount];
        for (int i = 0; i < palCount; i++) {
            short s = palBuf.getShort();
            palColors[i] = 0xFF000000
                    | (((s & 31) * 8 & 255) << 16)
                    | ((((s & 992) >> 5) * 8 & 255) << 8)
                    | (((s & 31744) >> 10) * 8 & 255);
        }
        i4_0 pixmap = new i4_0(fe.BU, fe.YE0, ix0_0.Vw);
        pixmap.Pa0(DF0.Ha0);
        int format = fe.Je0;
        if (format == 6) {
            for (int y = 0; y < fe.YE0; y++) {
                for (int x = 0; x < fe.BU; x++) {
                    int idx = y * fe.BU + x;
                    if (fe.Xo0.length > idx) {
                        byte b = fe.Xo0[idx];
                        int palIdx = b & 7;
                        int alpha = (b >> 3) * 8;
                        if (palIdx < palCount) {
                            int c = (alpha << 24) | (palColors[palIdx] & 0xFFFFFF);
                            int rgba = (c << 8) | (c >>> 24);
                            pixmap.XF.XS(x, y, rgba);
                        }
                    }
                }
            }
        } else if (format == 1) {
            for (int y = 0; y < fe.YE0; y++) {
                for (int x = 0; x < fe.BU; x++) {
                    int idx = y * fe.BU + x;
                    if (fe.Xo0.length > idx) {
                        byte b = fe.Xo0[idx];
                        int palIdx = b & 31;
                        if (palIdx < palCount) {
                            int v = b >> 5;
                            int alpha = (v / 2 + v * 4) * 8;
                            alpha |= alpha >> 5;
                            int c = (alpha << 24) | (palColors[palIdx] & 0xFFFFFF);
                            int rgba = (c << 8) | (c >>> 24);
                            pixmap.XF.XS(x, y, rgba);
                        }
                    }
                }
            }
        } else if (format == 3) {
            fe.Xo0 = Ws0.Go(fe.Xo0);
            palColors[0] = 0;
            for (int y = 0; y < fe.YE0; y++) {
                for (int x = 0; x < fe.BU; x++) {
                    int idx = y * fe.BU + x;
                    if (fe.Xo0.length > idx) {
                        int palIdx = fe.Xo0[idx] & 255;
                        if (palIdx < palCount) {
                            int c = palColors[palIdx];
                            int rgba = (c << 8) | (c >>> 24);
                            pixmap.XF.XS(x, y, rgba);
                        }
                    }
                }
            }
        } else {
            FE.dx0.info("unk aps texture format = {}", Integer.valueOf(format));
        }
        return pixmap;
    }
}
