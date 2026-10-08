package cn.pokemmo.platform.desktop.glfw;

import f.*;


import com.badlogic.gdx.graphics.g2d.Gdx2DPixmap;
import java.nio.Buffer;
import org.lwjgl.glfw.GLFW;

public class GlfwCursorUtils {
    public GlfwCursorUtils() {
    }

    public static void tD(int target, i4_0 texture, int width, int height) {
        hb0_2 mode = hb0_2.BN;
        boolean forcedHardwareMipmap = mode == hb0_2.cw || mode == hb0_2.Rv0 || mode == hb0_2.XU;
        boolean supportsMipmap = GLFW.glfwExtensionSupported("GL_ARB_framebuffer_object")
            || GLFW.glfwExtensionSupported("GL_EXT_framebuffer_object")
            || (lg_0.Sf0 != null && lg_0.Sf0.getClass().getName().equals("com.badlogic.gdx.backends.lwjgl3.Lwjgl3GLES20"))
            || lg_0.MA != null;
        if (forcedHardwareMipmap || supportsMipmap) {
            upload(target, 0, texture);
            lg_0.Sf0.glGenerateMipmap(target);
            return;
        }

        upload(target, 0, texture);
        if (lg_0.Sf0 == null && width != height) {
            throw new nf_1("texture width and height must be square when using mipmapping.");
        }
        int level = 1;
        int mipWidth = texture.XF.SH / 2;
        int mipHeight = texture.XF.mB0 / 2;
        while (mipWidth > 0 && mipHeight > 0) {
            i4_0 mip = new i4_0(mipWidth, mipHeight, texture.rH0());
            mip.Pa0(DF0.Ha0);
            Gdx2DPixmap source = texture.XF;
            mip.XF.Cg(source, 0, 0, source.SH, source.mB0, 0, 0, mipWidth, mipHeight);
            if (level > 1) {
                texture.dispose();
            }
            upload(target, level, mip);
            mipWidth = mip.XF.SH / 2;
            mipHeight = mip.XF.mB0 / 2;
            level++;
            texture = mip;
        }
    }

    private static void upload(int target, int level, i4_0 texture) {
        Gdx2DPixmap pixmap = texture.XF;
        lg_0.OH0.glTexImage2D(target, level, texture.ro(), pixmap.SH, pixmap.mB0, 0, texture.Wc(), texture.t30(), (Buffer)texture.Rh0());
    }
}
