package cn.pokemmo.graphics.gl;

import com.badlogic.gdx.graphics.g2d.Gdx2DPixmap;
import com.badlogic.gdx.utils.BufferUtils;
import f.*;
import java.nio.FloatBuffer;
import org.lwjgl.glfw.GLFW;

/**
 * 现代化重构类 - 原始类: f.lq_2
 */
public abstract class GLFrameBufferArray implements fy0_0 {

    private static float maxAnisotropicFilterLevel = 0.0f;
    public final int glTarget;
    protected int glHandle;
    protected eb0_1 minFilter;
    protected eb0_1 magFilter;
    protected a00_0 uWrap;
    protected a00_0 vWrap;
    protected float anisotropicFilterLevel;

    public GLFrameBufferArray(int i) {
        this(i, lg_0.OH0.glGenTexture());
    }

    public GLFrameBufferArray(int i, int i2) {
        this.minFilter = eb0_1.Y30;
        this.magFilter = eb0_1.Y30;
        this.uWrap = a00_0.x3;
        this.vWrap = a00_0.x3;
        this.anisotropicFilterLevel = 1.0f;
        this.glTarget = i;
        this.glHandle = i2;
    }

    public static float getMaxAnisotropicFilterLevel() {
        float f = maxAnisotropicFilterLevel;
        if (f > 0.0f) {
            return f;
        }
        lg_0.S4.getClass();
        if (GLFW.glfwExtensionSupported("GL_EXT_texture_filter_anisotropic")) {
            FloatBuffer S5 = BufferUtils.S5();
            S5.position(0);
            S5.limit(S5.capacity());
            lg_0.Sf0.glGetFloatv(34047, S5);
            float f2 = S5.get(0);
            maxAnisotropicFilterLevel = f2;
            return f2;
        }
        maxAnisotropicFilterLevel = 1.0f;
        return 1.0f;
    }

    public static void uploadImageData(int i, E9 e9) {
        uploadImageData(i, e9, 0);
    }

    public static void uploadImageData(int i, E9 e9, int i2) {
        if (e9 == null) {
            return;
        }
        if (!e9.xZ()) {
            e9.Dx0();
        }
        if (e9.getType() == ed_2.k4) {
            e9.wJ(i);
            return;
        }
        i4_0 JX = e9.JX();
        boolean mZ = e9.mZ();
        if (e9.uv() != JX.rH0()) {
            i4_0 i4_0Var = new i4_0(JX.XF.SH, JX.XF.mB0, e9.uv());
            i4_0Var.Pa0(DF0.Ha0);
            Gdx2DPixmap gdx2DPixmap = JX.XF;
            i4_0Var.XF.bJ(gdx2DPixmap, 0, 0, 0, 0, gdx2DPixmap.SH, gdx2DPixmap.mB0);
            if (e9.mZ()) {
                JX.dispose();
            }
            mZ = true;
            JX = i4_0Var;
        }
        lg_0.OH0.glPixelStorei(3317, 1);
        if (e9.bm()) {
            c4_0.tD(i, JX, JX.XF.SH, JX.XF.mB0);
        } else {
            lg_0.OH0.glTexImage2D(i, i2, JX.ro(), JX.XF.SH, JX.XF.mB0, 0, JX.Wc(), JX.t30(), JX.Rh0());
        }
        if (mZ) {
            JX.dispose();
        }
    }

    public void bind() {
        lg_0.OH0.glBindTexture(this.glTarget, this.glHandle);
    }

    public void bind(int i) {
        lg_0.OH0.glActiveTexture(i + 33984);
        lg_0.OH0.glBindTexture(this.glTarget, this.glHandle);
    }

    public eb0_1 getMinFilter() {
        return this.minFilter;
    }

    public eb0_1 getMagFilter() {
        return this.magFilter;
    }

    public a00_0 getUWrap() {
        return this.uWrap;
    }

    public a00_0 getVWrap() {
        return this.vWrap;
    }

    public int getTextureObjectHandle() {
        return this.glHandle;
    }

