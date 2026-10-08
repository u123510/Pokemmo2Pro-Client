package cn.pokemmo.ui.input;

import f.Su0;
import org.lwjgl.glfw.GLFWWindowMaximizeCallback;

public abstract class GlfwWindowMaximizeCallback extends GLFWWindowMaximizeCallback {
    public final Su0 JY;

    public GlfwWindowMaximizeCallback(Su0 su0) {
        this.JY = su0;
    }
}
