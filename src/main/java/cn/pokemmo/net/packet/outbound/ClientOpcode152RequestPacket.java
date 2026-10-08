package cn.pokemmo.net.packet.outbound;

import f.*;
import java.nio.ByteBuffer;

import java.nio.ByteBuffer;

public class ClientOpcode152RequestPacket extends RE {
    public final CH0 cOM9;
    public final byte GU;
    public final fb0_1 Po0;
    public final short YW;
    public final byte XY;

    public ClientOpcode152RequestPacket(CH0 id, byte flag, fb0_1 data, short value, byte mode) {
        super(152);
        this.cOM9 = id;
        this.GU = flag;
        this.Po0 = data;
        this.YW = value;
        this.XY = mode;
    }

    @Override
    public final void ig0(k20_0 connection, ByteBuffer buffer) {
        buffer.putLong(this.cOM9.Sa);
        buffer.put(this.GU);
        if (this.Po0 == null) {
            buffer.put((byte) 0);
        } else {
            fb0_1 data = this.Po0;
            buffer.put((byte) 1);
            buffer.put(data.rO);
            int type = data.rO;
            if (type == 1) {
                rz_0 reason = data.Jg;
                buffer.put(reason == null ? (byte) -1 : reason.f10);
                buffer.put(data.BL0);
                short[] values = data.cI;
                buffer.put((byte) values.length);
                for (short value : values) {
                    buffer.putShort(value);
                }

                mv_1 metadata = data.Ie0;
                buffer.put((byte) metadata.Rv);
                Object[] entries = metadata.Yw;
                byte[] entryTypes = metadata.ZA0;
                int index = entryTypes.length;
                while (--index > 0) {
                    Object entry = entries[index];
                    if (entry == iw_2.VW || entry == iw_2.J80) {
                        continue;
                    }
                    buffer.put(((gc_2) entry).v10);
                    buffer.put(entryTypes[index]);
                }
            } else if (type == 6) {
                buffer.put(data.AH0);
            }
        }
        buffer.putShort(this.YW);
        buffer.put(this.XY);
    }
}
