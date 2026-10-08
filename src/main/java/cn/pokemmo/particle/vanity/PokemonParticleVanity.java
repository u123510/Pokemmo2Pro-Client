package cn.pokemmo.particle.vanity;

import f.zj_0;

public class PokemonParticleVanity {
    public final byte D7;
    public final zj_0 aUx;
    public final int uw0;

    public PokemonParticleVanity(final int uw0, final byte d7, final zj_0 aUx) {
        this.uw0 = uw0;
        this.D7 = d7;
        this.aUx = aUx;
    }

    public byte getParticleId() {
        return this.D7;
    }

    public int getIndex() {
        return this.uw0;
    }

    public zj_0 getCategory() {
        return this.aUx;
    }
}
