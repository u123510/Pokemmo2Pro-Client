package cn.pokemmo.assets.loader.parameter;

import f.in_0;
import f.zq_1;

/**
 * 资产加载参数统一抽象基类
 * 对应 LibGDX 中的 AssetLoaderParameters
 */
public class BaseAssetLoaderParameters extends in_0 {
    public zq_1 getLoadedCallback() {
        return this.loadedCallback;
    }

    public void setLoadedCallback(zq_1 loadedCallback) {
        this.loadedCallback = loadedCallback;
    }
}
