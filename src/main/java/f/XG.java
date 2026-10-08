package f;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import cn.pokemmo.graphics.gdx.scene2d.GdxTextureRegionDrawable;

/**
 * Shim: XG -> GdxTextureRegionDrawable
 * @see cn.pokemmo.graphics.gdx.scene2d.GdxTextureRegionDrawable
 */
public class XG extends GdxTextureRegionDrawable {

    public XG() { super(); }
    public XG(LPT6_ region) { super(region); }
    public XG(si_2 regionDrawable) { super(regionDrawable); }

}
