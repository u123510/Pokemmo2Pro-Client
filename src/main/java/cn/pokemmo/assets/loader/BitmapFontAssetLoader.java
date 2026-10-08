package cn.pokemmo.assets.loader;

import f.*;
import java.util.*;
import com.badlogic.gdx.graphics.*;


public class BitmapFontAssetLoader extends BaseAssetLoader {
    public gg0_0 QF0;

    public BitmapFontAssetLoader(gq_1 v1) {
        super(v1);
    }

    public final Object loadSync(hd0_2 v1, String v2, Dn0 v3, in_0 v4) {
        u00_0 u = (u00_0) v4;
        gg0_0 res = this.QF0;
        this.QF0 = null;
        return res;
    }

    public final void loadAsync(hd0_2 v1, String v2, Dn0 v3, in_0 v4) {
        u00_0 u = (u00_0) v4;
        this.QF0 = lg_0.MF.Vr(v3);
    }

    public final es_1 getDependencies(String v1, Dn0 v2, in_0 v3) {
        u00_0 u = (u00_0) v3;
        return null;
    }
}
