package cn.pokemmo.assets.loader;

import f.*;
import java.util.*;
import com.badlogic.gdx.graphics.*;


public class MusicStreamAssetLoader extends BaseAssetLoader {
    public AC0 bo;

    public MusicStreamAssetLoader(gq_1 v1) {
        super(v1);
    }

    public final Object loadSync(hd0_2 v1, String v2, Dn0 v3, in_0 v4) {
        Aw0 a = (Aw0) v4;
        AC0 res = this.bo;
        this.bo = null;
        return res;
    }

    public final void loadAsync(hd0_2 v1, String v2, Dn0 v3, in_0 v4) {
        Aw0 a = (Aw0) v4;
        this.bo = lg_0.MF.WC(v3);
    }

    public final es_1 getDependencies(String v1, Dn0 v2, in_0 v3) {
        Aw0 a = (Aw0) v3;
        return null;
    }
}
