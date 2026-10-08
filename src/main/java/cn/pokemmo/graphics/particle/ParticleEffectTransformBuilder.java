package cn.pokemmo.graphics.particle;

import f.MU;
import f.Vi0;
import f.pw_1;

public abstract class ParticleEffectTransformBuilder {
    public static pw_1 Jn(MU vi0, int n, int n2, pw_1 pw_12, float f) {
        return pw_12.xi0(vi0.df0(n, n2)).mz0().mz0().TD0().p1(f).Xf0();
    }

    public static pw_1 Jn(Vi0 vi0, int n, int n2, pw_1 pw_12, float f) {
        return Jn((MU) vi0, n, n2, pw_12, f);
    }
}
