package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ServerOpcode132Packet extends GH {
    public CH0 Mc;
    public pg0_0 Pc;

    public ServerOpcode132Packet(k20_0 source, ByteBuffer data) {
        super(source, data);
    }

    @Override
    public final void Oj0() {
        this.pE();
        this.Mc = this.pE();
        byte value = this.Rj.get();
        this.Pc = pg0_0.vh0(value);
    }

    @Override
    public final void os0() {
        Ge0 world = this.sr0();
        pk_0 manager = world.xI0;
        if (manager == null) {
            return;
        }
        ce0_0 entry = manager.ci(this.Mc);
        if (entry == null) {
            return;
        }
        if (entry.qf0 != this.Pc) {
            entry.qf0 = this.Pc;
            world.jC(sm0_0.Bx(2602, new String[]{entry.GG0.DR, manager.Ha0(this.Pc)}), zo_0.kJ0);
            manager.Ov = true;
        }
    }
}
