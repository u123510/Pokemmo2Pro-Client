package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ServerOpcode086Packet extends GH {
    public gl_2 lk0;
    public ys_0 Ff0;

    public ServerOpcode086Packet(k20_0 connection, ByteBuffer input) {
        super(connection, input);
    }

    public final void Oj0() {
        this.lk0 = gl_2.Wk0[this.Rj.get()];
        CH0 id = CH0.Ab(this.Rj.getLong());
        short value = this.Rj.getShort();
        if (this.lk0.Vp > 0) {
            this.Rj.getShort();
        }
        this.Ff0 = new ys_0(id, value);
    }

    public final void os0() {
        this.sr0().coM2(this.lk0).sI(this.Ff0);
        this.sr0().yt0();
    }
}
