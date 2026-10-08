package cn.pokemmo.rom.nds.model;

import f.*;

import java.nio.ByteBuffer;

public class NdsRibbonMedalEntry extends gn_2 {
    public final byte Y2;
    public final byte zn;
    public final io_2[] JS;
    public final short[] yr;
    public final l50_0 zI;

    public NdsRibbonMedalEntry(short value, l50_0 type, ByteBuffer buffer) {
        super(type.Tz(), value);
        byte flags = 0;
        byte count = 0;
        io_2[] entries;
        Cq.Wn0.toString();
        this.yr = new short[4];
        this.zI = type;
        if (buffer.remaining() < 20) {
            entries = new io_2[0];
        } else {
            flags = buffer.get();
            count = buffer.get();
            buffer.get();
            entries = new io_2[buffer.get() & 0xff];
            for (int i = 0; i < this.yr.length; i++) {
                short entry = buffer.getShort();
                if (entry > 112 && entry < 135) {
                    entry = 0;
                }
                this.yr[i] = entry;
            }
            buffer.getInt();
            if (buffer.getInt() == 2) {
                Cq.Wn0.toString();
            }
        }
        this.Y2 = flags;
        this.zn = count;
        this.JS = entries;
    }

    @Override
    public final String gK0() {
        int type = this.zI.Tz();
        if (type == 3) {
            return sm0_0.Bw((byte) 3, lpt6__2.Q80, 618, this.vn, sm0_0.zb0);
        }
        if (type == 4) {
            return sm0_0.Bw((byte) 4, lpt6__2.Q80, 729, this.vn, sm0_0.zb0);
        }
        throw new UnsupportedOperationException();
    }

    @Override
    public final byte VK0() {
        return this.zn;
    }

    @Override
    public final short A5() {
        return (short) this.zn;
    }

    public final boolean Nk0() {
        return (this.Y2 & 1) != 0;
    }

    public final boolean aT() {
        return (this.Y2 & 2) != 0;
    }
}
