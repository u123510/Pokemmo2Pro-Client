package cn.pokemmo.world.render.mesh;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class LightSourceMeshRenderer extends BaseMapMeshRenderer {
    public LightSourceMeshRenderer(cb_0 source) {
        super(source);
        v80_0.Cb0().getClass();
        Ou0 first = v80_0.VH(487);
        first.ho.m80(2.625F, 0.8000000119F, 6.875F);
        first.Ni(LightSourceMeshRenderer::gU);
        first.TU(0, true);
        this.yS(first);
        v80_0.Cb0().getClass();
        Ou0 second = v80_0.VH(486);
        second.ho.m80(2.625F, 1.0499999523F, 1.125F);
        second.Ni(LightSourceMeshRenderer::fJ0);
        second.TU(0, true);
        this.yS(second);
    }

    public static boolean fJ0() {
        BR client = tw0_0.rl;
        return client != null && client.yh0.Ny((byte) 3, (short) 1367);
    }

    public static boolean gU() {
        BR client = tw0_0.rl;
        return client != null && client.yh0.Ny((byte) 3, (short) 1367);
    }
}
