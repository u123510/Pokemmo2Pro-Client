package cn.pokemmo.battle;

import f.*;
import java.nio.ByteBuffer;

public class BattleTerrainEffectState {
    public final int Xf0;
    public final int SC0;
    public byte dE;
    public final cf_2 qn0;

    public BattleTerrainEffectState(int first, int second) {
        this.qn0 = new cf_2(4);
        this.Xf0 = first;
        this.SC0 = second;
        this.dE = 0;
    }

    public BattleTerrainEffectState(ByteBuffer input, int width) {
        this.qn0 = new cf_2(4);
        this.Xf0 = width >= 3 ? input.getInt() : input.get() & 255;
        this.SC0 = input.getInt();
        this.dE = input.get();
        if ((this.dE & 1) != 0) v0(0, input);
        if ((this.dE & 2) != 0) v0(1, input);
        if ((this.dE & 4) != 0) v0(2, input);
        if ((this.dE & 8) != 0) v0(3, input);
    }

    @Override
    public final int hashCode() {
        return this.Xf0 * 1000000 + this.SC0;
    }

    public final void v0(int index, ByteBuffer input) {
        int count = input.get();
        es_1 values = new es_1(count);
        for (int i = 0; i < count; i++) {
            values.Ue0(new VK0(input.get(), input.getInt()));
        }
        this.qn0.n3(Integer.valueOf(index), values);
    }

    public final void ZC0(int index, ByteBuffer output) {
        es_1 values = (es_1) this.qn0.vC(Integer.valueOf(index), null);
        output.put((byte) values.KB);
        I2 iterator = values.ZD();
        while (iterator.hasNext()) {
            VK0 value = (VK0) iterator.next();
            output.put(value.Z7);
            output.putInt(value.yh);
        }
    }
}
