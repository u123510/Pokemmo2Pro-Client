package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ServerOpcode122Packet extends GH {
    public JN[] GG0;

    public ServerOpcode122Packet(k20_0 source, ByteBuffer data) {
        super(source, data);
    }

    @Override
    public final void Oj0() {
        this.GG0 = new JN[this.Rj.get() & 255];
        for (short index = 0; index < this.GG0.length; index++) {
            short slot = this.Rj.getShort();
            if (slot < 0) {
                continue;
            }
            this.GG0[index] = new JN(slot, this.pE());
            this.GG0[index].fh0(this.h80());
        }
    }

    @Override
    public final void os0() {
    }

    @Override
    public final void km() {
        zp0_0 target = tw0_0.rl.LPt1;
        if (target == null) {
            return;
        }
        if (target.SM == null) {
            target.SM = new JN[target.H10];
        }
        for (JN value : this.GG0) {
            if (value != null) {
                target.SM[value.Uz0] = value;
            }
        }
    }
}
