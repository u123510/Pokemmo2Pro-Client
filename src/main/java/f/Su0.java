package f;

import cn.pokemmo.ui.window.GlfwGraphicsContext;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.glfw.GLFW;

/**
 * 兼容垫片 (Shim) - 原始混淆类: f.Su0
 * 核心逻辑已迁移至 cn.pokemmo.ui.window.GlfwGraphicsContext
 */
public class Su0 extends GlfwGraphicsContext {

    public Su0(OR var1, DZ var2, ee_2 var3) {
        super(var1, var2, var3);
        this.KG = new H20(this);
        this.Pe = new L80(this);
        this.Kr0 = new Mx(this);
        this.vF = new qd0_1(this);
        this.yL0 = new id0_0(this);
        this.vh0 = new ag0_0(this);
    }

}
