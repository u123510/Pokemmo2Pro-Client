package cn.pokemmo.battle.model;

import f.*;
import f.org.json.N7;
import f.org.json.yw_2;
import java.nio.ByteBuffer;
import java.util.Arrays;

public class BattleRecordScenario {
    public Cq Nw0 = Cq.Wn0;
    public final on0_0[] XF0 = new on0_0[2];
    public byte ot = (byte) -1;

    public BattleRecordScenario() {
        for (int n = 0; n < this.XF0.length; ++n) {
            this.XF0[n] = new on0_0();
        }
    }

    public BattleRecordScenario(N7 object) {
        this.Nw0 = Cq.Gl((byte) object.pF("battle_type"));
        this.ot = (byte) object.MT(-1, "turns");
        yw_2 yw = object.gz0("participants");
        if (yw.DD() == 2) {
            for (int j = 0; j < yw.DD(); ++j) {
                this.XF0[j] = new on0_0(yw.OA0(j));
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void nx0(ByteBuffer byteBuffer, on0_0 on0) {
        on0.P5(byteBuffer);
    }

    public final N7 U40() {
        N7 n7 = new N7();
        n7.D50(Integer.valueOf(this.Nw0.WW), "battle_type");
        n7.D50(Integer.valueOf(this.ot), "turns");
        yw_2 yw = new yw_2();
        Arrays.stream(this.XF0).map(on0_0::ow).forEach(yw::lC);
        n7.D50(yw, "participants");
        return n7;
    }

    public final void rp0(ByteBuffer byteBuffer) {
        byteBuffer.put(this.Nw0.WW);
        byteBuffer.put(this.ot);
        byteBuffer.put((byte) this.XF0.length);
        Arrays.stream(this.XF0).forEach(on0 -> bt_0.nx0(byteBuffer, on0));
    }
}
