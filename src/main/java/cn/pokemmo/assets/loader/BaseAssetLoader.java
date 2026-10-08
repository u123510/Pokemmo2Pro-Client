package cn.pokemmo.assets.loader;

import f.Dn0;
import f.N00;
import f.gq_1;
import f.hd0_2;
import f.in_0;

/**
 * 资产异步/同步加载器基类
 * 
 * 职责: 封装 LibGDX 资产加载器的文件解析器绑定、异步准备 (loadAsync) 与主线程同步完成 (loadSync) 契约。
 * 原混淆基类: f.N00
 */
public abstract class BaseAssetLoader extends N00 {

    public BaseAssetLoader(gq_1 fileHandleResolver) {
        super(fileHandleResolver);
    }
}
