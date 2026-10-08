package cn.pokemmo.graphics.shader;

import f.*;

public abstract class BaseShaderProvider implements ux_1 {
    public final es_1 n90;

    public BaseShaderProvider() {
        this.n90 = new es_1();
    }

    public final o9_0 go(W00 v1) {
        o9_0 v2 = v1.st;
        if (v2 != null && v2.canRender(v1)) {
            return v2;
        }
        I2 v2_iter = this.n90.ZD();
        while (v2_iter.hasNext()) {
            o9_0 v3 = (o9_0) v2_iter.next();
            if (v3.canRender(v1)) {
                return v3;
            }
        }
        o9_0 v2_shader = this.D00(v1);
        if (v2_shader.canRender(v1)) {
            v2_shader.init();
            this.n90.Ue0(v2_shader);
            return v2_shader;
        }
        throw new nf_1("unable to provide a shader for this renderable");
    }

    public abstract o9_0 D00(W00 v1);

    public final void dispose() {
        I2 v1_iter = this.n90.ZD();
        while (v1_iter.hasNext()) {
            ((o9_0) v1_iter.next()).dispose();
        }
        this.n90.clear();
    }
}
