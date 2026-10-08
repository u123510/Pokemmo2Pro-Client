package cn.pokemmo.world.render.mesh;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class ConveyorMeshRenderer extends BaseMapMeshRenderer {
    public static final float[] eq0 = new float[]{7.5f, 4.5f, 0.0f, -10.0f};
    public static final byte[] A6 = new byte[]{0, 0};
    public final wy0_0 lA;
    public Ou0 pB0;

    public ConveyorMeshRenderer(p50_0 p500) {
        super(p500);
        this.pB0 = null;
        wy0_0 wy00 = new wy0_0((ConveyorMeshRenderer)(Object)this, 0, eq0, A6, 0, false);
        this.lA = wy00;
        this.yS(wy00.uF0);
    }

    public static boolean Xg() {
        BR br = tw0_0.rl;
        return br != null && br.yh0.Ny((byte) 2, (short) 1525);
    }

    @Override
    public final void sn0(short[] arrs) {
        if (arrs.length < 1) {
            return;
        }
        if (arrs[0] != 402) {
            return;
        }
        if (arrs.length < 2) {
            return;
        }
        int state = (arrs[1] == 0) ? 1 : 0;
        this.lA.Fe0(state);
        this.lA.nr0 = arrs[1];
    }

    @Override
    public final void lpt1(float f) {
        if (this.pB0 == null) {
            I2 it = tw0_0.LD0.Sc.qf.ZD();
            while (it.hasNext()) {
                nv0_0 nv00 = (nv0_0) it.next();
                if (nv00.EK.O60 == J4.p5(this.WK.Bm0, this.WK.case$)) {
                    Ou0 ou0 = nv00.LH0(new C8(5.5f, 0.0f, 9.5f), 107);
                    this.pB0 = ou0;
                    ou0.qp = ConveyorMeshRenderer::Xg;
                    break;
                }
            }
        }
        this.lA.w70();
        super.lpt1(f);
    }

    @Override
    public final void dispose() {
        super.dispose();
        yt_1 yt1 = tw0_0.e60;
        if (yt1 == null) {
            return;
        }
        E90 e90 = yt1.jB0;
        if (e90 != null) {
            e90.il0.f60(null, false, C8.Zero);
        }
    }
}
