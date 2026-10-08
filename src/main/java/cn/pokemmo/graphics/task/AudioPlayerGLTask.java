package cn.pokemmo.graphics.task;

import cn.pokemmo.world.entity.target.EntityTargetSelector;
import f.Bp0;

public class AudioPlayerGLTask extends BaseGLTask {
    public final EntityTargetSelector hZ;

    public AudioPlayerGLTask(EntityTargetSelector c90) {
        this.hZ = c90;
    }

    @Override
    public void run() {
        EntityTargetSelector c90 = this.hZ;
        if (!c90.t8) {
            Bp0 bp0 = c90.ej;
            float f = bp0.x;
            c90.t8 = c90.UC0.fJ0(f, bp0.y);
        }
    }
}
