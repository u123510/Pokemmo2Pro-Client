package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ServerOpcode250Packet extends GH {
    public CH0 Zc;

    public ServerOpcode250Packet(k20_0 source, ByteBuffer data) {
        super(source, data);
    }

    @Override
    public final void Oj0() {
        this.Zc = this.pE();
    }

    @Override
    public final void os0() {
        BR client = (BR) this.sr0();
        client.getClass();
        boolean changed = false;
        synchronized (Vv0.GU.rc) {
            for (Object value : Vv0.GU.rc) {
                sf0_2 entry = (sf0_2) value;
                if (entry.Mp0.equals(this.Zc) && !entry.de) {
                    entry.de = true;
                    changed = true;
                }
            }
        }
        if (changed) {
            BU state = client.lZ.zK0;
            if (state != null) {
                state.BK.IY();
            }
        }
    }
}
