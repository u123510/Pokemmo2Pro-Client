/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.platform.desktop.glfw;

import f.*;


import f.Cq0;
import f.NR;
import f.com5__4;
import f.dl_1;
import f.ea0_1;
import f.l6_0;
import f.m4_0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.lwjgl.glfw.GLFW;

public abstract class GlfwNativeBuffer {
    public static final dl_1 gs;

    public static ArrayList kf0() {
        ArrayList<m4_0> arrayList2 = new ArrayList<m4_0>();
        String string = System.getenv("XDG_SESSION_TYPE");
        if (NR.dy0 == com5__4.Zv) {
            String flatpakInfo;
            try {
                ArrayList<String> args = new ArrayList<String>();
                args.add("flatpak");
                args.add("info");
                args.add("--show-permissions");
                args.add("com.pokemmo.PokeMMO");
                ProcessBuilder processBuilder = new ProcessBuilder((List<String>)args);
                flatpakInfo = new String(processBuilder.start().getInputStream().readAllBytes());
                if (flatpakInfo.contains("x11")) {
                    arrayList2.add(m4_0.Ox);
                }
            }
            catch (Exception exception) {
                gs.info("Could not receive flatpak info. Assuming X11");
                arrayList2.add(m4_0.Ox);
                return arrayList2;
            }
            if (flatpakInfo.contains("wayland")) {
                String waylandDisplay = System.getenv("WAYLAND_DISPLAY");
                if (GLFW.glfwPlatformSupported(393219) && string != null && string.contains("wayland") && waylandDisplay != null) {
                    arrayList2.add(m4_0.wk0);
                }
            }
            return arrayList2;
        }
        String string3 = System.getenv("WAYLAND_DISPLAY");
        if (GLFW.glfwPlatformSupported(393219) && string != null && string.contains("wayland") && string3 != null) {
            arrayList2.add(m4_0.wk0);
            arrayList2.add(m4_0.Ox);
        }
        if (GLFW.glfwPlatformSupported(393220) && string != null && string.contains("x11")) {
            arrayList2.add(m4_0.Ox);
        }
        return arrayList2;
    }

    public static boolean Ef0(String ... stringArray) {
        Process process;
        try {
            process = Runtime.getRuntime().exec(stringArray);
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return false;
        }
        try {
            process.waitFor(1000L, TimeUnit.MILLISECONDS);
        }
        catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
            return false;
        }
        return process.exitValue() == 0;
    }

    static {
        block8: {
            HashSet<l6_0> hashSet;
            l6_0[] l6_0Array;
            gs = Cq0.E1(GlfwNativeBuffer.class);
            if (ea0_1.rv0) {
                if (System.getenv().containsKey("POKEMMO_IS_SNAPPED")) {
                    NR.dy0 = com5__4.Xv0;
                } else if (System.getenv().containsKey("POKEMMO_IS_FLATPAKED")) {
                    NR.dy0 = com5__4.Zv;
                }
            }
            if (NR.dy0 == com5__4.a7 || (l6_0Array = (l6_0[])com5__4.Lh0.get((Object)NR.dy0)).length <= 0) break block8;
            HashSet<l6_0> hashSet2 = new HashSet<l6_0>();
            NR.Bf = hashSet2;
            for (l6_0 l6_02 : l6_0Array) {
                block11: {
                    boolean bl;
                    block10: {
                        block9: {
                            if (NR.dy0 != com5__4.Xv0) continue;
                            if (l6_02 != l6_0.tt) break block9;
                            bl = NI.Ef0("snapctl", "is-connected", "joystick");
                            break block10;
                        }
                        if (l6_02 != l6_0.F0) break block11;
                        bl = NI.Ef0("snapctl", "is-connected", "removable-media");
                    }
                    if (!bl) continue;
                    hashSet2.add(l6_02);
                    continue;
                }
                throw new UnsupportedOperationException("Unsupported permission type test requested");
            }
        }
    }
}

