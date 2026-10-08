package cn.pokemmo.ui.app;

import com.badlogic.gdx.utils.BufferUtils;
import f.*;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.util.HashMap;
import org.lwjgl.glfw.GLFW;

/**
 * 现代化重构类 - 原始类: f.PA
 */
public abstract class ApplicationLifecycleManager implements fy0_0 {

    public static final HashMap N30;
    public static int u2;
    public static boolean q00;
    public final es_1 f1;
    public int SQ;
    public int Os;
    public int Y3;
    public int fv0;
    public boolean MR;
    public boolean tJ0;
    public cg_1 dx0;

    public ApplicationLifecycleManager() {
        super();
        this.f1 = new es_1();
    }

    public ApplicationLifecycleManager(cg_1 config) {
        super();
        this.f1 = new es_1();
        this.dx0 = config;
        this.zY();
    }

    static {
        N30 = new HashMap();
        q00 = false;
    }

    public abstract com.badlogic.gdx.graphics.Texture w1(y_0 descriptor);

    public abstract void WX(lq_2 texture);

    public abstract void x30(lq_2 texture);

    public final void zY() {
        sY gl = lg_0.Sf0;
        if (lg_0.S4.COm2 == null) {
            if (!GLFW.glfwExtensionSupported("GL_OES_packed_depth_stencil")) {
                lg_0.S4.getClass();
                GLFW.glfwExtensionSupported("GL_EXT_packed_depth_stencil");
            }
            es_1 descriptors = this.dx0.Mc0;
            if (descriptors.KB > 1) {
                throw new nf_1("Multiple render targets not available on GLES 2.0");
            }
            I2 descriptorIterator = descriptors.ZD();
            while (descriptorIterator.hasNext()) {
                ((y_0) descriptorIterator.next()).getClass();
            }
        }
        if (!q00) {
            q00 = true;
            lg_0.k.getClass();
            if (hb0_2.BN == hb0_2.XU) {
                IntBuffer samples = ByteBuffer.allocateDirect(64)
                        .order(ByteOrder.nativeOrder())
                        .asIntBuffer();
                gl.glGetIntegerv(36006, samples);
                u2 = samples.get(0);
            } else {
                u2 = 0;
            }
        }

        int width = this.dx0.Yd0;
        int height = this.dx0.JY;
        this.SQ = gl.glGenFramebuffer();
        gl.glBindFramebuffer(36160, this.SQ);

        if (this.dx0.c9) {
            this.Os = gl.glGenRenderbuffer();
            gl.glBindRenderbuffer(36161, this.Os);
            gl.glRenderbufferStorage(36161, this.dx0.Ht.Kp0, width, height);
        }
        if (this.dx0.s9) {
            this.Y3 = gl.glGenRenderbuffer();
            gl.glBindRenderbuffer(36161, this.Y3);
            gl.glRenderbufferStorage(36161, this.dx0.rg.Kp0, width, height);
        }

        this.tJ0 = this.dx0.Mc0.KB > 1;
        int attachment = 0;
        if (this.tJ0) {
            I2 descriptors = this.dx0.Mc0.ZD();
            while (descriptors.hasNext()) {
                y_0 descriptor = (y_0) descriptors.next();
                lq_2 texture = (lq_2) this.w1(descriptor);
                this.f1.Ue0(texture);
                int colorAttachment = 36064 + attachment;
                gl.glFramebufferTexture2D(36160, colorAttachment, 3553,
                        texture.getTextureObjectHandle(), 0);
                attachment++;
            }
        } else {
            y_0 descriptor = (y_0) this.dx0.Mc0.KI();
            lq_2 texture = (lq_2) this.w1(descriptor);
            this.f1.Ue0(texture);
            gl.glBindTexture(texture.glTarget, texture.getTextureObjectHandle());
        }

        if (this.tJ0) {
            IntBuffer attachments = BufferUtils.yD0(attachment);
            for (int i = 0; i < attachment; i++) {
                attachments.put(36064 + i);
            }
            attachments.position(0);
            lg_0.MA.PM(attachment, attachments);
        } else {
            this.x30((lq_2) this.f1.KI());
        }

        if (this.dx0.c9) {
            gl.glFramebufferRenderbuffer(36160, 36096, 36161, this.Os);
        }
        if (this.dx0.s9) {
            gl.glFramebufferRenderbuffer(36160, 36128, 36161, this.Y3);
        }

        gl.glBindRenderbuffer(36161, 0);
        I2 textures = this.f1.ZD();
        while (textures.hasNext()) {
            lq_2 texture = (lq_2) textures.next();
            gl.glBindTexture(texture.glTarget, 0);
        }

        int status = gl.glCheckFramebufferStatus(36160);
        boolean packedStencilSupported = false;
        if (status == 36061 && this.dx0.c9 && this.dx0.s9) {
            lg_0.S4.getClass();
            packedStencilSupported = GLFW.glfwExtensionSupported("GL_OES_packed_depth_stencil");
            if (!packedStencilSupported) {
                lg_0.S4.getClass();
                packedStencilSupported = GLFW.glfwExtensionSupported("GL_EXT_packed_depth_stencil");
            }
        }
        if (status == 36061
                && this.dx0.c9
                && this.dx0.s9
                && packedStencilSupported) {
            if (this.dx0.c9) {
                gl.glDeleteRenderbuffer(this.Os);
                this.Os = 0;
            }
            if (this.dx0.s9) {
                gl.glDeleteRenderbuffer(this.Y3);
                this.Y3 = 0;
            }
            this.fv0 = gl.glGenRenderbuffer();
            this.MR = true;
            gl.glBindRenderbuffer(36161, this.fv0);
            gl.glRenderbufferStorage(36161, 35056, width, height);
            gl.glBindRenderbuffer(36161, 0);
            gl.glFramebufferRenderbuffer(36160, 36096, 36161, this.fv0);
            gl.glFramebufferRenderbuffer(36160, 36128, 36161, this.fv0);
            status = gl.glCheckFramebufferStatus(36160);
        }

        gl.glBindFramebuffer(36160, u2);
        if (status != 36053) {
            I2 created = this.f1.ZD();
            while (created.hasNext()) {
                this.WX((lq_2) created.next());
            }
            if (this.MR) {
                gl.glDeleteBuffer(this.fv0);
            } else {
                if (this.dx0.c9) {
                    gl.glDeleteRenderbuffer(this.Os);
                }
                if (this.dx0.s9) {
                    gl.glDeleteRenderbuffer(this.Y3);
                }
            }
            gl.glDeleteFramebuffer(this.SQ);
            if (status == 36054) {
                throw new IllegalStateException(
                        "Frame buffer couldn't be constructed: incomplete attachment");
            }
            if (status == 36057) {
                throw new IllegalStateException(
                        "Frame buffer couldn't be constructed: incomplete dimensions");
            }
            if (status == 36055) {
                throw new IllegalStateException(
                        "Frame buffer couldn't be constructed: missing attachment");
            }
            if (status == 36061) {
                throw new IllegalStateException(
                        "Frame buffer couldn't be constructed: unsupported combination of formats");
            }
            throw new IllegalStateException(
                    yr_1.pG("Frame buffer couldn't be constructed: unknown error ", status));
        }

        Dt0 application = lg_0.k;
        es_1 cached = (es_1) N30.get(application);
        if (cached == null) {
            cached = new es_1();
        }
        cached.Ue0(this);
        N30.put(application, cached);
    }

    public final void dispose() {
        sY gl = lg_0.Sf0;
        I2 textures = this.f1.ZD();
        while (textures.hasNext()) {
            this.WX((lq_2) textures.next());
        }
        if (this.MR) {
            gl.glDeleteRenderbuffer(this.fv0);
        } else {
            if (this.dx0.c9) {
                gl.glDeleteRenderbuffer(this.Os);
            }
            if (this.dx0.s9) {
                gl.glDeleteRenderbuffer(this.Y3);
            }
        }
        gl.glDeleteFramebuffer(this.SQ);
        es_1 cached = (es_1) N30.get(lg_0.k);
        if (cached != null) {
            cached.sj0(this, true);
        }
    }

    public final void synchronized$() {
        sY gl = lg_0.Sf0;
        gl.glBindFramebuffer(36160, this.SQ);
        gl.glViewport(0, 0, this.dx0.Yd0, this.dx0.JY);
    }

    public final void end() {
        int width = lg_0.S4.cJ;
        int height = lg_0.S4.eP;
        sY gl = lg_0.Sf0;
        gl.glBindFramebuffer(36160, u2);
        gl.glViewport(0, 0, width, height);
    }
}
