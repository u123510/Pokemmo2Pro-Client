/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.world.render.mesh;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import f.BR;
import f.Ou0;
import f.gr_2;
import f.hm_0;
import f.tw0_0;
import f.v80_0;

/*
 * Renamed from f.mj
 */
public class TreeShadowMeshRenderer extends BaseMapMeshRenderer {
    public TreeShadowMeshRenderer(hm_0 hm_02) {
        super(hm_02);
        if (hm_02.p4() == 397) {
            v80_0.Cb0().getClass();
            Ou0 ou0 = v80_0.sb((byte)4, 158, false);
            ou0.ho.m80(0.625f, 0.25f, 4.125f);
            ou0.Ni(TreeShadowMeshRenderer::Y2);
            ou0.TU(0, true);
            this.yS(ou0);
        }
        if (hm_02.p4() == 140) {
            v80_0.Cb0().getClass();
            Ou0 ou0 = v80_0.sb((byte)4, 157, false);
            ou0.ho.m80(2.125f, 0.25f, 0.875f);
            ou0.Ni(TreeShadowMeshRenderer::nc);
            ou0.TU(0, true);
            this.yS(ou0);
        }
    }

    public static boolean nc() {
        BR bR = tw0_0.rl;
        return bR != null && bR.yh0.Ny((byte)4, (short)1367);
    }

    public static boolean Y2() {
        BR bR = tw0_0.rl;
        return bR != null && bR.yh0.Ny((byte)4, (short)1367);
    }
}

