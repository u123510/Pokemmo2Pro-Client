package cn.pokemmo.world.sprite.provider;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class FollowerPokemonShinyProvider extends BaseSpriteFrameProvider {
    public final vh_1 rG0;
    public final int AE;

    public FollowerPokemonShinyProvider(FJ fJ, int n) {
        this.rG0 = fJ;
        this.AE = n;
    }

    @Override
    public final i4_0 KN() {
        Tt0 palette = new Tt0(this.rG0.EG(30));
        i4_0 source = new Gt0(this.rG0.EG(46), false).NK(palette, 32, 3072);
        i4_0 result = new i4_0(32, 32, ix0_0.Vw);
        result.XF.bJ(source.XF, 0, this.AE * 384, 0, 0, 32, 32);
        source.dispose();
        return result;
    }
}
