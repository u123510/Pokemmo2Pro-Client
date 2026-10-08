package cn.pokemmo.assets.loader;

import f.*;
import java.util.*;
import com.badlogic.gdx.graphics.*;


import com.badlogic.gdx.graphics.Texture;

public class TextureAtlasAssetLoader extends BaseAssetLoader {
    public mh0_0 bU;

    public TextureAtlasAssetLoader(gq_1 resolver) {
        super(resolver);
    }

    @Override
    public final Object loadSync(hd0_2 manager, String fileName, Dn0 file, in_0 parameters) {
        hg0_1 ignored = (hg0_1) parameters;
        es_1 textures = new es_1(this.bU.bs0.length);
        for (String path : this.bU.bs0) {
            textures.Ue0(new LPT6_((Texture) manager.nc(Texture.class, path)));
        }
        return new sc_0(this.bU, textures, true);
    }

    @Override
    public final void loadAsync(hd0_2 manager, String fileName, Dn0 file, in_0 parameters) {
        hg0_1 ignored = (hg0_1) parameters;
    }

    @Override
    public final es_1 getDependencies(String name, Dn0 file, in_0 context) {
        hg0_1 options = (hg0_1) context;
        es_1 dependencies = new es_1();
        this.bU = new mh0_0(file, false);
        for (String path : this.bU.bs0) {
            Dn0 dependency = this.resolve(path);
            Em0 params = new Em0();
            if (options != null) {
                params.f8 = false;
                params.A30 = options.LU;
                params.YI = options.Lg0;
            }
            dependencies.Ue0(new cr_2(dependency, Texture.class, params));
        }
        return dependencies;
    }
}
