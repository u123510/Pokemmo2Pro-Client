package cn.pokemmo.net.packet.inbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ServerOpcode108Packet extends GH {
    public CH0 Mp0;
    public q10_0 uH0;
    public short hK0;
    public boolean zg0;

    public ServerOpcode108Packet(k20_0 source, ByteBuffer data) {
        super(source, data);
        this.Mp0 = CH0.j1;
    }

    @Override
    public final void Oj0() {
        this.Mp0 = this.pE();
        this.uH0 = q10_0.Pt0(this.Rj.get());
        this.hK0 = this.Rj.getShort();
        this.zg0 = this.Rj.get() == 1;
    }

    @Override
    public final void os0() {
        bi0_1 value = this.sr0().cJ0.ax(this.Mp0);
        if (!(value instanceof E90) || tw0_0.RE0 == null) {
            return;
        }
        E90 entity = (E90) value;
        short current = entity.J1.Nul(this.uH0);
        short expected = this.hK0;
        if (current != expected && Ss0.Fv(this.uH0, expected) != current) {
            return;
        }
        if (tw0_0.PK0 != null) {
            this.zg0 = false;
        }
        float factor = this.zg0 ? bu_0.d40(entity) : 0.0f;
        if (factor > 0.0f && !this.sr0().cJ0.dj0.equals(this.Mp0)) {
            x30 queue = tw0_0.RE0.JZ;
            synchronized (queue) {
                long now = System.currentTimeMillis();
                int index = 0;
                while (index < queue.gA) {
                    if (queue.qV[index] < now) {
                        queue.qV[index] = now + queue.sI0;
                        break;
                    }
                    index++;
                }
                if (index >= queue.gA) {
                    factor = 0.0f;
                }
            }
        }
        entity.J1.auX[this.uH0.iL].Mj0(current, factor);
    }
}
