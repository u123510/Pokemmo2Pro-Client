package cn.pokemmo.ui.font;

import com.badlogic.gdx.graphics.g2d.freetype.az0;
import f.Dn0;
import f.nb_2;
import f.ve_2;

public class FreeTypeFontCache {
    public final nb_2 xe = new nb_2();

    public az0 Gk0(Dn0 file, int size) {
        String key = file.a5.ordinal() + file.el() + "-" + size;
        ve_2 cached = (ve_2) this.xe.Wk0(key);
        if (cached == null) {
            cached = new ve_2();
            cached.Hd0 = new az0(file, size);
            this.xe.WK0(key, cached);
        }
        cached.DA0++;
        return cached.Hd0;
    }

    public void G3(Dn0 file, int size) {
        String key = file.a5.ordinal() + file.el() + "-" + size;
        ve_2 cached = (ve_2) this.xe.Wk0(key);
        if (cached == null) return;
        if (--cached.DA0 >= 1) return;
        cached.Hd0.s3.dispose();
        cached.Hd0.R9.dispose();
        this.xe.ns0(key);
    }
}
