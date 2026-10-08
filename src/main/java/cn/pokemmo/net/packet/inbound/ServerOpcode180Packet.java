package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ServerOpcode180Packet extends GH {
    public boolean g90;

    public ServerOpcode180Packet(k20_0 var1, ByteBuffer var2) {
        super(var1, var2);
    }

    @Override
    public final void Oj0() {
        this.g90 = (this.Rj.get() & 255) == 1;
    }

    @Override
    public final void os0() {
        if (this.g90) {
            lg_0.k.lPT5(new TP((hw_0) this));
            return;
        }
        Ge0 var1 = this.sr0();
        boolean var2 = this.g90;
        if (var2) {
            var1.nI = true;
        }
        var1.NA = var2;
        if (var2) {
            E90 var3 = var1.cJ0.jB0;
            if (var3 != null) {
                var3.il0.gd = 0L;
                var3.il0.fv = 0L;
            }
        }
    }
}
