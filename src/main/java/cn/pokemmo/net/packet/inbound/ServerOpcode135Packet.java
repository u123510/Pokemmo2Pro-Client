package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ServerOpcode135Packet extends GH {
    public tx_0 hB;

    public ServerOpcode135Packet(k20_0 source, ByteBuffer data) {
        super(source, data);
    }

    @Override
    public final void Oj0() {
        byte type = this.Rj.get();
        String name = this.q60();
        CH0[] channels = new CH0[type];
        for (int i = 0; i < 6; i++) {
            channels[i] = this.pE();
        }
        this.hB = new tx_0(type, name, channels);
    }

    @Override
    public final void os0() {
        HY state = this.sr0().dh0;
        state.C20.gE0(this.hB.wo, this.hB);
        BU panel = BU.T50;
        if (panel != null) {
            QT overlay = panel.OJ;
            if (overlay != null) {
                overlay.rt(false);
            }
        }
    }
}
