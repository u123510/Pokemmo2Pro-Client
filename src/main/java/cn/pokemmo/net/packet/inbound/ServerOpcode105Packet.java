package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ServerOpcode105Packet extends GH {
    public CH0 yG0;

    public ServerOpcode105Packet(k20_0 connection, ByteBuffer input) {
        super(connection, input);
    }

    public final void Oj0() {
        this.yG0 = this.pE();
    }

    public final void os0() {
        BB0 bb0 = this.sr0().a8;
        e70_0 e70 = (e70_0) bb0.qY.remove(this.yG0);
        if (e70 != null) {
            bb0.o7 = true;
            tw0_0.rl.jC(sm0_0.wa0(1670, e70.zJ0), zo_0.Dd);
        }
        if (BU.T50 != null) {
            vl_0 md0 = BU.T50.md0;
            if (md0 != null) {
                md0.LB0.LD0();
                md0.jP.hk0();
            }
        }
    }
}
