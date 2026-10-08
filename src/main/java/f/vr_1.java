package f;

import aurelienribon.tweenengine.equations.Quad;
import aurelienribon.tweenengine.equations.Quint;
import aurelienribon.tweenengine.equations.Sine;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g3d.particles.ParticleEffectExt;
import com.badlogic.gdx.graphics.g3d.particles.ParticleControllerExt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Stream;
import cn.pokemmo.graphics.gdx.render.Gdx3DModelBatch;

/**
 * Shim: vr_1 -> Gdx3DModelBatch
 * @see cn.pokemmo.graphics.gdx.render.Gdx3DModelBatch
 */
public class vr_1 extends Gdx3DModelBatch {

    public vr_1(ML0 model, a10_0 data) { super(model, data); }

}
