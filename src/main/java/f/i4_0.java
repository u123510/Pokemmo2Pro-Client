package f;

import cn.pokemmo.graphics.image.GdxPixmapResource;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Gdx2DPixmap;
import java.io.IOException;
import java.nio.ByteBuffer;

/**
 * 兼容垫片 (Shim) - 原始混淆类: f.i4_0
 * 核心逻辑已迁移至 cn.pokemmo.graphics.image.GdxPixmapResource
 */
public class i4_0 extends GdxPixmapResource {

    public i4_0(int width, int height, ix0_0 format) {
        super(width, height, format);
    }

    public i4_0(byte[] bytes, int offset, int len) {
        super(bytes, offset, len);
    }

    public i4_0(ByteBuffer buffer, int offset, int len) {
        super(buffer, offset, len);
    }

    public i4_0(ByteBuffer buffer) {
        super(buffer);
    }

    public i4_0(Dn0 fileHandle) {
        super(fileHandle);
    }

    public i4_0(Gdx2DPixmap pixmap) {
        super(pixmap);
    }

}
