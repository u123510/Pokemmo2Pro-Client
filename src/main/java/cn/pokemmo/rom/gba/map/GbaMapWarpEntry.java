package cn.pokemmo.rom.gba.map;

import f.*;

import java.nio.ByteBuffer;

public class GbaMapWarpEntry {
    public byte LpT5;
    public final short su;
    public byte R10;
    public byte ff;
    public byte cC;
    public final short[] fY;
    public boolean Sd;
    public final boolean oF0;

    public GbaMapWarpEntry(byte mode, ByteBuffer buffer) {
        this.Sd = false;
        this.oF0 = true;
        this.LpT5 = mode;
        short id = (short)buffer.get();
        this.su = id;
        byte[] name = new byte[16];
        buffer.get(name);
        sm0_0.Tm0(id + 290000, mz_1.Y(name));
        this.R10 = buffer.get();
        this.ff = buffer.get();
        this.cC = buffer.get();
        buffer.getInt();
        int offset = G90.GF0(buffer.getInt());
        int length = G90.GF0(buffer.getInt());
        String description = mz_1.BC(length, buffer);
        sm0_0.Tm0(id + 295000, description);
        int end = buffer.position();
        buffer.position(offset);
        int count = this.hc();
        if (this.R10 != 4) {
            count = 1;
        }
        this.fY = new short[count];
        for (int index = 0; index < count; index++) {
            this.fY[index] = buffer.getShort();
        }
        buffer.position(end);
    }

    public GbaMapWarpEntry(short id, boolean enabled) {
        this.Sd = false;
        this.LpT5 = 0;
        this.su = id;
        this.oF0 = enabled;
        this.R10 = 0;
        this.ff = 0;
        this.cC = 0;
        this.fY = new short[]{0};
    }

    public final byte Qz0() {
        return this.LpT5;
    }

    public final String FL0() {
        return !this.oF0 ? sm0_0.c0(1450) : sm0_0.c0(this.su + 290000);
    }

    public final int dM() {
        switch (this.ff) {
            case 0: return 1;
            case 1: return 2;
            case 2: return 0;
            case 3: return 4;
            case 4: return 2;
            case 5: return 1;
            case 6: return 0;
            case 7: return 2;
            case 8: case 9: return 3;
            default: return 0;
        }
    }

    public final int hc() {
        int multiplier = this.dM();
        int value;
        switch (this.ff) {
            case 0: case 1: return multiplier;
            case 2: case 6: return 0 * multiplier;
            case 3: case 4: case 5: case 9: return 2 * multiplier;
            case 7: return 4 * multiplier;
            case 8: return 3 * multiplier;
            default: return 0;
        }
    }

    public final void N5() {
        short[] values = this.fY;
        if (values.length < 1) {
            return;
        }
        this.LpT5 = 10;
        values[0] = 211;
        this.Sd = true;
    }

    public final void Lh0() {
        this.R10 = 5;
    }

    public final void h4() {
        this.ff = 0;
    }

    public final void bz0() {
        this.cC = 2;
    }

    public final short I20() {
        if (!this.Sd && this.R10 != 4) {
            return 0;
        }
        return this.fY.length < 1 ? 0 : this.fY[0];
    }
}
