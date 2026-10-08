package f;

import cn.pokemmo.ui.twl.renderer.TwlTextureAreaBase;

/**
 * TWL 纹理区域基类兼容垫片 - MD -> TwlTextureAreaBase
 */
public abstract class MD extends TwlTextureAreaBase {

    public MD(int n, int n2, int n3, int n4) {
        super(n, n2, n3, n4);
    }

    public MD(MD mD) {
        super(mD);
    }
}
