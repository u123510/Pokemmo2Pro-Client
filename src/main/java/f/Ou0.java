package f;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Matrix4;
import java.util.HashMap;
import java.util.function.BooleanSupplier;
import cn.pokemmo.graphics.gdx.model.GdxAnimatedModelInstance;

/**
 * Shim: Ou0 -> GdxAnimatedModelInstance
 * @see cn.pokemmo.graphics.gdx.model.GdxAnimatedModelInstance
 */
public class Ou0 extends GdxAnimatedModelInstance {

    public Ou0(ut_0 resources, String name, float opacity, u4_0 controller) { super(resources, name, opacity, controller); }
    public Ou0(Ou0 other) { super(other); }
    @Override
    public Ou0 Ma0() {
        Ou0 copy = new Ou0(this);
        copy.I0 = true;
        return copy;
    }
}
