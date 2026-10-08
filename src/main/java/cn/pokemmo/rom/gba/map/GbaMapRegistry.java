package cn.pokemmo.rom.gba.map;

import f.*;

import java.util.ArrayList;
import java.util.Arrays;

public class GbaMapRegistry {
    public static final GbaMapRegistry rb = new GbaMapRegistry();
    public final ZT[][] sn;
    public final S80[] h4;
    public final J10[] Ta;

    public GbaMapRegistry() {
        this.sn = new ZT[100][];
        this.h4 = new S80[5];
        this.Ta = new J10[5];
        for (int i = 0; i < this.Ta.length; i++) {
            this.Ta[i] = new J10();
        }
    }

    public static GbaMapRegistry Bm() {
        return rb;
    }
    public static GbaMapRegistry getInstance() {
        return rb;
    }

    

    public final ZT or(short value) {
        byte low = (byte) (value & 255);
        short kind = (short) J4.K9(value);
        return this.wz(low, kind);
    }

    public final ZT wz(byte row, short column) {
        if (column == 99) {
            column = 2;
        }
        if (column == 50 && row == 100) {
            row = 1;
        }
        if (column == 3 && row == 100) {
            row = 5;
        }
        if (column >= this.sn.length) {
            return null;
        }
        ZT[] values = this.sn[column];
        if (values == null || row >= values.length) {
            return null;
        }
        return values[row];
    }

    public final void im(byte row, byte column, ZT value) {
        ZT[] values = this.sn[row];
        if (values == null) {
            values = new ZT[0];
            this.sn[row] = values;
        }
        if (column >= values.length) {
            values = Arrays.copyOf(values, column + 1);
            this.sn[row] = values;
        }
        values[column] = value;
    }

    public final void Ew0(byte table, short key, ng0_0 value) {
        this.Ta[table].x20.coM4(key, value);
    }

    public final ng0_0 nW(byte table, int key) {
        return (ng0_0) this.Ta[table].JG0.get(key);
    }

    public final ArrayList Oe0() {
        ArrayList result = new ArrayList();
        for (ZT[] row : this.sn) {
            if (row == null) {
                continue;
            }
            for (ZT value : row) {
                if (value != null) {
                    result.add(value);
                }
            }
        }
        return result;
    }
}
