package cn.pokemmo.graphics.gdx.gl;

import f.*;


import com.badlogic.gdx.utils.BufferUtils;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;

public class GdxVertexBufferObject implements lk0_2 {
    public final ShortBuffer ue;
    public final ByteBuffer yy0;
    public final boolean ff;
    public int nD;
    public boolean Aj0;
    public boolean Xe0;
    public final int uE;
    public final boolean Lpt1;

    public GdxVertexBufferObject(int i) {
        this(true, i);
    }

    public GdxVertexBufferObject(boolean z, int i) {
        this.Aj0 = true;
        this.Xe0 = false;
        boolean isEmpty = (i == 0);
        this.Lpt1 = isEmpty;
        if (isEmpty) {
            i = 1;
        }

        this.yy0 = BufferUtils.qw0(i * 2);
        this.ue = this.yy0.asShortBuffer();
        this.ff = true;
        ((Buffer) this.ue).flip();
        ((Buffer) this.yy0).flip();
        this.nD = lg_0.Sf0.glGenBuffer();
        this.uE = z ? 35044 : 35048;
    }

    public GdxVertexBufferObject(boolean z, ByteBuffer byteBuffer) {
        this.Aj0 = true;
        this.Xe0 = false;
        boolean isEmpty = (((Buffer) byteBuffer).limit() == 0);
        this.Lpt1 = isEmpty;
        this.yy0 = byteBuffer;
        this.ue = byteBuffer.asShortBuffer();
        this.ff = false;
        this.nD = lg_0.Sf0.glGenBuffer();
        this.uE = z ? 35044 : 35048;
    }

    @Override
    public final int Id() {
        if (this.Lpt1) {
            return 0;
        }
        return ((Buffer) this.ue).limit();
    }

    @Override
    public final int Kd() {
        if (this.Lpt1) {
            return 0;
        }
        return ((Buffer) this.ue).capacity();
    }

    @Override
    public final void Gy0(int i, short[] arrs) {
        this.Aj0 = true;
        ((Buffer) this.ue).clear();
        this.ue.put(arrs, 0, i);
        ((Buffer) this.ue).flip();
        ((Buffer) this.yy0).position(0);
        ((Buffer) this.yy0).limit(i << 1);

        if (this.Xe0) {
            lg_0.Sf0.glBufferData(34963, ((Buffer) this.yy0).limit(), this.yy0, this.uE);
            this.Aj0 = false;
        }
    }

    @Override
    public final ShortBuffer st0(boolean z) {
        this.Aj0 |= z;
        return this.ue;
    }

    @Override
    public final void bind() {
        int i = this.nD;
        if (i == 0) {
            throw new nf_1("No buffer allocated!");
        }

        lg_0.Sf0.glBindBuffer(34963, i);
        if (this.Aj0) {
            ((Buffer) this.yy0).limit(((Buffer) this.ue).limit() * 2);
            lg_0.Sf0.glBufferData(34963, ((Buffer) this.yy0).limit(), this.yy0, this.uE);
            this.Aj0 = false;
        }
        this.Xe0 = true;
    }

    @Override
    public final void qe() {
        lg_0.Sf0.glBindBuffer(34963, 0);
        this.Xe0 = false;
    }

    @Override
    public final void dispose() {
        lg_0.Sf0.glBindBuffer(34963, 0);
        lg_0.Sf0.glDeleteBuffer(this.nD);
        this.nD = 0;
        if (this.ff) {
            BufferUtils.t7(this.yy0);
        }
    }
}
