package cn.pokemmo.rom.gba.tileset;

import f.*;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class GbaAnimatedTileData {
    public final int fm;
    public final i4_0[][] Hl0;

    public GbaAnimatedTileData(ByteBuffer buffer, int offset, i8_0 palette, int width, int format, int height, int rotation) {
        super();
        this.Hl0 = new i4_0[height][width];
        this.fm = format;

        ByteBuffer table = buffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        ByteBuffer pixels = buffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        table.position(offset);

        byte[] tile = new byte[32];
        int[] offsets = new int[width];
        for (int index = 0; index < width; index++) {
            offsets[index] = G90.GF0(table.getInt());
        }

        while (rotation > 0) {
            int last = offsets[width - 1];
            for (int index = width - 1; index > 0; index--) {
                offsets[index] = offsets[index - 1];
            }
            offsets[0] = last;
            rotation--;
        }

        for (int column = 0; column < width; column++) {
            pixels.position(offsets[column]);
            for (int row = 0; row < height; row++) {
                pixels.get(tile);
                this.Hl0[row][column] = wI(tile, palette);
            }
        }
    }

    public static i4_0 wI(byte[] data, i8_0 palette) {
        i4_0 image = new i4_0(8, 8, ix0_0.Vw);
        int x = 0;
        int y = 0;
        for (int index = 0; index < data.length; index++) {
            int value = data[index];
            int low = value & 15;
            int high = (value >> 4) & 15;
            if (low > 0) {
                image.XF.XS(x, y, palette.ax[low]);
            }
            if (high > 0) {
                image.XF.XS(x + 1, y, palette.ax[high]);
            }

            int nextX = x + 2;
            if (nextX % 8 == 0) {
                int nextY = y + 1;
                if (nextY % 8 == 0) {
                    nextY = y - 7;
                } else {
                    nextX = x - 6;
                }
                if (nextX == 8) {
                    x = 0;
                    y = nextY + 8;
                } else {
                    x = nextX;
                    y = nextY;
                }
            } else {
                x = nextX;
            }
        }
        return image;
    }
}
