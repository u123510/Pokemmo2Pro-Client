package cn.pokemmo.graphics.task;

import java.lang.reflect.Field;
import f.bw0_0;
import f.oa_2;
import f.tw0_0;
import f.zv_2;

public class ReflectFieldUpdateGLTask extends BaseGLTask {
    public final oa_2 xB0;

    public ReflectFieldUpdateGLTask(oa_2 value) {
        this.xB0 = value;
    }

    @Override
    public void run() {
        try {
            Field field = oa_2.class.getField("Ws0");
            zv_2 value = (zv_2) field.get(this.xB0);
            tw0_0.rl.fk0.uQ(new bw0_0(value, false, false));
        } catch (ReflectiveOperationException exception) {
            throw new IllegalStateException("oa_2.Ws0 field is unavailable", exception);
        }
    }
}
