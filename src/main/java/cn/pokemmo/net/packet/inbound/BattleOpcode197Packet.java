package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class BattleOpcode197Packet extends GH {
    public b30_0 Jo0;
    public kt_2 F90;
    public short hD;

    public BattleOpcode197Packet(k20_0 v1, ByteBuffer v2) {
        super(v1, v2);
    }

    public final void Oj0() {
        this.Jo0 = b30_0.f5(this.Rj.get());
        this.F90 = kt_2.uF(this.Rj.get());
        this.hD = this.Rj.getShort();
    }

    public final void os0() {
        a10_0 pk0 = tw0_0.PK0;
        if (pk0 == null) {
            return;
        }
        pk0.N8(this.Jo0, this.F90, this.hD);
    }
}
