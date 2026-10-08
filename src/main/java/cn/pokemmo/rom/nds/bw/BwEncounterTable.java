package cn.pokemmo.rom.nds.bw;

import f.*;

import java.nio.ByteBuffer;

public class BwEncounterTable {
    public final nj0_0 En0;
    public final int jK;
    public final byte[] Lv0;
    public final byte[] Oy0;
    public final byte[] Xy;
    public final byte[] ih;

    public BwEncounterTable(nj0_0 source, int type) {
        super();
        this.Lv0 = new byte[4];
        this.Oy0 = new byte[4];
        if (type < 1 || type > 6) {
            type = 1;
        }
        this.En0 = source;
        this.jK = type;
        ByteBuffer buffer = new FJ((Ae)source.nuL().COM7("/a/1/3/1"))
                .EG(type + 62).j90();
        buffer.get(this.Oy0);
        buffer.get(this.Lv0);
        fa_0 first = new fa_0();
        fa_0 second = new fa_0();
        while (buffer.remaining() > 3 && buffer.get() == 1) {
            first.nf0(buffer.get());
            second.nf0(buffer.get());
            buffer.get();
        }
        this.Xy = second.Jh0();
        this.ih = first.Jh0();
    }

    public final byte Yy0(int index) {
        if (index < 0 || index >= this.Lv0.length) {
            index = 3;
        }
        return this.Lv0[index];
    }

    public final byte fl0(int index) {
        if (index < 0 || index >= this.Oy0.length) {
            index = 3;
        }
        return this.Oy0[index];
    }

    public final int y0(byte value, int index) {
        switch (this.Yy0(index)) {
            case 4:
                return 5;
            case 2:
                return 4;
            case 1:
                return 3;
            case 0:
            case 6:
            case 5:
                return value == 0 ? 2 : 1;
            default:
                return 0;
        }
    }

    public final String nG0(byte index, String fallback) {
        if (index < 0 || index >= this.Lv0.length) {
            return "";
        }
        byte value = this.Lv0[index];
        if (value == 0 || value == 5) {
            return fallback;
        }
        this.En0.getClass();
        return sm0_0.Bw((byte)2, lpt6__2.Q80, 198, value, sm0_0.zb0);
    }
}
