package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

public class ServerOpcode074Packet extends GH {
    public Im[] d80;

    public ServerOpcode074Packet(k20_0 owner, java.nio.ByteBuffer data) {
        super(owner, data);
    }

    @Override
    public final void Oj0() {
        this.d80 = new Im[this.Rj.get() & 255];
        for (int i = 0; i < this.d80.length; i++) {
            this.d80[i] = this.X90();
        }
    }

    @Override
    public final void os0() {
        TT table = this.sr0().A20;
        for (Im value : this.d80) {
            int key = value.SJ0.NR + value.u20 * 16;
            table.r0.put(Integer.valueOf(key), value);
        }
    }
}
