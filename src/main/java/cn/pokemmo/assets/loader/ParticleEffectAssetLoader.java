package cn.pokemmo.assets.loader;

import f.*;
import java.util.*;
import com.badlogic.gdx.graphics.*;


public class ParticleEffectAssetLoader extends BaseAssetLoader {
    public final gv0_0 Qt;

    public ParticleEffectAssetLoader(gq_1 resolver) {
        super(resolver);
        this.Qt = new gv0_0();
    }

    @Override
    public final Object loadSync(hd0_2 manager, String fileName, Dn0 file, in_0 parameters) {
        il_1 options = (il_1) parameters;
        if (this.Qt == null) {
            return null;
        }
        AH0 texture = new AH0(this.Qt.iZ);
        if (options != null) {
            texture.setFilter(options.hk, options.ls0);
            texture.setWrap(options.BC, options.g40);
        }
        return texture;
    }

    @Override
    public final void loadAsync(hd0_2 manager, String fileName, Dn0 file, in_0 parameters) {
        il_1 options = (il_1) parameters;
        boolean compressed = fileName.contains(".ktx") || fileName.contains(".zktx");
        if (compressed) {
            this.Qt.iZ = new R10(file, false);
        }
        if (!this.Qt.iZ.xZ()) {
            this.Qt.iZ.Dx0();
        }
    }

    @Override
    public final es_1 getDependencies(String fileName, Dn0 file, in_0 parameters) {
        il_1 ignored = (il_1) parameters;
        return null;
    }
}
