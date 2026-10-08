package cn.pokemmo.assets.loader;

import f.*;
import java.util.*;
import com.badlogic.gdx.graphics.*;


public class ModelMeshAssetLoader extends BaseAssetLoader {
    public ModelMeshAssetLoader(gq_1 resolver) {
        super(resolver);
    }

    @Override
    public final Object loadSync(hd0_2 manager, String fileName, Dn0 file, in_0 parameters) {
        aw_1 options = (aw_1) parameters;

        StringBuilder builder = new StringBuilder();
        String path = file.Q50.getPath().replace('\\', '/');
        int dot = path.lastIndexOf('.');
        if (dot != -1) {
            path = path.substring(0, dot);
        }

        String atlasPath = VG.Mq(builder, path, ".atlas");
        nb_2 values = null;
        if (options != null) {
            if (options.fD != null) {
                atlasPath = options.fD;
            }
            if (options.F4 != null) {
                values = options.F4;
            }
        }

        D30 atlas;
        synchronized (manager) {
            atlas = (D30) manager.Og0(D30.class, atlasPath);
        }

        A3 result = new A3(atlas);
        if (values != null) {
            a60_0 iterator = values.lb0();
            iterator.getClass();
            while (iterator.hasNext()) {
                xn_1 entry = (xn_1) iterator.next();
                String name = (String) entry.I20;
                Object value = entry.kM;
                result.oj(value.getClass(), value, name);
            }
        }

        result.zU(file);
        return result;
    }

    @Override
    public final void loadAsync(hd0_2 manager, String fileName, Dn0 file, in_0 parameters) {
        aw_1 ignoredOptions = (aw_1) parameters;
    }

    public final es_1 getDependencies(String fileName, Dn0 file, in_0 parameters) {
        aw_1 options = (aw_1) parameters;
        es_1 dependencies = new es_1();

        if (options != null && options.fD != null) {
            dependencies.Ue0(new cr_2(options.fD, D30.class));
        } else {
            StringBuilder builder = new StringBuilder();
            String path = file.Q50.getPath().replace('\\', '/');
            int dot = path.lastIndexOf('.');
            if (dot != -1) {
                path = path.substring(0, dot);
            }
            dependencies.Ue0(new cr_2(VG.Mq(builder, path, ".atlas"), D30.class));
        }

        return dependencies;
    }
}
