package cn.pokemmo.graphics.gl;

import f.*;
import com.badlogic.gdx.utils.BufferUtils;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;

public class StaticShortIndexBuffer implements lk0_2 {
    public final ShortBuffer xl;
    public final ByteBuffer nx;
    public int g8;
    public boolean nv;
    public boolean FX;
    public final int f50;

    public StaticShortIndexBuffer(boolean isStatic, int maxIndices) {
        this.nv = true;
        this.FX = false;
        this.nx = BufferUtils.I5(maxIndices * 2);
        this.f50 = isStatic ? 35044 : 35048;
        this.xl = this.nx.asShortBuffer();
        ((Buffer) this.xl).flip();
        ((Buffer) this.nx).flip();
        this.g8 = this.He();
    }

    public StaticShortIndexBuffer(int maxIndices) {
        this.nv = true;
        this.FX = false;
        this.nx = BufferUtils.I5(maxIndices * 2);
        this.f50 = 35044;
        this.xl = this.nx.asShortBuffer();
        ((Buffer) this.xl).flip();
        ((Buffer) this.nx).flip();
        this.g8 = this.He();
    }

    @Override
    public final int Id() {
        return this.xl.limit();
    }

    @Override
    public final int Kd() {
        return this.xl.capacity();
    }

    @Override
    public final void Gy0(int count, short[] values) {
        this.nv = true;
        ((Buffer) this.xl).clear();
        this.xl.put(values, 0, count);
        ((Buffer) this.xl).flip();
        ((Buffer) this.nx).position(0);
        ((Buffer) this.nx).limit(count << 1);
        if (this.FX) {
            lg_0.Sf0.glBufferSubData(34963, 0, this.nx.limit(), this.nx);
            this.nv = false;
        }
    }

    @Override
    public final ShortBuffer st0(boolean dirty) {
        this.nv |= dirty;
        return this.xl;
    }

    @Override
    public final void bind() {
        int handle = this.g8;
        if (handle == 0) {
            throw new nf_1("IndexBufferObject cannot be used after it has been disposed.");
        }

        lg_0.Sf0.glBindBuffer(34963, handle);
        if (this.nv) {
            ((Buffer) this.nx).limit(this.xl.limit() * 2);
            lg_0.Sf0.glBufferSubData(34963, 0, this.nx.limit(), this.nx);
            this.nv = false;
        }
        this.FX = true;
    }

    @Override
    public final void qe() {
        lg_0.Sf0.glBindBuffer(34963, 0);
        this.FX = false;
    }

    @Override
    public final void dispose() {
        lg_0.Sf0.glBindBuffer(34963, 0);
        lg_0.Sf0.glDeleteBuffer(this.g8);
        this.g8 = 0;
    }

    public final int He() {
        int handle = lg_0.Sf0.glGenBuffer();
        lg_0.Sf0.glBindBuffer(34963, handle);
        lg_0.Sf0.glBufferData(34963, this.nx.capacity(), null, this.f50);
        lg_0.Sf0.glBindBuffer(34963, 0);
        return handle;
    }
}
