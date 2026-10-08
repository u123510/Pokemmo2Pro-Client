package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ServerOpcode064Packet extends GH {
    public A5 continue$;
    public hl0_0[] d60;
    public boolean gf;

    public ServerOpcode064Packet(k20_0 source, ByteBuffer data) {
        super(source, data);
    }

    @Override
    public final void Oj0() {
        byte kind = this.Rj.get();
        this.continue$ = (A5) t_0.BI0(A5.N8.BM(kind), A5.class, kind);
        this.gf = (this.Rj.get() & 255) == 1;
        this.d60 = new hl0_0[this.Rj.getShort() & 65535];
        for (int index = 0; index < this.d60.length; index++) {
            this.d60[index] = this.BM();
        }
    }

    @Override
    public final void os0() {
        if (this.gf) {
            RJ0 value = new RJ0(this.d60);
            this.sr0().NC[this.continue$.ec0] = value;
            return;
        }
        for (hl0_0 entry : this.d60) {
            this.sr0().Bb(this.continue$).cq0(entry);
        }
    }
}
