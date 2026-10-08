package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ServerOpcode211Packet extends GH {
    public byte[] i7;
    public int[] DD;
    public short[] nI0;

    public ServerOpcode211Packet(k20_0 source, ByteBuffer data) {
        super(source, data);
    }

    @Override
    public final void Oj0() {
        int count = this.Rj.get() & 0xFF;
        this.i7 = new byte[count];
        this.DD = new int[count];
        this.nI0 = new short[count];
        for (int index = 0; index < count; index++) {
            this.i7[index] = this.Rj.get();
            this.DD[index] = this.Rj.getInt();
            this.nI0[index] = this.Rj.getShort();
        }
    }

    @Override
    public final void os0() {
        for (int index = 0; index < this.i7.length; index++) {
            OJ entry = (OJ)hq_2.ZG.kg.BM(this.i7[index]);
            if (entry != null) {
                entry.kA0 = this.DD[index];
                entry.uY = this.nI0[index];
            }
        }

        bm0_1 map = hq_2.ZG.kg;
        map.getClass();
        new YL0(map);
        YC0 iterator = new YC0(map);
        while (iterator.hasNext()) {
            OJ entry = (OJ)iterator.ro();
            byte key = entry.cT;
            boolean found = false;
            for (int index = 0; index < this.i7.length; index++) {
                if (this.i7[index] == key) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                entry.kA0 = 0;
                entry.uY = 0;
            }
        }

        BR state = (BR)this.sr0();
        BU holder = state.lZ.zK0;
        if (holder != null) {
            wr0 renderer = holder.Y80;
            if (renderer != null) {
                renderer.update();
            }
        }
    }
}
