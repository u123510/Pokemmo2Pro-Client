package f;

import cn.pokemmo.graphics.gdx.model.GdxModelResourceManager;

/**
 * Shim: UT -> GdxModelResourceManager
 * @see cn.pokemmo.graphics.gdx.model.GdxModelResourceManager
 */
public class UT extends GdxModelResourceManager {
    public UT() { super(); }

    public static UT oV() {
        if (mh == null) {
            mh = new UT();
        }
        return (UT) mh;
    }
}
