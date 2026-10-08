package cn.pokemmo.ui.widget.slot;

import f.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import cn.pokemmo.ui.widget.slot.BaseItemSlotWidget;

public class StaticItemPreviewSlotWidget extends BaseItemSlotWidget {
    public StaticItemPreviewSlotWidget(short width, boolean enabled) {
        super((short) -1, CH0.j1, (short) 0, width, enabled);
    }

    @Override
    public final void UR(K5 value) {
        if (value == null) {
            return;
        }
        Dm0 state = tw0_0.rl.bh;
        if (state != null && state.RU[state.c80]) {
            return;
        }
        mc0_1 item = value.cL;
        if (item == null) {
            return;
        }
        hl0_0 data = value.nn;
        short amount = data.PA0;
        if (amount > 1) {
            uf0_0 existing = (uf0_0) jq0_0.tK0(Qy0.yI0, uf0_0.class);
            if (existing != null) {
                lpt6__0.v90(existing);
                return;
            }
            String prompt = sm0_0.wa0(1962, sm0_0.c0(item.Nl));
            uf0_0 dialog = new uf0_0(prompt, amount, new Xp0(this, value), null);
            Qy0.yI0.F9(Qy0.yI0.fU(), dialog);
            return;
        }
        CH0 slot = data.Br;
        if (slot != null) {
            tw0_0.rl.fk0.uQ(new AV(slot, this.Lu, (short) 1));
        }
    }
}
