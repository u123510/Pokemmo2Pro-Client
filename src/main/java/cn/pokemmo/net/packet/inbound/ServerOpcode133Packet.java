package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ServerOpcode133Packet extends GH {
    public CH0 Fc;

    public ServerOpcode133Packet(k20_0 source, ByteBuffer data) {
        super(source, data);
        this.Fc = CH0.j1;
    }

    @Override
    public final void Oj0() {
        this.pE();
        this.Fc = this.pE();
    }

    @Override
    public final void os0() {
        Ge0 state = this.sr0();
        pk_0 registry = state.xI0;
        if (registry == null) {
            return;
        }
        ce0_0 removed;
        synchronized (registry.VJ0) {
            removed = (ce0_0) registry.VJ0.remove(this.Fc);
            if (removed == null) {
                return;
            }
            registry.Ov = true;
        }
        state.jC(sm0_0.Bx(2601, new String[]{removed.GG0.DR, registry.mn0.lt0}), zo_0.kJ0);
        state.fP();
    }
}
