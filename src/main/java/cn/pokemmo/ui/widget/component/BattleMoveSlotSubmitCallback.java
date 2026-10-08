package cn.pokemmo.ui.widget.component;

import f.BR;
import f.dl_1;
import f.ef_0;
import f.f80_0;
import f.tw0_0;
import f.tx_1;
import f.uw_0;
import f.yj_1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class BattleMoveSlotSubmitCallback implements uw_0 {
    public final ef_0 en0;

    public BattleMoveSlotSubmitCallback(ef_0 value) {
        this.en0 = value;
    }

    @Override
    public void Q(int value) {
        BR battle = tw0_0.rl;
        byte kind = this.en0.Gr0;
        yj_1 slots = new yj_1(10, 0);
        slots.uo0((short) value);
        for (f80_0 entry : this.en0.coM7) {
            short slot = entry.wE0;
            if (slot >= 1) {
                slots.uo0(slot);
            }
        }
        short[] values = slots.qE();
        dl_1 ignored = tx_1.Sy0;
        byte[] encoded = new byte[values.length * 2];
        ByteBuffer.wrap(encoded).order(ByteOrder.LITTLE_ENDIAN).asShortBuffer().put(values);
        battle.hB(kind, encoded);
        this.en0.xe0();
    }

    @Override
    public void run() {
    }
}
