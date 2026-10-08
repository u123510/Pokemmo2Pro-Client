package cn.pokemmo.assets.loader;

import f.*;
import java.util.*;
import com.badlogic.gdx.graphics.*;


import com.badlogic.gdx.graphics.Texture;

public class CubemapAssetLoader extends BaseAssetLoader {
    public final ei0_1 zG;

    public CubemapAssetLoader(gq_1 resolver) {
        super(resolver);
        this.zG = new ei0_1();
    }

    @Override
    public final Object loadSync(hd0_2 manager, String name, Dn0 file, in_0 params) {
        Em0 options = (Em0) params;
        ei0_1 state = this.zG;
        if (state == null) return null;
        Texture texture = state.kD0;
        if (texture != null) {
            texture.load(state.xx);
        } else {
            texture = new Texture(state.xx);
        }
        if (options != null) {
            texture.setFilter(options.A30, options.YI);
            texture.setWrap(options.nf0, options.wd0);
        }
        return texture;
    }

    @Override
    public final void loadAsync(hd0_2 manager, String name, Dn0 file, in_0 params) {
        Em0 options = (Em0) params;
        this.zG.getClass();
        if (options != null && options.iJ != null) {
            this.zG.xx = options.iJ;
            this.zG.kD0 = options.wU;
        } else {
            this.zG.kD0 = null;
            ix0_0 format = null;
            boolean force = false;
            if (options != null) {
                format = options.Ol;
                force = options.f8;
                this.zG.kD0 = options.wU;
            }
            this.zG.xx = cm_0.Py(file, format, force);
        }
        if (!this.zG.xx.xZ()) this.zG.xx.Dx0();
    }

    @Override
    public final es_1 getDependencies(String name, Dn0 file, in_0 params) {
        // The original bridge only casts the optional parameter; null is valid here.
        Em0 ignored = (Em0) params;
        return null;
    }
}
