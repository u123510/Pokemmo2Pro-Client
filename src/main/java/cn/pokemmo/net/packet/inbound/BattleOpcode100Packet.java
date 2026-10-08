package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class BattleOpcode100Packet extends GH {
    public GR KE0;

    public BattleOpcode100Packet(k20_0 source, ByteBuffer data) {
        super(source, data);
    }

    @Override
    public final void Oj0() {
        GR friend = new GR(this.pE(), this.Rj.getInt(), (this.Rj.get() & 255) == 1);
        friend.fh0(this.h80());
        this.KE0 = friend;
    }

    @Override
    public final void os0() {
        fa0_0 friends = this.sr0().q50;
        GR friend = this.KE0;
        if (friends.lx.put(friend.WS, friend) == null) {
            friends.LF0 = true;
            tw0_0.rl.jC(sm0_0.wa0(1657, friend.QB0.DR), zo_0.Dd);
        }
        this.sr0().fP();
        BU battle = BU.T50;
        if (battle != null && battle.md0 != null) {
            battle.md0.LB0.LD0();
            battle.md0.jP.hk0();
        }
    }
}
