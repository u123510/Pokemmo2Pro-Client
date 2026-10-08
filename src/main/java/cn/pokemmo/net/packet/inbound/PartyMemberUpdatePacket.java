package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class PartyMemberUpdatePacket extends GH {
    public CH0 jq0;
    public nk_0[] const$;

    public PartyMemberUpdatePacket(k20_0 source, ByteBuffer data) {
        super(source, data);
        this.jq0 = CH0.j1;
    }

    public final void Oj0() {
        this.jq0 = this.pE();
        boolean enabled = (this.Rj.get() & 255) == 1;
        int count = this.Rj.get() & 255;
        this.const$ = new nk_0[count];
        for (int i = 0; i < count; i++) {
            byte code = this.Rj.get();
            nk_0 match = null;
            for (nk_0 candidate : nk_0.BD0) {
                if (candidate.Qf0 == code && candidate.vp == enabled) {
                    match = candidate;
                    break;
                }
            }
            this.const$[i] = match;
        }
    }

    public final void os0() {
        long id = this.jq0.Sa;
        if (id == -1L) {
            com6__1.WI0.Qf(this.const$);
            return;
        }
        if (id == -2L) {
            this.sr0().cJ0.jB0.rd.il0.LE(this.const$);
            return;
        }
        bi0_1 entity = this.sr0().cJ0.ax(this.jq0);
        if (entity != null) {
            entity.il0.LE(this.const$);
        }
    }
}
