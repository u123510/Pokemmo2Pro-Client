package cn.pokemmo.graphics.task;

import java.lang.reflect.Field;
import f.C8;
import f.Gv0;
import f.bi0_1;
import f.gf_1;
import f.hk0_1;
import f.j5_0;
import f.mw_0;
import f.ra0_0;
import f.tw0_0;

public class EntityFieldUpdateGLTask extends BaseGLTask {
    public final byte Tu;
    public final bi0_1 Cs;
    public final j5_0 Ra0;

    public EntityFieldUpdateGLTask(j5_0 source, byte index, bi0_1 owner) {
        super();
        this.Ra0 = source;
        this.Tu = index;
        this.Cs = owner;
    }

    @Override
    public void run() {
        j5_0 source = this.Ra0;
        gf_1 animation = animationOf(source);
        ra0_0 guard = ra0_0.Kr;
        byte[][] table = gf_1.Ke0;
        byte category = source.ZN;
        byte mapped = table[category][this.Tu];
        boolean special = mapped == 0 && this.Tu == 1
                && tw0_0.rl.yh0.Ny((byte) 2, (short) 1526);
        guard.getClass();
        Gv0 effect = special
                ? new mw_0(ra0_0.kJ.GJ(21))
                : new Gv0(ra0_0.kJ.GJ(mapped));
        animation.m00 = effect;
        animation.Le = hk0_1.KG;
        animation.qo0[category].ho.V1(animation.bM0);
        this.Cs.il0.f60(animation.Zr0, false, C8.Zero);
    }

    private static gf_1 animationOf(j5_0 source) {
        try {
            Field field = j5_0.class.getDeclaredField("VW");
            field.setAccessible(true);
            return (gf_1) field.get(source);
        } catch (ReflectiveOperationException error) {
            throw new IllegalStateException(error);
        }
    }
}
