package cn.pokemmo.graphics.render;

import f.*;
import com.badlogic.gdx.math.Matrix4;

import com.badlogic.gdx.math.Matrix4;

public abstract class SimpleRenderableInstance implements uh_1 {
    public final BM K7;
    public U30 rl;
    public final Matrix4 qI0;

    public SimpleRenderableInstance(ut_0 owner) {
        this.qI0 = new Matrix4();
        Xz0 group = (Xz0) owner.Wc0.KI();
        I20 source = (I20) group.sJ0.KI();
        this.K7 = source.jK0.Ll();
        this.rl = source.d40;
    }

    @Override
    public final void getRenderables(es_1 renderables, ju_0 pool) {
        W00 value = (W00) pool.obtain();
        value.ly = this.K7;
        value.VE0.l0(this.rl);
        value.lpt7 = null;
        value.eo0.Dd0(this.qI0.EW);
        renderables.Ue0(value);
    }
}
