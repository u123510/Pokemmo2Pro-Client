/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.graphics.gdx.gl;

import f.*;


import com.badlogic.gdx.utils.BufferUtils;
import f.lk0_2;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;

public class GdxShortIndexBuffer
implements lk0_2 {
    public final ShortBuffer Na0;
    public final ByteBuffer ru;
    public final boolean DF;

    public GdxShortIndexBuffer(int n) {
        boolean bl = n == 0;
        this.DF = bl;
        if (bl) {
            n = 1;
        }
        this.ru = BufferUtils.qw0(n * 2);
        this.Na0 = this.ru.asShortBuffer();
        ((Buffer)this.Na0).flip();
        ((Buffer)this.ru).flip();
    }

    @Override
    public final int Id() {
        return this.DF ? 0 : this.Na0.limit();
    }

    @Override
    public final int Kd() {
        return this.DF ? 0 : this.Na0.capacity();
    }

    @Override
    public final void Gy0(int n, short[] sArray) {
        GdxShortIndexBuffer g6 = this;
        ((Buffer)g6.Na0).clear();
        g6.Na0.put(sArray, 0, n);
        ((Buffer)g6.Na0).flip();
        ((Buffer)g6.ru).position(0);
        ((Buffer)g6.ru).limit(n << 1);
    }

    @Override
    public final ShortBuffer st0(boolean bl) {
        return this.Na0;
    }

    @Override
    public final void bind() {
    }

    @Override
    public final void qe() {
    }

    @Override
    public final void dispose() {
        BufferUtils.t7(this.ru);
    }
}

