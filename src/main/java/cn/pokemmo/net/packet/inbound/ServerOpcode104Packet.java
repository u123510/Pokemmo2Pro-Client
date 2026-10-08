package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

public class ServerOpcode104Packet extends GH {
    public e70_0 zL0;

    public ServerOpcode104Packet(k20_0 source, java.nio.ByteBuffer data) { super(source, data); }

    @Override
    public final void Oj0() {
        CH0 owner = this.pE();
        String first = this.q60();
        String second = this.q60();
        this.zL0 = new e70_0(this.Rj.getInt(), owner, first, second);
    }

    @Override
    public final void os0() {
        Ge0 root = this.sr0();
        BB0 table = root.a8;
        e70_0 value = this.zL0;
        if (table.qY.put(value.w8, value) == null) {
            table.o7 = true;
            tw0_0.rl.jC(sm0_0.Bx(1669, new String[]{value.zJ0, value.mo}), zo_0.Dd);
        }
        root.cJ0.xc(value.w8);
        BU panel = BU.T50;
        if (panel != null && panel.md0 != null) {
            panel.md0.LB0.LD0();
            panel.md0.jP.hk0();
        }
    }
}
