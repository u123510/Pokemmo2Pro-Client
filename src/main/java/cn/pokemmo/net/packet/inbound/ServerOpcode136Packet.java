package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;
import java.util.HashMap;

public class ServerOpcode136Packet extends GH {
    public boolean c;
    public ce0_0[] NL0;

    public ServerOpcode136Packet(k20_0 context, ByteBuffer buffer) {
        super(context, buffer);
    }

    @Override
    public final void Oj0() {
        Ge0 state = this.sr0();
        if (state.xI0 != null) {
            CH0 ignored = state.xI0.mn0.Vj;
        }
        this.c = (this.Rj.get() & 255) == 1;
        this.NL0 = new ce0_0[this.Rj.get() & 255];
        for (int i = 0; i < this.NL0.length; i++) {
            ce0_0 entry = new ce0_0(this.pE(), pg0_0.vh0(this.Rj.get()), this.Rj.getInt());
            entry.fh0(this.h80());
            this.NL0[i] = entry;
            entry.mo0 = (this.Rj.get() & 255) == 1;
        }
    }

    @Override
    public final void os0() {
        Ge0 state = this.sr0();
        pk_0 registry = state.xI0;
        if (registry == null) {
            return;
        }
        if (this.c) {
            synchronized (registry.VJ0) {
                registry.VJ0.clear();
            }
            registry.Ov = true;
        }
        for (ce0_0 entry : this.NL0) {
            registry.eG0(entry);
        }
        this.sr0().fP();
    }
}
