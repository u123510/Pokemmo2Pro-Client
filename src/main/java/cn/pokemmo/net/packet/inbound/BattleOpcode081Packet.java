package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class BattleOpcode081Packet extends GH {
    public Vz0 qp0;

    public BattleOpcode081Packet(k20_0 source, ByteBuffer data) {
        super(source, data);
    }

    @Override
    public final void Oj0() {
        this.qp0 = (Vz0) Vz0.fg.BM(this.Rj.get());
    }

    @Override
    public final void os0() {
        BR root = (BR) this.sr0();
        Vz0 value = this.qp0;
        int first = switch (value.oC0) {
            case 1 -> 2;
            case 2 -> 1;
            case 3 -> 4;
            case 4 -> 3;
            default -> 0;
        };
        if (first == 1 || first == 2) {
            root.bh = null;
        } else if (first == 3) {
            Dm0 state = root.bh;
            byte index = state.KK();
            state.RU[index] = true;
        } else if (first == 4) {
            Dm0 state = root.bh;
            byte index = state.KK();
            state.u8[index] = true;
        }
        int second = first;
        if (second == 3 || second == 4) {
            root.lZ.zK0.YB0.Hr0();
        } else if (second == 1 || second == 2) {
            if (second == 1) {
                root.qK(sm0_0.c0(1969));
            }
            if (value == Vz0.MM) {
                root.qK(sm0_0.c0(1968));
            }
            root.lZ.zK0.GF0(null);
            Dt0 taskQueue = lg_0.k;
            BU battle = root.lZ.zK0;
            taskQueue.lPT5(new Q60(battle));
        }
    }
}
