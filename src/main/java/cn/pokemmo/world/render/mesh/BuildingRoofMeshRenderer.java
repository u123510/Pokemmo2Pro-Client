package cn.pokemmo.world.render.mesh;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BuildingRoofMeshRenderer extends BaseMapMeshRenderer {
    public BuildingRoofMeshRenderer(hm_0 source) {
        super(source);
        v80_0.Cb0().getClass();
        Ou0 first = v80_0.sb((byte) 4, 158, false);
        first.ho.m80(0.375F, 0.0F, 6.375F);
        first.Ni(BuildingRoofMeshRenderer::Lh0);
        first.TU(0, true);
        this.yS(first);
        v80_0.Cb0().getClass();
        Ou0 second = v80_0.sb((byte) 4, 157, false);
        second.ho.m80(3.875F, 0.0F, 0.875F);
        second.Ni(BuildingRoofMeshRenderer::kn);
        second.TU(0, true);
        this.yS(second);
    }

    public static boolean kn() {
        BR client = tw0_0.rl;
        return client != null && client.yh0.Ny((byte) 4, (short) 1363);
    }

    public static boolean Lh0() {
        BR client = tw0_0.rl;
        return client != null && client.yh0.Ny((byte) 4, (short) 1363);
    }
}
