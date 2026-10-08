package cn.pokemmo.world.render.mesh;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class CliffMeshRenderer extends BaseMapMeshRenderer {
    public boolean rw;
    public final Ou0[] Se;

    public CliffMeshRenderer(hm_0 source) {
        super(source);
        this.rw = false;
        this.Se = new Ou0[3];
    }

    @Override
    public final void lpt1(float delta) {
        if (!this.rw) {
            I2 iterator = tw0_0.LD0.Sc.qf.ZD();
            while (iterator.hasNext()) {
                nv0_0 group = (nv0_0) iterator.next();
                byte groupId = (byte) group.EK.O60;
                XF0 owner = this.WK;
                if (J4.p5(groupId, owner.Bm0) != owner.case$) {
                    continue;
                }
                I2 parts = group.yf0.ZD();
                while (parts.hasNext()) {
                    Ou0 part = (Ou0) parts.next();
                    if ("aji_mech01".equals(part.yI0)) {
                        this.Se[0] = part;
                    } else if ("aji_mech02".equals(part.yI0)) {
                        this.Se[1] = part;
                    } else if ("aji_mech03".equals(part.yI0)) {
                        this.Se[2] = part;
                    }
                }
                this.rw = true;
            }
        }
        super.lpt1(delta);
    }

    @Override
    public final void sn0(short[] values) {
        if (values.length < 1) {
            return;
        }
        if (!this.rw) {
            lg_0.k.lPT5(() -> this.rw(values));
            return;
        }
        if (values[0] != 4704) {
            return;
        }
        for (int index = 0; index < 3; index++) {
            Ou0 part = this.Se[index];
            if (part == null) {
                continue;
            }
            short value = values[index + 1];
            part.sC0(value, value == 0, null);
        }
    }

    public final void rw(short[] values) {
        this.sn0(values);
    }

}
