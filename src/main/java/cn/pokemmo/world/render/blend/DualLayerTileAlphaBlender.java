package cn.pokemmo.world.render.blend;

import f.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.world.render.blend.BaseTerrainTileBlender;

import com.badlogic.gdx.graphics.Texture;

public class DualLayerTileAlphaBlender extends BaseTerrainTileBlender {
    public final long yk;
    public final byte b30;
    public final byte UV;
    public final boolean ib0;

    public DualLayerTileAlphaBlender(byte first, byte second, boolean flag) {
        super();
        this.yk = hk0_1.lQ();
        this.b30 = first;
        this.UV = second;
        this.ib0 = flag;
    }

    @Override
    public final void x8(hl0_1 target, int mode, int y, int x) {
        if (mode != 0) {
            return;
        }

        if (this.ib0) {
            int selected = 0;
            int flip = 0;
            int uv = this.UV;
            int base = this.b30;
            if (uv == base) {
                selected = base == 0 ? 0 : (base == 1 ? 2 : base == 2 ? 0 : 2);
            } else {
                switch (uv) {
                    case 0:
                        if (base == 3) {
                            selected = 3;
                        } else if (base == 2) {
                            selected = 3;
                            flip = 1;
                        }
                        break;
                    case 1:
                        if (base == 3) {
                            selected = 0;
                        } else if (base == 2) {
                            selected = 0;
                            flip = 1;
                        }
                        break;
                    case 2:
                        if (base == 1) {
                            selected = 3;
                        } else if (base == 0) {
                            selected = 0;
                        }
                        break;
                    case 3:
                        if (base == 1) {
                            selected = 3;
                            flip = 1;
                        } else if (base == 0) {
                            selected = 0;
                            flip = 1;
                        }
                        break;
                    default:
                        break;
                }
            }

            Texture texture = QI.Py.kN((byte) 0, 179, false).li0(selected).H8();
            int width = texture.getWidth();
            int height = texture.getHeight();
            target.QB0(texture, (float) x, (float) y, (float) width, (float) height,
                    width, height, flip != 0, false);
            return;
        }

        ht_0 table = QI.Py.kN((byte) 0, 163, false);
        int selected = this.b30 == 1 ? 0 : 1;
        Texture texture = table.li0(selected).H8();
        int width = texture.getWidth();
        int height = texture.getHeight();
        target.QB0(texture, (float) x, (float) y, (float) width, (float) height,
                width, height, this.b30 == 3, false);
    }

    @Override
    public final boolean qR() {
        return hk0_1.KG - this.yk > 750L;
    }
}
