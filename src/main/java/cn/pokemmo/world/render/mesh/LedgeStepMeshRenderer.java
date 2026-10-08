package cn.pokemmo.world.render.mesh;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

import com.badlogic.gdx.math.Matrix4;

public class LedgeStepMeshRenderer extends BaseMapMeshRenderer {
    public boolean fX;

    public LedgeStepMeshRenderer(hm_0 value) {
        super(value);
    }

    public static void az(Xz0 value) {
        if ("polygon14_msg_r10".equals(value.mw)) {
            if (value.sy.yn.sj0(value, true)) {
                value.sy = null;
            }
        }
        I2 iterator = value.yn.ZD();
        while (iterator.hasNext()) {
            az((Xz0) iterator.next());
        }
    }

    @Override
    public final void lpt1(float delta) {
        super.lpt1(delta);
        if (this.fX) {
            return;
        }
        I2 iterator = tw0_0.LD0.Sc.qf.ZD();
        while (iterator.hasNext()) {
            nv0_0 entry = (nv0_0) iterator.next();
            if (entry.EK.O60 == J4.p5(this.WK.Bm0, this.WK.case$)) {
                this.fX = true;
                I2 sprites = entry.wp0.ZE0.ZD();
                while (sprites.hasNext()) {
                    az((Xz0) sprites.next());
                }
                I2 objects = entry.yf0.ZD();
                while (objects.hasNext()) {
                    Ou0 object = (Ou0) objects.next();
                    if ("poster_fs01".equals(object.yI0)) {
                        Matrix4 matrix = object.ho;
                        matrix.el0(1000.0f, 1000.0f, 1000.0f);
                        object.rF0();
                    }
                }
            }
        }
    }
}
