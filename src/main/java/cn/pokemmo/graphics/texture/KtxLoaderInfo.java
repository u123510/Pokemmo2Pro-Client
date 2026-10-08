package cn.pokemmo.graphics.texture;

import f.R10;

/**
 * KTX 纹理异步加载信息承载类 (KTX Texture Loader Info)
 * 供 KTX 纹理异步加载器在异步/同步准备阶段暂存和传递纹理数据
 * 原混淆类: f.gv0 (f.gv0_0)
 */
public class KtxLoaderInfo {
    /**
     * KTX 纹理二进制数据源
     */
    public R10 iZ;

    public KtxLoaderInfo() {
    }

    public KtxLoaderInfo(R10 textureData) {
        this.iZ = textureData;
    }

    public R10 getTextureData() {
        return this.iZ;
    }

    public void setTextureData(R10 textureData) {
        this.iZ = textureData;
    }
}
