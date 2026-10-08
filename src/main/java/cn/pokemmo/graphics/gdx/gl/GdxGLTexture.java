package cn.pokemmo.graphics.gdx.gl;

import f.*;


import com.badlogic.gdx.utils.BufferUtils;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;

public class GdxGLTexture implements kj_0 {
    public sa_0 xi;
    public FloatBuffer wi0;
    public ByteBuffer Sx;
    public boolean Lx;
    public int ox;
    public int lPt4;
    public boolean gs;
    public boolean Z80;

    public GdxGLTexture(boolean isStatic, int numVertices, kz_0... attributes) {
        this(isStatic, numVertices, new sa_0(attributes));
    }

    public GdxGLTexture(boolean isStatic, int numVertices, sa_0 attributes) {
        this.gs = false;
        this.Z80 = false;
        this.ox = lg_0.Sf0.glGenBuffer();
        ByteBuffer buffer = BufferUtils.qw0(attributes.u5 * numVertices);
        buffer.limit(0);
        L2(buffer, true, attributes);
        K10(isStatic ? 35044 : 35048);
    }

    public GdxGLTexture(int usage, ByteBuffer buffer, boolean isOwner, sa_0 attributes) {
        this.gs = false;
        this.Z80 = false;
        this.ox = lg_0.Sf0.glGenBuffer();
        L2(buffer, isOwner, attributes);
        K10(usage);
    }

    @Override
    public final sa_0 JP() {
        return this.xi;
    }

    @Override
    public final int mB0() {
        return (this.wi0.limit() * 4) / this.xi.u5;
    }

    @Override
    public final int Ew0() {
        return this.Sx.capacity() / this.xi.u5;
    }

    @Override
    public final FloatBuffer st0(boolean z) {
        this.gs |= z;
        return this.wi0;
    }

    public final void L2(Buffer buffer, boolean isOwner, sa_0 attributes) {
        if (this.Z80) {
            throw new nf_1("Cannot change attributes while VBO is bound");
        }
        if (this.Lx && this.Sx != null) {
            BufferUtils.t7(this.Sx);
        }
        this.xi = attributes;
        if (!(buffer instanceof ByteBuffer)) {
            throw new nf_1("Only ByteBuffer is currently supported");
        }
        ByteBuffer byteBuffer = (ByteBuffer) buffer;
        this.Sx = byteBuffer;
        this.Lx = isOwner;
        int limit = byteBuffer.limit();
        this.Sx.limit(this.Sx.capacity());
        this.wi0 = this.Sx.asFloatBuffer();
        this.Sx.limit(limit);
        this.wi0.limit(limit / 4);
    }

    @Override
    public final void ce0(int offset, int count, float[] vertices) {
        this.gs = true;
        BufferUtils.ys0(vertices, this.Sx, count, offset);
        this.wi0.position(0);
        this.wi0.limit(count);
        if (this.Z80) {
            lg_0.Sf0.glBufferData(34962, this.Sx.limit(), this.Sx, this.lPt4);
            this.gs = false;
        }
    }

    public final void K10(int usage) {
        if (this.Z80) {
            throw new nf_1("Cannot change usage while VBO is bound");
        }
        this.lPt4 = usage;
    }

    @Override
    public final void Fn0(lt_1 shader, int[] locations) {
        sY gl = lg_0.Sf0;
        gl.glBindBuffer(34962, this.ox);
        if (this.gs) {
            this.Sx.limit(this.wi0.limit() * 4);
            gl.glBufferData(34962, this.Sx.limit(), this.Sx, this.lPt4);
            this.gs = false;
        }
        int numAttributes = this.xi.Os.length;
        if (locations == null) {
            for (int i = 0; i < numAttributes; i++) {
                kz_0 attribute = this.xi.Os[i];
                int location = shader.Us.Rl0(-1, attribute.ot0);
                if (location >= 0) {
                    gl.glEnableVertexAttribArray(location);
                    gl.glVertexAttribPointer(location, attribute.dG0, attribute.IK0, attribute.UO, this.xi.u5, attribute.Kk0);
                }
            }
        } else {
            for (int i = 0; i < numAttributes; i++) {
                kz_0 attribute = this.xi.Os[i];
                int location = locations[i];
                if (location >= 0) {
                    gl.glEnableVertexAttribArray(location);
                    gl.glVertexAttribPointer(location, attribute.dG0, attribute.IK0, attribute.UO, this.xi.u5, attribute.Kk0);
                }
            }
        }
        this.Z80 = true;
    }

    @Override
    public final void yK0(lt_1 shader, int[] locations) {
        sY gl = lg_0.Sf0;
        int numAttributes = this.xi.Os.length;
        if (locations == null) {
            for (int i = 0; i < numAttributes; i++) {
                shader.kC(this.xi.Os[i].ot0);
            }
        } else {
            for (int i = 0; i < numAttributes; i++) {
                int location = locations[i];
                if (location >= 0) {
                    gl.glDisableVertexAttribArray(location);
                }
            }
        }
        gl.glBindBuffer(34962, 0);
        this.Z80 = false;
    }

    @Override
    public final void dispose() {
        sY gl = lg_0.Sf0;
        gl.glBindBuffer(34962, 0);
        gl.glDeleteBuffer(this.ox);
        this.ox = 0;
        if (this.Lx) {
            BufferUtils.t7(this.Sx);
        }
    }
}
