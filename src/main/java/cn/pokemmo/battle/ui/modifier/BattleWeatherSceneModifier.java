package cn.pokemmo.battle.ui.modifier;

import f.*;
import java.util.*;
import java.nio.ByteBuffer;

public class BattleWeatherSceneModifier extends TC0 {
    public final byte pC0;
    public final byte[] l3;
    public final byte[] uo0;
    public final short[] C80;

    public BattleWeatherSceneModifier(byte type, byte[] first, byte[] second, short[] values) {
        this.pC0 = type;
        this.l3 = first;
        this.uo0 = second;
        this.C80 = values;
    }

    public final void QC(ML0 state) {
        if (!(state instanceof L5)) return;
        for (byte index = 0; index < this.C80.length; index = (byte)(index + 1)) {
            PF slot = state.yd0.Ce(index, (byte)0);
            if (slot != null) slot.q40.b3 = this.C80[index];
        }
        state.lZ.add(new zi_2(state));
        state.lZ.add(new rt_0(state));
        state.lZ.add(new a50_0((LD) this, state));
        state.lZ.add(new XY(state));
    }
}
