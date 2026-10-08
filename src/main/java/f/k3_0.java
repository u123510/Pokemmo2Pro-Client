package f;

import cn.pokemmo.ui.input.GlfwInputProcessor;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.PointerBuffer;
import org.lwjgl.glfw.GLFW;

/**
 * 兼容垫片 (Shim) - 原始混淆类: f.k3_0
 * 核心逻辑已迁移至 cn.pokemmo.ui.input.GlfwInputProcessor
 */
public class k3_0 extends GlfwInputProcessor {

    public k3_0(Su0 su0) {
        super(su0);
        this.UB = new _public(this);
        GLFW.glfwSetFramebufferSizeCallback(su0.Z6(), this.UB);
    }

}
