package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class FriendStatusUpdatePacket extends GH {
    public si_0 gX;

    public FriendStatusUpdatePacket(k20_0 source, ByteBuffer data) {
        super(source, data);
    }

    public final void Oj0() {
        CH0 id = this.pE();
        cd0_2 metadata = this.h80();
        ls_0[] entries = this.Vj0();
        this.gX = new si_0(id, metadata, entries);
    }

    public final void os0() {
        if (this.sr0().gd0 == null) {
            return;
        }
        BR connection = (BR) this.sr0();
        si_0 data = this.gX;
        connection.gd0.Wc.put(data.HU, data);
        connection.lZ.zK0.LPT8.DN(data);
        this.sr0().fP();
    }
}
