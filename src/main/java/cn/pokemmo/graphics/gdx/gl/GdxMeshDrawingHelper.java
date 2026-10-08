package cn.pokemmo.graphics.gdx.gl;

import f.*;


import com.badlogic.gdx.graphics.Texture;
import java.nio.ByteBuffer;
import java.util.BitSet;

public class GdxMeshDrawingHelper extends CG {
    public static final Wr Mk0;
    public final au_2 Pa0;
    public Texture bq0;
    public boolean zz;
    public int fr0;
    public int Tq;
    public BitSet sO;

    public GdxMeshDrawingHelper(au_2 source) {
        this.zz = false;
        this.fr0 = -1;
        this.Tq = -1;
        this.sO = null;
        this.Pa0 = source;
    }

    static {
        Mk0 = new Wr(new zk_1());
        Mk0.O50(Mk0);
        Wr second = new Wr(new rf0_0());
        second.O50(second);
    }

    public final i4_0 R7() {
        this.Ik = hk0_1.KG;
        i4_0 image = this.Pa0.KN();
        this.fr0 = image.XF.SH;
        this.Tq = image.XF.mB0;
        if (this.zz && this.sO == null) {
            this.sO = new BitSet(image.XF.mB0);
            if (image.rH0() != ix0_0.Vw) {
                throw new RuntimeException("Not supported pixmap format = " + image.rH0());
            }
            int stride = this.fr0 * 4;
            ByteBuffer buffer = image.Rh0();
            while (buffer.hasRemaining()) {
                if ((buffer.getInt() & 255) == 0) {
                    continue;
                }
                int index = (buffer.position() - 4) / stride;
                this.sO.set(index);
                buffer.position((index + 1) * stride);
            }
            buffer.position(0);
        }
        return image;
    }

    public final Texture H8() {
        this.Ik = hk0_1.KG;
        if (this.bq0 != null) {
            return this.bq0;
        }
        i4_0 image = this.R7();
        this.bq0 = new Texture(image);
        this.bq0.setWrap(a00_0.xm0, a00_0.xm0);
        li_2.HA0(this);
        image.dispose();
        return this.bq0;
    }

    public final int zz() {
        return this.fr0;
    }

    public final int K0() {
        return this.Tq;
    }

    public final Xm0 coM8() {
        return new Xm0((Wr) (Object) this);
    }

    public final void ji0() {
        Texture texture = this.bq0;
        this.bq0 = null;
        li_2.cx(this);
        if (texture != null) {
            texture.dispose();
        }
    }

    public final AG0 T20() {
        return new AG0((Wr) (Object) this, 0, 0, -1, -1);
    }
}
