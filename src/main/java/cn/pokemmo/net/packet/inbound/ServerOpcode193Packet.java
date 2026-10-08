package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ServerOpcode193Packet extends GH {
    public byte gE0;
    public boolean Kw0;

    public ServerOpcode193Packet(k20_0 var1, ByteBuffer var2) {
        super(var1, var2);
    }

    @Override
    public final void Oj0() {
        this.gE0 = this.Rj.get();
        this.Kw0 = this.Rj.get() == 1;
    }

    @Override
    public final void os0() {
        Ge0 target = this.sr0();
        target.c50 = this.gE0;
        _else state = target.cJ0.N60();
        if (this.Kw0 && state != null) {
            state.Z10 = this.Kw0;
        }
    }
}
