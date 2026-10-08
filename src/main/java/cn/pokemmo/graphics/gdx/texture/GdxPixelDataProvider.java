package cn.pokemmo.graphics.gdx.texture;

import f.*;


import com.badlogic.gdx.graphics.glutils.ETC1;
import com.badlogic.gdx.utils.BufferUtils;
import org.lwjgl.glfw.GLFW;

public class GdxPixelDataProvider implements E9 {
    public final Dn0 Mz;
    public ay_2 TJ;
    public boolean Wh0;
    public int Qi = 0;
    public int qT = 0;
    public boolean G2 = false;

    public GdxPixelDataProvider(Dn0 dn0) {
        this(dn0, false);
    }

    public GdxPixelDataProvider(Dn0 dn0, boolean z) {
        this.Mz = dn0;
        this.Wh0 = z;
    }

    public GdxPixelDataProvider(ay_2 ay_22, boolean z) {
        this.Mz = null;
        this.TJ = ay_22;
        this.Wh0 = z;
    }

    @Override
    public final ed_2 getType() {
        return ed_2.k4;
    }

    @Override
    public final boolean xZ() {
        return this.G2;
    }

    @Override
    public final void Dx0() {
        if (this.G2) {
            throw new nf_1("Already prepared");
        }
        if (this.Mz == null && this.TJ == null) {
            throw new nf_1("Can only load once from ETC1Data");
        }
        if (this.Mz != null) {
            this.TJ = new ay_2(this.Mz);
        }
        this.Qi = this.TJ.o5;
        this.qT = this.TJ.tx;
        this.G2 = true;
    }

    @Override
    public final void wJ(int i1) {
        if (!this.G2) {
            throw new nf_1("Call prepare() before calling consumeCompressedData()");
        }
        lg_0.S4.getClass();
        if (!GLFW.glfwExtensionSupported("GL_OES_compressed_ETC1_RGB8_texture")) {
            i4_0 i4_02 = ETC1.xL0(this.TJ, ix0_0.Tr);
            lg_0.OH0.glTexImage2D(i1, 0, i4_02.ro(), i4_02.XF.SH, i4_02.XF.mB0, 0, i4_02.Wc(), i4_02.t30(), i4_02.Rh0());
            if (this.Wh0) {
                c4_0.tD(i1, i4_02, i4_02.XF.SH, i4_02.XF.mB0);
            }
            i4_02.dispose();
            this.Wh0 = false;
        } else {
            lg_0.OH0.glCompressedTexImage2D(i1, 0, 36196, this.Qi, this.qT, 0, this.TJ.f.capacity() - this.TJ.jY, this.TJ.f);
            if (this.Wh0) {
                lg_0.Sf0.glGenerateMipmap(3553);
            }
        }
        BufferUtils.t7(this.TJ.f);
        this.TJ = null;
        this.G2 = false;
    }

    @Override
    public final i4_0 JX() {
        throw new nf_1("This TextureData implementation does not return a Pixmap");
    }

    @Override
    public final boolean mZ() {
        throw new nf_1("This TextureData implementation does not return a Pixmap");
    }

    @Override
    public final int Nx() {
        return this.Qi;
    }

    @Override
    public final int Af() {
        return this.qT;
    }

    @Override
    public final ix0_0 uv() {
        return ix0_0.Tr;
    }

    @Override
    public final boolean bm() {
        return this.Wh0;
    }

    @Override
    public final boolean wx() {
        return true;
    }
}
