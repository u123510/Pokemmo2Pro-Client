package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class BattleOpcode156Packet extends GH {
    public td_1 zf0;

    public BattleOpcode156Packet(k20_0 source, ByteBuffer data) {
        super(source, data);
    }

    @Override
    public final void Oj0() {
        byte code = this.Rj.get();
        bm0_1 registry = td_1.i60;
        td_1 value;
        if (registry.dg(code)) {
            value = (td_1)registry.BM(code);
        } else {
            value = td_1.op0;
        }
        this.zf0 = value;
    }

    @Override
    public final void os0() {
        BR battle = (BR)this.sr0();
        td_1 value = this.zf0;
        battle.getClass();
        battle.qK(sm0_0.wa0(value.H6, "4"));
        BU controller = battle.lZ.zK0;
        if (controller == null) {
            return;
        }
        lr_0 listener = controller.Xf0;
        if (listener == null) {
            return;
        }
        listener.lo(value);
    }
}
