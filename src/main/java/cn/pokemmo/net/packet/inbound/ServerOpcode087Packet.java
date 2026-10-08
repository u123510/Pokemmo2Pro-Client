package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ServerOpcode087Packet extends GH {
    public gl_2 rN;
    public CH0 ND0;

    public ServerOpcode087Packet(k20_0 var1, ByteBuffer var2) {
        super(var1, var2);
    }

    @Override
    public final void Oj0() {
        this.rN = gl_2.Wk0[this.Rj.get()];
        this.ND0 = this.pE();
    }

    @Override
    public final void os0() {
        Ge0 var1 = this.sr0();
        ib_0 var2 = var1.coM2(this.rN);
        CH0 var3 = this.ND0;
        synchronized (var2.oS) {
            var2.oS.remove(var3);
        }

        this.sr0().yt0();
    }
}
