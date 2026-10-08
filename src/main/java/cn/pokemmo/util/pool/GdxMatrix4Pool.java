package cn.pokemmo.util.pool;

import com.badlogic.gdx.math.Matrix4;
import f.uw_2;

public class GdxMatrix4Pool extends uw_2 {
    @Override
    public Object newObject() {
        return new Matrix4();
    }
}
