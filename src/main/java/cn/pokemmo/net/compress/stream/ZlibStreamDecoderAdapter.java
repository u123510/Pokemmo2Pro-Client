package cn.pokemmo.net.compress.stream;

import cn.pokemmo.graphics.gdx.texture.GdxKtxTextureData;
import f.Dn0;

/**
 * @deprecated 历史误命名类。f.R10 实际语义为 LibGDX KTX 压缩纹理数据加载器，属于图形与渲染系统。
 * 现代规范实现请使用 {@link GdxKtxTextureData}，向下兼容垫片请使用 {@link f.R10}。
 */
@Deprecated
public class ZlibStreamDecoderAdapter extends GdxKtxTextureData {
    public ZlibStreamDecoderAdapter(Dn0 dn0, boolean bl) {
        super(dn0, bl);
    }
}
