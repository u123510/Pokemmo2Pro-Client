package cn.pokemmo.graphics.particle;

import f._instanceof;
import f.pn_1;

public class NamedParticleCue extends pn_1 {
    public final String GM;

    public NamedParticleCue(String string, _instanceof[] instanceofArray) {
        super(0.025f, instanceofArray);
        this.GM = string;
    }
}
