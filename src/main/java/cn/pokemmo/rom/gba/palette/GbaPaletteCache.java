package cn.pokemmo.rom.gba.palette;

import f.*;

import java.lang.ref.Reference;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.locks.ReentrantLock;

public class GbaPaletteCache {
    public static final GbaPaletteCache Ic;
    public final ye0_2 p00;
    public final ReentrantLock z50;

    public GbaPaletteCache() {
        this.p00 = CT.FJ0();
        this.z50 = new ReentrantLock();
    }

    public static GbaPaletteCache gs0() {
        return Ic;
    }

    static {
        Ic = new GbaPaletteCache();
    }

    public final i8_0 OY(XG0 format, int index, qa0_1 source) {
        ByteBuffer buffer = source.VL0.slice().order(ByteOrder.LITTLE_ENDIAN);
        return this.tv(format, index, buffer, source.rt0());
    }

    public final i8_0 tv(XG0 format, int index, ByteBuffer buffer, byte kind) {
        this.z50.lock();
        try {
            int keyValue = kind * 268435456 + index;
            Integer key = Integer.valueOf(keyValue);
            this.p00.lI0();
            Reference reference = (Reference)this.p00.op.get(key);
            i8_0 result = reference == null ? null : (i8_0)reference.get();
            if (result == null) {
                result = new i8_0(format, index, buffer);
                this.p00.op.remove(key);
                this.p00.aT(key, result);
            }
            return result;
        } finally {
            this.z50.unlock();
        }
    }
}
