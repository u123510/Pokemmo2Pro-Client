package cn.pokemmo.ui.input;

import f.Su0;
import org.lwjgl.glfw.GLFWWindowFocusCallback;

public abstract class GlfwWindowFocusCallback extends GLFWWindowFocusCallback {
    public final Su0 Nf;

    public GlfwWindowFocusCallback(Su0 su0) {
        this.Nf = su0;
    }
}
