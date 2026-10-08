package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class BattleOpcode137Packet extends GH {
    public short SS;
    public zy_1[] T8;

    public BattleOpcode137Packet(k20_0 connection, ByteBuffer buffer) {
        super(connection, buffer);
    }

    public final void Oj0() {
        this.SS = this.Rj.getShort();
        this.T8 = new zy_1[this.Rj.get() & 255];
        for (int index = 0; index < this.T8.length; index++) {
            byte typeId = this.Rj.get();
            ss0_0 type = (ss0_0) ss0_0.En.BM(typeId);
            String first = this.q60();
            String second = this.q60();
            this.T8[index] = new zy_1(type, first, second, this.Rj.getInt());
        }
    }

    public final void os0() {
        BU battle = tw0_0.rl.lZ.zK0;
        if (battle != null && battle.zX != null) {
            battle.zX.ZC0(this.SS, this.T8);
        }
    }
}
