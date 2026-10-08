package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class BattleOpcode094Packet extends GH {
    public ny_0[] RK;

    public BattleOpcode094Packet(k20_0 owner, ByteBuffer buffer) {
        super(owner, buffer);
    }

    @Override
    public final void Oj0() {
        int groupCount = this.Rj.get() & 255;
        this.RK = new ny_0[groupCount];
        for (int groupIndex = 0; groupIndex < this.RK.length; groupIndex++) {
            long key = this.Rj.getLong();
            byte type = this.Rj.get();
            int entryCount = this.Rj.get() & 255;
            nu_0[] entries = new nu_0[entryCount];
            for (int entryIndex = 0; entryIndex < entryCount; entryIndex++) {
                short first = this.Rj.getShort();
                short second = this.Rj.getShort();
                int value = this.Rj.getInt();
                boolean enabled = this.Rj.get() == 1;
                entries[entryIndex] = new nu_0(first, second, value, enabled);
            }

            if (br_0.EA0 == null) {
                br_0.EA0 = br_0.Dv0.clone();
            }
            br_0 selected = null;
            for (br_0 candidate : br_0.EA0) {
                if (candidate.hA == type) {
                    selected = candidate;
                    break;
                }
            }
            this.RK[groupIndex] = new ny_0(key, selected, entries);
        }
    }

    @Override
    public final void os0() {
        Ge0 owner = this.sr0();
        ny_0[] values = this.RK;
        BR battle = (BR) owner;
        BU bundle = battle.lZ.zK0;
        if (bundle != null) {
            lr_0 loader = bundle.Xf0;
            if (loader != null) {
                loader.kv0(values);
            }
        }
    }
}
