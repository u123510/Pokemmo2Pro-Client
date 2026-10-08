package cn.pokemmo.world.render.mesh;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class PitfallTrapMeshRenderer extends BaseMapMeshRenderer {
    public static final short[][] vn0 = {
        {-2, -3},
        {2, -3},
        {-3, -2},
        {3, -2},
        {-3, 4},
        {3, 4},
        {-2, 5},
        {2, 5},
    };

    public static final short[][] iH0 = {
        {-2, -3},
        {1, -3},
        {-3, -2},
        {2, -2},
        {-3, 5},
        {2, 5},
        {-2, 6},
        {1, 6},
    };

    public static final short[][] lPt5 = {
        {-2, -2},
        {2, 4},
    };

    public static final short[][] Ue = {
        {-2, -2},
        {1, 5},
    };

    public final ti0_1[] Tw;

    public PitfallTrapMeshRenderer(hm_0 map) {
        super(map);
        this.Tw = new ti0_1[3];
        for (byte i = 0; i < this.Tw.length; i = (byte) (i + 1)) {
            this.Tw[i] = new ti0_1((f.bj0_1)(Object)this, i);
        }
        gl0_0 g = new gl0_0((f.bj0_1)(Object)this);
        int w = map.Kb() * map.uF0();
        int h = map.To() * map.cH0();
        for (short x = 0; x < w; x = (short) (x + 1)) {
            for (short y = 0; y < h; y = (short) (y + 1)) {
                LT tile = map.A40(x, y);
                if (tile.re() == 44) {
                    tile.Mw(g);
                }
            }
        }
    }

    @Override
    public final void lpt1(float f) {
        for (ti0_1 t : this.Tw) {
            t.Ih();
        }
        super.lpt1(f);
    }

    @Override
    public final void sn0(short[] data) {
        if (data.length < 1) {
            return;
        }
        if (data[0] != 4705) {
            return;
        }
        ti0_1 t = this.Tw[data[1]];
        Bp0 b = t.iY;
        b.x = data[2];
        b.y = data[3];
        t.PC = data[4];
        float f = -90 * data[4];
        t.d6 = f;
        t.fh0 = f;
        Bp0 c = t.CO;
        c.x = b.x;
        c.y = b.y;
        t.Ih();
    }
}
