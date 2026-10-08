package cn.pokemmo.world.tile.behavior;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import com.badlogic.gdx.math.Matrix4;

public class WaterSplashTileBehavior extends BaseTileBehavior {
    public final in_2 t30;

    public WaterSplashTileBehavior() {
        this.t30 = new in_2(125);
    }

    @Override
    public final void PI0(LT left, bi0_1 controller, ER renderer, U5 batch, BJ0 state,
                          float first, float second, float third) {
        mg_0 effect = controller.uR();
        if (!effect.Ii0.vx0()) {
            return;
        }
        if (effect.JW == null) {
            Ou0 source = fi_0.xL().aJ;
            Ou0 splash = tq0_0.ip0(source, source);
            splash.I0 = true;
            effect.JW = splash;
            splash.Ey("shibuki", true, null);
        }
        effect.vj.Rx0();
        effect.vj.Ox0(C8.Y, state.d00);
        Matrix4 transform = effect.JW.ho;
        C8 position = T3.hf(effect.VH, effect.VH);
        C8 scale = mg_0.bg0;
        scale.x = 0.65f;
        scale.y = 1.0f;
        scale.z = 0.75f;
        transform.oF0(position, effect.vj, scale);
        transform.el0(0.0f, -0.22f, 0.25f);
        effect.JW.P30(effect.Hn, null);
        renderer.Lh0(effect.JW, batch);
    }

    @Override
    public final boolean xB(LT first, LT second, bi0_1 controller, byte value) {
        if (controller.Ou() && this.t30.ty0()) {
            tw0_0.RE0.IE((byte)2, (short)1662, (short)-1, true, 0.0f, 1.0f, 0.35f, 0);
        }
        return false;
    }

    @Override
    public final boolean Xc() {
        return false;
    }
}
