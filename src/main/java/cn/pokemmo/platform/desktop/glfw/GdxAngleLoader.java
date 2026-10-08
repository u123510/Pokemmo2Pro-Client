/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.platform.desktop.glfw;

import f.*;


import com.badlogic.gdx.backends.lwjgl3.angle.ANGLELoader;
import f.UE;
import f.WN;
import f.di_2;
import f.dw_2;
import f.nf0_0;
import f.nf_1;
import f.qt_1;
import f.sm0_0;
import f.tw0_0;
import java.util.Locale;

public class GdxAngleLoader
extends di_2{
    public static void EK0() {
        dw_2.Og = "ANGLE";
        dw_2.CY();
        String[] stringArray = new String[1];
        String[] stringArray2 = stringArray;
        stringArray[0] = "angle";
        tw0_0.Ro0.qI0(true, stringArray2);
    }

    @Override
    public final boolean E(nf_1 nf_12) {
        Object object = Locale.ROOT;
        if (nf_12.getMessage().toLowerCase((Locale)object).contains("OpenGL 2.0 or higher with the FBO extension is required".toLowerCase((Locale)object)) || nf_12.getMessage().toLowerCase((Locale)object).contains("OpenGL is not supported by the video driver".toLowerCase((Locale)object)) || nf_12.getMessage().equalsIgnoreCase("Couldn't create window") || nf_12.getMessage().equalsIgnoreCase("Unable to initialize GLFW")) {
            if (ANGLELoader.isCompatible()) {
                if (qt_1.zm0 == qt_1.C1) {
                    object = System.getProperty("os.version");
                    if ("Windows XP".equalsIgnoreCase(System.getProperty("os.name")) || "5.1".equals(object)) {
                        tw0_0.uV.Ef0("PokeMMO", sm0_0.c0(nf0_0.d1), UE.iC, null, false);
                        System.exit(0);
                        return true;
                    }
                }
                if (WN.valueOf(dw_2.Og) != WN.Or0 || !ANGLELoader.isInstalled()) {
                    tw0_0.uV.Qu(nf_12.getMessage(), sm0_0.c0(nf0_0.Uh), UE.Oh0, LI::EK0, () -> System.exit(0), true);
                }
            }
            tw0_0.uV.Ef0("PokeMMO", sm0_0.c0(nf0_0.m2), UE.iC, () -> System.exit(0), false);
            return true;
        }
        return false;
    }
}

