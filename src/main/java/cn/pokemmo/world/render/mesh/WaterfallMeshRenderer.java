package cn.pokemmo.world.render.mesh;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class WaterfallMeshRenderer extends BaseMapMeshRenderer {
    public static final short[][] tE0 = {
        {1,195,50,16},{1,195,38,15},{1,195,40,24},{1,195,62,45},
        {1,195,8,47},{1,195,8,37},{1,195,13,18},{1,195,12,11},
        {1,195,27,13},{1,195,25,54},{1,195,66,25},{1,195,64,26},
        {1,195,63,24},{1,196,54,51},{1,196,31,48},{1,196,31,49},
        {1,196,31,50},{1,196,46,41},{1,196,61,37},{1,196,50,26},
        {1,196,56,17},{1,196,41,17},{1,196,46,5},{1,196,52,10},
        {1,197,8,14},{1,197,27,6},{1,197,23,12},{1,197,25,14},
        {1,197,24,25},{1,197,8,35},{1,197,12,42},{1,197,17,49},
        {1,197,20,35}
    };

    public WaterfallMeshRenderer(p50_0 source) {
        super(source);
        for (int index = 0; index < 33; index++) {
            short[] row = tE0[index];
            if (row[1] != source.p4()) {
                continue;
            }
            int layer = row[0];
            LT frame = source.A40(row[2], row[3]);
            Ou0 target = fi_0.xL().v(row[0]).Ma0();
            float x = (row[2] + 0.5F) * 0.25F;
            float y = frame.S80() * 0.25F;
            float z = (row[3] + 1.0F) * 0.25F;
            float offset = layer == 0 ? 0.125F : 0.0F;
            target.ho.m80(x, y + offset, z);
            yS(target);
            if (layer == 1) {
                target.TU(0, true);
                frame.Mw(new eq_0(target));
            } else {
                Ou0 second = fi_0.xL().v(2).Ma0();
                second.ho.m80(x, y, z);
                yS(second);
            }
        }
    }
}
