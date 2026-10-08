package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ChannelSubscriptionPacket extends GH {
    public G50 dm = null;
    public zo_0 n9 = null;
    public boolean u0 = true;

    public ChannelSubscriptionPacket(k20_0 v1, ByteBuffer v2) {
        super(v1, v2);
    }


    public final void Oj0() {
        if ((this.Rj.get() & 0xff) == 1) {
            this.dm = G50.oZ(this.Rj.get(), false);
        }
        if ((this.Rj.get() & 0xff) == 1) {
            this.n9 = (zo_0) zo_0.N00.BM(this.Rj.get());
        }
        this.u0 = (this.Rj.get() & 0xff) == 1;
    }


    public final void os0() {
        this.sr0().GC(this.dm, this.n9, this.u0, false);
    }
}
