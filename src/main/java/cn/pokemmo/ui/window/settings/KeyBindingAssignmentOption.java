package cn.pokemmo.ui.window.settings;

import f.*;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class KeyBindingAssignmentOption {
    public final qe0_0 m30;
    public final int[] nL0;
    public final int[] bJ;

    public KeyBindingAssignmentOption(qe0_0 source) {
        super();
        this.m30 = source;
        ByteBuffer data = source.X60();
        data.position(56);
        int count = data.getInt();
        if (count > 0 && count < 10000) {
            this.nL0 = new int[count];
            this.bJ = new int[count];
            data.position(60);
            for (int i = 0; i < count; i++) {
                this.nL0[i] = data.getInt();
            }
            for (int i = 0; i < count - 1; i++) {
                this.bJ[i] = this.nL0[i + 1] - this.nL0[i];
            }
            this.bJ[count - 1] = source.Gk() - this.nL0[count - 1];
        } else {
            this.nL0 = new int[0];
            this.bJ = new int[0];
        }
    }

    public final CS e10() {
        if (this.nL0.length <= 0) {
            return null;
        }
        int offset = this.nL0[0];
        if (offset < 0) {
            return null;
        }
        ByteBuffer source = this.m30.X60();
        if (offset >= source.limit()) {
            return null;
        }
        source.position(offset);
        source.limit(Math.min(source.limit(), offset + this.bJ[0]));
        return new CS(source.slice().order(ByteOrder.LITTLE_ENDIAN));
    }
}
