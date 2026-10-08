package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ServerOpcode101Packet extends GH {
    public CH0 Jt0;

    public ServerOpcode101Packet(k20_0 source, ByteBuffer data) {
        super(source, data);
    }

    @Override
    public final void Oj0() {
        this.Jt0 = this.pE();
    }

    @Override
    public final void os0() {
        Ge0 world = this.sr0();
        fa0_0 registry = world.q50;
        GR entry = (GR) registry.lx.remove(this.Jt0);
        if (entry != null) {
            registry.LF0 = true;
            tw0_0.rl.jC(sm0_0.wa0(1658, entry.QB0.DR), zo_0.Dd);
        }
        this.sr0().fP();
        BU client = BU.T50;
        if (client != null && client.md0 != null) {
            client.md0.LB0.LD0();
            client.md0.jP.hk0();
        }
    }
}
