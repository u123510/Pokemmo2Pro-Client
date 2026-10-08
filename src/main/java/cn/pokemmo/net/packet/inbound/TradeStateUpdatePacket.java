package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class TradeStateUpdatePacket extends GH {
    public CH0 nH0;
    public RL0 q00;

    public TradeStateUpdatePacket(k20_0 source, ByteBuffer data) {
        super(source, data);
        this.nH0 = CH0.j1;
    }

    @Override
    public final void Oj0() {
        this.nH0 = this.pE();
        byte code = this.Rj.get();
        this.q00 = (RL0) t_0.BI0(RL0.rO.BM(code), RL0.class, code);
    }

    @Override
    public final void os0() {
        Ge0 state = this.sr0();
        if (state == null || state.cJ0 == null) {
            return;
        }
        yt_1 registry = state.cJ0;
        CH0 key = this.nH0;
        RL0 value = this.q00;
        bi0_1 entry = registry.ax(key);
        if (entry == null) {
            return;
        }
        entry.PC0(value);
        g70_0 callback = (g70_0) tw0_0.Tl0.B1.get(this);
        if (callback != null) {
            callback.D70(value);
        }
    }
}
