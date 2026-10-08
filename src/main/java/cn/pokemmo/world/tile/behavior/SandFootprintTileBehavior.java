package cn.pokemmo.world.tile.behavior;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class SandFootprintTileBehavior extends BaseTileBehavior {
    public final es_1 Ur;

    public SandFootprintTileBehavior(NG0 target) {
        this.Ur = new es_1();
        this.Ur.Ue0(target);
    }

    public final void K40(bi0_1 entity, LT tile) {
        if (entity != tw0_0.e60.jB0) {
            return;
        }

        I2 iterator = this.Ur.ZD();
        while (iterator.hasNext()) {
            NG0 target = (NG0) iterator.next();
            if (t70_0.PZ((byte) target.YH) != entity.ba0.Y30) {
                continue;
            }

            BJ0 camera = ((L00) tw0_0.LD0.Sc).cV();
            float rotation;
            switch (target.W7) {
                case 0:
                    rotation = 0.0F;
                    break;
                case 40:
                    rotation = 40.0F;
                    break;
                case 45:
                    rotation = 45.0F;
                    break;
                case 220:
                    rotation = -45.0F;
                    break;
                case 240:
                    rotation = -25.0F;
                    break;
                default:
                    System.out.println("unk rotation = " + target.W7);
                    rotation = 0.0F;
                    break;
            }

            float elevation = target.vf0 != 0 ? target.vf0 - 45.0F : -56.0F;
            pw_1 tween = pw_1.xC().Xf0();
            if (camera.d00 != rotation) {
                ao_1 animation = ao_1.DX(camera, 5, 0.5F);
                animation.h5[0] = rotation;
                tween.y80(animation);
            }
            if (camera.Q30 != elevation) {
                ao_1 animation = ao_1.DX(camera, 6, 0.5F);
                animation.h5[0] = elevation;
                tween.y80(animation);
            }
            tween.mz0();
            tween.Ms(tw0_0.LD0.Ov);
        }
    }
}
