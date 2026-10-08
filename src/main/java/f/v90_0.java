package f;

import cn.pokemmo.io.loader.Particle2DEffectLoader;

public final class v90_0 extends md_0 {
    public final Particle2DEffectLoader delegate;

    public v90_0(gq_1 gq_1Var) {
        super(gq_1Var);
        this.delegate = new Particle2DEffectLoader(gq_1Var);
    }

    @Override
    public final Object mm(hd0_2 v1, String v2, Dn0 v3, in_0 v4) {
        return this.delegate.mm(v1, v2, v3, v4);
    }

    @Override
    public final es_1 getDependencies(String str, Dn0 dn0, in_0 in_0Var) {
        return this.delegate.getDependencies(str, dn0, in_0Var);
    }
}
