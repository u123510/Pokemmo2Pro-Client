package cn.pokemmo.battle;

import f.*;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;

/**
 * 现代化重构类 - 原始混淆类: f.ye0_2
 */
public class Modern_Battle_ye0_2
extends _new {

    public Modern_Battle_ye0_2() {
        super();
    }

    static {
        Cq0.E1(ye0_2.class);
    }

    @Override
    public final synchronized void lI0() {
        Object object;
        while ((object = (EG)this.Oy.poll()) != null) {
            object = ((EG)object).Su;
            this.op.remove(object);
        }
    }

    @Override
    public final Reference EV(Integer n, i8_0 i8_02, ReferenceQueue referenceQueue) {
        return new EG(n, i8_02, referenceQueue);
    }
}


