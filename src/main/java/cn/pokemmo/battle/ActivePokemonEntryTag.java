package cn.pokemmo.battle;

import f.ZJ0;
import f.t_0;
import f.ys_1;

public class ActivePokemonEntryTag {
    public final ZJ0 S00;
    public final byte kd0;

    public ActivePokemonEntryTag(ZJ0 kind, byte value) {
        this.S00 = kind;
        this.kd0 = value;
    }

    @Override
    public String toString() {
        Object suffix;
        if (this.S00 == ZJ0.zZ) {
            if (this.kd0 == -1) {
                ys_1.uR.getClass();
                suffix = null;
            } else {
                suffix = (ys_1) t_0.BI0(ys_1.Com3.BM(this.kd0), ys_1.class, this.kd0);
            }
        } else {
            suffix = Byte.valueOf(this.kd0);
        }
        return new StringBuilder().append(this.S00).append("(").append(suffix).append(")").toString();
    }
}
