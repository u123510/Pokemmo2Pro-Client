package cn.pokemmo.graphics.shader;

import f.*;

public class DefaultShaderProvider extends uu_0 {
    public final mv_0 Rq;

    public DefaultShaderProvider(mv_0 v1) {
        super();
        this.Rq = (v1 == null) ? new mv_0() : v1;
    }

    public DefaultShaderProvider(String v1, String v2) {
        this(new mv_0(v1, v2));
    }

    public DefaultShaderProvider(Dn0 v1, Dn0 v2) {
        this(v1.uz(), v2.uz());
    }

    public DefaultShaderProvider() {
        this((mv_0) null);
    }

    public final o9_0 D00(W00 v1) {
        return new TD(v1, this.Rq);
    }
}
