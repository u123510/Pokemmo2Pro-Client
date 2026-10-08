package cn.pokemmo.io.loader;

import f.*;
import com.badlogic.gdx.graphics.Texture;

public class AtlasModelAssetLoader extends SyncAssetLoader {
    public w80_0 E3;

    public AtlasModelAssetLoader(gq_1 resolver) {
        super(resolver);
    }

    @Override
    public Object mm(hd0_2 loader, String name, Dn0 file, in_0 context) {
        KK ignored = (KK) context;
        I2 iterator = this.E3.Ow.ZD();
        while (iterator.hasNext()) {
            uj_2 asset = (uj_2) iterator.next();
            String path = asset.u7.el().replaceAll("\\", "/");
            Texture texture;
            synchronized (Texture.class) {
                texture = (Texture) loader.Og0(Texture.class, path);
            }
            asset.u90 = texture;
        }
        D30 result = new D30(this.E3);
        this.E3 = null;
        return result;
    }

    @Override
    public es_1 getDependencies(String name, Dn0 file, in_0 context) {
        KK owner = (KK) context;
        Dn0 parent = file.Br();
        if (parent != null) {
            this.E3 = new w80_0(file, parent, owner.ah0);
        } else {
            this.E3 = new w80_0(file, parent, false);
        }
        es_1 dependencies = new es_1();
        I2 iterator = this.E3.Ow.ZD();
        while (iterator.hasNext()) {
            uj_2 asset = (uj_2) iterator.next();
            Em0 params = new Em0();
            params.Ol = asset.jA0;
            params.f8 = asset.i8;
            params.A30 = asset.mF;
            params.YI = asset.Zy;
            dependencies.Ue0(new cr_2(asset.u7, Texture.class, params));
        }
        return dependencies;
    }
}
