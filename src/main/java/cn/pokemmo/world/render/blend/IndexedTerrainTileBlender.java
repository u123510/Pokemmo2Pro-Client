/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.world.render.blend;

import f.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.world.render.blend.BaseTerrainTileBlender;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import f.QI;
import f.Vs0;
import f.gj_0;
import f.hk0_1;
import f.hl0_1;
import f.ht_0;

/*
 * Renamed from f.LPT3
 */
public class IndexedTerrainTileBlender extends BaseTerrainTileBlender {
    public final long VM = hk0_1.lQ();
    public final short Ln0;

    public IndexedTerrainTileBlender(short s) {
        this.Ln0 = s;
    }

    @Override
    public final void x8(hl0_1 hl0_12, int n, int n2, int n3) {
        if (n != 0) {
            return;
        }
        Object object = QI.Py;
        byte by = 10;
        int n4 = this.Ln0 == 40 ? 314 : 303;
        object = ((QI)object).kN(by, n4, false);
        int n5 = (int)((hk0_1.KG - this.VM) / 75L);
        if (n5 < 0) {
            n5 = 0;
        } else if (n5 > 5) {
            n5 = 5;
        }
        Texture texture = ((ht_0)object).li0(n5).H8();
        Color color = Color.WHITE;
        hl0_12.oH.set(color);
        hl0_12.og = color.toFloatBits();
        float f = (float)n2 + 1.66f;
        float f2 = (float)n3 + 6.33f;
        n2 = texture.getWidth();
        n3 = texture.getHeight();
        hl0_12.QB0(texture, f, f2, 12.0f, 12.0f, n2, n3, false, false);
        float f3 = Vs0.lv;
        Color.abgr8888ToColor(hl0_12.oH, f3);
        hl0_12.og = f3;
    }

    @Override
    public final boolean qR() {
        return hk0_1.KG - this.VM > 450L;
    }
}

