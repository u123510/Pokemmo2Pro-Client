package cn.pokemmo.world.render.mesh;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import com.badlogic.gdx.math.Matrix4;

public class CaveEntranceMeshRenderer extends BaseMapMeshRenderer {
    public final Ou0[] zq0;

    public CaveEntranceMeshRenderer(hm_0 source) {
        super(source);
        this.zq0 = new Ou0[3];
        v80_0.Cb0().getClass();
        Ou0 template = v80_0.sb((byte) 4, 141, false);
        for (int i = 0; i < this.zq0.length; i++) {
            Ou0 value = i == 0 ? template : template.Ma0();
            this.zq0[i] = value;
            Matrix4 matrix = value.ho;
            if (i == 0) {
                matrix.m80(2.05F, 0.0F, 1.025F);
            } else if (i == 1) {
                matrix.m80(2.2F, 0.0F, 1.025F);
            } else {
                matrix.m80(2.125F, 0.0F, 1.1F);
            }
            this.yS(value);
        }
    }

    @Override
    public final void lpt1(float value) {
        super.lpt1(value);
    }

    @Override
    public final void sn0(short[] values) {
        if (values.length < 1 || values[0] != 4706) {
            return;
        }
        int active = values[1];
        for (int i = 0; i < this.zq0.length; i++) {
            boolean enabled = i < active;
            I2 iterator = this.zq0[i].Y3.ZD();
            while (iterator.hasNext()) {
                BM item = (BM) iterator.next();
                item.LPT8(new sh_0(enabled ? 1.0F : 0.0F));
            }
        }
    }
}
