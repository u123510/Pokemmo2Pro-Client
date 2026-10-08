package cn.pokemmo.net.packet.outbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ClientOpcode072RequestPacket extends RE {
    public final wf0_1 Fe;

    public ClientOpcode072RequestPacket(wf0_1 v1) {
        super(72);
        this.Fe = v1;
    }

    public final void ig0(k20_0 v1, ByteBuffer v2) {
        wf0_1 wf = this.Fe;
        if (wf.q30 != null) {
            v2.put((byte) 0);
            v2.putLong(this.Fe.q30.LB0.Sa);
            v2.put(this.Fe.W30);
            return;
        }
        av_1[] arr_av = wf.ni0;
        byte[] arr_b = wf.U50;
        v2.put((byte) arr_av.length);
        for (int i3 = 0; i3 < arr_av.length; i3++) {
            v2.put(arr_av[i3].NR);
            v2.put(arr_b[i3]);
        }
    }
}
