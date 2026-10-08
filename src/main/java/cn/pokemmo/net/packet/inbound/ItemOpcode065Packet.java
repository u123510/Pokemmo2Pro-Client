package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;
import java.util.HashMap;

public class ItemOpcode065Packet extends GH {
    public CH0 BD0 = CH0.j1;
    public short WB0;

    public ItemOpcode065Packet(k20_0 connection, ByteBuffer data) {
        super(connection, data);
    }

    public final void Oj0() {
        this.BD0 = this.pE();
        this.WB0 = this.Rj.getShort();
    }

    public final void os0() {
        for (A5 type : A5.B4) {
            RJ0 container = this.sr0().Bb(type);
            if (container == null) {
                continue;
            }
            HashMap entries = container.pb0;
            synchronized (entries) {
                K5 item = (K5) entries.get(this.BD0);
                if (item != null) {
                    item.nn.PA0 = this.WB0;
                }
            }
        }
        this.sr0().yt0();
    }
}
