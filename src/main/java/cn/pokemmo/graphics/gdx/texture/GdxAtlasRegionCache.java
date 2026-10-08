package cn.pokemmo.graphics.gdx.texture;

import f.*;


import com.badlogic.gdx.graphics.g2d.Gdx2DPixmap;
import java.nio.ByteBuffer;

public class GdxAtlasRegionCache {
    public byte[] lJ0;
    public byte[] DA0;
    public int LA;
    public int v4;
    public ft_1 jr0;
    public in_1 EC0;
    public int eC0;
    public int ZL;

    public GdxAtlasRegionCache() {
    }

    public final i4_0 Qo0(Tt0 tt0) {
        return this.NK(tt0, this.LA, this.v4);
    }

    public final i4_0 NK(zd_0 zd0, int width, int height) {
        byte[] bArr;
        byte[] bArr2;
        if (this.EC0 == in_1.J9) {
            bArr = Ws0.ut(this.lJ0, width, height, this.ZL, this.eC0);
            bArr2 = Ws0.ut(this.DA0, width, height, 8, this.eC0);
        } else {
            bArr = this.lJ0;
            bArr2 = this.DA0;
        }

        LPT4_[][] lpt4_Arr = zd0.dc0;
        ft_1 ft1 = this.jr0;
        if (bArr.length == 0) {
            return new i4_0(1, 1, ix0_0.Vw);
        }

        i4_0 pixmap = new i4_0(width, height, ix0_0.Vw);
        if (ft1 == ft_1.LPT2) {
            bArr = Ws0.Go(bArr);
        } else if (ft1 != ft_1.CZ) {
            throw new RuntimeException("Unsupported cf: " + ft1.oJ0);
        }

        if (pixmap.rH0() != ix0_0.Vw) {
            throw new RuntimeException("Invalid format");
        }

        Gdx2DPixmap gdx2DPixmap = pixmap.XF;
        int pixelCount = gdx2DPixmap.mB0 * gdx2DPixmap.SH;
        ByteBuffer buffer = pixmap.Rh0();
        buffer.position(0);
        int limit = Math.min(pixelCount, buffer.remaining() / 4);

        if (lpt4_Arr[0].length == 16) {
            for (int i = 0; i < limit; i++) {
                byte b = bArr[i];
                int color = lpt4_Arr[bArr2[i] + (b >> 4)][b & 15].Lf0;
                buffer.putInt((color << 8) | (color >>> 24));
            }
        } else {
            for (int i = 0; i < limit; i++) {
                int color = lpt4_Arr[bArr2[i]][bArr[i] & 255].Lf0;
                buffer.putInt((color << 8) | (color >>> 24));
            }
        }

        buffer.position(0);
        return pixmap;
    }

    public final void Zd0(byte[] bArr, int width, int height, ft_1 ft1, in_1 in1) {
        this.lJ0 = bArr;
        this.jr0 = ft1;
        this.EC0 = in1;
        this.LA = width;
        if (in1 == in_1.J9 || in1 == in_1.bC0) {
            if (width < this.eC0) {
                this.LA = this.eC0;
            }
        }
        this.YA0(height);
        this.eC0 = 8;
        if (this.EC0 == in_1.J9 || this.EC0 == in_1.bC0) {
            if (this.LA < 8) {
                this.LA = 8;
            }
            if (this.v4 < 8) {
                this.v4 = 8;
            }
        }
        this.ZL = ft1.hg;
        this.DA0 = new byte[(8 / this.ZL) * bArr.length];
    }

    public final void YA0(int height) {
        this.v4 = height;
        if (this.EC0 == in_1.J9 || this.EC0 == in_1.bC0) {
            if (height < this.eC0) {
                this.v4 = this.eC0;
            }
        }
    }
}
