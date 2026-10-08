package cn.pokemmo.assets.loader;

import f.*;
import java.util.*;
import com.badlogic.gdx.graphics.*;


import java.util.Locale;

public class I18NBundleAssetLoader extends BaseAssetLoader {
    public vj_1 fp;

    public I18NBundleAssetLoader(gq_1 resolver) {
        super(resolver);
    }

    @Override
    public final Object loadSync(hd0_2 manager, String fileName, Dn0 file, in_0 parameters) {
        AM ignored = (AM) parameters;
        vj_1 value = this.fp;
        this.fp = null;
        return value;
    }

    @Override
    public final void loadAsync(hd0_2 manager, String fileName, Dn0 file, in_0 parameters) {
        AM options = (AM) parameters;
        this.fp = null;
        Locale locale;
        String encoding;
        if (options == null) {
            locale = Locale.getDefault();
            encoding = null;
        } else {
            locale = options.Y8;
            if (locale == null) {
                locale = Locale.getDefault();
            }
            encoding = options.wT;
        }
        if (encoding == null) {
            this.fp = vj_1.COm1(file, "UTF-8", locale);
        } else {
            this.fp = vj_1.COm1(file, encoding, locale);
        }
    }

    @Override
    public final es_1 getDependencies(String fileName, Dn0 file, in_0 parameters) {
        AM ignored = (AM) parameters;
        return null;
    }
}
