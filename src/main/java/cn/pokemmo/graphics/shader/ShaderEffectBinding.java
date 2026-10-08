package cn.pokemmo.graphics.shader;

import f.am_2;
import f.fy0_0;
import f.pc_1;
import f.u4_0;
import f.vt_0;

/**
 * 着色器效果属性绑定器
 * 原始类: f.wl0_1
 */
public class ShaderEffectBinding implements fy0_0 {
    public final am_2 vI0;
    public final u4_0 t50;

    public ShaderEffectBinding(am_2 am_2, pc_1 pc_1) {
        this.vI0 = am_2;
        this.t50 = pc_1;
    }

    public final void while$(vt_0 vt_0) {
        this.t50.Od0(vt_0, this.vI0);
    }

    @Override
    public final void dispose() {
        this.t50.dispose();
    }
}
