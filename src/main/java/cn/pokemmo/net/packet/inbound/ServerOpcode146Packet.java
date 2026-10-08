package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ServerOpcode146Packet extends GH {
    public CH0 rM;
    public boolean Pj0;

    public ServerOpcode146Packet(k20_0 source, ByteBuffer data) {
        super(source, data);
    }

    @Override
    public final void Oj0() {
        this.rM = this.pE();
        this.Pj0 = (this.Rj.get() & 255) == 1;
    }

    @Override
    public final void os0() {
        if (this.Pj0) {
            k20_0 source = (k20_0) this.uk;
            if (source.Co0 == 3) {
                this.je(new vu_2(this.rM));
            }
            ((BR) this.sr0()).lZ.da0(null, CH0.j1, (byte) 0);
            return;
        }
        this.sr0().jp0(sm0_0.c0(2805));
    }
}
