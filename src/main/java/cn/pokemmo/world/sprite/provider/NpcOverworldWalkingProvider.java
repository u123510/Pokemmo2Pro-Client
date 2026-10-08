package cn.pokemmo.world.sprite.provider;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import com.badlogic.gdx.graphics.g2d.Gdx2DPixmap;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class NpcOverworldWalkingProvider extends BaseSpriteFrameProvider {
    public final ByteBuffer D80;
    public final qa0_1 uf;
    public final int J9;

    public NpcOverworldWalkingProvider(int index, qa0_1 source, ByteBuffer data) {
        super();
        this.D80 = data;
        this.uf = source;
        this.J9 = index;
    }

    @Override
    public final i4_0 KN() {
        i8_0 palette = new i8_0(XG0.hi0, 160, this.D80);
        palette.ax[1] = 0;
        palette.ax[2] = 0;
        ByteBuffer pixels = this.uf.VL0.slice().order(ByteOrder.LITTLE_ENDIAN);
        i4_0 image = new Q20(this.J9, 16, 16, XG0.hi0, pixels).MO(palette);
        image.Pa0(DF0.Ha0);
        Gdx2DPixmap pixmap = image.XF;
        for (int x = 0; x < pixmap.SH; x++) {
            pixmap.XS(x, 31, 0);
        }
        return image;
    }
}
