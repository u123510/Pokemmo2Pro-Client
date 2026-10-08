package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;
import java.util.HashMap;

public class ServerOpcode118Packet extends GH {
    public zp0_0 oq0;

    public ServerOpcode118Packet(k20_0 source, ByteBuffer data) {
        super(source, data);
    }

    @Override
    public final void Oj0() {
        this.oq0 = this.Pl0();
        int count = this.Rj.get() & 0xFF;
        i9[] entries = new i9[count];
        for (int i = 0; i < count; i++) {
            byte index = this.Rj.get();
            this.oq0.LB0.getClass();
            i9 entry = new i9(index, this.pE());
            entries[i] = entry;
            entry.fh0(this.h80());
        }
        this.oq0.ab0 = entries;

        int statCount = this.Rj.get() & 0xFF;
        jr0_0[] stats = new jr0_0[statCount];
        for (int i = 0; i < statCount; i++) {
            this.oq0.LB0.getClass();
            stats[i] = this.bM0();
        }
        this.oq0.getClass();
        HashMap<Byte, jr0_0> map = new HashMap<>();
        for (jr0_0 stat : stats) {
            map.put(stat.ye0, stat);
        }
        this.oq0.X0 = map;
    }

    @Override
    public final void os0() {
    }

    @Override
    public final void km() {
        this.sr0().LPt1 = this.oq0;
    }
}
