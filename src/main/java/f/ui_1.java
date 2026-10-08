package f;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Matrix4;
import java.nio.ShortBuffer;
import cn.pokemmo.graphics.gdx.render.GdxQuadSpriteBatch;

/**
 * Shim: ui_1 -> GdxQuadSpriteBatch
 * @see cn.pokemmo.graphics.gdx.render.GdxQuadSpriteBatch
 */
public class ui_1 extends GdxQuadSpriteBatch {

    public ui_1() { super(); }
    public ui_1(int size) { super(size); }
    public ui_1(int size, lt_1 shader) { super(size, shader); }

}
