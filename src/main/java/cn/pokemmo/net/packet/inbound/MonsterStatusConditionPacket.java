package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class MonsterStatusConditionPacket extends S20 {
    public _volatile wM;
    public CH0 GO;

    public MonsterStatusConditionPacket(k20_0 source, ByteBuffer data) {
        super(data, source);
        this.GO = CH0.j1;
    }

    @Override
    public final void Oj0() {
        this.wM = (_volatile) _volatile.zs0.BM(this.Rj.get());
        this.GO = this.pE();
    }

    @Override
    public final void os0() {
        int mode = AL.RT[this.wM.Hf];
        if (mode < 1 || mode > 6) {
            throw new IllegalArgumentException();
        }
        Mj entry = this.sr0().r1(this.wM);
        if (entry != null) {
            entry.Qe(this.GO);
        }
    }
}
