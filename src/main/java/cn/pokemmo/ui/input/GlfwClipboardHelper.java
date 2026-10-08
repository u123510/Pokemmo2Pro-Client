package cn.pokemmo.ui.input;

import f.lg_0;
import org.lwjgl.glfw.GLFW;

public final class GlfwClipboardHelper {
    public static void setClipboardString(String string) {
        GLFW.glfwSetClipboardString(lg_0.S4.rt0.hc0, string);
    }

    public static void Ja0(String string) {
        setClipboardString(string);
    }
}
