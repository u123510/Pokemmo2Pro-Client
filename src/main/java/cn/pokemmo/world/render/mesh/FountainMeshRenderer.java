package cn.pokemmo.world.render.mesh;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class FountainMeshRenderer extends BaseMapMeshRenderer {
    public final Ou0 Qn0;

    public FountainMeshRenderer(p50_0 world) {
        super(world);
        int base = world.p4() - 18;
        int[] ids = new int[]{124, 125, 126, 127};
        this.Qn0 = v80_0.CW(tw0_0.Ll0.Qz0.Hp(), base, ids);
        this.Qn0.ho.el0(11.21875f, -0.25f, 3.0f);
        this.yS(this.Qn0);
        world.A40(16, 14).DZ(world.A40(16, 13).S80());
    }

    @Override
    public final void j80(U5 context, ER renderer, BJ0 transform) {
        super.j80(context, renderer, transform);
    }

    @Override
    public final void sn0(short[] values) {
        if (values.length < 1 || values[0] != (short) -32768) {
            return;
        }
        this.Qn0.sC0(values[1], false, null);
    }
}
