package cn.pokemmo.world.sprite.provider;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class MapWeatherHailstoneProvider extends BaseSpriteFrameProvider {
    public final qa0_1 At0;
    public final int mA0;
    public final int BD;
    public final int Lv0;
    public final int Rp0;
    public final boolean Jj;

    public MapWeatherHailstoneProvider(qa0_1 source, int offset, int width, int height, int palette, boolean flip) {
        this.At0 = source;
        this.mA0 = offset;
        this.BD = width;
        this.Lv0 = height;
        this.Rp0 = palette;
        this.Jj = flip;
    }

    @Override
    public final i4_0 KN() {
        ByteBuffer source = this.At0.VL0.slice().order(ByteOrder.LITTLE_ENDIAN);
        ByteBuffer paletteData = ByteBuffer.wrap(tx_1.Gi(this.Lv0, source)).order(source.order());
        i8_0 palette = new i8_0(XG0.hi0, this.Rp0 * 32, paletteData);
        Q20 pixels = new Q20(this.mA0, 1, 1, XG0.hi0, source);
        i4_0 image = fp_2.bB(this.At0, pixels, this.BD, this.Lv0, 256, 112, XG0.hi0, palette);
        i4_0 target = new i4_0(512, 112, ix0_0.Vw);
        if (this.Jj) {
            image.NH0(target, 0, 0);
            image.NH0(target, 256, 0);
        } else {
            image.NH0(target, 0, 0);
            for (int i = 0; i < 16; ++i) {
                int x = 256 + i * 16;
                target.XF.bJ(image.XF, 240, 0, x, 0, 16, 112);
            }
        }
        image.dispose();
        return target;
    }
}
