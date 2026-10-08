package cn.pokemmo.ui.widget.model;

import f.sm0_0;
import f.tx_0;

public class ChatChannelSelectionOption {
    public final byte DZ;
    public final tx_0 extends$;

    public ChatChannelSelectionOption(tx_0 value) {
        this.extends$ = value;
        this.DZ = value == null ? 0 : (byte) (value.Q6() + 1);
    }

    @Override
    public String toString() {
        tx_0 value = this.extends$;
        if (value != null) {
            return value.toString();
        }
        return sm0_0.c0(5528).replaceAll(":", "");
    }
}
