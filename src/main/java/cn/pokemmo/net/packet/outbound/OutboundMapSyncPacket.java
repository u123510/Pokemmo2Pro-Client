package cn.pokemmo.net.packet.outbound;

import f.G50;
import f.TX;
import f._else;
import f.dw_2;
import f.lpt4__2;
import f.tw0_0;
import f.yt_1;
import java.nio.ByteBuffer;

public class OutboundMapSyncPacket extends lpt4__2 {
    public byte Kz0;

    public OutboundMapSyncPacket() {
        super(2);
        yt_1 v1 = tw0_0.e60;
        if (v1 != null) {
            _else el = v1.N60();
            if (el != null) {
                this.Kz0 = el.Lt();
            }
        }
    }

    @Override
    public void pH0(TX v1, ByteBuffer v2) {
        v2.put(G50.Rw(dw_2.fP).Sf0);
        v2.putShort(v1.Bu.Wv0);
        v2.putShort(dw_2.Mt0);
        v2.put(this.Kz0);
    }
}
