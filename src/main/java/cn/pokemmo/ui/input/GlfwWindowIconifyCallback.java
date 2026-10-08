package cn.pokemmo.ui.input;

import f.Su0;
import org.lwjgl.glfw.GLFWWindowIconifyCallback;

public abstract class GlfwWindowIconifyCallback extends GLFWWindowIconifyCallback {
    public final Su0 rk0;

    public GlfwWindowIconifyCallback(Su0 su0) {
        this.rk0 = su0;
    }
}
