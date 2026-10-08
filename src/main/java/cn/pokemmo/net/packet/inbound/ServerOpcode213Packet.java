package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ServerOpcode213Packet extends GH {
    public short[] ZF0;
    public CH0[] Kg;


    public ServerOpcode213Packet(k20_0 v1, ByteBuffer v2) {
        super(v1, v2);
    }


    public final void Oj0() {
        byte i1 = this.Rj.get();
        this.ZF0 = new short[i1];
        this.Kg = new CH0[i1];
        for (int i2 = 0; i2 < i1; i2++) {
            this.ZF0[i2] = this.Rj.getShort();
            this.Kg[i2] = this.pE();
        }
    }

    public final void os0() {
        BR v0 = tw0_0.rl;
        short[] shorts = this.ZF0;
        CH0[] ch0s = this.Kg;
        v0.ML0 = shorts;
        v0.package$ = ch0s;
        Qy0.yI0.zK0.z6.Lf0(shorts, ch0s);
    }
}
