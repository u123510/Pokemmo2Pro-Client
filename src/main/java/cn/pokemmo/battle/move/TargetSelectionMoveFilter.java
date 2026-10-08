package cn.pokemmo.battle.move;

import f.*;
import java.util.Iterator;
import java.util.Map;

public class TargetSelectionMoveFilter extends Jz {
    public final jb0_1 tv0;

    public TargetSelectionMoveFilter(jb0_1 owner) {
        super(owner, 0);
        this.tv0 = owner;
    }

    @Override
    public final Iterator iterator() {
        return new xj0_2((rl_2) (Object) this, this.tv0);
    }

    @Override
    public final boolean z4(Object value) {
        Map.Entry entry = (Map.Entry) value;
        Object actual = this.tv0.get(entry.getKey());
        Object expected = entry.getValue();
        if (actual == expected) {
            return true;
        }
        return actual != null && iw_2.k2(actual, expected);
    }

    @Override
    public final boolean QT(Object value) {
        Map.Entry entry = (Map.Entry) value;
        if (entry == null) {
            return false;
        }
        Object key = entry.getKey();
        int index = this.tv0.Dy0(key);
        if (index < 0) {
            return false;
        }
        Object expected = entry.getValue();
        Object actual = this.tv0.ba[index];
        if (actual != expected && (expected == null || !iw_2.k2(expected, actual))) {
            return false;
        }
        this.tv0.tq0(index);
        return true;
    }
}
