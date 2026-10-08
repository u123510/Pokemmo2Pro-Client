package cn.pokemmo.graphics.gdx.texture;

import f.*;


import com.badlogic.gdx.utils.BufferUtils;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

public class GdxCompressedTextureData implements kj_0 {
    public static final IntBuffer du0;
    public final sa_0 CoM9;
    public final FloatBuffer RI0;
    public final ByteBuffer qH0;
    public final boolean Vs0;
    public int finally$;
    public final int S0;
    public boolean wN;
    public boolean gf0;
    public int tD;
    public final Nn0 final$;

    static {
        du0 = BufferUtils.yD0(1);
    }

    public GdxCompressedTextureData(boolean isStatic, int numVertices, kz_0... attributes) {
        this(isStatic, numVertices, new sa_0(attributes));
    }

    public GdxCompressedTextureData(boolean isStatic, int numVertices, sa_0 attributes) {
        this.wN = false;
        this.gf0 = false;
        this.tD = -1;
        this.final$ = new Nn0();
        this.CoM9 = attributes;
        ByteBuffer byteBuffer = BufferUtils.qw0(attributes.u5 * numVertices);
        this.qH0 = byteBuffer;
        FloatBuffer asFloatBuffer = byteBuffer.asFloatBuffer();
        this.RI0 = asFloatBuffer;
        this.Vs0 = true;
        asFloatBuffer.flip();
        byteBuffer.flip();
        this.finally$ = lg_0.Sf0.glGenBuffer();
        this.S0 = isStatic ? 35044 : 35048;
        yg0();
    }

    public GdxCompressedTextureData(boolean isStatic, ByteBuffer byteBuffer, sa_0 attributes) {
        this.wN = false;
        this.gf0 = false;
        this.tD = -1;
        this.final$ = new Nn0();
        this.CoM9 = attributes;
        this.qH0 = byteBuffer;
        this.Vs0 = false;
        FloatBuffer asFloatBuffer = byteBuffer.asFloatBuffer();
        this.RI0 = asFloatBuffer;
        asFloatBuffer.flip();
        byteBuffer.flip();
        this.finally$ = lg_0.Sf0.glGenBuffer();
        this.S0 = isStatic ? 35044 : 35048;
        yg0();
    }

    public final sa_0 JP() {
        return this.CoM9;
    }

    public final int mB0() {
        return (this.RI0.limit() * 4) / this.CoM9.u5;
    }

    public final int Ew0() {
        return this.qH0.capacity() / this.CoM9.u5;
    }

    public final FloatBuffer st0(boolean markDirty) {
        this.wN |= markDirty;
        return this.RI0;
    }

    public final void ce0(int offset, int count, float[] vertices) {
        this.wN = true;
        BufferUtils.ys0(vertices, this.qH0, count, offset);
        this.RI0.position(0);
        this.RI0.limit(count);
        if (this.gf0) {
            lg_0.Sf0.glBindBuffer(34962, this.finally$);
            lg_0.Sf0.glBufferData(34962, this.qH0.limit(), this.qH0, this.S0);
            this.wN = false;
        }
    }

    public final void Fn0(lt_1 shader, int[] locations) {
        lb0_1 lb = lg_0.MA;
        lb.cC(this.tD);
        boolean isCached = this.final$.Ml != 0;
        int numAttributes = this.CoM9.Os.length;
        if (numAttributes != 0) {
            if (locations == null) {
                for (int i = 0; isCached && i < numAttributes; i++) {
                    String alias = this.CoM9.Os[i].ot0;
                    int location = shader.Us.Rl0(-1, alias);
                    isCached = (location == this.final$.X8(i));
                }
            } else {
                isCached = (locations.length == this.final$.Ml);
                for (int i = 0; isCached && i < numAttributes; i++) {
                    isCached = (locations[i] == this.final$.X8(i));
                }
            }
        }
        if (!isCached) {
            lg_0.OH0.glBindBuffer(34962, this.finally$);
            if (this.final$.Ml != 0) {
                int cachedCount = this.CoM9.Os.length;
                for (int i = 0; i < cachedCount; i++) {
                    int loc = this.final$.X8(i);
                    if (loc >= 0) {
                        shader.getClass();
                        lg_0.Sf0.glDisableVertexAttribArray(loc);
                    }
                }
            }
            this.final$.Ml = 0;
            for (int i = 0; i < numAttributes; i++) {
                kz_0 attribute = this.CoM9.Os[i];
                if (locations == null) {
                    this.final$.ja0(shader.Us.Rl0(-1, attribute.ot0));
                } else {
                    this.final$.ja0(locations[i]);
                }
                int loc = this.final$.X8(i);
                if (loc >= 0) {
                    shader.getClass();
                    lg_0.Sf0.glEnableVertexAttribArray(loc);
                    lg_0.Sf0.glVertexAttribPointer(loc, attribute.dG0, attribute.IK0, attribute.UO, this.CoM9.u5, attribute.Kk0);
                }
            }
        }
        if (this.wN) {
            lb.glBindBuffer(34962, this.finally$);
            this.qH0.limit(this.RI0.limit() * 4);
            lb.glBufferData(34962, this.qH0.limit(), this.qH0, this.S0);
            this.wN = false;
        }
        this.gf0 = true;
    }

    public final void yK0(lt_1 shader, int[] locations) {
        lg_0.MA.cC(0);
        this.gf0 = false;
    }

    public final void dispose() {
        lg_0.MA.glBindBuffer(34962, 0);
        lg_0.MA.glDeleteBuffer(this.finally$);
        this.finally$ = 0;
        if (this.Vs0) {
            BufferUtils.t7(this.qH0);
        }
        if (this.tD != -1) {
            du0.clear();
            du0.put(this.tD);
            du0.flip();
            lg_0.MA.Bi(du0);
            this.tD = -1;
        }
    }

    public final void yg0() {
        du0.clear();
        lg_0.MA.iB(du0);
        this.tD = du0.get();
    }
}