    public void unsafeSetWrap(a00_0 a00_0Var, a00_0 a00_0Var2) {
        unsafeSetWrap(a00_0Var, a00_0Var2, false);
    }

    public void unsafeSetWrap(a00_0 a00_0Var, a00_0 a00_0Var2, boolean z) {
        if (a00_0Var != null && (z || this.uWrap != a00_0Var)) {
            lg_0.OH0.glTexParameteri(this.glTarget, 10242, a00_0Var.kj);
            this.uWrap = a00_0Var;
        }
        if (a00_0Var2 != null && (z || this.vWrap != a00_0Var2)) {
            lg_0.OH0.glTexParameteri(this.glTarget, 10243, a00_0Var2.kj);
            this.vWrap = a00_0Var2;
        }
    }

    public void setWrap(a00_0 a00_0Var, a00_0 a00_0Var2) {
        this.uWrap = a00_0Var;
        this.vWrap = a00_0Var2;
        bind();
        lg_0.OH0.glTexParameteri(this.glTarget, 10242, a00_0Var.kj);
        lg_0.OH0.glTexParameteri(this.glTarget, 10243, a00_0Var2.kj);
    }

    public void unsafeSetFilter(eb0_1 eb0_1Var, eb0_1 eb0_1Var2) {
        unsafeSetFilter(eb0_1Var, eb0_1Var2, false);
    }

    public void unsafeSetFilter(eb0_1 eb0_1Var, eb0_1 eb0_1Var2, boolean z) {
        if (eb0_1Var != null && (z || this.minFilter != eb0_1Var)) {
            lg_0.OH0.glTexParameteri(this.glTarget, 10241, eb0_1Var.vv0);
            this.minFilter = eb0_1Var;
        }
        if (eb0_1Var2 != null && (z || this.magFilter != eb0_1Var2)) {
            lg_0.OH0.glTexParameteri(this.glTarget, 10240, eb0_1Var2.vv0);
            this.magFilter = eb0_1Var2;
        }
    }

    public void setFilter(eb0_1 eb0_1Var, eb0_1 eb0_1Var2) {
        this.minFilter = eb0_1Var;
        this.magFilter = eb0_1Var2;
        bind();
        lg_0.OH0.glTexParameteri(this.glTarget, 10241, eb0_1Var.vv0);
        lg_0.OH0.glTexParameteri(this.glTarget, 10240, eb0_1Var2.vv0);
    }

    public float unsafeSetAnisotropicFilter(float f) {
        return unsafeSetAnisotropicFilter(f, false);
    }

    public float unsafeSetAnisotropicFilter(float f, boolean z) {
        float maxAnisotropicFilterLevel2 = getMaxAnisotropicFilterLevel();
        if (maxAnisotropicFilterLevel2 == 1.0f) {
            return 1.0f;
        }
        float min = Math.min(f, maxAnisotropicFilterLevel2);
        if (!z && Math.abs(min - this.anisotropicFilterLevel) <= 0.1f) {
            return this.anisotropicFilterLevel;
        }
        lg_0.Sf0.glTexParameterf(3553, 34046, min);
        this.anisotropicFilterLevel = min;
        return min;
    }

    public float setAnisotropicFilter(float f) {
        float maxAnisotropicFilterLevel2 = getMaxAnisotropicFilterLevel();
        if (maxAnisotropicFilterLevel2 == 1.0f) {
            return 1.0f;
        }
        float min = Math.min(f, maxAnisotropicFilterLevel2);
        if (Math.abs(min - this.anisotropicFilterLevel) <= 0.1f) {
            return min;
        }
        bind();
        lg_0.Sf0.glTexParameterf(3553, 34046, min);
        this.anisotropicFilterLevel = min;
        return min;
    }

    public float getAnisotropicFilter() {
        return this.anisotropicFilterLevel;
    }

    public void delete() {
        int i = this.glHandle;
        if (i != 0) {
            lg_0.OH0.glDeleteTexture(i);
            this.glHandle = 0;
        }
    }

    @Override
    public void dispose() {
        delete();
    }
}
