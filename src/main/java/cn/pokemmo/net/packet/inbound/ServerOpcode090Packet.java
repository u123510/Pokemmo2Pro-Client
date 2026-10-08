package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ServerOpcode090Packet extends GH {
    public byte js;
    public boolean Q5;
    public String[] OE;
    public CH0[] L70;

    public ServerOpcode090Packet(k20_0 owner, ByteBuffer buffer) {
        super(owner, buffer);
    }

    @Override
    public final void Oj0() {
        this.js = this.Rj.get();
        this.Q5 = (this.Rj.get() & 255) == 1;
        int count = this.Rj.get() & 255;
        this.L70 = new CH0[count];
        this.OE = new String[count];
        for (int i = 0; i < count; i++) {
            this.L70[i] = this.pE();
            this.OE[i] = this.q60();
        }
    }

    @Override
    public final void os0() {
        BU target = ((BR) this.sr0()).lZ.zK0;
        if (target == null) {
            return;
        }
        target.se(true, this.js, this.Q5, this.OE, this.L70);
    }
}
