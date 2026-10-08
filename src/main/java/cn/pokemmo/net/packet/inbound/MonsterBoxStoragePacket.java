package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class MonsterBoxStoragePacket extends S20 {
    public ch0_2[] Yl;

    public MonsterBoxStoragePacket(k20_0 source, ByteBuffer data) {
        super(data, source);
    }

    @Override
    public final void Oj0() {
        this.Yl = new ch0_2[this.Rj.get() & 255];
        for (int index = 0; index < this.Yl.length; index++) {
            this.Yl[index] = this.ST();
        }
    }

    @Override
    public final void os0() {
        BR battle = (BR)this.sr0();
        ZY lookup = battle.Cl;
        lookup.px0.clear();
        for (ch0_2 entry : this.Yl) {
            lookup.px0.put(entry.Pc0.WN, entry);
        }

        Qy0 state = battle.lZ;
        lg_0.k.lPT5(new IL0(state, false));
        lg_0.k.lPT5(new Nq(battle.lZ, battle));
    }
}
