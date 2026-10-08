package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class MonsterStatCalculatePacket extends S20 {
    public VU zc0;

    public MonsterStatCalculatePacket(k20_0 source, ByteBuffer data) {
        super(data, source);
    }

    @Override
    public final void Oj0() {
        this.zc0 = new VU(this.Lr0());
    }

    @Override
    public final void os0() {
        Ge0 state = this.sr0();
        if (state.bh == null) {
            return;
        }
        VU value = this.zc0;
        CE data = value.I8;
        QL mode = data.N00;
        if (mode.aUx == zj_0.dC0) {
            gc_0 registry = BU.T50.YB0;
            if (registry != null) {
                registry.bH.put(value, mode);
            }
        }
        data = value.I8;
        mode = QL.lQ;
        if (data.N00 != mode) {
            data.N00 = mode;
        }
        Mj primary = state.bh.COM3[state.bh.KK()];
        primary.hD(value);
        Mj secondary = state.bh.COM3[state.bh.c80];
        secondary.rr0 = true;
        secondary.jf = false;
    }
}
