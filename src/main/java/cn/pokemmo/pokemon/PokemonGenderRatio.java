package cn.pokemmo.pokemon;

/**
 * 宝可梦性别比例与性别可用性定义
 */
public class PokemonGenderRatio {
    public final byte ec0;
    public final boolean LPt4;
    public final boolean K6;

    public PokemonGenderRatio(byte ec0, boolean lPt4, boolean k6) {
        this.ec0 = ec0;
        this.LPt4 = lPt4;
        this.K6 = k6;
    }

    public byte getId() {
        return this.ec0;
    }

    public boolean canBeMale() {
        return this.LPt4;
    }

    public boolean canBeFemale() {
        return this.K6;
    }
}
