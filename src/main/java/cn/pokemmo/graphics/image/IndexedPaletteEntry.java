package cn.pokemmo.graphics.image;

import f.*;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class IndexedPaletteEntry implements Cloneable {
    public final XG0 Vc;
    public int[] ax;
    public final int nv0;

    public IndexedPaletteEntry(XG0 format, int index, ByteBuffer data) {
        this.nv0 = index;
        this.Vc = format;
        this.ax = new int[XG0.V3(format)];
        data.position(index);
        if (tx_1.T30(data, kd_2.GU) > 0) {
            ByteBuffer palette = ByteBuffer.wrap(tx_1.Gi(index, data)).order(ByteOrder.LITTLE_ENDIAN);
            if (this.ax.length < palette.capacity() / 2) {
                this.ax = new int[palette.capacity() / 2];
            }
            for (int i = 0; i < this.ax.length; ++i) {
                int packed = palette.getShort() & 0xffff;
                int r = packed / 1024;
                packed -= r * 1024;
                int g = packed / 32;
                int b = packed - g * 32;
                r = Math.min(r, 31);
                g = Math.min(g, 31);
                b = Math.min(b, 31);
                this.ax[i] = ((b * 8 & 255) << 24) | ((g * 8 & 255) << 16)
                        | ((r * 8 & 255) << 8) | 255;
            }
        } else {
            for (int i = 0; i < this.ax.length; ++i) {
                int packed = data.getShort() & 0xffff;
                int r = packed / 1024;
                packed -= r * 1024;
                int g = packed / 32;
                int b = packed - g * 32;
                r = Math.min(r, 31);
                g = Math.min(g, 31);
                b = Math.min(b, 31);
                this.ax[i] = ((b * 8 & 255) << 24) | ((g * 8 & 255) << 16)
                        | ((r * 8 & 255) << 8) | 255;
            }
        }
        if (this.ax.length > 0) {
            this.ax[0] = 0;
            this.ax[0] = 0;
        }
    }

    public final i8_0 e20() {
        try {
            i8_0 copy = (i8_0)super.clone();
            copy.ax = this.ax.clone();
            return copy;
        } catch (CloneNotSupportedException error) {
            error.printStackTrace();
            return null;
        }
    }

    public final i8_0 FQ() {
        try {
            i8_0 copy = (i8_0)super.clone();
            copy.ax = this.ax.clone();
            for (int i = 1; i < copy.ax.length; ++i) {
                int color = copy.ax[i];
                int blue = (color >>> 24) & 255;
                int green = (color >>> 16) & 255;
                int red = (color >>> 8) & 255;
                int average = (blue + green + red) / 3;
                copy.ax[i] = (average << 24) | (average << 16) | (average << 8) | 255;
            }
            return copy;
        } catch (CloneNotSupportedException error) {
            error.printStackTrace();
            return null;
        }
    }

    @Override
    public final Object clone() {
        return this.e20();
    }
}
