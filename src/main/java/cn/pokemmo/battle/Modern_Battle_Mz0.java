package cn.pokemmo.battle;

import f.*;
import java.util.Iterator;

/**
 * 现代化重构类 - 原始混淆类: f.Mz0
 */
public class Modern_Battle_Mz0 extends Jz {

    public final jb0_1 W10;

    public Modern_Battle_Mz0(jb0_1 owner) {
        super(owner, 0);
        this.W10 = owner;
    }

    @Override
    public final Iterator iterator() {
        return new tz_0((Mz0)this, this.W10);
    }

    @Override
    public final boolean z4(Object value) {
        return this.W10.containsValue(value);
    }

    @Override
    public final boolean QT(Object value) {
        Object[] states = this.W10.Yw;
        Object[] values = this.W10.ba;
        int length = states.length;
        while (length > 0) {
            int index = length - 1;
            Object state = states[index];
            if (state != iw_2.VW && state != iw_2.J80 && value == values[index]) {
                this.W10.tq0(index);
                return true;
            }
            Object candidate = values[index];
            if (candidate != null) {
                this.W10.getClass();
                if (iw_2.k2(candidate, value)) {
                    this.W10.tq0(index);
                    return true;
                }
            }
            length = index;
        }
        return false;
    }
}

