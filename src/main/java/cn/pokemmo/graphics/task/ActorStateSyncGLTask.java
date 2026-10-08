package cn.pokemmo.graphics.task;

import f.C8;
import f.bi0_1;
import f.nk_0;
import f.oa_2;

public class ActorStateSyncGLTask extends BaseGLTask {
    public final oa_2 ub0;

    public ActorStateSyncGLTask(oa_2 value) {
        super();
        this.ub0 = value;
    }

    @Override
    public void run() {
        try {
            oa_2 owner = this.ub0;
            bi0_1 first = (bi0_1) oa_2.class.getField("gQ").get(owner);
            short[] coordinates = (short[]) oa_2.class.getField("UV").get(owner);
            first.ba0.PX(false, coordinates[0], (short) (coordinates[1] - 2), (byte) 0, (byte) 0);
            first.il0.p6(first.ba0);
            first.il0.getClass();
            first.il0.f60(null, false, C8.Zero);
            first.il0.LE(new nk_0[]{nk_0.cC, nk_0.bO});

            bi0_1 second = first.rd;
            second.ba0.PX(false, coordinates[0], coordinates[1], (byte) 0, (byte) 0);
            second.il0.p6(second.ba0);
            second.il0.LE(new nk_0[]{nk_0.Vs0, null});
        } catch (ReflectiveOperationException error) {
            throw new IllegalStateException("oa_2 synthetic fields are unavailable", error);
        }
    }
}
