package cn.pokemmo.world.render.mesh;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class WaterReflectionMeshRenderer extends BaseMapMeshRenderer {
    public static final float[] NuL;
    public static final byte[] fK;
    public final wy0_0 nj;

    public WaterReflectionMeshRenderer(p50_0 world) {
        super(world);
        NuL[0] = 30.0f;
        NuL[1] = 81.0f;
        ra0_0.Ao0().getClass();
        Ou0 texture = ra0_0.GH0();
        this.nj = new wy0_0((WaterReflectionMeshRenderer)(Object)this, texture, 0, NuL, fK, 0, false);
        this.nj.P8 = false;
        this.yS(this.nj.uF0);
    }

    static {
        NuL = new float[]{30.0f, 82.0f, 0.0f, -10.0f};
        fK = new byte[]{0, 0};
    }

    @Override
    public final void lpt1(float delta) {
        super.lpt1(delta);
        this.nj.w70();
    }

    @Override
    public final void dispose() {
        super.dispose();
        yt_1 manager = tw0_0.e60;
        if (manager == null || manager.jB0 == null) {
            return;
        }
        manager.jB0.il0.f60(null, false, C8.Zero);
    }
}
