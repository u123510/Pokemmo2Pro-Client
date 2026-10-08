package cn.pokemmo.rom.nds.graphics;

import f.Ae;
import f.Gt0;
import f.Tt0;
import f.ac0_0;
import f.i4_0;
import f.in_1;
import f.xf_0;
import f.yr_1;
import java.nio.ByteBuffer;
import java.util.Arrays;

/**
 * NDS Nitro 地图图块调色板资源 (Nitro Tile Palette Resource)
 * <p>
 * 原始混淆类: {@code f.IA0}
 */
public class NitroTilePaletteResource extends xf_0 {
    public final Ae k7;
    public short[] nm;
    public final boolean hN;

    public NitroTilePaletteResource(Ae source) {
        this(source, false);
    }

    public NitroTilePaletteResource(Ae source, boolean alternate) {
        super();
        this.k7 = source;
        this.hN = alternate;
        this.Jn0();
    }

    public final i4_0 dB(Tt0 texture, Gt0 section) {
        if (section.EC0 == in_1.fH) {
            section.EC0 = in_1.J9;
        }
        this.jr0 = section.jr0;
        int width = section.eC0;
        this.eC0 = width;
        this.EC0 = section.EC0;
        int height = section.ZL;
        this.ZL = height;
        int pixelCount = width * width;
        int rowBytes = pixelCount * height / 8;
        byte[] packed = new byte[this.nm.length * pixelCount];
        int used = 0;
        this.DA0 = new byte[this.nm.length * pixelCount];

        for (int index = 0; index < this.nm.length; index++) {
            short descriptor = this.nm[index];
            int sourceIndex = descriptor & 0x3ff;
            boolean flipVertical = ((descriptor >> 10) & 1) != 0;
            boolean flipHorizontal = ((descriptor >> 11) & 1) != 0;
            int format = (descriptor >> 12) & 0xf;
            for (int pixel = 0; pixel < pixelCount; pixel++) {
                this.DA0[index * pixelCount + pixel] = (byte) format;
            }

            if (!flipVertical && !flipHorizontal) {
                int offset = sourceIndex * rowBytes;
                int end = used + rowBytes;
                if (end > packed.length) {
                    byte[] expanded = new byte[Math.max(packed.length << 1, end)];
                    packed = expanded;
                }
                System.arraycopy(section.lJ0, offset, packed, used, rowBytes);
                used += rowBytes;
                continue;
            }

            int offset = sourceIndex * rowBytes;
            byte[] tile = Arrays.copyOfRange(section.lJ0, offset, offset + rowBytes);
            if (flipVertical) {
                int sourceHeight = this.eC0;
                int sourceWidth = this.ZL;
                byte[] transformed = new byte[tile.length];
                int stride = sourceHeight * sourceWidth / 8;
                for (int row = 0; row < sourceHeight; row++) {
                    for (int column = 0; column < stride / 2; column++) {
                        int start = row * stride + column;
                        int end = row * stride + stride - 1 - column;
                        int left = tile[end];
                        if (sourceWidth == 4) {
                            left = ((left & 0xf) << 4) | ((left & 0xf0) >> 4);
                        } else if (sourceWidth != 8) {
                            left = 0;
                        }
                        transformed[start] = (byte) left;
                        int right = tile[start];
                        if (sourceWidth == 4) {
                            right = ((right & 0xf) << 4) | ((right & 0xf0) >> 4);
                        } else if (sourceWidth != 8) {
                            right = 0;
                        }
                        transformed[end] = (byte) right;
                    }
                }
                tile = transformed;
            }
            if (flipHorizontal) {
                int sourceHeight = this.eC0;
                byte[] transformed = new byte[tile.length];
                int stride = sourceHeight * this.ZL / 8;
                for (int row = 0; row < sourceHeight / 2; row++) {
                    for (int column = 0; column < stride; column++) {
                        int top = row * stride + column;
                        int bottom = (sourceHeight - 1 - row) * stride + column;
                        transformed[top] = tile[bottom];
                        transformed[bottom] = tile[top];
                    }
                }
                tile = transformed;
            }

            int end = used + tile.length;
            if (end > packed.length) {
                byte[] expanded = new byte[Math.max(packed.length << 1, end)];
                packed = expanded;
            }
            System.arraycopy(tile, 0, packed, used, tile.length);
            used += tile.length;
        }

        byte[] imageData = new byte[used];
        if (used != 0) {
            if (used <= 0) {
                throw new ArrayIndexOutOfBoundsException(0);
            }
            System.arraycopy(packed, 0, imageData, 0, used);
        }
        this.lJ0 = imageData;
        return this.NK(texture, this.LA, this.v4);
    }

    public final void Jn0() {
        ByteBuffer data = this.k7.MH(this.hN);
        int magic = data.getInt();
        data.getShort();
        data.getShort();
        data.getInt();
        data.getShort();
        data.getShort();
        int expectedMagic = 1314079570;
        if (magic != expectedMagic) {
            throw new RuntimeException(ac0_0.YH0("Header magic mismatch = ", magic, " vs expected ", expectedMagic));
        }
        int section = data.getInt();
        if (section != 1396920910) {
            throw new RuntimeException(yr_1.pG("Wrong section: ", section));
        }
        data.getInt();
        this.LA = data.getShort();
        this.v4 = data.getShort();
        data.getInt();
        this.nm = new short[data.getInt() / 2];
        for (int index = 0; index < this.nm.length; index++) {
            this.nm[index] = data.getShort();
        }
    }
}
