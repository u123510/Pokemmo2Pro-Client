package cn.pokemmo.graphics.render;

import f.hl0_1;
import f.jk_0;

public class CompositeRenderPrimitive extends jk_0 {
    public final jk_0[] tD0;

    public CompositeRenderPrimitive(jk_0[] v1) {
        this.tD0 = v1;
        if (v1.length > 0) {
            CC0(v1[0].dq(), v1[0].native$());
        }
    }

    public void gy(hl0_1 v1) {
        for (jk_0 jk : this.tD0) {
            jk.Ql(v1, this.yJ, this.tX);
        }
    }

    @Override
    public void Ql(hl0_1 v1, int i2, int i3) {
        for (jk_0 jk : this.tD0) {
            jk.Ql(v1, i2, i3);
        }
    }
}
