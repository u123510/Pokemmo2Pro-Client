package cn.pokemmo.world.sprite.provider;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import com.badlogic.gdx.graphics.Color;

public class MapWeatherSandstormParticleProvider extends BaseSpriteFrameProvider {
    public final vh_1 KC0;
    public final short dx;
    public final boolean J6;
    public final short B6;
    public final Rk0 ZE;
    public final byte oc0;
    public final Color zg;

    public MapWeatherSandstormParticleProvider(FJ source, short first, boolean flag, short second, Rk0 renderer, byte mode, Color color) {
        super();
        this.KC0 = source;
        this.dx = first;
        this.J6 = flag;
        this.B6 = second;
        this.ZE = renderer;
        this.oc0 = mode;
        this.zg = color;
    }

    @Override
    public final i4_0 KN() {
        Tt0 base = new Tt0(this.KC0.EG(this.dx));
        if (this.J6) {
            base.Hs();
        }
        Gt0 overlay = new Gt0(this.KC0.EG(this.B6), false);
        i4_0 image = this.ZE.oQ(overlay, base, 0, 32, 32, 0);
        if (this.oc0 == 2) {
            image.Pa0(DF0.Ha0);
            if (this.B6 == 397 || this.B6 == 414) {
                for (int x = 0; x < 32; x++) {
                    for (int y = 0; y < 32; y++) {
                        if (image.XF.iH0(x, y) == 2021161215) {
                            image.XF.XS(x, y, 0);
                        }
                    }
                }
            }
        }
        i4_0 result = new i4_0(24, 24, image.rH0());
        result.NH0(image, 0, 0);
        if (this.zg != null) {
            yh_0.y60(result, this.zg);
        }
        image.dispose();
        return result;
    }
}
