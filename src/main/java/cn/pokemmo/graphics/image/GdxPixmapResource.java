package cn.pokemmo.graphics.image;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Gdx2DPixmap;
import f.*;
import java.io.IOException;
import java.nio.ByteBuffer;

/**
 * 现代化重构类 - 原始类: f.i4_0
 */
public class GdxPixmapResource implements fy0_0 {

    public final Gdx2DPixmap XF;
    public int Je0;
    public boolean Mp;

    public GdxPixmapResource(int width, int height, ix0_0 format) {
        super();
        DF0 var_df0 = DF0.Ha0;
        IB0[] var_ib0 = IB0.j10;
        this.Je0 = 0;
        this.XF = new Gdx2DPixmap(width, height, ix0_0.p9(format));
        K7(0.0f, 0.0f, 0.0f, 0.0f);
        kd();
    }

    private static void dummyThrow() throws IOException {}

    public GdxPixmapResource(byte[] bytes, int offset, int len) {
        super();
        DF0 var_df0 = DF0.Ha0;
        IB0[] var_ib0 = IB0.j10;
        this.Je0 = 0;
        try {
            dummyThrow();
            this.XF = new Gdx2DPixmap(bytes, offset, len, 0);
        } catch (IOException e) {
            throw new nf_1("Couldn't load pixmap from image data", e);
        }
    }

    public GdxPixmapResource(ByteBuffer buffer, int offset, int len) {
        super();
        DF0 var_df0 = DF0.Ha0;
        IB0[] var_ib0 = IB0.j10;
        this.Je0 = 0;
        if (!buffer.isDirect()) {
            throw new nf_1("Couldn't load pixmap from non-direct ByteBuffer");
        }
        try {
            dummyThrow();
            this.XF = new Gdx2DPixmap(buffer, offset, len, 0);
        } catch (IOException e) {
            throw new nf_1("Couldn't load pixmap from image data", e);
        }
    }

    public GdxPixmapResource(ByteBuffer buffer) {
        this(buffer, buffer.position(), buffer.remaining());
    }

    public GdxPixmapResource(Dn0 fileHandle) {
        super();
        DF0 var_df0 = DF0.Ha0;
        IB0[] var_ib0 = IB0.j10;
        this.Je0 = 0;
        try {
            byte[] bytes = fileHandle.kI0();
            this.XF = new Gdx2DPixmap(bytes, 0, bytes.length, 0);
        } catch (Exception e) {
            throw new nf_1("Couldn't load file: " + fileHandle, e);
        }
    }

    public GdxPixmapResource(Gdx2DPixmap pixmap) {
        super();
        DF0 var_df0 = DF0.Ha0;
        IB0[] var_ib0 = IB0.j10;
        this.Je0 = 0;
        this.XF = pixmap;
    }

    public final void Pa0(DF0 v1) {
        this.XF.Fj0(v1 == DF0.Ha0 ? 0 : 1);
    }

    public final void K7(float r, float g, float b, float a) {
        this.Je0 = Color.rgba8888(r, g, b, a);
    }

    public final void bI(Color color) {
        this.Je0 = Color.rgba8888(color.r, color.g, color.b, color.a);
    }

    public final void kd() {
        this.XF.Vd(this.Je0);
    }

    public final void NH0(i4_0 v1, int i2, int i3) {
        Gdx2DPixmap gdx2DPixmap = v1.XF;
        this.XF.bJ(gdx2DPixmap, 0, 0, i2, i3, gdx2DPixmap.SH, gdx2DPixmap.mB0);
    }

    public final int Sq0() {
        return this.XF.SH;
    }

    public final int Oi() {
        return this.XF.mB0;
    }

    @Override
    public void dispose() {
        if (this.Mp) {
            throw new nf_1("Pixmap already disposed!");
        }
        this.XF.dispose();
        this.Mp = true;
    }

    public final void oZ(int x, int y, int color) {
        this.XF.XS(x, y, color);
    }

    public final int Wc() {
        return Gdx2DPixmap.abstract$(this.XF.cW);
    }

    public final int ro() {
        return Gdx2DPixmap.abstract$(this.XF.cW);
    }

    public final int t30() {
        int format = this.XF.cW;
        switch (format) {
            case 1:
            case 2:
            case 3:
            case 4:
                return 5121;
            case 5:
                return 33635;
            case 6:
                return 32819;
            default:
                throw new nf_1(yr_1.pG("unknown format: ", format));
        }
    }

    public final ByteBuffer Rh0() {
        if (this.Mp) {
            throw new nf_1("Pixmap already disposed");
        }
        return this.XF.o2;
    }

    public final ix0_0 rH0() {
        return ix0_0.Xt(this.XF.cW);
    }

    public final void dw0(i4_0 v1, int i2, int i3, int i4, int i5) {
        this.XF.bJ(v1.XF, i2, i3, 0, 0, i4, i5);
    }
}
