package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ServerOpcode103Packet extends GH {
    public int Yq0;
    public e70_0[] Fn;

    public ServerOpcode103Packet(k20_0 source, ByteBuffer data) {
        super(source, data);
    }

    @Override
    public final void Oj0() {
        this.Yq0 = this.Rj.get() & 0xFF;
        int count = this.Rj.get() & 0xFF;
        this.Fn = new e70_0[count];
        for (int i = 0; i < this.Fn.length; i++) {
            CH0 id = this.pE();
            String first = this.q60();
            String second = this.q60();
            this.Fn[i] = new e70_0(this.Rj.getInt(), id, first, second);
        }
    }

    @Override
    public final void os0() {
        Ge0 state = this.sr0();
        if (this.Yq0 == 0) {
            state.a8.qY.clear();
        }
        BB0 map = state.a8;
        map.getClass();
        for (e70_0 entry : this.Fn) {
            map.qY.put(entry.w8, entry);
        }
    }
}
