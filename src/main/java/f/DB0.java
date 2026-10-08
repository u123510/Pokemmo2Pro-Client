package f;

import cn.pokemmo.ui.window.GlfwWindowContext;
import org.lwjgl.glfw.GLFW;

/**
 * 兼容垫片 (Shim) - 原始混淆类: f.DB0
 * 核心逻辑已迁移至 cn.pokemmo.ui.window.GlfwWindowContext
 */
public class DB0 extends GlfwWindowContext {

    public DB0(Su0 su0) {
        super(su0);
        this.kp0 = new KA0(this);
        this.ft0 = new mo_0(this);
        this.L2 = new zo_1(this);
        this.NQ = new Bm0(this);
        this.mD = new de0_0(this);
        this.h10();
    }

}
