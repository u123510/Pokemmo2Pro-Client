package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;
import java.util.HashMap;

public class BattleOpcode196Packet extends GH {
    public short eK0;
    public final HashMap mM;

    public BattleOpcode196Packet(k20_0 source, ByteBuffer data) {
        super(source, data);
        this.mM = new HashMap();
    }

    @Override
    public final void Oj0() {
        this.eK0 = this.Rj.getShort();
        if (this.Rj.get() != 1) {
            return;
        }
        int count = this.Rj.get();
        for (int i = 0; i < count; i++) {
            this.mM.put(b30_0.f5(this.Rj.get()), Byte.valueOf(this.Rj.get()));
        }
    }

    @Override
    public final void os0() {
        a10_0 state = tw0_0.PK0;
        if (state != null) {
            state.Tk0.add(new v7_0(state, this.eK0, this.mM));
        }
    }
}
