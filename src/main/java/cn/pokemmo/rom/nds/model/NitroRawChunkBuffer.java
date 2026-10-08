package cn.pokemmo.rom.nds.model;

import f.C4;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

public class NitroRawChunkBuffer {
    public final byte[] cq0;
    public ArrayList v;

    public NitroRawChunkBuffer(byte[] data) {
        this.cq0 = data;
    }

    public List ai() {
        synchronized (this) {
            if (this.v == null && this.cq0 != null) {
                this.v = new ArrayList();
                ByteBuffer buffer = ByteBuffer.wrap(this.cq0).order(ByteOrder.LITTLE_ENDIAN);
                int count = buffer.limit() / 4;
                for (int index = 0; index < count; index++) {
                    short value = buffer.getShort();
                    buffer.get();
                    buffer.get();
                    this.v.add(new C4(value));
                }
            }
            if (this.v == null) {
                this.v = new ArrayList();
            }
            return this.v;
        }
    }

    public C4[] ax() {
        synchronized (this) {
            return (C4[]) this.ai().toArray(new C4[0]);
        }
    }
}
