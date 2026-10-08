package cn.pokemmo.battle;

import f.*;
import java.util.ArrayList;

/**
 * 现代化重构类 - 原始混淆类: f.T60
 */
public abstract class Modern_Battle_T60 {

    public final ArrayList HF;
    public final sc0_0 LPT8;

    public Modern_Battle_T60(int initialCapacity, sc0_0 listener) {
        this.HF = new ArrayList(initialCapacity);
        this.LPT8 = listener;
    }

    public abstract Object L80();

    public final Object u9() {
        Object value = null;
        try {
            value = this.HF.isEmpty() ? this.L80() : this.HF.remove(0);
        } catch (Exception ignored) {
        }
        if (value == null) {
            value = this.L80();
        }
        if (this.LPT8 != null) {
            this.LPT8.kg0(value);
        }
        return value;
    }
}

