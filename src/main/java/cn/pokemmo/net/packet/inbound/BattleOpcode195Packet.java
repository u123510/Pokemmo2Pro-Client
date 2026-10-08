package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class BattleOpcode195Packet extends GH {
    public byte bo;
    public byte[] CH0;
    public byte[] K1;
    public short[] yn0;

    public BattleOpcode195Packet(k20_0 source, ByteBuffer data) {
        super(source, data);
    }

    @Override
    public final void Oj0() {
        this.bo = this.Rj.get();
        this.CH0 = new byte[this.Rj.get() & 255];
        this.Rj.get(this.CH0);
        this.K1 = new byte[this.Rj.get() & 255];
        this.Rj.get(this.K1);
        this.yn0 = new short[this.Rj.get() & 255];
        for (int index = 0; index < this.yn0.length; index++) {
            this.yn0[index] = this.Rj.getShort();
        }
    }

    @Override
    public final void os0() {
        a10_0 queue = tw0_0.PK0;
        if (queue != null) {
            queue.Tk0.add(new LD(this.bo, this.CH0, this.K1, this.yn0));
        }
    }
}
