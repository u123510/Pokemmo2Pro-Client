package cn.pokemmo.assets.loader;

import f.Dn0;
import f.gq_1;
import f.hd0_2;
import f.in_0;
import f.u6_0;

/**
 * 自定义同步资源加载器基类
 */
public abstract class BaseCustomAssetLoader extends u6_0 {
    public BaseCustomAssetLoader(gq_1 resolver) {
        super(resolver);
    }

    public abstract Object mm(hd0_2 manager, String fileName, Dn0 file, in_0 parameter);
}
